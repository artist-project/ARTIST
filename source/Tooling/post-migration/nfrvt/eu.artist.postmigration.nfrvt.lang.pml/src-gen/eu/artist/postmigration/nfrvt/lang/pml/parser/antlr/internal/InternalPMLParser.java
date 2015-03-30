package eu.artist.postmigration.nfrvt.lang.pml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.artist.postmigration.nfrvt.lang.pml.services.PMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DATE_TIME", "RULE_STRING", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_EBOOLEAN", "RULE_NULL", "RULE_INT", "RULE_SMALL_DECIMAL", "RULE_EBIGDECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'observation'", "'{'", "'time'", "','", "'level'", "'type'", "'measurements'", "'['", "']'", "'}'", "'data-point'", "'property'", "'context'", "'workload'", "'confidence'", "'value'", "'info'", "'time-series'", "'values'", "'benchmark'", "'provider'", "'service'", "'test'", "':'", "'with'", "'('", "')'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'"
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
    public static final int RULE_INT=10;
    public static final int T__50=50;
    public static final int RULE_SMALL_DECIMAL=11;
    public static final int T__42=42;
    public static final int RULE_EBIGDECIMAL=12;
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
    public static final int RULE_NULL=9;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
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
    public static final int RULE_DATE_TIME=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=15;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalPMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPMLParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g"; }



     	private PMLGrammarAccess grammarAccess;
     	
        public InternalPMLParser(TokenStream input, PMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ARTISTModel";	
       	}
       	
       	@Override
       	protected PMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleARTISTModel"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:67:1: entryRuleARTISTModel returns [EObject current=null] : iv_ruleARTISTModel= ruleARTISTModel EOF ;
    public final EObject entryRuleARTISTModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARTISTModel = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:68:2: (iv_ruleARTISTModel= ruleARTISTModel EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:69:2: iv_ruleARTISTModel= ruleARTISTModel EOF
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:76:1: ruleARTISTModel returns [EObject current=null] : this_MeasurementModel_0= ruleMeasurementModel ;
    public final EObject ruleARTISTModel() throws RecognitionException {
        EObject current = null;

        EObject this_MeasurementModel_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:79:28: (this_MeasurementModel_0= ruleMeasurementModel )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:81:5: this_MeasurementModel_0= ruleMeasurementModel
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getARTISTModelAccess().getMeasurementModelParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleMeasurementModel_in_ruleARTISTModel131);
            this_MeasurementModel_0=ruleMeasurementModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MeasurementModel_0; 
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


    // $ANTLR start "entryRuleMeasurementModel"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:97:1: entryRuleMeasurementModel returns [EObject current=null] : iv_ruleMeasurementModel= ruleMeasurementModel EOF ;
    public final EObject entryRuleMeasurementModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementModel = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:98:2: (iv_ruleMeasurementModel= ruleMeasurementModel EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:99:2: iv_ruleMeasurementModel= ruleMeasurementModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeasurementModelRule()); 
            }
            pushFollow(FOLLOW_ruleMeasurementModel_in_entryRuleMeasurementModel165);
            iv_ruleMeasurementModel=ruleMeasurementModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeasurementModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementModel175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurementModel"


    // $ANTLR start "ruleMeasurementModel"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:106:1: ruleMeasurementModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImportNamespace ) )* ( (lv_observations_2_0= ruleObservation ) )* ) ;
    public final EObject ruleMeasurementModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_observations_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:109:28: ( ( () ( (lv_imports_1_0= ruleImportNamespace ) )* ( (lv_observations_2_0= ruleObservation ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:110:1: ( () ( (lv_imports_1_0= ruleImportNamespace ) )* ( (lv_observations_2_0= ruleObservation ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:110:1: ( () ( (lv_imports_1_0= ruleImportNamespace ) )* ( (lv_observations_2_0= ruleObservation ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:110:2: () ( (lv_imports_1_0= ruleImportNamespace ) )* ( (lv_observations_2_0= ruleObservation ) )*
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:110:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:111:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMeasurementModelAccess().getMeasurementModelAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:116:2: ( (lv_imports_1_0= ruleImportNamespace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==77) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:117:1: (lv_imports_1_0= ruleImportNamespace )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:117:1: (lv_imports_1_0= ruleImportNamespace )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:118:3: lv_imports_1_0= ruleImportNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMeasurementModelAccess().getImportsImportNamespaceParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportNamespace_in_ruleMeasurementModel230);
            	    lv_imports_1_0=ruleImportNamespace();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMeasurementModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_1_0, 
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

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:134:3: ( (lv_observations_2_0= ruleObservation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:135:1: (lv_observations_2_0= ruleObservation )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:135:1: (lv_observations_2_0= ruleObservation )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:136:3: lv_observations_2_0= ruleObservation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMeasurementModelAccess().getObservationsObservationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleObservation_in_ruleMeasurementModel252);
            	    lv_observations_2_0=ruleObservation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMeasurementModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"observations",
            	              		lv_observations_2_0, 
            	              		"Observation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleMeasurementModel"


    // $ANTLR start "entryRuleObservation"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:160:1: entryRuleObservation returns [EObject current=null] : iv_ruleObservation= ruleObservation EOF ;
    public final EObject entryRuleObservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:161:2: (iv_ruleObservation= ruleObservation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:162:2: iv_ruleObservation= ruleObservation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObservationRule()); 
            }
            pushFollow(FOLLOW_ruleObservation_in_entryRuleObservation289);
            iv_ruleObservation=ruleObservation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObservation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObservation299); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObservation"


    // $ANTLR start "ruleObservation"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:169:1: ruleObservation returns [EObject current=null] : (otherlv_0= 'observation' ( (lv_toolName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'time' ( (lv_dateTime_4_0= RULE_DATE_TIME ) ) (otherlv_5= ',' otherlv_6= 'level' ( (lv_level_7_0= RULE_STRING ) ) )? (otherlv_8= ',' otherlv_9= 'type' ( (lv_measurementType_10_0= RULE_STRING ) ) )? otherlv_11= ',' otherlv_12= 'measurements' otherlv_13= '[' ( ( (lv_measurements_14_0= ruleMeasurement ) ) (otherlv_15= ',' ( (lv_measurements_16_0= ruleMeasurement ) ) )* )? otherlv_17= ']' otherlv_18= '}' ) ;
    public final EObject ruleObservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_toolName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_dateTime_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_level_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_measurementType_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_measurements_14_0 = null;

        EObject lv_measurements_16_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:172:28: ( (otherlv_0= 'observation' ( (lv_toolName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'time' ( (lv_dateTime_4_0= RULE_DATE_TIME ) ) (otherlv_5= ',' otherlv_6= 'level' ( (lv_level_7_0= RULE_STRING ) ) )? (otherlv_8= ',' otherlv_9= 'type' ( (lv_measurementType_10_0= RULE_STRING ) ) )? otherlv_11= ',' otherlv_12= 'measurements' otherlv_13= '[' ( ( (lv_measurements_14_0= ruleMeasurement ) ) (otherlv_15= ',' ( (lv_measurements_16_0= ruleMeasurement ) ) )* )? otherlv_17= ']' otherlv_18= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:173:1: (otherlv_0= 'observation' ( (lv_toolName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'time' ( (lv_dateTime_4_0= RULE_DATE_TIME ) ) (otherlv_5= ',' otherlv_6= 'level' ( (lv_level_7_0= RULE_STRING ) ) )? (otherlv_8= ',' otherlv_9= 'type' ( (lv_measurementType_10_0= RULE_STRING ) ) )? otherlv_11= ',' otherlv_12= 'measurements' otherlv_13= '[' ( ( (lv_measurements_14_0= ruleMeasurement ) ) (otherlv_15= ',' ( (lv_measurements_16_0= ruleMeasurement ) ) )* )? otherlv_17= ']' otherlv_18= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:173:1: (otherlv_0= 'observation' ( (lv_toolName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'time' ( (lv_dateTime_4_0= RULE_DATE_TIME ) ) (otherlv_5= ',' otherlv_6= 'level' ( (lv_level_7_0= RULE_STRING ) ) )? (otherlv_8= ',' otherlv_9= 'type' ( (lv_measurementType_10_0= RULE_STRING ) ) )? otherlv_11= ',' otherlv_12= 'measurements' otherlv_13= '[' ( ( (lv_measurements_14_0= ruleMeasurement ) ) (otherlv_15= ',' ( (lv_measurements_16_0= ruleMeasurement ) ) )* )? otherlv_17= ']' otherlv_18= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:173:3: otherlv_0= 'observation' ( (lv_toolName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'time' ( (lv_dateTime_4_0= RULE_DATE_TIME ) ) (otherlv_5= ',' otherlv_6= 'level' ( (lv_level_7_0= RULE_STRING ) ) )? (otherlv_8= ',' otherlv_9= 'type' ( (lv_measurementType_10_0= RULE_STRING ) ) )? otherlv_11= ',' otherlv_12= 'measurements' otherlv_13= '[' ( ( (lv_measurements_14_0= ruleMeasurement ) ) (otherlv_15= ',' ( (lv_measurements_16_0= ruleMeasurement ) ) )* )? otherlv_17= ']' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleObservation336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getObservationAccess().getObservationKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:177:1: ( (lv_toolName_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:178:1: (lv_toolName_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:178:1: (lv_toolName_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:179:3: lv_toolName_1_0= RULE_ID
            {
            lv_toolName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObservation353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_toolName_1_0, grammarAccess.getObservationAccess().getToolNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getObservationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"toolName",
                      		lv_toolName_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleObservation370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getObservationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleObservation382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getObservationAccess().getTimeKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:203:1: ( (lv_dateTime_4_0= RULE_DATE_TIME ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:204:1: (lv_dateTime_4_0= RULE_DATE_TIME )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:204:1: (lv_dateTime_4_0= RULE_DATE_TIME )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:205:3: lv_dateTime_4_0= RULE_DATE_TIME
            {
            lv_dateTime_4_0=(Token)match(input,RULE_DATE_TIME,FOLLOW_RULE_DATE_TIME_in_ruleObservation399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_dateTime_4_0, grammarAccess.getObservationAccess().getDateTimeDATE_TIMETerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getObservationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"dateTime",
                      		lv_dateTime_4_0, 
                      		"DATE_TIME");
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:221:2: (otherlv_5= ',' otherlv_6= 'level' ( (lv_level_7_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==21) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:221:4: otherlv_5= ',' otherlv_6= 'level' ( (lv_level_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleObservation417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getObservationAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleObservation429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getObservationAccess().getLevelKeyword_5_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:229:1: ( (lv_level_7_0= RULE_STRING ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:230:1: (lv_level_7_0= RULE_STRING )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:230:1: (lv_level_7_0= RULE_STRING )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:231:3: lv_level_7_0= RULE_STRING
                    {
                    lv_level_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleObservation446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_level_7_0, grammarAccess.getObservationAccess().getLevelSTRINGTerminalRuleCall_5_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getObservationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"level",
                              		lv_level_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:247:4: (otherlv_8= ',' otherlv_9= 'type' ( (lv_measurementType_10_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:247:6: otherlv_8= ',' otherlv_9= 'type' ( (lv_measurementType_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleObservation466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getObservationAccess().getCommaKeyword_6_0());
                          
                    }
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleObservation478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getObservationAccess().getTypeKeyword_6_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:255:1: ( (lv_measurementType_10_0= RULE_STRING ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:256:1: (lv_measurementType_10_0= RULE_STRING )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:256:1: (lv_measurementType_10_0= RULE_STRING )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:257:3: lv_measurementType_10_0= RULE_STRING
                    {
                    lv_measurementType_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleObservation495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_measurementType_10_0, grammarAccess.getObservationAccess().getMeasurementTypeSTRINGTerminalRuleCall_6_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getObservationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"measurementType",
                              		lv_measurementType_10_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleObservation514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getObservationAccess().getCommaKeyword_7());
                  
            }
            otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleObservation526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getObservationAccess().getMeasurementsKeyword_8());
                  
            }
            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleObservation538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getObservationAccess().getLeftSquareBracketKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:285:1: ( ( (lv_measurements_14_0= ruleMeasurement ) ) (otherlv_15= ',' ( (lv_measurements_16_0= ruleMeasurement ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27||LA6_0==34||LA6_0==36) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:285:2: ( (lv_measurements_14_0= ruleMeasurement ) ) (otherlv_15= ',' ( (lv_measurements_16_0= ruleMeasurement ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:285:2: ( (lv_measurements_14_0= ruleMeasurement ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:286:1: (lv_measurements_14_0= ruleMeasurement )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:286:1: (lv_measurements_14_0= ruleMeasurement )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:287:3: lv_measurements_14_0= ruleMeasurement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObservationAccess().getMeasurementsMeasurementParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMeasurement_in_ruleObservation560);
                    lv_measurements_14_0=ruleMeasurement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getObservationRule());
                      	        }
                             		add(
                             			current, 
                             			"measurements",
                              		lv_measurements_14_0, 
                              		"Measurement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:303:2: (otherlv_15= ',' ( (lv_measurements_16_0= ruleMeasurement ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:303:4: otherlv_15= ',' ( (lv_measurements_16_0= ruleMeasurement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleObservation573); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_15, grammarAccess.getObservationAccess().getCommaKeyword_10_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:307:1: ( (lv_measurements_16_0= ruleMeasurement ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:308:1: (lv_measurements_16_0= ruleMeasurement )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:308:1: (lv_measurements_16_0= ruleMeasurement )
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:309:3: lv_measurements_16_0= ruleMeasurement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getObservationAccess().getMeasurementsMeasurementParserRuleCall_10_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMeasurement_in_ruleObservation594);
                    	    lv_measurements_16_0=ruleMeasurement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getObservationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"measurements",
                    	              		lv_measurements_16_0, 
                    	              		"Measurement");
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
                    break;

            }

            otherlv_17=(Token)match(input,25,FOLLOW_25_in_ruleObservation610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getObservationAccess().getRightSquareBracketKeyword_11());
                  
            }
            otherlv_18=(Token)match(input,26,FOLLOW_26_in_ruleObservation622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getObservationAccess().getRightCurlyBracketKeyword_12());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObservation"


    // $ANTLR start "entryRuleMeasurement"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:341:1: entryRuleMeasurement returns [EObject current=null] : iv_ruleMeasurement= ruleMeasurement EOF ;
    public final EObject entryRuleMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurement = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:342:2: (iv_ruleMeasurement= ruleMeasurement EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:343:2: iv_ruleMeasurement= ruleMeasurement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeasurementRule()); 
            }
            pushFollow(FOLLOW_ruleMeasurement_in_entryRuleMeasurement658);
            iv_ruleMeasurement=ruleMeasurement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeasurement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurement668); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurement"


    // $ANTLR start "ruleMeasurement"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:350:1: ruleMeasurement returns [EObject current=null] : (this_ApplicationMeasurement_0= ruleApplicationMeasurement | this_BenchmarkMeasurement_1= ruleBenchmarkMeasurement ) ;
    public final EObject ruleMeasurement() throws RecognitionException {
        EObject current = null;

        EObject this_ApplicationMeasurement_0 = null;

        EObject this_BenchmarkMeasurement_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:353:28: ( (this_ApplicationMeasurement_0= ruleApplicationMeasurement | this_BenchmarkMeasurement_1= ruleBenchmarkMeasurement ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:354:1: (this_ApplicationMeasurement_0= ruleApplicationMeasurement | this_BenchmarkMeasurement_1= ruleBenchmarkMeasurement )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:354:1: (this_ApplicationMeasurement_0= ruleApplicationMeasurement | this_BenchmarkMeasurement_1= ruleBenchmarkMeasurement )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27||LA7_0==34) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:355:5: this_ApplicationMeasurement_0= ruleApplicationMeasurement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMeasurementAccess().getApplicationMeasurementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleApplicationMeasurement_in_ruleMeasurement715);
                    this_ApplicationMeasurement_0=ruleApplicationMeasurement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ApplicationMeasurement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:365:5: this_BenchmarkMeasurement_1= ruleBenchmarkMeasurement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMeasurementAccess().getBenchmarkMeasurementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBenchmarkMeasurement_in_ruleMeasurement742);
                    this_BenchmarkMeasurement_1=ruleBenchmarkMeasurement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BenchmarkMeasurement_1; 
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
    // $ANTLR end "ruleMeasurement"


    // $ANTLR start "entryRuleApplicationMeasurement"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:381:1: entryRuleApplicationMeasurement returns [EObject current=null] : iv_ruleApplicationMeasurement= ruleApplicationMeasurement EOF ;
    public final EObject entryRuleApplicationMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationMeasurement = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:382:2: (iv_ruleApplicationMeasurement= ruleApplicationMeasurement EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:383:2: iv_ruleApplicationMeasurement= ruleApplicationMeasurement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationMeasurementRule()); 
            }
            pushFollow(FOLLOW_ruleApplicationMeasurement_in_entryRuleApplicationMeasurement777);
            iv_ruleApplicationMeasurement=ruleApplicationMeasurement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplicationMeasurement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMeasurement787); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationMeasurement"


    // $ANTLR start "ruleApplicationMeasurement"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:390:1: ruleApplicationMeasurement returns [EObject current=null] : (this_DataPointMeasurement_0= ruleDataPointMeasurement | this_TimeSeriesMeasurement_1= ruleTimeSeriesMeasurement ) ;
    public final EObject ruleApplicationMeasurement() throws RecognitionException {
        EObject current = null;

        EObject this_DataPointMeasurement_0 = null;

        EObject this_TimeSeriesMeasurement_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:393:28: ( (this_DataPointMeasurement_0= ruleDataPointMeasurement | this_TimeSeriesMeasurement_1= ruleTimeSeriesMeasurement ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:394:1: (this_DataPointMeasurement_0= ruleDataPointMeasurement | this_TimeSeriesMeasurement_1= ruleTimeSeriesMeasurement )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:394:1: (this_DataPointMeasurement_0= ruleDataPointMeasurement | this_TimeSeriesMeasurement_1= ruleTimeSeriesMeasurement )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==34) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:395:5: this_DataPointMeasurement_0= ruleDataPointMeasurement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getApplicationMeasurementAccess().getDataPointMeasurementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataPointMeasurement_in_ruleApplicationMeasurement834);
                    this_DataPointMeasurement_0=ruleDataPointMeasurement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataPointMeasurement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:405:5: this_TimeSeriesMeasurement_1= ruleTimeSeriesMeasurement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getApplicationMeasurementAccess().getTimeSeriesMeasurementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeSeriesMeasurement_in_ruleApplicationMeasurement861);
                    this_TimeSeriesMeasurement_1=ruleTimeSeriesMeasurement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TimeSeriesMeasurement_1; 
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
    // $ANTLR end "ruleApplicationMeasurement"


    // $ANTLR start "entryRuleDataPointMeasurement"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:421:1: entryRuleDataPointMeasurement returns [EObject current=null] : iv_ruleDataPointMeasurement= ruleDataPointMeasurement EOF ;
    public final EObject entryRuleDataPointMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPointMeasurement = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:422:2: (iv_ruleDataPointMeasurement= ruleDataPointMeasurement EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:423:2: iv_ruleDataPointMeasurement= ruleDataPointMeasurement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataPointMeasurementRule()); 
            }
            pushFollow(FOLLOW_ruleDataPointMeasurement_in_entryRuleDataPointMeasurement896);
            iv_ruleDataPointMeasurement=ruleDataPointMeasurement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataPointMeasurement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataPointMeasurement906); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPointMeasurement"


    // $ANTLR start "ruleDataPointMeasurement"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:430:1: ruleDataPointMeasurement returns [EObject current=null] : (otherlv_0= 'data-point' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )? (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= ',' otherlv_15= 'value' ( (lv_value_16_0= ruleValueSpecification ) ) (otherlv_17= ',' otherlv_18= 'info' ( (lv_info_19_0= RULE_STRING ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleDataPointMeasurement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_confidence_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_info_19_0=null;
        Token otherlv_20=null;
        EObject lv_workload_10_0 = null;

        EObject lv_value_16_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:433:28: ( (otherlv_0= 'data-point' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )? (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= ',' otherlv_15= 'value' ( (lv_value_16_0= ruleValueSpecification ) ) (otherlv_17= ',' otherlv_18= 'info' ( (lv_info_19_0= RULE_STRING ) ) )? otherlv_20= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:434:1: (otherlv_0= 'data-point' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )? (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= ',' otherlv_15= 'value' ( (lv_value_16_0= ruleValueSpecification ) ) (otherlv_17= ',' otherlv_18= 'info' ( (lv_info_19_0= RULE_STRING ) ) )? otherlv_20= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:434:1: (otherlv_0= 'data-point' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )? (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= ',' otherlv_15= 'value' ( (lv_value_16_0= ruleValueSpecification ) ) (otherlv_17= ',' otherlv_18= 'info' ( (lv_info_19_0= RULE_STRING ) ) )? otherlv_20= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:434:3: otherlv_0= 'data-point' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )? (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= ',' otherlv_15= 'value' ( (lv_value_16_0= ruleValueSpecification ) ) (otherlv_17= ',' otherlv_18= 'info' ( (lv_info_19_0= RULE_STRING ) ) )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleDataPointMeasurement943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDataPointMeasurementAccess().getDataPointKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:438:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:439:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:439:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:440:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataPointMeasurement960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDataPointMeasurementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataPointMeasurementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDataPointMeasurement977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDataPointMeasurementAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleDataPointMeasurement989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDataPointMeasurementAccess().getPropertyKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:464:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:465:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:465:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:466:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDataPointMeasurementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataPointMeasurementAccess().getPropertyQuantitativePropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDataPointMeasurement1012);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleDataPointMeasurement1024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDataPointMeasurementAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleDataPointMeasurement1036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDataPointMeasurementAccess().getContextKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:487:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:488:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:488:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:489:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDataPointMeasurementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataPointMeasurementAccess().getContextNamedElementCrossReference_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDataPointMeasurement1059);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:502:2: (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )?
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:502:4: otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleDataPointMeasurement1072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDataPointMeasurementAccess().getCommaKeyword_8_0());
                          
                    }
                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleDataPointMeasurement1084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDataPointMeasurementAccess().getWorkloadKeyword_8_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:510:1: ( (lv_workload_10_0= ruleSimpleWorkload ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:511:1: (lv_workload_10_0= ruleSimpleWorkload )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:511:1: (lv_workload_10_0= ruleSimpleWorkload )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:512:3: lv_workload_10_0= ruleSimpleWorkload
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataPointMeasurementAccess().getWorkloadSimpleWorkloadParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSimpleWorkload_in_ruleDataPointMeasurement1105);
                    lv_workload_10_0=ruleSimpleWorkload();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataPointMeasurementRule());
                      	        }
                             		set(
                             			current, 
                             			"workload",
                              		lv_workload_10_0, 
                              		"SimpleWorkload");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:528:4: (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==31) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:528:6: otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleDataPointMeasurement1120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDataPointMeasurementAccess().getCommaKeyword_9_0());
                          
                    }
                    otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleDataPointMeasurement1132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getDataPointMeasurementAccess().getConfidenceKeyword_9_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:536:1: ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:537:1: (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:537:1: (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:538:3: lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    lv_confidence_13_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleDataPointMeasurement1149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_confidence_13_0, grammarAccess.getDataPointMeasurementAccess().getConfidencePOSITIVE_SMALL_DECIMALTerminalRuleCall_9_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataPointMeasurementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"confidence",
                              		lv_confidence_13_0, 
                              		"POSITIVE_SMALL_DECIMAL");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleDataPointMeasurement1168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getDataPointMeasurementAccess().getCommaKeyword_10());
                  
            }
            otherlv_15=(Token)match(input,32,FOLLOW_32_in_ruleDataPointMeasurement1180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getDataPointMeasurementAccess().getValueKeyword_11());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:562:1: ( (lv_value_16_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:563:1: (lv_value_16_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:563:1: (lv_value_16_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:564:3: lv_value_16_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataPointMeasurementAccess().getValueValueSpecificationParserRuleCall_12_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleDataPointMeasurement1201);
            lv_value_16_0=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataPointMeasurementRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_16_0, 
                      		"ValueSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:580:2: (otherlv_17= ',' otherlv_18= 'info' ( (lv_info_19_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:580:4: otherlv_17= ',' otherlv_18= 'info' ( (lv_info_19_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleDataPointMeasurement1214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getDataPointMeasurementAccess().getCommaKeyword_13_0());
                          
                    }
                    otherlv_18=(Token)match(input,33,FOLLOW_33_in_ruleDataPointMeasurement1226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getDataPointMeasurementAccess().getInfoKeyword_13_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:588:1: ( (lv_info_19_0= RULE_STRING ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:589:1: (lv_info_19_0= RULE_STRING )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:589:1: (lv_info_19_0= RULE_STRING )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:590:3: lv_info_19_0= RULE_STRING
                    {
                    lv_info_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataPointMeasurement1243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_info_19_0, grammarAccess.getDataPointMeasurementAccess().getInfoSTRINGTerminalRuleCall_13_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataPointMeasurementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"info",
                              		lv_info_19_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,26,FOLLOW_26_in_ruleDataPointMeasurement1262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getDataPointMeasurementAccess().getRightCurlyBracketKeyword_14());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataPointMeasurement"


    // $ANTLR start "entryRuleTimeSeriesMeasurement"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:618:1: entryRuleTimeSeriesMeasurement returns [EObject current=null] : iv_ruleTimeSeriesMeasurement= ruleTimeSeriesMeasurement EOF ;
    public final EObject entryRuleTimeSeriesMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSeriesMeasurement = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:619:2: (iv_ruleTimeSeriesMeasurement= ruleTimeSeriesMeasurement EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:620:2: iv_ruleTimeSeriesMeasurement= ruleTimeSeriesMeasurement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeSeriesMeasurementRule()); 
            }
            pushFollow(FOLLOW_ruleTimeSeriesMeasurement_in_entryRuleTimeSeriesMeasurement1298);
            iv_ruleTimeSeriesMeasurement=ruleTimeSeriesMeasurement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeSeriesMeasurement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeSeriesMeasurement1308); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeSeriesMeasurement"


    // $ANTLR start "ruleTimeSeriesMeasurement"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:627:1: ruleTimeSeriesMeasurement returns [EObject current=null] : (otherlv_0= 'time-series' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )? (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= ',' otherlv_15= 'values' otherlv_16= '[' ( (lv_values_17_0= ruleTimeValuePair ) ) (otherlv_18= ',' ( (lv_values_19_0= ruleTimeValuePair ) ) )* otherlv_20= ']' (otherlv_21= ',' otherlv_22= 'info' ( (lv_info_23_0= RULE_STRING ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleTimeSeriesMeasurement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_confidence_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_info_23_0=null;
        Token otherlv_24=null;
        EObject lv_workload_10_0 = null;

        EObject lv_values_17_0 = null;

        EObject lv_values_19_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:630:28: ( (otherlv_0= 'time-series' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )? (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= ',' otherlv_15= 'values' otherlv_16= '[' ( (lv_values_17_0= ruleTimeValuePair ) ) (otherlv_18= ',' ( (lv_values_19_0= ruleTimeValuePair ) ) )* otherlv_20= ']' (otherlv_21= ',' otherlv_22= 'info' ( (lv_info_23_0= RULE_STRING ) ) )? otherlv_24= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:631:1: (otherlv_0= 'time-series' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )? (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= ',' otherlv_15= 'values' otherlv_16= '[' ( (lv_values_17_0= ruleTimeValuePair ) ) (otherlv_18= ',' ( (lv_values_19_0= ruleTimeValuePair ) ) )* otherlv_20= ']' (otherlv_21= ',' otherlv_22= 'info' ( (lv_info_23_0= RULE_STRING ) ) )? otherlv_24= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:631:1: (otherlv_0= 'time-series' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )? (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= ',' otherlv_15= 'values' otherlv_16= '[' ( (lv_values_17_0= ruleTimeValuePair ) ) (otherlv_18= ',' ( (lv_values_19_0= ruleTimeValuePair ) ) )* otherlv_20= ']' (otherlv_21= ',' otherlv_22= 'info' ( (lv_info_23_0= RULE_STRING ) ) )? otherlv_24= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:631:3: otherlv_0= 'time-series' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )? (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= ',' otherlv_15= 'values' otherlv_16= '[' ( (lv_values_17_0= ruleTimeValuePair ) ) (otherlv_18= ',' ( (lv_values_19_0= ruleTimeValuePair ) ) )* otherlv_20= ']' (otherlv_21= ',' otherlv_22= 'info' ( (lv_info_23_0= RULE_STRING ) ) )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleTimeSeriesMeasurement1345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTimeSeriesMeasurementAccess().getTimeSeriesKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:635:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:636:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:636:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:637:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTimeSeriesMeasurement1362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTimeSeriesMeasurementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTimeSeriesMeasurementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleTimeSeriesMeasurement1379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTimeSeriesMeasurementAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleTimeSeriesMeasurement1391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTimeSeriesMeasurementAccess().getPropertyKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:661:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:662:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:662:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:663:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTimeSeriesMeasurementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeSeriesMeasurementAccess().getPropertyQuantitativePropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTimeSeriesMeasurement1414);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleTimeSeriesMeasurement1426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTimeSeriesMeasurementAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleTimeSeriesMeasurement1438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTimeSeriesMeasurementAccess().getContextKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:684:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:685:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:685:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:686:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTimeSeriesMeasurementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeSeriesMeasurementAccess().getContextNamedElementCrossReference_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTimeSeriesMeasurement1461);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:699:2: (otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==30) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:699:4: otherlv_8= ',' otherlv_9= 'workload' ( (lv_workload_10_0= ruleSimpleWorkload ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleTimeSeriesMeasurement1474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTimeSeriesMeasurementAccess().getCommaKeyword_8_0());
                          
                    }
                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleTimeSeriesMeasurement1486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTimeSeriesMeasurementAccess().getWorkloadKeyword_8_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:707:1: ( (lv_workload_10_0= ruleSimpleWorkload ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:708:1: (lv_workload_10_0= ruleSimpleWorkload )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:708:1: (lv_workload_10_0= ruleSimpleWorkload )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:709:3: lv_workload_10_0= ruleSimpleWorkload
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeSeriesMeasurementAccess().getWorkloadSimpleWorkloadParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSimpleWorkload_in_ruleTimeSeriesMeasurement1507);
                    lv_workload_10_0=ruleSimpleWorkload();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeSeriesMeasurementRule());
                      	        }
                             		set(
                             			current, 
                             			"workload",
                              		lv_workload_10_0, 
                              		"SimpleWorkload");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:725:4: (otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )?
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:725:6: otherlv_11= ',' otherlv_12= 'confidence' ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleTimeSeriesMeasurement1522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTimeSeriesMeasurementAccess().getCommaKeyword_9_0());
                          
                    }
                    otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleTimeSeriesMeasurement1534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getTimeSeriesMeasurementAccess().getConfidenceKeyword_9_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:733:1: ( (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:734:1: (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:734:1: (lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:735:3: lv_confidence_13_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    lv_confidence_13_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleTimeSeriesMeasurement1551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_confidence_13_0, grammarAccess.getTimeSeriesMeasurementAccess().getConfidencePOSITIVE_SMALL_DECIMALTerminalRuleCall_9_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTimeSeriesMeasurementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"confidence",
                              		lv_confidence_13_0, 
                              		"POSITIVE_SMALL_DECIMAL");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleTimeSeriesMeasurement1570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getTimeSeriesMeasurementAccess().getCommaKeyword_10());
                  
            }
            otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleTimeSeriesMeasurement1582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getTimeSeriesMeasurementAccess().getValuesKeyword_11());
                  
            }
            otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleTimeSeriesMeasurement1594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getTimeSeriesMeasurementAccess().getLeftSquareBracketKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:763:1: ( (lv_values_17_0= ruleTimeValuePair ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:764:1: (lv_values_17_0= ruleTimeValuePair )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:764:1: (lv_values_17_0= ruleTimeValuePair )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:765:3: lv_values_17_0= ruleTimeValuePair
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeSeriesMeasurementAccess().getValuesTimeValuePairParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeValuePair_in_ruleTimeSeriesMeasurement1615);
            lv_values_17_0=ruleTimeValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeSeriesMeasurementRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_17_0, 
                      		"TimeValuePair");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:781:2: (otherlv_18= ',' ( (lv_values_19_0= ruleTimeValuePair ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:781:4: otherlv_18= ',' ( (lv_values_19_0= ruleTimeValuePair ) )
            	    {
            	    otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleTimeSeriesMeasurement1628); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getTimeSeriesMeasurementAccess().getCommaKeyword_14_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:785:1: ( (lv_values_19_0= ruleTimeValuePair ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:786:1: (lv_values_19_0= ruleTimeValuePair )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:786:1: (lv_values_19_0= ruleTimeValuePair )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:787:3: lv_values_19_0= ruleTimeValuePair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimeSeriesMeasurementAccess().getValuesTimeValuePairParserRuleCall_14_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTimeValuePair_in_ruleTimeSeriesMeasurement1649);
            	    lv_values_19_0=ruleTimeValuePair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimeSeriesMeasurementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_19_0, 
            	              		"TimeValuePair");
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

            otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleTimeSeriesMeasurement1663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getTimeSeriesMeasurementAccess().getRightSquareBracketKeyword_15());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:807:1: (otherlv_21= ',' otherlv_22= 'info' ( (lv_info_23_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:807:3: otherlv_21= ',' otherlv_22= 'info' ( (lv_info_23_0= RULE_STRING ) )
                    {
                    otherlv_21=(Token)match(input,20,FOLLOW_20_in_ruleTimeSeriesMeasurement1676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getTimeSeriesMeasurementAccess().getCommaKeyword_16_0());
                          
                    }
                    otherlv_22=(Token)match(input,33,FOLLOW_33_in_ruleTimeSeriesMeasurement1688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getTimeSeriesMeasurementAccess().getInfoKeyword_16_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:815:1: ( (lv_info_23_0= RULE_STRING ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:816:1: (lv_info_23_0= RULE_STRING )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:816:1: (lv_info_23_0= RULE_STRING )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:817:3: lv_info_23_0= RULE_STRING
                    {
                    lv_info_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTimeSeriesMeasurement1705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_info_23_0, grammarAccess.getTimeSeriesMeasurementAccess().getInfoSTRINGTerminalRuleCall_16_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTimeSeriesMeasurementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"info",
                              		lv_info_23_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,26,FOLLOW_26_in_ruleTimeSeriesMeasurement1724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_24, grammarAccess.getTimeSeriesMeasurementAccess().getRightCurlyBracketKeyword_17());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeSeriesMeasurement"


    // $ANTLR start "entryRuleBenchmarkMeasurement"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:845:1: entryRuleBenchmarkMeasurement returns [EObject current=null] : iv_ruleBenchmarkMeasurement= ruleBenchmarkMeasurement EOF ;
    public final EObject entryRuleBenchmarkMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBenchmarkMeasurement = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:846:2: (iv_ruleBenchmarkMeasurement= ruleBenchmarkMeasurement EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:847:2: iv_ruleBenchmarkMeasurement= ruleBenchmarkMeasurement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBenchmarkMeasurementRule()); 
            }
            pushFollow(FOLLOW_ruleBenchmarkMeasurement_in_entryRuleBenchmarkMeasurement1760);
            iv_ruleBenchmarkMeasurement=ruleBenchmarkMeasurement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBenchmarkMeasurement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBenchmarkMeasurement1770); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBenchmarkMeasurement"


    // $ANTLR start "ruleBenchmarkMeasurement"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:854:1: ruleBenchmarkMeasurement returns [EObject current=null] : (otherlv_0= 'benchmark' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'provider' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'service' ( (lv_service_10_0= RULE_STRING ) ) )? (otherlv_11= ',' otherlv_12= 'test' ( (lv_test_13_0= RULE_STRING ) ) )? (otherlv_14= ',' otherlv_15= 'workload' ( (lv_workload_16_0= RULE_STRING ) ) )? (otherlv_17= ',' otherlv_18= 'confidence' ( (lv_confidence_19_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_20= ',' otherlv_21= 'value' ( (lv_value_22_0= ruleValueSpecification ) ) (otherlv_23= ',' otherlv_24= 'info' ( (lv_info_25_0= RULE_STRING ) ) )? otherlv_26= '}' ) ;
    public final EObject ruleBenchmarkMeasurement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_service_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_test_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_workload_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_confidence_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_info_25_0=null;
        Token otherlv_26=null;
        EObject lv_value_22_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:857:28: ( (otherlv_0= 'benchmark' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'provider' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'service' ( (lv_service_10_0= RULE_STRING ) ) )? (otherlv_11= ',' otherlv_12= 'test' ( (lv_test_13_0= RULE_STRING ) ) )? (otherlv_14= ',' otherlv_15= 'workload' ( (lv_workload_16_0= RULE_STRING ) ) )? (otherlv_17= ',' otherlv_18= 'confidence' ( (lv_confidence_19_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_20= ',' otherlv_21= 'value' ( (lv_value_22_0= ruleValueSpecification ) ) (otherlv_23= ',' otherlv_24= 'info' ( (lv_info_25_0= RULE_STRING ) ) )? otherlv_26= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:858:1: (otherlv_0= 'benchmark' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'provider' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'service' ( (lv_service_10_0= RULE_STRING ) ) )? (otherlv_11= ',' otherlv_12= 'test' ( (lv_test_13_0= RULE_STRING ) ) )? (otherlv_14= ',' otherlv_15= 'workload' ( (lv_workload_16_0= RULE_STRING ) ) )? (otherlv_17= ',' otherlv_18= 'confidence' ( (lv_confidence_19_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_20= ',' otherlv_21= 'value' ( (lv_value_22_0= ruleValueSpecification ) ) (otherlv_23= ',' otherlv_24= 'info' ( (lv_info_25_0= RULE_STRING ) ) )? otherlv_26= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:858:1: (otherlv_0= 'benchmark' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'provider' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'service' ( (lv_service_10_0= RULE_STRING ) ) )? (otherlv_11= ',' otherlv_12= 'test' ( (lv_test_13_0= RULE_STRING ) ) )? (otherlv_14= ',' otherlv_15= 'workload' ( (lv_workload_16_0= RULE_STRING ) ) )? (otherlv_17= ',' otherlv_18= 'confidence' ( (lv_confidence_19_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_20= ',' otherlv_21= 'value' ( (lv_value_22_0= ruleValueSpecification ) ) (otherlv_23= ',' otherlv_24= 'info' ( (lv_info_25_0= RULE_STRING ) ) )? otherlv_26= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:858:3: otherlv_0= 'benchmark' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'provider' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'service' ( (lv_service_10_0= RULE_STRING ) ) )? (otherlv_11= ',' otherlv_12= 'test' ( (lv_test_13_0= RULE_STRING ) ) )? (otherlv_14= ',' otherlv_15= 'workload' ( (lv_workload_16_0= RULE_STRING ) ) )? (otherlv_17= ',' otherlv_18= 'confidence' ( (lv_confidence_19_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_20= ',' otherlv_21= 'value' ( (lv_value_22_0= ruleValueSpecification ) ) (otherlv_23= ',' otherlv_24= 'info' ( (lv_info_25_0= RULE_STRING ) ) )? otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleBenchmarkMeasurement1807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBenchmarkMeasurementAccess().getBenchmarkKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:862:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:863:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:863:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:864:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBenchmarkMeasurement1824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBenchmarkMeasurementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBenchmarkMeasurementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleBenchmarkMeasurement1841); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBenchmarkMeasurementAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleBenchmarkMeasurement1853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBenchmarkMeasurementAccess().getPropertyKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:888:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:889:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:889:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:890:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBenchmarkMeasurementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBenchmarkMeasurementAccess().getPropertyQuantitativePropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBenchmarkMeasurement1876);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleBenchmarkMeasurement1888); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBenchmarkMeasurementAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleBenchmarkMeasurement1900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBenchmarkMeasurementAccess().getProviderKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:911:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:912:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:912:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:913:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBenchmarkMeasurementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBenchmarkMeasurementAccess().getProviderEnumerationLiteralCrossReference_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBenchmarkMeasurement1923);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:926:2: (otherlv_8= ',' otherlv_9= 'service' ( (lv_service_10_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==38) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:926:4: otherlv_8= ',' otherlv_9= 'service' ( (lv_service_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleBenchmarkMeasurement1936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBenchmarkMeasurementAccess().getCommaKeyword_8_0());
                          
                    }
                    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleBenchmarkMeasurement1948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getBenchmarkMeasurementAccess().getServiceKeyword_8_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:934:1: ( (lv_service_10_0= RULE_STRING ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:935:1: (lv_service_10_0= RULE_STRING )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:935:1: (lv_service_10_0= RULE_STRING )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:936:3: lv_service_10_0= RULE_STRING
                    {
                    lv_service_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBenchmarkMeasurement1965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_service_10_0, grammarAccess.getBenchmarkMeasurementAccess().getServiceSTRINGTerminalRuleCall_8_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBenchmarkMeasurementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"service",
                              		lv_service_10_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:952:4: (otherlv_11= ',' otherlv_12= 'test' ( (lv_test_13_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==39) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:952:6: otherlv_11= ',' otherlv_12= 'test' ( (lv_test_13_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleBenchmarkMeasurement1985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBenchmarkMeasurementAccess().getCommaKeyword_9_0());
                          
                    }
                    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleBenchmarkMeasurement1997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getBenchmarkMeasurementAccess().getTestKeyword_9_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:960:1: ( (lv_test_13_0= RULE_STRING ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:961:1: (lv_test_13_0= RULE_STRING )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:961:1: (lv_test_13_0= RULE_STRING )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:962:3: lv_test_13_0= RULE_STRING
                    {
                    lv_test_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBenchmarkMeasurement2014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_test_13_0, grammarAccess.getBenchmarkMeasurementAccess().getTestSTRINGTerminalRuleCall_9_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBenchmarkMeasurementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"test",
                              		lv_test_13_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:978:4: (otherlv_14= ',' otherlv_15= 'workload' ( (lv_workload_16_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==30) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:978:6: otherlv_14= ',' otherlv_15= 'workload' ( (lv_workload_16_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleBenchmarkMeasurement2034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBenchmarkMeasurementAccess().getCommaKeyword_10_0());
                          
                    }
                    otherlv_15=(Token)match(input,30,FOLLOW_30_in_ruleBenchmarkMeasurement2046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getBenchmarkMeasurementAccess().getWorkloadKeyword_10_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:986:1: ( (lv_workload_16_0= RULE_STRING ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:987:1: (lv_workload_16_0= RULE_STRING )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:987:1: (lv_workload_16_0= RULE_STRING )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:988:3: lv_workload_16_0= RULE_STRING
                    {
                    lv_workload_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBenchmarkMeasurement2063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_workload_16_0, grammarAccess.getBenchmarkMeasurementAccess().getWorkloadSTRINGTerminalRuleCall_10_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBenchmarkMeasurementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"workload",
                              		lv_workload_16_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1004:4: (otherlv_17= ',' otherlv_18= 'confidence' ( (lv_confidence_19_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==31) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1004:6: otherlv_17= ',' otherlv_18= 'confidence' ( (lv_confidence_19_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleBenchmarkMeasurement2083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getBenchmarkMeasurementAccess().getCommaKeyword_11_0());
                          
                    }
                    otherlv_18=(Token)match(input,31,FOLLOW_31_in_ruleBenchmarkMeasurement2095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getBenchmarkMeasurementAccess().getConfidenceKeyword_11_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1012:1: ( (lv_confidence_19_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1013:1: (lv_confidence_19_0= RULE_POSITIVE_SMALL_DECIMAL )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1013:1: (lv_confidence_19_0= RULE_POSITIVE_SMALL_DECIMAL )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1014:3: lv_confidence_19_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    lv_confidence_19_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleBenchmarkMeasurement2112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_confidence_19_0, grammarAccess.getBenchmarkMeasurementAccess().getConfidencePOSITIVE_SMALL_DECIMALTerminalRuleCall_11_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBenchmarkMeasurementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"confidence",
                              		lv_confidence_19_0, 
                              		"POSITIVE_SMALL_DECIMAL");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,20,FOLLOW_20_in_ruleBenchmarkMeasurement2131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getBenchmarkMeasurementAccess().getCommaKeyword_12());
                  
            }
            otherlv_21=(Token)match(input,32,FOLLOW_32_in_ruleBenchmarkMeasurement2143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getBenchmarkMeasurementAccess().getValueKeyword_13());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1038:1: ( (lv_value_22_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1039:1: (lv_value_22_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1039:1: (lv_value_22_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1040:3: lv_value_22_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBenchmarkMeasurementAccess().getValueValueSpecificationParserRuleCall_14_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleBenchmarkMeasurement2164);
            lv_value_22_0=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBenchmarkMeasurementRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_22_0, 
                      		"ValueSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1056:2: (otherlv_23= ',' otherlv_24= 'info' ( (lv_info_25_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1056:4: otherlv_23= ',' otherlv_24= 'info' ( (lv_info_25_0= RULE_STRING ) )
                    {
                    otherlv_23=(Token)match(input,20,FOLLOW_20_in_ruleBenchmarkMeasurement2177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getBenchmarkMeasurementAccess().getCommaKeyword_15_0());
                          
                    }
                    otherlv_24=(Token)match(input,33,FOLLOW_33_in_ruleBenchmarkMeasurement2189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getBenchmarkMeasurementAccess().getInfoKeyword_15_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1064:1: ( (lv_info_25_0= RULE_STRING ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1065:1: (lv_info_25_0= RULE_STRING )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1065:1: (lv_info_25_0= RULE_STRING )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1066:3: lv_info_25_0= RULE_STRING
                    {
                    lv_info_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBenchmarkMeasurement2206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_info_25_0, grammarAccess.getBenchmarkMeasurementAccess().getInfoSTRINGTerminalRuleCall_15_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBenchmarkMeasurementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"info",
                              		lv_info_25_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,26,FOLLOW_26_in_ruleBenchmarkMeasurement2225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_26, grammarAccess.getBenchmarkMeasurementAccess().getRightCurlyBracketKeyword_16());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBenchmarkMeasurement"


    // $ANTLR start "entryRuleTimeValuePair"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1094:1: entryRuleTimeValuePair returns [EObject current=null] : iv_ruleTimeValuePair= ruleTimeValuePair EOF ;
    public final EObject entryRuleTimeValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1095:2: (iv_ruleTimeValuePair= ruleTimeValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1096:2: iv_ruleTimeValuePair= ruleTimeValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeValuePairRule()); 
            }
            pushFollow(FOLLOW_ruleTimeValuePair_in_entryRuleTimeValuePair2261);
            iv_ruleTimeValuePair=ruleTimeValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeValuePair2271); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeValuePair"


    // $ANTLR start "ruleTimeValuePair"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1103:1: ruleTimeValuePair returns [EObject current=null] : ( ( (lv_dateTime_0_0= RULE_DATE_TIME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject ruleTimeValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_dateTime_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1106:28: ( ( ( (lv_dateTime_0_0= RULE_DATE_TIME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1107:1: ( ( (lv_dateTime_0_0= RULE_DATE_TIME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1107:1: ( ( (lv_dateTime_0_0= RULE_DATE_TIME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1107:2: ( (lv_dateTime_0_0= RULE_DATE_TIME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1107:2: ( (lv_dateTime_0_0= RULE_DATE_TIME ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1108:1: (lv_dateTime_0_0= RULE_DATE_TIME )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1108:1: (lv_dateTime_0_0= RULE_DATE_TIME )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1109:3: lv_dateTime_0_0= RULE_DATE_TIME
            {
            lv_dateTime_0_0=(Token)match(input,RULE_DATE_TIME,FOLLOW_RULE_DATE_TIME_in_ruleTimeValuePair2313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_dateTime_0_0, grammarAccess.getTimeValuePairAccess().getDateTimeDATE_TIMETerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTimeValuePairRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"dateTime",
                      		lv_dateTime_0_0, 
                      		"DATE_TIME");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleTimeValuePair2330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTimeValuePairAccess().getColonKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1129:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1130:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1130:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1131:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleTimeValuePair2351);
            lv_value_2_0=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeValuePairRule());
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
    // $ANTLR end "ruleTimeValuePair"


    // $ANTLR start "entryRuleSimpleWorkload"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1155:1: entryRuleSimpleWorkload returns [EObject current=null] : iv_ruleSimpleWorkload= ruleSimpleWorkload EOF ;
    public final EObject entryRuleSimpleWorkload() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleWorkload = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1156:2: (iv_ruleSimpleWorkload= ruleSimpleWorkload EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1157:2: iv_ruleSimpleWorkload= ruleSimpleWorkload EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleWorkloadRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleWorkload_in_entryRuleSimpleWorkload2387);
            iv_ruleSimpleWorkload=ruleSimpleWorkload();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleWorkload; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleWorkload2397); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleWorkload"


    // $ANTLR start "ruleSimpleWorkload"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1164:1: ruleSimpleWorkload returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'with' ( (lv_pattern_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleWorkload() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pattern_2_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1167:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'with' ( (lv_pattern_2_0= RULE_STRING ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1168:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'with' ( (lv_pattern_2_0= RULE_STRING ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1168:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'with' ( (lv_pattern_2_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1168:2: ( ( ruleQualifiedName ) ) otherlv_1= 'with' ( (lv_pattern_2_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1168:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1169:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1169:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1170:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSimpleWorkloadRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleWorkloadAccess().getActivityActivityCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSimpleWorkload2445);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleSimpleWorkload2457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSimpleWorkloadAccess().getWithKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1187:1: ( (lv_pattern_2_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1188:1: (lv_pattern_2_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1188:1: (lv_pattern_2_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1189:3: lv_pattern_2_0= RULE_STRING
            {
            lv_pattern_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleWorkload2474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_pattern_2_0, grammarAccess.getSimpleWorkloadAccess().getPatternSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSimpleWorkloadRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"pattern",
                      		lv_pattern_2_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleSimpleWorkload"


    // $ANTLR start "entryRuleExpression"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1213:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1214:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1215:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2515);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2525); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1222:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1225:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1227:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression2571);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1243:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1244:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1245:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication2605);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication2615); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1252:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1255:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1256:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1256:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1257:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication2662);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1265:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=52 && LA21_0<=53)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1265:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1265:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1266:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1271:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1272:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1272:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1273:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication2692);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1289:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1290:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1290:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1291:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication2713);
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
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1315:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1316:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1317:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction2751);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction2761); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1324:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1327:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1328:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1328:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1329:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction2808);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1337:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=46 && LA23_0<=49)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1337:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1337:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1338:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1343:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1344:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1344:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1345:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1345:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( ((LA22_0>=46 && LA22_0<=47)) ) {
            	        alt22=1;
            	    }
            	    else if ( ((LA22_0>=48 && LA22_0<=49)) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1346:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction2840);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1361:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction2859);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1379:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1380:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1380:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1381:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction2883);
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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1405:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1406:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1407:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction2921);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction2931); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1414:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1417:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1418:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1418:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1419:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction2978);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1427:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=50 && LA24_0<=51)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1427:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1427:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1428:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1433:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1434:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1434:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1435:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction3008);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1451:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1452:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1452:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1453:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction3029);
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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleComparison"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1477:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1478:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1479:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison3067);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison3077); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1486:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1489:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1490:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1490:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1491:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison3124);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1499:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=54 && LA26_0<=56)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1499:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1499:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1500:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1505:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1506:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1506:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1507:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1507:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==54) ) {
            	        alt25=1;
            	    }
            	    else if ( ((LA25_0>=55 && LA25_0<=56)) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1508:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison3156);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1523:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison3175);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1541:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1542:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1542:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1543:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison3199);
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
            	    break loop26;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1567:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1568:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1569:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit3237);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit3247); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1576:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1579:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1580:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1580:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 57:
            case 58:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_NULL:
            case RULE_INT:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
            case 42:
            case 45:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt27=2;
                }
                break;
            case RULE_EBOOLEAN:
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1581:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit3294);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1591:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit3321);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1601:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit3348);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1617:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1618:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1619:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation3383);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation3393); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1626:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1629:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1630:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1630:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1630:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1630:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1631:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1631:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1632:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation3439);
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

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1648:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1649:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1649:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1650:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation3460);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1674:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1675:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1676:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3496);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression3506); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1683:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1686:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1687:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1687:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1688:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3553);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1696:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=59 && LA29_0<=62)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1696:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1696:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt28=4;
            	    switch ( input.LA(1) ) {
            	    case 59:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    case 61:
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
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1696:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1696:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1696:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1696:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1697:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1702:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1703:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1703:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1704:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression3585);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1721:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1721:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1721:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1721:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1722:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1727:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1728:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1728:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1729:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression3623);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1746:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1746:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1746:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1746:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1747:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1752:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1753:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1753:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1754:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression3661);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1771:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1771:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1771:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1771:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1772:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1777:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1778:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1778:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1779:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression3699);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1795:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1796:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1796:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1797:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3722);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleComparableExpression"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1821:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1822:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1823:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression3760);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression3770); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1830:1: ruleComparableExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1833:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1834:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1834:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            int alt30=7;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1835:5: this_ArithmeticExpression_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression3817);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1845:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression3844);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1855:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression3871);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1865:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleComparableExpression3898);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1875:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleComparableExpression3925);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1885:5: this_UnlimitedLiteral_5= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getUnlimitedLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression3952);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1895:5: this_ParenthesizedExpression_6= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getParenthesizedExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression3979);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1911:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1912:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1913:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression4014);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression4024); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1920:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1923:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1925:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression4070);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1941:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1942:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1943:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression4104);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression4114); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1950:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1953:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1954:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1954:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1955:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression4161);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1963:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=63 && LA32_0<=64)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1963:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1963:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1964:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1969:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1970:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1970:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1971:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1971:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==64) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==63) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1972:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression4193);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:1987:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression4212);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2005:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2006:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2006:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2007:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression4236);
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2031:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2032:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2033:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression4274);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression4284); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2040:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2043:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2044:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2044:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2045:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression4331);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2053:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==45||(LA34_0>=65 && LA34_0<=66)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2053:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2053:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2054:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2059:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2060:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2060:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2061:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2061:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt33=3;
            	    switch ( input.LA(1) ) {
            	    case 45:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 66:
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
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2062:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression4363);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2077:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression4382);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2092:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression4401);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2110:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2111:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2111:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2112:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression4425);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleNumberExpression"
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2136:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2137:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2138:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4463);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression4473); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2145:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2148:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2149:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2149:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_POSITIVE_SMALL_DECIMAL||(LA35_0>=RULE_INT && LA35_0<=RULE_EBIGDECIMAL)) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=67 && LA35_0<=74)) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2150:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression4520);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2160:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression4547);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2176:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2177:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2178:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction4582);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction4592); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2185:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2188:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2189:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2189:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt36=8;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt36=1;
                }
                break;
            case 68:
                {
                alt36=2;
                }
                break;
            case 69:
                {
                alt36=3;
                }
                break;
            case 70:
                {
                alt36=4;
                }
                break;
            case 71:
                {
                alt36=5;
                }
                break;
            case 72:
                {
                alt36=6;
                }
                break;
            case 73:
                {
                alt36=7;
                }
                break;
            case 74:
                {
                alt36=8;
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2190:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction4639);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2200:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction4666);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2210:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction4693);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2220:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction4720);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2230:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction4747);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2240:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction4774);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2250:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction4801);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2260:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction4828);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2276:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2277:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2278:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction4863);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction4873); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2285:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2288:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2289:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2289:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2289:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2289:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2290:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2290:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2291:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction4919);
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleMaximumFunction4931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2311:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2312:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2312:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2313:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4952);
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

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2329:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==20) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2329:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMaximumFunction4965); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2333:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2334:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2334:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2335:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4986);
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
            	    break loop37;
                }
            } while (true);

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleMaximumFunction5000); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2363:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2364:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2365:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction5036);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction5046); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2372:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2375:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2376:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2376:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2376:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2376:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2377:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2377:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2378:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction5092);
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleMinimumFunction5104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2398:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2399:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2399:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2400:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction5125);
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

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2416:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==20) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2416:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMinimumFunction5138); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2420:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2421:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2421:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2422:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction5159);
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
            	    break loop38;
                }
            } while (true);

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleMinimumFunction5173); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2450:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2451:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2452:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction5209);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction5219); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2459:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2462:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2463:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2463:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2463:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2463:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2464:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2464:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2465:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction5265);
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleAverageFunction5277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2485:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2486:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2486:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2487:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction5298);
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

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2503:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==20) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2503:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAverageFunction5311); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2507:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2508:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2508:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2509:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction5332);
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
            	    break loop39;
                }
            } while (true);

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleAverageFunction5346); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2537:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2538:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2539:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction5382);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction5392); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2546:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2549:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2550:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2550:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2550:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2550:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2551:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2551:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2552:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction5438);
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleSumFunction5450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2572:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2573:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2573:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2574:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction5471);
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

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2590:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==20) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2590:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSumFunction5484); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2594:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2595:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2595:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2596:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction5505);
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
            	    break loop40;
                }
            } while (true);

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleSumFunction5519); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2624:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2625:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2626:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction5555);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction5565); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2633:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2636:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2637:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2637:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2637:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2637:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2638:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2638:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2639:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction5611);
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleExponentialFunction5623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2659:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2660:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2660:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2661:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5644);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleExponentialFunction5656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2681:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2682:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2682:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2683:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5677);
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

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleExponentialFunction5689); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2711:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2712:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2713:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction5725);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction5735); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2720:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2723:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2724:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2724:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2724:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2724:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2725:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2725:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2726:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction5781);
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleAbsoluteFunction5793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2746:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2747:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2747:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2748:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction5814);
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

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleAbsoluteFunction5826); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2776:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2777:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2778:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction5862);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction5872); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2785:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2788:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2789:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2789:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2789:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2789:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2790:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2790:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2791:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction5918);
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleNaturalLogarithmFunction5930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2811:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2812:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2812:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2813:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction5951);
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

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleNaturalLogarithmFunction5963); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2841:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2842:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2843:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction5999);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction6009); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2850:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2853:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2854:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2854:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2854:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2854:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2855:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2855:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2856:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction6055);
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleCommonLogarithmFunction6067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2876:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2877:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2877:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2878:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction6088);
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

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleCommonLogarithmFunction6100); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2906:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2907:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2908:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression6136);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression6146); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2915:1: ruleParenthesizedExpression returns [EObject current=null] : ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2918:28: ( ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2919:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2919:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2920:5: ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression6187);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2927:1: ( (lv_value_1_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2928:1: (lv_value_1_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2928:1: (lv_value_1_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2929:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression6207);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression6223);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2961:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2962:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2963:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification6258);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification6268); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2970:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2973:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2974:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2974:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt41=3;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2975:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification6315);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2985:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification6342);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:2995:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification6369);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3011:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3012:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3013:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression6404);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression6414); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3020:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3023:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3024:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3024:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3024:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3024:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3025:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3025:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3026:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression6462);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3039:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==24) ) {
                alt42=1;
            }
            else if ( (LA42_0==18) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3039:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3039:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3040:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3040:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3041:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression6484);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3058:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3058:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3059:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3059:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3060:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression6511);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3084:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3085:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3086:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection6548);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection6558); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3093:1: ruleCollection returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3096:28: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3097:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3097:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3097:2: () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3097:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3098:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCollectionAccess().getCollectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCollection6604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3107:1: ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||(LA44_0>=RULE_STRING && LA44_0<=RULE_EBIGDECIMAL)||LA44_0==45) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3107:2: ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3107:2: ( (lv_values_2_0= ruleValueSpecification ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3108:1: (lv_values_2_0= ruleValueSpecification )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3108:1: (lv_values_2_0= ruleValueSpecification )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3109:3: lv_values_2_0= ruleValueSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection6626);
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

                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3125:2: (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==20) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3125:4: otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCollection6639); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3129:1: ( (lv_values_4_0= ruleValueSpecification ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3130:1: (lv_values_4_0= ruleValueSpecification )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3130:1: (lv_values_4_0= ruleValueSpecification )
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3131:3: lv_values_4_0= ruleValueSpecification
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection6660);
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
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleCollection6676); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3159:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3160:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3161:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple6712);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple6722); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3168:1: ruleTuple returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tuples_2_0 = null;

        EObject lv_tuples_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3171:28: ( ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3172:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3172:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3172:2: () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3172:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3173:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTupleAccess().getTupleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTuple6768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3182:1: ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3182:2: ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3182:2: ( (lv_tuples_2_0= rulePropertyValuePair ) )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3183:1: (lv_tuples_2_0= rulePropertyValuePair )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3183:1: (lv_tuples_2_0= rulePropertyValuePair )
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3184:3: lv_tuples_2_0= rulePropertyValuePair
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple6790);
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

                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3200:2: (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==20) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3200:4: otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTuple6803); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3204:1: ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3205:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3205:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3206:3: lv_tuples_4_0= rulePropertyValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple6824);
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleTuple6840); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3234:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3235:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3236:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair6876);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair6886); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3243:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3246:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3247:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3247:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3247:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3247:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3248:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3248:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3249:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair6934);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_rulePropertyValuePair6946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3266:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3267:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3267:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3268:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair6967);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3292:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3293:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3294:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression7003);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression7013); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3301:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3304:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3305:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3305:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3306:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3306:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3307:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression7060);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3328:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3329:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3330:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression7095);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression7105); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3337:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3340:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3341:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3341:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt47=5;
            switch ( input.LA(1) ) {
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_INT:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt47=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt47=2;
                }
                break;
            case RULE_NULL:
                {
                alt47=3;
                }
                break;
            case RULE_STRING:
                {
                alt47=4;
                }
                break;
            case 45:
                {
                alt47=5;
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3342:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression7152);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3352:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression7179);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3362:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression7206);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3372:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression7233);
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3382:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression7260);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3398:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3399:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3400:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral7295);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral7305); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3407:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3410:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3411:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3411:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3412:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3412:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3413:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral7346); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3437:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3438:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3439:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral7386);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral7396); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3446:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3449:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3450:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3450:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3451:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3451:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3452:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral7441);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3476:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3477:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3478:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral7476);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral7486); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3485:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3488:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3489:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3489:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3490:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3490:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3491:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral7527); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3515:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3516:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3517:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7567);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral7577); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3524:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3527:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3528:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3528:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3529:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3529:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3530:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral7618); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3554:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3555:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3556:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral7658);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral7668); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3563:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3566:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3567:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3567:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3568:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3568:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3569:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,45,FOLLOW_45_in_ruleUnlimitedLiteral7710); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3590:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3591:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3592:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator7758);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator7768); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3599:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3602:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3603:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3603:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3603:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3603:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3604:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3609:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==46) ) {
                alt48=1;
            }
            else if ( (LA48_0==47) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3609:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleOrOperator7815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3614:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleOrOperator7833); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3626:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3627:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3628:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator7870);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator7880); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3635:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3638:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3639:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3639:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3639:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3639:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3640:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3645:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==48) ) {
                alt49=1;
            }
            else if ( (LA49_0==49) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3645:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXOrOperator7927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3650:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXOrOperator7945); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3662:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3663:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3664:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator7982);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator7992); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3671:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3674:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3675:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3675:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3675:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3675:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3676:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3681:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==50) ) {
                alt50=1;
            }
            else if ( (LA50_0==51) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3681:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleAndOperator8039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3686:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleAndOperator8057); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3698:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3699:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3700:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator8094);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator8104); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3707:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3710:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3711:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3711:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3711:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3711:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3712:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3717:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==52) ) {
                alt51=1;
            }
            else if ( (LA51_0==53) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3717:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleImplicationOperator8151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3722:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleImplicationOperator8169); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3734:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3735:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3736:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator8206);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator8216); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3743:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3746:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3747:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3747:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3747:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3747:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3748:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleEqualsOperator8262); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3765:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3766:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3767:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator8298);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator8308); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3774:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3777:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3778:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3778:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3778:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3778:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3779:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3784:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==55) ) {
                alt52=1;
            }
            else if ( (LA52_0==56) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3784:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleNotEqualsOperator8355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3789:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleNotEqualsOperator8373); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3801:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3802:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3803:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator8410);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator8420); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3810:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3813:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3814:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3814:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3814:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3814:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3815:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3820:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==57) ) {
                alt53=1;
            }
            else if ( (LA53_0==58) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3820:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleNotOperator8467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3825:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleNotOperator8485); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3837:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3838:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3839:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator8522);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator8532); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3846:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3849:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3850:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3850:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3850:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3850:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3851:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleGreaterThanOperator8578); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3868:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3869:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3870:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator8614);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator8624); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3877:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3880:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3881:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3881:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3881:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3881:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3882:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleGreaterOrEqualThanOperator8670); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3899:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3900:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3901:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator8706);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator8716); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3908:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3911:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3912:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3912:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3912:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3912:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3913:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleLessThanOperator8762); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3930:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3931:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3932:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator8798);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator8808); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3939:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3942:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3943:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3943:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3943:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3943:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3944:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleLessOrEqualThanOperator8854); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3961:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3962:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3963:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator8890);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator8900); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3970:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3973:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3974:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3974:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3974:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3974:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3975:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleAdditionOperator8946); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3992:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3993:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:3994:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator8982);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator8992); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4001:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4004:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4005:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4005:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4005:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4005:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4006:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleSubstractionOperator9038); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4023:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4024:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4025:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator9074);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator9084); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4032:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4035:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4036:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4036:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4036:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4036:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4037:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleMultiplicationOperator9130); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4054:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4055:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4056:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator9166);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator9176); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4063:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4066:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4067:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4067:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4067:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4067:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4068:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleDivisionOperator9222); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4085:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4086:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4087:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator9258);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator9268); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4094:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4097:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4098:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4098:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4098:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4098:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4099:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleModulusOperator9314); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4116:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4117:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4118:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator9350);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator9360); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4125:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4128:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4129:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4129:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4129:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4129:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4130:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleMaxOperator9406); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4147:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4148:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4149:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator9442);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator9452); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4156:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4159:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4160:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4160:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4160:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4160:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4161:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleMinOperator9498); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4178:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4179:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4180:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator9534);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator9544); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4187:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4190:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4191:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4191:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4191:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4191:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4192:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleAvgOperator9590); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4209:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4210:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4211:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator9626);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator9636); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4218:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4221:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4222:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4222:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4222:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4222:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4223:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleSumOperator9682); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4240:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4241:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4242:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator9718);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator9728); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4249:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4252:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4253:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4253:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4253:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4253:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4254:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleExponentialOperator9774); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4271:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4272:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4273:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator9810);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator9820); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4280:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4283:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4284:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4284:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4284:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4284:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4285:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleAbsoluteOperator9866); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4302:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4303:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4304:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator9902);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator9912); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4311:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4314:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4315:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4315:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4315:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4315:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4316:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleNaturalLogarithmOperator9958); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4333:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4334:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4335:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator9994);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator10004); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4342:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4345:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4346:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4346:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4346:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4346:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4347:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleCommonLogarithmOperator10050); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4364:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4365:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4366:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis10087);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis10098); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4373:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4376:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4378:2: kw= '('
            {
            kw=(Token)match(input,42,FOLLOW_42_in_ruleLeftParenthesis10135); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4391:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4392:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4393:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis10175);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis10186); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4400:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4403:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4405:2: kw= ')'
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleRightParenthesis10223); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4418:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4419:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4420:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10263);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10274); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4427:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4430:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4431:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4431:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4431:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName10314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4438:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==75) && (synpred1_InternalPML())) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4438:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4438:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4438:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,75,FOLLOW_75_in_ruleQualifiedName10342); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName10358); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4463:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4464:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4465:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard10408);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard10419); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4472:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4475:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4476:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4476:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4477:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard10466);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4487:1: (kw= '.*' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==76) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4488:2: kw= '.*'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleQualifiedNameWithWildcard10485); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4505:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4506:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4507:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace10531);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace10541); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4514:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4517:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4518:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4518:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4518:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleImportNamespace10578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4522:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4523:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4523:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4524:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace10599);
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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4548:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4549:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4550:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10636);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10647); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4557:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4560:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4561:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4561:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt56=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt56=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt56=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt56=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt56=4;
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
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4561:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4569:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber10713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4577:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber10739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4585:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber10765); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalPML
    public final void synpred1_InternalPML_fragment() throws RecognitionException {   
        // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4438:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.pml/src-gen/eu/artist/postmigration/nfrvt/lang/pml/parser/antlr/internal/InternalPML.g:4439:2: '.'
        {
        match(input,75,FOLLOW_75_in_synpred1_InternalPML10333); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalPML

    // Delegated rules

    public final boolean synpred1_InternalPML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA30_eotS =
        "\13\uffff";
    static final String DFA30_eofS =
        "\2\uffff\1\10\7\uffff\1\10";
    static final String DFA30_minS =
        "\1\4\1\uffff\1\22\4\uffff\1\4\2\uffff\1\22";
    static final String DFA30_maxS =
        "\1\112\1\uffff\1\113\4\uffff\1\4\2\uffff\1\113";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\2\1\3\1\uffff";
    static final String DFA30_specialS =
        "\13\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\2\1\uffff\1\4\1\1\1\uffff\1\3\3\1\35\uffff\1\6\2\uffff\1"+
            "\5\25\uffff\10\1",
            "",
            "\1\11\5\uffff\1\11\22\uffff\1\10\2\uffff\13\10\2\uffff\4\10"+
            "\14\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "\1\11\5\uffff\1\11\22\uffff\1\10\2\uffff\13\10\2\uffff\4\10"+
            "\14\uffff\1\7"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1834:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )";
        }
    }
    static final String DFA41_eotS =
        "\7\uffff";
    static final String DFA41_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA41_minS =
        "\1\4\1\uffff\1\22\1\4\2\uffff\1\22";
    static final String DFA41_maxS =
        "\1\55\1\uffff\1\113\1\4\2\uffff\1\113";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA41_specialS =
        "\7\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\2\1\uffff\7\1\40\uffff\1\1",
            "",
            "\1\5\1\uffff\1\4\3\uffff\1\5\2\4\60\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\5\1\uffff\1\4\3\uffff\1\5\2\4\60\uffff\1\3"
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
            return "2974:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleARTISTModel_in_entryRuleARTISTModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleARTISTModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementModel_in_ruleARTISTModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementModel_in_entryRuleMeasurementModel165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementModel175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_ruleMeasurementModel230 = new BitSet(new long[]{0x0000000000020002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObservation_in_ruleMeasurementModel252 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleObservation_in_entryRuleObservation289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObservation299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleObservation336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObservation353 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleObservation370 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleObservation382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DATE_TIME_in_ruleObservation399 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleObservation417 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleObservation429 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObservation446 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleObservation466 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleObservation478 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObservation495 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleObservation514 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleObservation526 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleObservation538 = new BitSet(new long[]{0x000000140A000000L});
    public static final BitSet FOLLOW_ruleMeasurement_in_ruleObservation560 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleObservation573 = new BitSet(new long[]{0x0000001408000000L});
    public static final BitSet FOLLOW_ruleMeasurement_in_ruleObservation594 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_ruleObservation610 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleObservation622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurement_in_entryRuleMeasurement658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMeasurement_in_ruleMeasurement715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBenchmarkMeasurement_in_ruleMeasurement742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMeasurement_in_entryRuleApplicationMeasurement777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMeasurement787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataPointMeasurement_in_ruleApplicationMeasurement834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeSeriesMeasurement_in_ruleApplicationMeasurement861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataPointMeasurement_in_entryRuleDataPointMeasurement896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataPointMeasurement906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataPointMeasurement943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataPointMeasurement960 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataPointMeasurement977 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDataPointMeasurement989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDataPointMeasurement1012 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDataPointMeasurement1024 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDataPointMeasurement1036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDataPointMeasurement1059 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDataPointMeasurement1072 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDataPointMeasurement1084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSimpleWorkload_in_ruleDataPointMeasurement1105 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDataPointMeasurement1120 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDataPointMeasurement1132 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleDataPointMeasurement1149 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDataPointMeasurement1168 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDataPointMeasurement1180 = new BitSet(new long[]{0x0000200000001FD0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleDataPointMeasurement1201 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20_in_ruleDataPointMeasurement1214 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDataPointMeasurement1226 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataPointMeasurement1243 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDataPointMeasurement1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeSeriesMeasurement_in_entryRuleTimeSeriesMeasurement1298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeSeriesMeasurement1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTimeSeriesMeasurement1345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTimeSeriesMeasurement1362 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTimeSeriesMeasurement1379 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTimeSeriesMeasurement1391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTimeSeriesMeasurement1414 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimeSeriesMeasurement1426 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTimeSeriesMeasurement1438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTimeSeriesMeasurement1461 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimeSeriesMeasurement1474 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTimeSeriesMeasurement1486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSimpleWorkload_in_ruleTimeSeriesMeasurement1507 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimeSeriesMeasurement1522 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTimeSeriesMeasurement1534 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleTimeSeriesMeasurement1551 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimeSeriesMeasurement1570 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTimeSeriesMeasurement1582 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTimeSeriesMeasurement1594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTimeValuePair_in_ruleTimeSeriesMeasurement1615 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleTimeSeriesMeasurement1628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTimeValuePair_in_ruleTimeSeriesMeasurement1649 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_ruleTimeSeriesMeasurement1663 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20_in_ruleTimeSeriesMeasurement1676 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTimeSeriesMeasurement1688 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTimeSeriesMeasurement1705 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTimeSeriesMeasurement1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBenchmarkMeasurement_in_entryRuleBenchmarkMeasurement1760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBenchmarkMeasurement1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBenchmarkMeasurement1807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBenchmarkMeasurement1824 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBenchmarkMeasurement1841 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleBenchmarkMeasurement1853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBenchmarkMeasurement1876 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBenchmarkMeasurement1888 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBenchmarkMeasurement1900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBenchmarkMeasurement1923 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBenchmarkMeasurement1936 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBenchmarkMeasurement1948 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBenchmarkMeasurement1965 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBenchmarkMeasurement1985 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleBenchmarkMeasurement1997 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBenchmarkMeasurement2014 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBenchmarkMeasurement2034 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleBenchmarkMeasurement2046 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBenchmarkMeasurement2063 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBenchmarkMeasurement2083 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBenchmarkMeasurement2095 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleBenchmarkMeasurement2112 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBenchmarkMeasurement2131 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBenchmarkMeasurement2143 = new BitSet(new long[]{0x0000200000001FD0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleBenchmarkMeasurement2164 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20_in_ruleBenchmarkMeasurement2177 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBenchmarkMeasurement2189 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBenchmarkMeasurement2206 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBenchmarkMeasurement2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeValuePair_in_entryRuleTimeValuePair2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeValuePair2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_TIME_in_ruleTimeValuePair2313 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleTimeValuePair2330 = new BitSet(new long[]{0x0000200000001FD0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleTimeValuePair2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleWorkload_in_entryRuleSimpleWorkload2387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleWorkload2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSimpleWorkload2445 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSimpleWorkload2457 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleWorkload2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication2605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication2662 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication2692 = new BitSet(new long[]{0x0600240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication2713 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction2751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction2808 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction2840 = new BitSet(new long[]{0x0600240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction2859 = new BitSet(new long[]{0x0600240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction2883 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction2921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction2978 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction3008 = new BitSet(new long[]{0x0600240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction3029 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison3067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison3124 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison3156 = new BitSet(new long[]{0x0600240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison3175 = new BitSet(new long[]{0x0600240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison3199 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit3237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation3383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation3439 = new BitSet(new long[]{0x0600240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3553 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression3585 = new BitSet(new long[]{0x0000240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression3623 = new BitSet(new long[]{0x0000240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression3661 = new BitSet(new long[]{0x0000240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression3699 = new BitSet(new long[]{0x0000240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3722 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression3760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleComparableExpression3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleComparableExpression3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression4014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression4104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression4161 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression4193 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression4212 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression4236 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression4274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression4331 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression4363 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression4382 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression4401 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression4425 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction4582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction4863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction4919 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleMaximumFunction4931 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4952 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_20_in_ruleMaximumFunction4965 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4986 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_43_in_ruleMaximumFunction5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction5036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction5092 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleMinimumFunction5104 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction5125 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_20_in_ruleMinimumFunction5138 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction5159 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_43_in_ruleMinimumFunction5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction5209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction5265 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAverageFunction5277 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction5298 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_20_in_ruleAverageFunction5311 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction5332 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_43_in_ruleAverageFunction5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction5382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction5438 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSumFunction5450 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction5471 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_20_in_ruleSumFunction5484 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction5505 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_43_in_ruleSumFunction5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction5555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction5611 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleExponentialFunction5623 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5644 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExponentialFunction5656 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5677 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleExponentialFunction5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction5725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction5781 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAbsoluteFunction5793 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction5814 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAbsoluteFunction5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction5862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction5918 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleNaturalLogarithmFunction5930 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction5951 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleNaturalLogarithmFunction5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction5999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction6055 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleCommonLogarithmFunction6067 = new BitSet(new long[]{0x0000000000001C80L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction6088 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleCommonLogarithmFunction6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression6136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression6187 = new BitSet(new long[]{0x0600240000001FD0L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression6207 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification6258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression6404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression6462 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection6548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCollection6604 = new BitSet(new long[]{0x0000200002001FD0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection6626 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleCollection6639 = new BitSet(new long[]{0x0000200000001FD0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection6660 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_ruleCollection6676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple6712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTuple6768 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple6790 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20_in_ruleTuple6803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple6824 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_26_in_ruleTuple6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair6876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair6934 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rulePropertyValuePair6946 = new BitSet(new long[]{0x0000200000001FD0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression7003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression7095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression7233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral7295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral7386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral7441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral7476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral7618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral7658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleUnlimitedLiteral7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator7758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOrOperator7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOrOperator7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator7870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator7880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXOrOperator7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXOrOperator7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator7982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAndOperator8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAndOperator8057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator8094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleImplicationOperator8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleImplicationOperator8169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator8206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEqualsOperator8262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator8298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator8308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNotEqualsOperator8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNotEqualsOperator8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator8410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator8420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNotOperator8467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNotOperator8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator8522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator8532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleGreaterThanOperator8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator8614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleGreaterOrEqualThanOperator8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator8706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator8716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLessThanOperator8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator8798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator8808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLessOrEqualThanOperator8854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator8890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator8900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleAdditionOperator8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator8982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator8992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSubstractionOperator9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator9074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator9084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMultiplicationOperator9130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator9166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDivisionOperator9222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator9258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator9268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleModulusOperator9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator9350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator9360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleMaxOperator9406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator9442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator9452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleMinOperator9498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator9534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator9544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleAvgOperator9590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator9626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator9636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleSumOperator9682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator9718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator9728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleExponentialOperator9774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator9810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator9820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAbsoluteOperator9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator9902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator9912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleNaturalLogarithmOperator9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator9994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator10004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCommonLogarithmOperator10050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis10087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLeftParenthesis10135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis10175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis10186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRightParenthesis10223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName10314 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleQualifiedName10342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName10358 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard10408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard10419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard10466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleQualifiedNameWithWildcard10485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace10531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace10541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleImportNamespace10578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace10599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber10713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber10739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber10765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred1_InternalPML10333 = new BitSet(new long[]{0x0000000000000002L});

}