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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_EBOOLEAN", "RULE_NULL", "RULE_INT", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_SMALL_DECIMAL", "RULE_EBIGDECIMAL", "RULE_DATE_TIME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pattern-catalogue'", "'{'", "'}'", "'pattern'", "'context'", "','", "'problem'", "'solution'", "'property-impacts'", "'['", "']'", "'pattern-impacts'", "'related-patterns'", "'('", "')'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_NULL=7;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DATE_TIME=12;
    public static final int RULE_POSITIVE_SMALL_DECIMAL=9;
    public static final int RULE_EBOOLEAN=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=15;

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
        	return "ARTISTModel";	
       	}
       	
       	@Override
       	protected TSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleARTISTModel"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:67:1: entryRuleARTISTModel returns [EObject current=null] : iv_ruleARTISTModel= ruleARTISTModel EOF ;
    public final EObject entryRuleARTISTModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARTISTModel = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:68:2: (iv_ruleARTISTModel= ruleARTISTModel EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:69:2: iv_ruleARTISTModel= ruleARTISTModel EOF
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:76:1: ruleARTISTModel returns [EObject current=null] : this_PatternCatalogue_0= rulePatternCatalogue ;
    public final EObject ruleARTISTModel() throws RecognitionException {
        EObject current = null;

        EObject this_PatternCatalogue_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:79:28: (this_PatternCatalogue_0= rulePatternCatalogue )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:81:5: this_PatternCatalogue_0= rulePatternCatalogue
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getARTISTModelAccess().getPatternCatalogueParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePatternCatalogue_in_ruleARTISTModel131);
            this_PatternCatalogue_0=rulePatternCatalogue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PatternCatalogue_0; 
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


    // $ANTLR start "entryRulePatternCatalogue"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:97:1: entryRulePatternCatalogue returns [EObject current=null] : iv_rulePatternCatalogue= rulePatternCatalogue EOF ;
    public final EObject entryRulePatternCatalogue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternCatalogue = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:98:2: (iv_rulePatternCatalogue= rulePatternCatalogue EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:99:2: iv_rulePatternCatalogue= rulePatternCatalogue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternCatalogueRule()); 
            }
            pushFollow(FOLLOW_rulePatternCatalogue_in_entryRulePatternCatalogue165);
            iv_rulePatternCatalogue=rulePatternCatalogue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternCatalogue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternCatalogue175); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:106:1: rulePatternCatalogue returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'pattern-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_patterns_4_0= rulePattern ) )* otherlv_5= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:109:28: ( ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'pattern-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_patterns_4_0= rulePattern ) )* otherlv_5= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:110:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'pattern-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_patterns_4_0= rulePattern ) )* otherlv_5= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:110:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'pattern-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_patterns_4_0= rulePattern ) )* otherlv_5= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:110:2: ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'pattern-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_patterns_4_0= rulePattern ) )* otherlv_5= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:110:2: ( (lv_imports_0_0= ruleImportNamespace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==65) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:111:1: (lv_imports_0_0= ruleImportNamespace )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:111:1: (lv_imports_0_0= ruleImportNamespace )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:112:3: lv_imports_0_0= ruleImportNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPatternCatalogueAccess().getImportsImportNamespaceParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportNamespace_in_rulePatternCatalogue221);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePatternCatalogue234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPatternCatalogueAccess().getPatternCatalogueKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:132:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:133:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:133:1: (lv_name_2_0= ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:134:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternCatalogueAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePatternCatalogue255);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePatternCatalogue267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPatternCatalogueAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:154:1: ( (lv_patterns_4_0= rulePattern ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:155:1: (lv_patterns_4_0= rulePattern )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:155:1: (lv_patterns_4_0= rulePattern )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:156:3: lv_patterns_4_0= rulePattern
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPatternCatalogueAccess().getPatternsPatternParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePattern_in_rulePatternCatalogue288);
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePatternCatalogue301); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:184:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:185:2: (iv_rulePattern= rulePattern EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:186:2: iv_rulePattern= rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern337);
            iv_rulePattern=rulePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern347); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:193:1: rulePattern returns [EObject current=null] : (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'problem' ( (lv_problem_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'solution' ( (lv_solution_10_0= RULE_STRING ) ) (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )? (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )? otherlv_32= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:196:28: ( (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'problem' ( (lv_problem_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'solution' ( (lv_solution_10_0= RULE_STRING ) ) (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )? (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )? otherlv_32= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:197:1: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'problem' ( (lv_problem_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'solution' ( (lv_solution_10_0= RULE_STRING ) ) (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )? (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )? otherlv_32= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:197:1: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'problem' ( (lv_problem_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'solution' ( (lv_solution_10_0= RULE_STRING ) ) (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )? (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )? otherlv_32= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:197:3: otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'problem' ( (lv_problem_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'solution' ( (lv_solution_10_0= RULE_STRING ) ) (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )? (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )? otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_rulePattern384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:201:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:202:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:202:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:203:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePattern401); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulePattern418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePattern430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getContextKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:227:1: ( (lv_context_4_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:228:1: (lv_context_4_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:228:1: (lv_context_4_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:229:3: lv_context_4_0= RULE_STRING
            {
            lv_context_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePattern447); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_rulePattern464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,23,FOLLOW_23_in_rulePattern476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getProblemKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:253:1: ( (lv_problem_7_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:254:1: (lv_problem_7_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:254:1: (lv_problem_7_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:255:3: lv_problem_7_0= RULE_STRING
            {
            lv_problem_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePattern493); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_rulePattern510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,24,FOLLOW_24_in_rulePattern522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPatternAccess().getSolutionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:279:1: ( (lv_solution_10_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:280:1: (lv_solution_10_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:280:1: (lv_solution_10_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:281:3: lv_solution_10_0= RULE_STRING
            {
            lv_solution_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePattern539); if (state.failed) return current;
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

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:297:2: (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==25) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:297:4: otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_22_in_rulePattern557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getPatternAccess().getCommaKeyword_11_0());
                          
                    }
                    otherlv_12=(Token)match(input,25,FOLLOW_25_in_rulePattern569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getPropertyImpactsKeyword_11_1());
                          
                    }
                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_rulePattern581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_11_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:309:1: ( (lv_propertyImpacts_14_0= rulePropertyImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:310:1: (lv_propertyImpacts_14_0= rulePropertyImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:310:1: (lv_propertyImpacts_14_0= rulePropertyImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:311:3: lv_propertyImpacts_14_0= rulePropertyImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternAccess().getPropertyImpactsPropertyImpactParserRuleCall_11_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyImpact_in_rulePattern602);
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

                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:327:2: (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==22) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:327:4: otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) )
                    	    {
                    	    otherlv_15=(Token)match(input,22,FOLLOW_22_in_rulePattern615); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_15, grammarAccess.getPatternAccess().getCommaKeyword_11_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:331:1: ( (lv_propertyImpacts_16_0= rulePropertyImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:332:1: (lv_propertyImpacts_16_0= rulePropertyImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:332:1: (lv_propertyImpacts_16_0= rulePropertyImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:333:3: lv_propertyImpacts_16_0= rulePropertyImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPatternAccess().getPropertyImpactsPropertyImpactParserRuleCall_11_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyImpact_in_rulePattern636);
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

                    otherlv_17=(Token)match(input,27,FOLLOW_27_in_rulePattern650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPatternAccess().getRightSquareBracketKeyword_11_5());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:353:3: (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==28) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:353:5: otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']'
                    {
                    otherlv_18=(Token)match(input,22,FOLLOW_22_in_rulePattern665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getPatternAccess().getCommaKeyword_12_0());
                          
                    }
                    otherlv_19=(Token)match(input,28,FOLLOW_28_in_rulePattern677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPatternAccess().getPatternImpactsKeyword_12_1());
                          
                    }
                    otherlv_20=(Token)match(input,26,FOLLOW_26_in_rulePattern689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_12_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:365:1: ( (lv_patternImpacts_21_0= rulePatternImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:366:1: (lv_patternImpacts_21_0= rulePatternImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:366:1: (lv_patternImpacts_21_0= rulePatternImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:367:3: lv_patternImpacts_21_0= rulePatternImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternAccess().getPatternImpactsPatternImpactParserRuleCall_12_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePatternImpact_in_rulePattern710);
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

                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:383:2: (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==22) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:383:4: otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) )
                    	    {
                    	    otherlv_22=(Token)match(input,22,FOLLOW_22_in_rulePattern723); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_22, grammarAccess.getPatternAccess().getCommaKeyword_12_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:387:1: ( (lv_patternImpacts_23_0= rulePatternImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:388:1: (lv_patternImpacts_23_0= rulePatternImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:388:1: (lv_patternImpacts_23_0= rulePatternImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:389:3: lv_patternImpacts_23_0= rulePatternImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPatternAccess().getPatternImpactsPatternImpactParserRuleCall_12_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePatternImpact_in_rulePattern744);
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

                    otherlv_24=(Token)match(input,27,FOLLOW_27_in_rulePattern758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getPatternAccess().getRightSquareBracketKeyword_12_5());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:409:3: (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:409:5: otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']'
                    {
                    otherlv_25=(Token)match(input,22,FOLLOW_22_in_rulePattern773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPatternAccess().getCommaKeyword_13_0());
                          
                    }
                    otherlv_26=(Token)match(input,29,FOLLOW_29_in_rulePattern785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getPatternAccess().getRelatedPatternsKeyword_13_1());
                          
                    }
                    otherlv_27=(Token)match(input,26,FOLLOW_26_in_rulePattern797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_13_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:421:1: ( ( ruleQualifiedName ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:422:1: ( ruleQualifiedName )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:422:1: ( ruleQualifiedName )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:423:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPatternRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternAccess().getRelatedPatternsPatternCrossReference_13_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePattern820);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:436:2: (otherlv_29= ',' ( ( ruleQualifiedName ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:436:4: otherlv_29= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_29=(Token)match(input,22,FOLLOW_22_in_rulePattern833); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_29, grammarAccess.getPatternAccess().getCommaKeyword_13_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:440:1: ( ( ruleQualifiedName ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:441:1: ( ruleQualifiedName )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:441:1: ( ruleQualifiedName )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:442:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getPatternRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPatternAccess().getRelatedPatternsPatternCrossReference_13_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_rulePattern856);
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

                    otherlv_31=(Token)match(input,27,FOLLOW_27_in_rulePattern870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getPatternAccess().getRightSquareBracketKeyword_13_5());
                          
                    }

                    }
                    break;

            }

            otherlv_32=(Token)match(input,19,FOLLOW_19_in_rulePattern884); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:471:1: entryRulePatternImpact returns [EObject current=null] : iv_rulePatternImpact= rulePatternImpact EOF ;
    public final EObject entryRulePatternImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:472:2: (iv_rulePatternImpact= rulePatternImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:473:2: iv_rulePatternImpact= rulePatternImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternImpactRule()); 
            }
            pushFollow(FOLLOW_rulePatternImpact_in_entryRulePatternImpact920);
            iv_rulePatternImpact=rulePatternImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternImpact; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternImpact930); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:480:1: rulePatternImpact returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) ;
    public final EObject rulePatternImpact() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_impact_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:483:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:484:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:484:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:484:2: ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:484:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:485:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:485:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:486:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPatternImpactRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternImpactAccess().getTargetPatternCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePatternImpact978);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:499:2: ( (lv_impact_1_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:500:1: (lv_impact_1_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:500:1: (lv_impact_1_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:501:3: lv_impact_1_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternImpactAccess().getImpactImpactParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_rulePatternImpact999);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:525:1: entryRulePropertyImpact returns [EObject current=null] : iv_rulePropertyImpact= rulePropertyImpact EOF ;
    public final EObject entryRulePropertyImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:526:2: (iv_rulePropertyImpact= rulePropertyImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:527:2: iv_rulePropertyImpact= rulePropertyImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyImpactRule()); 
            }
            pushFollow(FOLLOW_rulePropertyImpact_in_entryRulePropertyImpact1035);
            iv_rulePropertyImpact=rulePropertyImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyImpact; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyImpact1045); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:534:1: rulePropertyImpact returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) ;
    public final EObject rulePropertyImpact() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_impact_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:537:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:538:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:538:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:538:2: ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:538:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:539:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:539:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:540:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyImpactRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyImpactAccess().getTargetPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyImpact1093);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:553:2: ( (lv_impact_1_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:554:1: (lv_impact_1_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:554:1: (lv_impact_1_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:555:3: lv_impact_1_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyImpactAccess().getImpactImpactParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_rulePropertyImpact1114);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:579:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:580:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:581:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1150);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1160); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:588:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:591:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:593:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression1206);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:609:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:610:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:611:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication1240);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication1250); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:618:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:621:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:622:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:622:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:623:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication1297);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:631:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=40 && LA9_0<=41)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:631:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:631:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:632:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:637:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:638:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:638:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:639:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication1327);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:655:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:656:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:656:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:657:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication1348);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:681:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:682:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:683:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction1386);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction1396); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:690:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:693:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:694:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:694:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:695:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction1443);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:703:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=34 && LA11_0<=37)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:703:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:703:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:704:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:709:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:710:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:710:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:711:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:711:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( ((LA10_0>=34 && LA10_0<=35)) ) {
            	        alt10=1;
            	    }
            	    else if ( ((LA10_0>=36 && LA10_0<=37)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:712:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction1475);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:727:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction1494);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:745:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:746:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:746:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:747:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction1518);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:771:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:772:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:773:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction1556);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction1566); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:780:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:783:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:784:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:784:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:785:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction1613);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:793:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=38 && LA12_0<=39)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:793:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:793:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:794:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:799:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:800:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:800:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:801:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction1643);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:817:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:818:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:818:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:819:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction1664);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:843:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:844:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:845:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1702);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1712); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:852:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:855:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:856:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:856:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:857:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison1759);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:865:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=42 && LA14_0<=44)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:865:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:865:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:866:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:871:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:872:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:872:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:873:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:873:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==42) ) {
            	        alt13=1;
            	    }
            	    else if ( ((LA13_0>=43 && LA13_0<=44)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:874:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison1791);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:889:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison1810);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:907:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:908:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:908:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:909:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison1834);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:933:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:934:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:935:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit1872);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit1882); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:942:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:945:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:946:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:946:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 45:
            case 46:
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
            case 30:
            case 33:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:947:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit1929);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:957:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit1956);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:967:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit1983);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:983:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:984:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:985:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation2018);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation2028); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:992:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:995:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:996:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:996:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:996:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:996:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:997:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:997:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:998:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation2074);
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

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1014:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1015:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1015:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1016:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation2095);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1040:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1041:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1042:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2131);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression2141); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1049:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1052:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1053:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1053:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1054:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression2188);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1062:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=47 && LA17_0<=50)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1062:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1062:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt16=4;
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
            	    case 50:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 49:
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1062:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1062:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1062:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1062:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1063:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1068:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1069:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1069:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1070:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression2220);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1087:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1087:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1087:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1087:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1088:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1093:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1094:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1094:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1095:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression2258);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1112:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1112:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1112:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1112:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1113:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1118:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1119:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1119:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1120:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression2296);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1137:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1137:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1137:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1137:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1138:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1143:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1144:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1144:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1145:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression2334);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1161:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1162:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1162:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1163:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression2357);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1187:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1188:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1189:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression2395);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression2405); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1196:1: ruleComparableExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1199:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1200:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1200:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            int alt18=7;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1201:5: this_ArithmeticExpression_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression2452);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1211:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression2479);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1221:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression2506);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1231:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleComparableExpression2533);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1241:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleComparableExpression2560);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1251:5: this_UnlimitedLiteral_5= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getUnlimitedLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression2587);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1261:5: this_ParenthesizedExpression_6= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getParenthesizedExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression2614);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1277:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1278:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1279:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression2649);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression2659); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1286:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1289:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1291:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression2705);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1307:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1308:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1309:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2739);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression2749); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1316:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1319:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1320:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1320:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1321:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2796);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1329:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=51 && LA20_0<=52)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1329:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1329:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1330:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1335:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1336:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1336:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1337:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1337:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==52) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==51) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1338:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression2828);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1353:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression2847);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1371:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1372:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1372:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1373:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2871);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1397:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1398:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1399:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2909);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression2919); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1406:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1409:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1410:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1410:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1411:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression2966);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1419:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33||(LA22_0>=53 && LA22_0<=54)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1419:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1419:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1420:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1425:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1426:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1426:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1427:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1427:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 54:
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1428:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression2998);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1443:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression3017);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1458:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression3036);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1476:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1477:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1477:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1478:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression3060);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1502:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1503:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1504:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression3098);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression3108); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1511:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1514:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1515:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1515:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_INT && LA23_0<=RULE_EBIGDECIMAL)) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=55 && LA23_0<=62)) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1516:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression3155);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1526:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression3182);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1542:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1543:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1544:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction3217);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction3227); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1551:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1554:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1555:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1555:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt24=8;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt24=1;
                }
                break;
            case 56:
                {
                alt24=2;
                }
                break;
            case 57:
                {
                alt24=3;
                }
                break;
            case 58:
                {
                alt24=4;
                }
                break;
            case 59:
                {
                alt24=5;
                }
                break;
            case 60:
                {
                alt24=6;
                }
                break;
            case 61:
                {
                alt24=7;
                }
                break;
            case 62:
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1556:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction3274);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1566:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction3301);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1576:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction3328);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1586:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction3355);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1596:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction3382);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1606:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction3409);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1616:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction3436);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1626:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction3463);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1642:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1643:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1644:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction3498);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction3508); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1651:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1654:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1655:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1655:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1655:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1655:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1656:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1656:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1657:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction3554);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMaximumFunction3566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1677:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1678:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1678:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1679:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3587);
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

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1695:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==22) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1695:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleMaximumFunction3600); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1699:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1700:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1700:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1701:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3621);
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

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleMaximumFunction3635); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1729:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1730:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1731:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction3671);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction3681); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1738:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1741:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1742:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1742:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1742:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1742:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1743:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1743:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1744:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction3727);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMinimumFunction3739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1764:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1765:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1765:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1766:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3760);
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

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1782:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1782:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleMinimumFunction3773); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1786:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1787:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1787:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1788:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3794);
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

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleMinimumFunction3808); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1816:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1817:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1818:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction3844);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction3854); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1825:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1828:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1829:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1829:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1829:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1829:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1830:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1830:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1831:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction3900);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleAverageFunction3912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1851:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1852:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1852:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1853:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction3933);
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

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1869:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1869:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAverageFunction3946); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1873:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1874:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1874:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1875:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction3967);
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

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleAverageFunction3981); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1903:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1904:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1905:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction4017);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction4027); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1912:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1915:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1916:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1916:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1916:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1916:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1917:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1917:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1918:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction4073);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleSumFunction4085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1938:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1939:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1939:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1940:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction4106);
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

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1956:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1956:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSumFunction4119); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1960:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1961:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1961:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1962:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction4140);
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

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleSumFunction4154); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1990:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1991:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1992:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction4190);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction4200); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1999:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2002:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2003:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2003:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2003:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2003:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2004:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2004:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2005:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction4246);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleExponentialFunction4258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2025:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2026:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2026:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2027:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction4279);
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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleExponentialFunction4291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2047:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2048:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2048:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2049:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction4312);
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

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleExponentialFunction4324); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2077:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2078:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2079:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction4360);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction4370); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2086:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2089:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2090:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2090:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2090:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2090:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2091:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2091:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2092:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction4416);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleAbsoluteFunction4428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2112:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2113:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2113:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2114:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction4449);
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

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleAbsoluteFunction4461); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2142:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2143:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2144:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction4497);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction4507); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2151:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2154:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2155:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2155:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2155:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2155:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2156:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2156:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2157:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction4553);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleNaturalLogarithmFunction4565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2177:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2178:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2178:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2179:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction4586);
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

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleNaturalLogarithmFunction4598); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2207:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2208:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2209:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction4634);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction4644); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2216:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2219:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2220:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2220:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2220:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2220:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2221:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2221:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2222:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction4690);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleCommonLogarithmFunction4702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2242:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2243:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2243:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2244:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction4723);
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

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleCommonLogarithmFunction4735); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2272:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2273:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2274:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression4771);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression4781); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2281:1: ruleParenthesizedExpression returns [EObject current=null] : ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2284:28: ( ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2285:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2285:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2286:5: ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression4822);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2293:1: ( (lv_value_1_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2294:1: (lv_value_1_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2294:1: (lv_value_1_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2295:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression4842);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression4858);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2327:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2328:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2329:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification4893);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification4903); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2336:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2339:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2340:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2340:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2341:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification4950);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2351:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification4977);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2361:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification5004);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2377:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2378:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2379:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression5039);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression5049); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2386:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2389:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2390:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2390:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2390:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2390:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2391:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2391:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2392:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression5097);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2405:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            else if ( (LA30_0==18) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2405:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2405:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2406:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2406:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2407:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression5119);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2424:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2424:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2425:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2425:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2426:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression5146);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2450:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2451:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2452:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection5183);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection5193); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2459:1: ruleCollection returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2462:28: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2463:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2463:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2463:2: () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2463:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2464:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCollectionAccess().getCollectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleCollection5239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2473:1: ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_EBIGDECIMAL)||LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2473:2: ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2473:2: ( (lv_values_2_0= ruleValueSpecification ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2474:1: (lv_values_2_0= ruleValueSpecification )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2474:1: (lv_values_2_0= ruleValueSpecification )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2475:3: lv_values_2_0= ruleValueSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection5261);
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

                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2491:2: (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==22) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2491:4: otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleCollection5274); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2495:1: ( (lv_values_4_0= ruleValueSpecification ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2496:1: (lv_values_4_0= ruleValueSpecification )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2496:1: (lv_values_4_0= ruleValueSpecification )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2497:3: lv_values_4_0= ruleValueSpecification
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection5295);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleCollection5311); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2525:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2526:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2527:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple5347);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple5357); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2534:1: ruleTuple returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tuples_2_0 = null;

        EObject lv_tuples_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2537:28: ( ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2538:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2538:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2538:2: () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2538:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2539:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTupleAccess().getTupleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTuple5403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2548:1: ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2548:2: ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2548:2: ( (lv_tuples_2_0= rulePropertyValuePair ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2549:1: (lv_tuples_2_0= rulePropertyValuePair )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2549:1: (lv_tuples_2_0= rulePropertyValuePair )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2550:3: lv_tuples_2_0= rulePropertyValuePair
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple5425);
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

                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2566:2: (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==22) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2566:4: otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleTuple5438); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2570:1: ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2571:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2571:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2572:3: lv_tuples_4_0= rulePropertyValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple5459);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleTuple5475); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2600:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2601:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2602:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair5511);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair5521); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2609:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2612:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2613:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2613:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2613:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2613:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2614:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2614:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2615:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair5569);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_rulePropertyValuePair5581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2632:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2633:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2633:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2634:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair5602);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2658:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2659:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2660:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression5638);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression5648); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2667:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2670:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2671:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2671:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2672:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2672:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2673:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression5695);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2694:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2695:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2696:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression5730);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression5740); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2703:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2706:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2707:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2707:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt35=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt35=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt35=2;
                }
                break;
            case RULE_NULL:
                {
                alt35=3;
                }
                break;
            case RULE_STRING:
                {
                alt35=4;
                }
                break;
            case 33:
                {
                alt35=5;
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2708:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression5787);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2718:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression5814);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2728:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression5841);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2738:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression5868);
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2748:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression5895);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2764:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2765:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2766:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5930);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral5940); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2773:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2776:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2777:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2777:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2778:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2778:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2779:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral5981); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2803:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2804:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2805:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6021);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral6031); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2812:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2815:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2816:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2816:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2817:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2817:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2818:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral6076);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2842:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2843:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2844:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral6111);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral6121); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2851:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2854:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2855:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2855:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2856:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2856:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2857:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral6162); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2881:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2882:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2883:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6202);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6212); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2890:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2893:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2894:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2894:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2895:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2895:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2896:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral6253); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2920:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2921:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2922:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral6293);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral6303); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2929:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2932:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2933:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2933:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2934:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2934:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2935:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,33,FOLLOW_33_in_ruleUnlimitedLiteral6345); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2956:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2957:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2958:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator6393);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator6403); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2965:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2968:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2969:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2969:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2969:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2969:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2970:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2975:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            else if ( (LA36_0==35) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2975:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleOrOperator6450); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2980:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleOrOperator6468); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2992:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2993:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2994:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator6505);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator6515); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3001:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3004:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3005:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3005:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3005:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3005:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3006:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3011:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            else if ( (LA37_0==37) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3011:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleXOrOperator6562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3016:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXOrOperator6580); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3028:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3029:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3030:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator6617);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator6627); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3037:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3040:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3041:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3041:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3041:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3041:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3042:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3047:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            else if ( (LA38_0==39) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3047:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleAndOperator6674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3052:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleAndOperator6692); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3064:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3065:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3066:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator6729);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator6739); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3073:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3076:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3077:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3077:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3077:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3077:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3078:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3083:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            else if ( (LA39_0==41) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3083:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleImplicationOperator6786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3088:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleImplicationOperator6804); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3100:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3101:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3102:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator6841);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator6851); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3109:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3112:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3113:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3113:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3113:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3113:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3114:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleEqualsOperator6897); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3131:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3132:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3133:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator6933);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator6943); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3140:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3143:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3144:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3144:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3144:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3144:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3145:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3150:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            else if ( (LA40_0==44) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3150:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleNotEqualsOperator6990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3155:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleNotEqualsOperator7008); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3167:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3168:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3169:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator7045);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator7055); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3176:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3179:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3180:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3180:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3180:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3180:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3181:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3186:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            else if ( (LA41_0==46) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3186:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleNotOperator7102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3191:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleNotOperator7120); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3203:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3204:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3205:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator7157);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator7167); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3212:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3215:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3216:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3216:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3216:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3216:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3217:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleGreaterThanOperator7213); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3234:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3235:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3236:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator7249);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator7259); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3243:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3246:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3247:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3247:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3247:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3247:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3248:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleGreaterOrEqualThanOperator7305); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3265:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3266:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3267:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator7341);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator7351); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3274:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3277:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3278:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3278:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3278:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3278:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3279:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleLessThanOperator7397); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3296:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3297:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3298:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator7433);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator7443); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3305:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3308:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3309:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3309:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3309:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3309:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3310:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleLessOrEqualThanOperator7489); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3327:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3328:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3329:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator7525);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator7535); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3336:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3339:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3340:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3340:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3340:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3340:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3341:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleAdditionOperator7581); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3358:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3359:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3360:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator7617);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator7627); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3367:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3370:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3371:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3371:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3371:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3371:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3372:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleSubstractionOperator7673); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3389:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3390:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3391:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator7709);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator7719); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3398:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3401:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3402:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3402:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3402:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3402:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3403:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleMultiplicationOperator7765); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3420:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3421:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3422:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator7801);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator7811); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3429:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3432:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3433:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3433:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3433:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3433:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3434:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleDivisionOperator7857); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3451:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3452:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3453:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator7893);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator7903); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3460:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3463:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3464:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3464:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3464:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3464:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3465:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleModulusOperator7949); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3482:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3483:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3484:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator7985);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator7995); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3491:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3494:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3495:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3495:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3495:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3495:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3496:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleMaxOperator8041); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3513:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3514:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3515:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator8077);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator8087); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3522:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3525:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3526:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3526:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3526:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3526:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3527:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleMinOperator8133); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3544:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3545:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3546:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator8169);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator8179); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3553:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3556:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3557:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3557:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3557:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3557:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3558:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleAvgOperator8225); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3575:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3576:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3577:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator8261);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator8271); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3584:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3587:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3588:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3588:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3588:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3588:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3589:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleSumOperator8317); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3606:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3607:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3608:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator8353);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator8363); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3615:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3618:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3619:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3619:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3619:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3619:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3620:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleExponentialOperator8409); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3637:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3638:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3639:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator8445);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator8455); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3646:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3649:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3650:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3650:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3650:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3650:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3651:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleAbsoluteOperator8501); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3668:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3669:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3670:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator8537);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator8547); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3677:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3680:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3681:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3681:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3681:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3681:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3682:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleNaturalLogarithmOperator8593); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3699:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3700:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3701:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator8629);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator8639); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3708:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3711:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3712:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3712:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3712:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3712:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3713:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleCommonLogarithmOperator8685); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3730:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3731:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3732:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis8722);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis8733); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3739:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3742:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3744:2: kw= '('
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleLeftParenthesis8770); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3757:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3758:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3759:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis8810);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis8821); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3766:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3769:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3771:2: kw= ')'
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleRightParenthesis8858); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3784:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3785:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3786:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8898);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName8909); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3793:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3796:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3797:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3797:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3797:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3804:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==63) && (synpred1_InternalTSL())) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3804:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3804:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3804:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,63,FOLLOW_63_in_ruleQualifiedName8977); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8993); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3829:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3830:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3831:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9043);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9054); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3838:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3841:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3842:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3842:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3843:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9101);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3853:1: (kw= '.*' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==64) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3854:2: kw= '.*'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleQualifiedNameWithWildcard9120); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3871:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3872:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3873:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace9166);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace9176); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3880:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3883:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3884:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3884:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3884:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleImportNamespace9213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3888:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3889:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3889:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3890:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace9234);
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3914:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3915:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3916:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber9271);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber9282); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3923:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3926:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3927:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3927:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt44=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt44=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt44=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt44=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt44=4;
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3927:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber9322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3935:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber9348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3943:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber9374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3951:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber9400); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3966:1: entryRuleImpact returns [String current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final String entryRuleImpact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3967:2: (iv_ruleImpact= ruleImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3968:2: iv_ruleImpact= ruleImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpactRule()); 
            }
            pushFollow(FOLLOW_ruleImpact_in_entryRuleImpact9446);
            iv_ruleImpact=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpact.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpact9457); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3975:1: ruleImpact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleImpact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_POSITIVE_SMALL_DECIMAL_0=null;
        Token this_SMALL_DECIMAL_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3978:28: ( (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3979:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3979:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_POSITIVE_SMALL_DECIMAL) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_SMALL_DECIMAL) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3979:6: this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact9497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_0, grammarAccess.getImpactAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3987:10: this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_1=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact9523); if (state.failed) return current;
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
        // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3804:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3805:2: '.'
        {
        match(input,63,FOLLOW_63_in_synpred1_InternalTSL8968); if (state.failed) return ;

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
        "\1\4\1\uffff\1\22\4\uffff\1\4\2\uffff\1\22";
    static final String DFA18_maxS =
        "\1\76\1\uffff\1\77\4\uffff\1\4\2\uffff\1\77";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\3\1\2\1\uffff";
    static final String DFA18_specialS =
        "\13\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\4\1\uffff\1\3\4\1\22\uffff\1\6\2\uffff\1\5\25\uffff"+
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
            return "1200:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )";
        }
    }
    static final String DFA29_eotS =
        "\7\uffff";
    static final String DFA29_eofS =
        "\2\uffff\1\5\3\uffff\1\5";
    static final String DFA29_minS =
        "\1\4\1\uffff\1\22\1\4\2\uffff\1\22";
    static final String DFA29_maxS =
        "\1\41\1\uffff\1\77\1\4\2\uffff\1\77";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String DFA29_specialS =
        "\7\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\7\1\25\uffff\1\1",
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
            return "2340:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleARTISTModel_in_entryRuleARTISTModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleARTISTModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternCatalogue_in_ruleARTISTModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternCatalogue_in_entryRulePatternCatalogue165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternCatalogue175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_rulePatternCatalogue221 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePatternCatalogue234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePatternCatalogue255 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePatternCatalogue267 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rulePattern_in_rulePatternCatalogue288 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_rulePatternCatalogue301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePattern384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePattern401 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePattern418 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePattern430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePattern447 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePattern464 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePattern476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePattern493 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePattern510 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePattern522 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePattern539 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_rulePattern557 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePattern569 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePattern581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_rulePattern602 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22_in_rulePattern615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_rulePattern636 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_rulePattern650 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_rulePattern665 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePattern677 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePattern689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePatternImpact_in_rulePattern710 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22_in_rulePattern723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePatternImpact_in_rulePattern744 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_rulePattern758 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_rulePattern773 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePattern785 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePattern797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePattern820 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22_in_rulePattern833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePattern856 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_rulePattern870 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePattern884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternImpact_in_entryRulePatternImpact920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternImpact930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePatternImpact978 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_ruleImpact_in_rulePatternImpact999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_entryRulePropertyImpact1035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyImpact1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyImpact1093 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_ruleImpact_in_rulePropertyImpact1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication1297 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication1327 = new BitSet(new long[]{0x7F80600240000FF0L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication1348 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction1443 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction1475 = new BitSet(new long[]{0x7F80600240000FF0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction1494 = new BitSet(new long[]{0x7F80600240000FF0L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction1518 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction1556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction1613 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction1643 = new BitSet(new long[]{0x7F80600240000FF0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction1664 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison1759 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison1791 = new BitSet(new long[]{0x7F80600240000FF0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison1810 = new BitSet(new long[]{0x7F80600240000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison1834 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit1872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation2018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation2074 = new BitSet(new long[]{0x7F80600240000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression2188 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression2220 = new BitSet(new long[]{0x7F80000240000FB0L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression2258 = new BitSet(new long[]{0x7F80000240000FB0L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression2296 = new BitSet(new long[]{0x7F80000240000FB0L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression2334 = new BitSet(new long[]{0x7F80000240000FB0L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression2357 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression2395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleComparableExpression2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleComparableExpression2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression2649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2796 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression2828 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression2847 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2871 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression2966 = new BitSet(new long[]{0x0060000200000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression2998 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression3017 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression3036 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression3060 = new BitSet(new long[]{0x0060000200000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression3098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction3217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction3498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction3554 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMaximumFunction3566 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3587 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_22_in_ruleMaximumFunction3600 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3621 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleMaximumFunction3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction3671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction3727 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMinimumFunction3739 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3760 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_22_in_ruleMinimumFunction3773 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3794 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleMinimumFunction3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction3844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction3900 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAverageFunction3912 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction3933 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_22_in_ruleAverageFunction3946 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction3967 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleAverageFunction3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction4017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction4073 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSumFunction4085 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction4106 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_22_in_ruleSumFunction4119 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction4140 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleSumFunction4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction4190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction4246 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleExponentialFunction4258 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction4279 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExponentialFunction4291 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction4312 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleExponentialFunction4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction4360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction4416 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAbsoluteFunction4428 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction4449 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAbsoluteFunction4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction4497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction4553 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNaturalLogarithmFunction4565 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction4586 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNaturalLogarithmFunction4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction4634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction4690 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCommonLogarithmFunction4702 = new BitSet(new long[]{0x7F80000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction4723 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCommonLogarithmFunction4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression4771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression4822 = new BitSet(new long[]{0x7F80600240000FF0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression4842 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification4893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression5039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression5097 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection5183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCollection5239 = new BitSet(new long[]{0x7F80600248000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection5261 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22_in_ruleCollection5274 = new BitSet(new long[]{0x7F80600240000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection5295 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_ruleCollection5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple5347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTuple5403 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple5425 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleTuple5438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple5459 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleTuple5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair5511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair5569 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePropertyValuePair5581 = new BitSet(new long[]{0x7F80600240000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression5638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression5695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression5730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral6076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral6111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral6293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral6303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleUnlimitedLiteral6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator6393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator6403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOrOperator6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOrOperator6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator6505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleXOrOperator6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleXOrOperator6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator6617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAndOperator6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAndOperator6692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator6729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleImplicationOperator6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleImplicationOperator6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator6841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator6851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEqualsOperator6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator6933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNotEqualsOperator6990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleNotEqualsOperator7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator7045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleNotOperator7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleNotOperator7120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator7157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleGreaterThanOperator7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator7249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleGreaterOrEqualThanOperator7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator7341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator7351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLessThanOperator7397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator7433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLessOrEqualThanOperator7489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator7525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator7535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAdditionOperator7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator7617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSubstractionOperator7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator7709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMultiplicationOperator7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator7801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDivisionOperator7857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator7893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleModulusOperator7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator7985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator7995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleMaxOperator8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator8077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMinOperator8133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator8169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator8179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAvgOperator8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator8261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator8271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSumOperator8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator8353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleExponentialOperator8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator8445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleAbsoluteOperator8501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator8537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNaturalLogarithmOperator8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator8629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator8639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCommonLogarithmOperator8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis8722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis8733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLeftParenthesis8770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis8810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRightParenthesis8858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName8909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8949 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleQualifiedName8977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8993 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleQualifiedNameWithWildcard9120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace9166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleImportNamespace9213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace9234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber9271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber9282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber9322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber9348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber9374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpact_in_entryRuleImpact9446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpact9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact9497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact9523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_synpred1_InternalTSL8968 = new BitSet(new long[]{0x0000000000000002L});

}