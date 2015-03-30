package eu.artist.postmigration.nfrvt.lang.common.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.artist.postmigration.nfrvt.lang.common.services.ARTISTCommonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalARTISTCommonParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EBOOLEAN", "RULE_NULL", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_SMALL_DECIMAL", "RULE_EBIGDECIMAL", "RULE_DATE_TIME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "','", "')'", "'['", "']'", "'{'", "'}'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'"
    };
    public static final int RULE_ID=7;
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
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
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
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_NULL=5;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DATE_TIME=12;
    public static final int RULE_POSITIVE_SMALL_DECIMAL=9;
    public static final int RULE_EBOOLEAN=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=15;

    // delegates
    // delegators


        public InternalARTISTCommonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalARTISTCommonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalARTISTCommonParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g"; }



     	private ARTISTCommonGrammarAccess grammarAccess;
     	
        public InternalARTISTCommonParser(TokenStream input, ARTISTCommonGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Expression";	
       	}
       	
       	@Override
       	protected ARTISTCommonGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleExpression"
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:67:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:68:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:69:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression75);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression85); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:76:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:79:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:81:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression131);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:97:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:98:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:99:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication165);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication175); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:106:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:109:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:110:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:110:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:111:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication222);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:119:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=32 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:119:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:119:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:120:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:125:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:126:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:126:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:127:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication252);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:143:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:144:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:144:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:145:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication273);
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
            	    break loop1;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:169:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:170:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:171:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction311);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction321); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:178:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:181:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:182:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:182:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:183:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction368);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:191:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=26 && LA3_0<=29)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:191:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:191:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:192:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:197:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:198:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:198:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:199:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:199:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( ((LA2_0>=26 && LA2_0<=27)) ) {
            	        alt2=1;
            	    }
            	    else if ( ((LA2_0>=28 && LA2_0<=29)) ) {
            	        alt2=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:200:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction400);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:215:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction419);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:233:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:234:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:234:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:235:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction443);
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
            	    break loop3;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:259:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:260:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:261:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction481);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction491); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:268:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:271:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:272:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:272:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:273:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction538);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:281:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=30 && LA4_0<=31)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:281:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:281:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:282:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:287:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:288:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:288:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:289:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction568);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:305:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:306:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:306:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:307:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction589);
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
            	    break loop4;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:331:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:332:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:333:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison627);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison637); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:340:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:343:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:344:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:344:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:345:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison684);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:353:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=34 && LA6_0<=36)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:353:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:353:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:354:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:359:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:360:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:360:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:361:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:361:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==34) ) {
            	        alt5=1;
            	    }
            	    else if ( ((LA5_0>=35 && LA5_0<=36)) ) {
            	        alt5=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:362:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison716);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:377:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison735);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:395:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:396:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:396:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:397:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison759);
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
            	    break loop6;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:421:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:422:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:423:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit797);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit807); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:430:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:433:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:434:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:434:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
                {
                alt7=1;
                }
                break;
            case RULE_NULL:
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
            case 17:
            case 25:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt7=2;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:435:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit854);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:445:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit881);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:455:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit908);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:471:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:472:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:473:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation943);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation953); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:480:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:483:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:484:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:484:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:484:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:484:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:485:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:485:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:486:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation999);
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

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:502:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:503:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:503:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:504:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation1020);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:528:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:529:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:530:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1056);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression1066); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:537:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:540:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:541:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:541:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:542:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression1113);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:550:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=39 && LA9_0<=42)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:550:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:550:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt8=4;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt8=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:550:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:550:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:550:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:550:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:551:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:556:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:557:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:557:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:558:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression1145);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:575:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:575:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:575:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:575:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:576:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:581:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:582:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:582:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:583:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression1183);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:600:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:600:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:600:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:600:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:601:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:606:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:607:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:607:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:608:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression1221);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:625:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:625:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:625:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:625:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:626:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:631:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:632:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:632:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:633:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression1259);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:649:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:650:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:650:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:651:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression1282);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleComparableExpression"
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:675:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:676:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:677:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression1320);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression1330); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:684:1: ruleComparableExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:687:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:688:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:688:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            int alt10=7;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:689:5: this_ArithmeticExpression_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression1377);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:699:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression1404);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:709:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression1431);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:719:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleComparableExpression1458);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:729:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleComparableExpression1485);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:739:5: this_UnlimitedLiteral_5= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getUnlimitedLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression1512);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:749:5: this_ParenthesizedExpression_6= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getParenthesizedExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression1539);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:765:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:766:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:767:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression1574);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression1584); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:774:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:777:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:779:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression1630);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:795:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:796:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:797:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1664);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression1674); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:804:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:807:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:808:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:808:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:809:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1721);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:817:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=43 && LA12_0<=44)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:817:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:817:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:818:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:823:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:824:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:824:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:825:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:825:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==44) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==43) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:826:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression1753);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:841:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression1772);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:859:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:860:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:860:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:861:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1796);
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:885:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:886:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:887:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression1834);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression1844); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:894:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:897:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:898:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:898:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:899:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression1891);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:907:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25||(LA14_0>=45 && LA14_0<=46)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:907:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:907:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:908:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:913:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:914:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:914:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:915:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:915:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt13=3;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:916:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression1923);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:931:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression1942);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:946:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression1961);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:964:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:965:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:965:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:966:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression1985);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleNumberExpression"
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:990:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:991:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:992:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression2023);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression2033); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:999:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1002:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1003:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1003:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_INT && LA15_0<=RULE_EBIGDECIMAL)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=47 && LA15_0<=54)) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1004:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression2080);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1014:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression2107);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1030:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1031:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1032:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction2142);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction2152); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1039:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1042:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1043:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1043:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt16=8;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt16=1;
                }
                break;
            case 48:
                {
                alt16=2;
                }
                break;
            case 49:
                {
                alt16=3;
                }
                break;
            case 50:
                {
                alt16=4;
                }
                break;
            case 51:
                {
                alt16=5;
                }
                break;
            case 52:
                {
                alt16=6;
                }
                break;
            case 53:
                {
                alt16=7;
                }
                break;
            case 54:
                {
                alt16=8;
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1044:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction2199);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1054:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction2226);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1064:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction2253);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1074:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction2280);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1084:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction2307);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1094:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction2334);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1104:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction2361);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1114:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction2388);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1130:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1131:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1132:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction2423);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction2433); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1139:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1142:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1143:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1143:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1143:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1143:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1144:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1144:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1145:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction2479);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMaximumFunction2491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1165:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1166:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1166:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1167:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction2512);
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

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1183:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1183:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleMaximumFunction2525); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1187:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1188:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1188:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1189:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction2546);
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
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleMaximumFunction2560); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1217:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1218:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1219:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction2596);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction2606); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1226:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1229:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1230:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1230:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1230:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1230:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1231:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1231:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1232:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction2652);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMinimumFunction2664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1252:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1253:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1253:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1254:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction2685);
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

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1270:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1270:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleMinimumFunction2698); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1274:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1275:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1275:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1276:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction2719);
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
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleMinimumFunction2733); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1304:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1305:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1306:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction2769);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction2779); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1313:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1316:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1317:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1317:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1317:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1317:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1318:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1318:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1319:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction2825);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAverageFunction2837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1339:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1340:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1340:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1341:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction2858);
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

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1357:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1357:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleAverageFunction2871); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1361:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1362:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1362:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1363:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction2892);
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
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleAverageFunction2906); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1391:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1392:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1393:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction2942);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction2952); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1400:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1403:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1404:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1404:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1404:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1404:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1405:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1405:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1406:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction2998);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSumFunction3010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1426:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1427:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1427:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1428:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction3031);
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

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1444:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1444:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleSumFunction3044); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1448:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1449:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1449:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1450:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction3065);
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
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleSumFunction3079); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1478:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1479:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1480:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction3115);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction3125); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1487:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1490:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1491:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1491:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1491:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1491:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1492:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1492:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1493:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction3171);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleExponentialFunction3183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1513:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1514:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1514:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1515:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction3204);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleExponentialFunction3216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1535:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1536:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1536:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1537:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction3237);
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleExponentialFunction3249); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1565:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1566:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1567:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction3285);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction3295); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1574:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1577:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1578:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1578:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1578:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1578:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1579:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1579:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1580:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction3341);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAbsoluteFunction3353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1600:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1601:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1601:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1602:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction3374);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAbsoluteFunction3386); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1630:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1631:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1632:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction3422);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction3432); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1639:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1642:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1643:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1643:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1643:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1643:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1644:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1644:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1645:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction3478);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleNaturalLogarithmFunction3490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1665:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1666:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1666:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1667:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction3511);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleNaturalLogarithmFunction3523); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1695:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1696:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1697:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction3559);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction3569); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1704:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1707:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1708:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1708:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1708:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1708:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1709:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1709:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1710:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction3615);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleCommonLogarithmFunction3627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1730:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1731:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1731:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1732:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction3648);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleCommonLogarithmFunction3660); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1760:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1761:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1762:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression3696);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression3706); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1769:1: ruleParenthesizedExpression returns [EObject current=null] : ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1772:28: ( ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1773:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1773:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1774:5: ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression3747);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1781:1: ( (lv_value_1_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1782:1: (lv_value_1_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1782:1: (lv_value_1_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1783:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression3767);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression3783);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1815:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1816:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1817:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification3818);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification3828); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1824:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1827:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1828:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1828:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1829:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification3875);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1839:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification3902);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1849:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification3929);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1865:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1866:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1867:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression3964);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression3974); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1874:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1877:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1878:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1878:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1878:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1878:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1879:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1879:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1880:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression4022);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1893:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            else if ( (LA22_0==22) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1893:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1893:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1894:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1894:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1895:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression4044);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1912:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1912:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1913:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1913:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1914:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression4071);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1938:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1939:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1940:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection4108);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection4118); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1947:1: ruleCollection returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1950:28: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1951:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1951:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1951:2: () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1951:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1952:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCollectionAccess().getCollectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCollection4164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1961:1: ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_EBOOLEAN && LA24_0<=RULE_EBIGDECIMAL)||LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1961:2: ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1961:2: ( (lv_values_2_0= ruleValueSpecification ) )
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1962:1: (lv_values_2_0= ruleValueSpecification )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1962:1: (lv_values_2_0= ruleValueSpecification )
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1963:3: lv_values_2_0= ruleValueSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection4186);
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

                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1979:2: (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1979:4: otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleCollection4199); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1983:1: ( (lv_values_4_0= ruleValueSpecification ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1984:1: (lv_values_4_0= ruleValueSpecification )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1984:1: (lv_values_4_0= ruleValueSpecification )
                    	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:1985:3: lv_values_4_0= ruleValueSpecification
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection4220);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleCollection4236); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2013:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2014:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2015:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple4272);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple4282); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2022:1: ruleTuple returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tuples_2_0 = null;

        EObject lv_tuples_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2025:28: ( ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2026:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2026:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2026:2: () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2026:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2027:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTupleAccess().getTupleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleTuple4328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2036:1: ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2036:2: ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2036:2: ( (lv_tuples_2_0= rulePropertyValuePair ) )
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2037:1: (lv_tuples_2_0= rulePropertyValuePair )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2037:1: (lv_tuples_2_0= rulePropertyValuePair )
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2038:3: lv_tuples_2_0= rulePropertyValuePair
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple4350);
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

                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2054:2: (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==18) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2054:4: otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleTuple4363); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2058:1: ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2059:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2059:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2060:3: lv_tuples_4_0= rulePropertyValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple4384);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleTuple4400); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2088:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2089:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2090:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair4436);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair4446); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2097:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2100:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2101:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2101:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2101:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2101:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2102:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2102:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2103:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair4494);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulePropertyValuePair4506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2120:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2121:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2121:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2122:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair4527);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2146:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2147:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2148:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression4563);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression4573); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2155:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2158:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2159:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2159:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2160:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2160:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2161:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression4620);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2182:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2183:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2184:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression4655);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression4665); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2191:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2194:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2195:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2195:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt27=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt27=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt27=2;
                }
                break;
            case RULE_NULL:
                {
                alt27=3;
                }
                break;
            case RULE_STRING:
                {
                alt27=4;
                }
                break;
            case 25:
                {
                alt27=5;
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2196:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression4712);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2206:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression4739);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2216:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression4766);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2226:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression4793);
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2236:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression4820);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2252:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2253:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2254:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4855);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral4865); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2261:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2264:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2265:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2265:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2266:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2266:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2267:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral4906); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2291:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2292:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2293:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral4946);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral4956); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2300:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2303:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2304:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2304:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2305:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2305:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2306:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral5001);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2330:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2331:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2332:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5036);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral5046); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2339:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2342:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2343:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2343:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2344:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2344:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2345:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral5087); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2369:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2370:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2371:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5127);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral5137); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2378:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2381:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2382:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2382:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2383:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2383:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2384:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral5178); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2408:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2409:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2410:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral5218);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral5228); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2417:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2420:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2421:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2421:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2422:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2422:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2423:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,25,FOLLOW_25_in_ruleUnlimitedLiteral5270); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2444:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2445:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2446:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator5318);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator5328); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2453:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2456:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2457:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2457:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2457:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2457:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2458:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2463:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            else if ( (LA28_0==27) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2463:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleOrOperator5375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2468:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleOrOperator5393); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2480:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2481:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2482:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator5430);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator5440); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2489:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2492:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2493:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2493:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2493:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2493:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2494:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2499:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            else if ( (LA29_0==29) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2499:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleXOrOperator5487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2504:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleXOrOperator5505); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2516:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2517:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2518:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator5542);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator5552); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2525:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2528:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2529:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2529:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2529:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2529:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2530:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2535:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            else if ( (LA30_0==31) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2535:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleAndOperator5599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2540:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleAndOperator5617); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2552:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2553:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2554:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator5654);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator5664); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2561:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2564:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2565:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2565:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2565:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2565:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2566:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2571:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            else if ( (LA31_0==33) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2571:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleImplicationOperator5711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2576:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleImplicationOperator5729); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2588:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2589:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2590:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator5766);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator5776); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2597:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2600:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2601:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2601:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2601:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2601:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2602:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleEqualsOperator5822); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2619:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2620:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2621:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator5858);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator5868); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2628:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2631:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2632:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2632:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2632:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2632:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2633:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2638:2: (otherlv_1= '!=' | otherlv_2= '<>' )
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2638:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleNotEqualsOperator5915); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2643:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleNotEqualsOperator5933); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2655:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2656:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2657:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator5970);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator5980); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2664:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2667:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2668:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2668:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2668:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2668:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2669:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2674:2: (otherlv_1= '!' | otherlv_2= 'not' )
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2674:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleNotOperator6027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2679:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleNotOperator6045); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2691:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2692:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2693:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator6082);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator6092); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2700:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2703:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2704:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2704:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2704:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2704:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2705:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleGreaterThanOperator6138); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2722:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2723:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2724:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator6174);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator6184); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2731:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2734:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2735:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2735:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2735:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2735:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2736:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleGreaterOrEqualThanOperator6230); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2753:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2754:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2755:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator6266);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator6276); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2762:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2765:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2766:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2766:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2766:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2766:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2767:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleLessThanOperator6322); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2784:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2785:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2786:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator6358);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator6368); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2793:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2796:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2797:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2797:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2797:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2797:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2798:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleLessOrEqualThanOperator6414); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2815:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2816:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2817:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator6450);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator6460); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2824:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2827:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2828:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2828:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2828:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2828:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2829:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAdditionOperator6506); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2846:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2847:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2848:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator6542);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator6552); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2855:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2858:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2859:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2859:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2859:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2859:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2860:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleSubstractionOperator6598); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2877:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2878:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2879:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator6634);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator6644); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2886:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2889:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2890:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2890:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2890:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2890:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2891:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleMultiplicationOperator6690); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2908:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2909:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2910:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator6726);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator6736); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2917:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2920:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2921:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2921:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2921:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2921:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2922:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleDivisionOperator6782); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2939:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2940:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2941:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator6818);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator6828); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2948:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2951:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2952:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2952:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2952:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2952:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2953:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleModulusOperator6874); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2970:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2971:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2972:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator6910);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator6920); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2979:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2982:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2983:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2983:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2983:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2983:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:2984:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleMaxOperator6966); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3001:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3002:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3003:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator7002);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator7012); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3010:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3013:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3014:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3014:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3014:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3014:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3015:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleMinOperator7058); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3032:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3033:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3034:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator7094);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator7104); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3041:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3044:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3045:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3045:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3045:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3045:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3046:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleAvgOperator7150); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3063:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3064:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3065:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator7186);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator7196); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3072:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3075:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3076:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3076:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3076:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3076:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3077:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleSumOperator7242); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3094:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3095:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3096:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator7278);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator7288); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3103:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3106:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3107:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3107:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3107:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3107:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3108:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleExponentialOperator7334); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3125:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3126:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3127:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator7370);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator7380); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3134:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3137:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3138:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3138:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3138:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3138:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3139:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleAbsoluteOperator7426); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3156:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3157:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3158:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator7462);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator7472); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3165:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3168:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3169:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3169:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3169:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3169:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3170:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleNaturalLogarithmOperator7518); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3187:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3188:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3189:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator7554);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator7564); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3196:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3199:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3200:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3200:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3200:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3200:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3201:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleCommonLogarithmOperator7610); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3218:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3219:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3220:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis7647);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis7658); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3227:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3230:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3232:2: kw= '('
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleLeftParenthesis7695); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3245:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3246:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3247:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis7735);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis7746); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3254:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3257:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3259:2: kw= ')'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleRightParenthesis7783); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3272:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3273:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3274:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7823);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName7834); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3281:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3284:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3285:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3285:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3285:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName7874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3292:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==55) && (synpred1_InternalARTISTCommon())) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3292:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3292:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3292:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,55,FOLLOW_55_in_ruleQualifiedName7902); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName7918); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3319:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3320:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3321:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard7970);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard7981); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3328:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3331:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3332:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3332:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3333:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8028);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3343:1: (kw= '.*' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==56) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3344:2: kw= '.*'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleQualifiedNameWithWildcard8047); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3361:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3362:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3363:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace8093);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace8103); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3370:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3373:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3374:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3374:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3374:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleImportNamespace8140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3378:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3379:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3379:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3380:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace8161);
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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3404:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3405:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3406:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber8198);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber8209); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3413:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3416:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3417:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3417:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt36=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt36=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt36=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt36=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt36=4;
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
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3417:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber8249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3425:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber8275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3433:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber8301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3441:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber8327); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalARTISTCommon
    public final void synpred1_InternalARTISTCommon_fragment() throws RecognitionException {   
        // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3292:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.common/src-gen/eu/artist/postmigration/nfrvt/lang/common/parser/antlr/internal/InternalARTISTCommon.g:3293:2: '.'
        {
        match(input,55,FOLLOW_55_in_synpred1_InternalARTISTCommon7893); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalARTISTCommon

    // Delegated rules

    public final boolean synpred1_InternalARTISTCommon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalARTISTCommon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA10_eotS =
        "\13\uffff";
    static final String DFA10_eofS =
        "\2\uffff\1\11\7\uffff\1\11";
    static final String DFA10_minS =
        "\1\5\1\uffff\1\23\4\uffff\1\7\2\uffff\1\23";
    static final String DFA10_maxS =
        "\1\66\1\uffff\1\67\4\uffff\1\7\2\uffff\1\67";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\3\1\2\1\uffff";
    static final String DFA10_specialS =
        "\13\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\3\1\4\1\2\4\1\5\uffff\1\6\7\uffff\1\5\25\uffff\10\1",
            "",
            "\1\11\1\10\1\uffff\1\10\3\uffff\13\11\2\uffff\4\11\14\uffff"+
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "\1\11\1\10\1\uffff\1\10\3\uffff\13\11\2\uffff\4\11\14\uffff"+
            "\1\7"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "688:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )";
        }
    }
    static final String DFA21_eotS =
        "\7\uffff";
    static final String DFA21_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA21_minS =
        "\1\4\1\uffff\1\22\1\7\2\uffff\1\22";
    static final String DFA21_maxS =
        "\1\31\1\uffff\1\67\1\7\2\uffff\1\67";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA21_specialS =
        "\7\uffff}>";
    static final String[] DFA21_transitionS = {
            "\3\1\1\2\4\1\15\uffff\1\1",
            "",
            "\1\4\1\uffff\1\5\1\4\1\5\1\4\37\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\1\uffff\1\5\1\4\1\5\1\4\37\uffff\1\3"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1828:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication222 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication252 = new BitSet(new long[]{0x007F806002020FF0L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication273 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction368 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction400 = new BitSet(new long[]{0x007F806002020FF0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction419 = new BitSet(new long[]{0x007F806002020FF0L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction443 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction538 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction568 = new BitSet(new long[]{0x007F806002020FF0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction589 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison684 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison716 = new BitSet(new long[]{0x007F806002020FF0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison735 = new BitSet(new long[]{0x007F806002020FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison759 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation999 = new BitSet(new long[]{0x007F806002020FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression1113 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression1145 = new BitSet(new long[]{0x007F800002020FE0L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression1183 = new BitSet(new long[]{0x007F800002020FE0L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression1221 = new BitSet(new long[]{0x007F800002020FE0L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression1259 = new BitSet(new long[]{0x007F800002020FE0L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression1282 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleComparableExpression1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleComparableExpression1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1721 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression1753 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression1772 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1796 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression1834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression1891 = new BitSet(new long[]{0x0000600002000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression1923 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression1942 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression1961 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression1985 = new BitSet(new long[]{0x0000600002000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression2023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction2142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction2423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction2479 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMaximumFunction2491 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction2512 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleMaximumFunction2525 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction2546 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleMaximumFunction2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction2596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction2652 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMinimumFunction2664 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction2685 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleMinimumFunction2698 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction2719 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleMinimumFunction2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction2769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction2825 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAverageFunction2837 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction2858 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleAverageFunction2871 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction2892 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleAverageFunction2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction2998 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSumFunction3010 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction3031 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleSumFunction3044 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction3065 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleSumFunction3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction3115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction3171 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExponentialFunction3183 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction3204 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExponentialFunction3216 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction3237 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExponentialFunction3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction3285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction3341 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAbsoluteFunction3353 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction3374 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAbsoluteFunction3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction3422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction3478 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNaturalLogarithmFunction3490 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction3511 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNaturalLogarithmFunction3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction3559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction3615 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCommonLogarithmFunction3627 = new BitSet(new long[]{0x007F800000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction3648 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCommonLogarithmFunction3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression3696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression3747 = new BitSet(new long[]{0x007F806002020FF0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression3767 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification3818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression3964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression4022 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection4108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCollection4164 = new BitSet(new long[]{0x007F806002220FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection4186 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_ruleCollection4199 = new BitSet(new long[]{0x007F806002020FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection4220 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleCollection4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple4272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTuple4328 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple4350 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18_in_ruleTuple4363 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple4384 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_23_in_ruleTuple4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair4436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair4494 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePropertyValuePair4506 = new BitSet(new long[]{0x007F806002020FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression4563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression4655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral4946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral5218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUnlimitedLiteral5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator5318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOrOperator5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOrOperator5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator5430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXOrOperator5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleXOrOperator5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator5542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAndOperator5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAndOperator5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator5654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleImplicationOperator5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleImplicationOperator5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator5766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEqualsOperator5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator5858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNotEqualsOperator5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleNotEqualsOperator5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator5970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleNotOperator6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNotOperator6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator6082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleGreaterThanOperator6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator6174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleGreaterOrEqualThanOperator6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator6266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLessThanOperator6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator6358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLessOrEqualThanOperator6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator6450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAdditionOperator6506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator6542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSubstractionOperator6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator6634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMultiplicationOperator6690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator6726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDivisionOperator6782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator6818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleModulusOperator6874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator6910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMaxOperator6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator7002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleMinOperator7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator7094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAvgOperator7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator7186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSumOperator7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator7278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExponentialOperator7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator7370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAbsoluteOperator7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator7462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleNaturalLogarithmOperator7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator7554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCommonLogarithmOperator7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis7647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLeftParenthesis7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis7735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRightParenthesis7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName7834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName7874 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleQualifiedName7902 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName7918 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard7970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard7981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8028 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleQualifiedNameWithWildcard8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace8093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImportNamespace8140 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber8198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber8301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred1_InternalARTISTCommon7893 = new BitSet(new long[]{0x0000000000000002L});

}