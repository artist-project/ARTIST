package eu.artist.postmigration.nfrvt.lang.nsl.parser.antlr.internal; 

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
import eu.artist.postmigration.nfrvt.lang.nsl.services.NSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_EBOOLEAN", "RULE_NULL", "RULE_INT", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_SMALL_DECIMAL", "RULE_EBIGDECIMAL", "RULE_DATE_TIME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'property-catalogue'", "'{'", "'}'", "'qualitative'", "'description'", "','", "'direction'", "'properties'", "'['", "']'", "'impacts'", "'quantitative'", "'type'", "'derived'", "'expression'", "'$'", "'('", "')'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'", "'increasing'", "'decreasing'", "'range'"
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
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
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


        public InternalNSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNSLParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g"; }



     	private NSLGrammarAccess grammarAccess;
     	
        public InternalNSLParser(TokenStream input, NSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ARTISTModel";	
       	}
       	
       	@Override
       	protected NSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleARTISTModel"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:68:1: entryRuleARTISTModel returns [EObject current=null] : iv_ruleARTISTModel= ruleARTISTModel EOF ;
    public final EObject entryRuleARTISTModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARTISTModel = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:69:2: (iv_ruleARTISTModel= ruleARTISTModel EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:70:2: iv_ruleARTISTModel= ruleARTISTModel EOF
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:77:1: ruleARTISTModel returns [EObject current=null] : this_PropertyCatalogue_0= rulePropertyCatalogue ;
    public final EObject ruleARTISTModel() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyCatalogue_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:80:28: (this_PropertyCatalogue_0= rulePropertyCatalogue )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:82:5: this_PropertyCatalogue_0= rulePropertyCatalogue
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getARTISTModelAccess().getPropertyCatalogueParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePropertyCatalogue_in_ruleARTISTModel131);
            this_PropertyCatalogue_0=rulePropertyCatalogue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PropertyCatalogue_0; 
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


    // $ANTLR start "entryRulePropertyCatalogue"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:98:1: entryRulePropertyCatalogue returns [EObject current=null] : iv_rulePropertyCatalogue= rulePropertyCatalogue EOF ;
    public final EObject entryRulePropertyCatalogue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCatalogue = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:99:2: (iv_rulePropertyCatalogue= rulePropertyCatalogue EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:100:2: iv_rulePropertyCatalogue= rulePropertyCatalogue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyCatalogueRule()); 
            }
            pushFollow(FOLLOW_rulePropertyCatalogue_in_entryRulePropertyCatalogue165);
            iv_rulePropertyCatalogue=rulePropertyCatalogue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyCatalogue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyCatalogue175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyCatalogue"


    // $ANTLR start "rulePropertyCatalogue"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:107:1: rulePropertyCatalogue returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'property-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' ) ;
    public final EObject rulePropertyCatalogue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:110:28: ( ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'property-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:111:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'property-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:111:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'property-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:111:2: ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'property-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:111:2: ( (lv_imports_0_0= ruleImportNamespace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==68) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:112:1: (lv_imports_0_0= ruleImportNamespace )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:112:1: (lv_imports_0_0= ruleImportNamespace )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:113:3: lv_imports_0_0= ruleImportNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertyCatalogueAccess().getImportsImportNamespaceParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportNamespace_in_rulePropertyCatalogue221);
            	    lv_imports_0_0=ruleImportNamespace();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPropertyCatalogueRule());
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePropertyCatalogue234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyCatalogueAccess().getPropertyCatalogueKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:133:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:134:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:134:1: (lv_name_2_0= ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:135:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyCatalogueAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyCatalogue255);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyCatalogueRule());
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePropertyCatalogue267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropertyCatalogueAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:155:1: ( (lv_properties_4_0= ruleProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20||LA2_0==28||LA2_0==30) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:156:1: (lv_properties_4_0= ruleProperty )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:156:1: (lv_properties_4_0= ruleProperty )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:157:3: lv_properties_4_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertyCatalogueAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_rulePropertyCatalogue288);
            	    lv_properties_4_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPropertyCatalogueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_4_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePropertyCatalogue301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPropertyCatalogueAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyCatalogue"


    // $ANTLR start "entryRuleProperty"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:185:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:186:2: (iv_ruleProperty= ruleProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:187:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty337);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty347); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:194:1: ruleProperty returns [EObject current=null] : (this_QualitativeProperty_0= ruleQualitativeProperty | this_QuantitativeProperty_1= ruleQuantitativeProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_QualitativeProperty_0 = null;

        EObject this_QuantitativeProperty_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:197:28: ( (this_QualitativeProperty_0= ruleQualitativeProperty | this_QuantitativeProperty_1= ruleQuantitativeProperty ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:198:1: (this_QualitativeProperty_0= ruleQualitativeProperty | this_QuantitativeProperty_1= ruleQuantitativeProperty )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:198:1: (this_QualitativeProperty_0= ruleQualitativeProperty | this_QuantitativeProperty_1= ruleQuantitativeProperty )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==28||LA3_0==30) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:199:5: this_QualitativeProperty_0= ruleQualitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getQualitativePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQualitativeProperty_in_ruleProperty394);
                    this_QualitativeProperty_0=ruleQualitativeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QualitativeProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:209:5: this_QuantitativeProperty_1= ruleQuantitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getQuantitativePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuantitativeProperty_in_ruleProperty421);
                    this_QuantitativeProperty_1=ruleQuantitativeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuantitativeProperty_1; 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleQualitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:225:1: entryRuleQualitativeProperty returns [EObject current=null] : iv_ruleQualitativeProperty= ruleQualitativeProperty EOF ;
    public final EObject entryRuleQualitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:226:2: (iv_ruleQualitativeProperty= ruleQualitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:227:2: iv_ruleQualitativeProperty= ruleQualitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleQualitativeProperty_in_entryRuleQualitativeProperty456);
            iv_ruleQualitativeProperty=ruleQualitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitativeProperty466); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualitativeProperty"


    // $ANTLR start "ruleQualitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:234:1: ruleQualitativeProperty returns [EObject current=null] : (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )? (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )? (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )? otherlv_20= '}' ) ;
    public final EObject ruleQualitativeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Enumerator lv_direction_7_0 = null;

        EObject lv_impacts_16_0 = null;

        EObject lv_impacts_18_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:237:28: ( (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )? (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )? (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )? otherlv_20= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:238:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )? (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )? (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )? otherlv_20= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:238:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )? (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )? (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )? otherlv_20= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:238:3: otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )? (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )? (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleQualitativeProperty503); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQualitativePropertyAccess().getQualitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:242:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:243:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:243:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:244:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeProperty520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getQualitativePropertyAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQualitativePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeProperty537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQualitativePropertyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleQualitativeProperty549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getQualitativePropertyAccess().getDescriptionKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:268:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:269:1: (lv_description_4_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:269:1: (lv_description_4_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:270:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQualitativeProperty566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_description_4_0, grammarAccess.getQualitativePropertyAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQualitativePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"description",
                      		lv_description_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:286:2: (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==23) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:286:4: otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleQualitativeProperty584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getQualitativePropertyAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleQualitativeProperty596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getQualitativePropertyAccess().getDirectionKeyword_5_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:294:1: ( (lv_direction_7_0= ruleDirectionKind ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:295:1: (lv_direction_7_0= ruleDirectionKind )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:295:1: (lv_direction_7_0= ruleDirectionKind )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:296:3: lv_direction_7_0= ruleDirectionKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQualitativePropertyAccess().getDirectionDirectionKindEnumRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirectionKind_in_ruleQualitativeProperty617);
                    lv_direction_7_0=ruleDirectionKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQualitativePropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"direction",
                              		lv_direction_7_0, 
                              		"DirectionKind");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:312:4: (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==24) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:312:6: otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleQualitativeProperty632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getQualitativePropertyAccess().getCommaKeyword_6_0());
                          
                    }
                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleQualitativeProperty644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getQualitativePropertyAccess().getPropertiesKeyword_6_1());
                          
                    }
                    otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleQualitativeProperty656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getQualitativePropertyAccess().getLeftSquareBracketKeyword_6_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:324:1: ( ( ruleQualifiedName ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:325:1: ( ruleQualifiedName )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:325:1: ( ruleQualifiedName )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:326:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getQualitativePropertyRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQualitativePropertyAccess().getPropertiesPropertyCrossReference_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualitativeProperty679);
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
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleQualitativeProperty692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getQualitativePropertyAccess().getRightSquareBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:343:3: (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:343:5: otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']'
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleQualitativeProperty707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getQualitativePropertyAccess().getCommaKeyword_7_0());
                          
                    }
                    otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleQualitativeProperty719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getQualitativePropertyAccess().getImpactsKeyword_7_1());
                          
                    }
                    otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleQualitativeProperty731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getQualitativePropertyAccess().getLeftSquareBracketKeyword_7_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:355:1: ( (lv_impacts_16_0= rulePropertyImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:356:1: (lv_impacts_16_0= rulePropertyImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:356:1: (lv_impacts_16_0= rulePropertyImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:357:3: lv_impacts_16_0= rulePropertyImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQualitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyImpact_in_ruleQualitativeProperty752);
                    lv_impacts_16_0=rulePropertyImpact();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQualitativePropertyRule());
                      	        }
                             		add(
                             			current, 
                             			"impacts",
                              		lv_impacts_16_0, 
                              		"PropertyImpact");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:373:2: (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:373:4: otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) )
                    	    {
                    	    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleQualitativeProperty765); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_17, grammarAccess.getQualitativePropertyAccess().getCommaKeyword_7_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:377:1: ( (lv_impacts_18_0= rulePropertyImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:378:1: (lv_impacts_18_0= rulePropertyImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:378:1: (lv_impacts_18_0= rulePropertyImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:379:3: lv_impacts_18_0= rulePropertyImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQualitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_7_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyImpact_in_ruleQualitativeProperty786);
                    	    lv_impacts_18_0=rulePropertyImpact();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getQualitativePropertyRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"impacts",
                    	              		lv_impacts_18_0, 
                    	              		"PropertyImpact");
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

                    otherlv_19=(Token)match(input,26,FOLLOW_26_in_ruleQualitativeProperty800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getQualitativePropertyAccess().getRightSquareBracketKeyword_7_5());
                          
                    }

                    }
                    break;

            }

            otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeProperty814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getQualitativePropertyAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualitativeProperty"


    // $ANTLR start "entryRuleQuantitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:411:1: entryRuleQuantitativeProperty returns [EObject current=null] : iv_ruleQuantitativeProperty= ruleQuantitativeProperty EOF ;
    public final EObject entryRuleQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:412:2: (iv_ruleQuantitativeProperty= ruleQuantitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:413:2: iv_ruleQuantitativeProperty= ruleQuantitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleQuantitativeProperty_in_entryRuleQuantitativeProperty850);
            iv_ruleQuantitativeProperty=ruleQuantitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantitativeProperty860); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantitativeProperty"


    // $ANTLR start "ruleQuantitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:420:1: ruleQuantitativeProperty returns [EObject current=null] : (this_BaseQuantitativeProperty_0= ruleBaseQuantitativeProperty | this_DerivedQuantitativeProperty_1= ruleDerivedQuantitativeProperty ) ;
    public final EObject ruleQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject this_BaseQuantitativeProperty_0 = null;

        EObject this_DerivedQuantitativeProperty_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:423:28: ( (this_BaseQuantitativeProperty_0= ruleBaseQuantitativeProperty | this_DerivedQuantitativeProperty_1= ruleDerivedQuantitativeProperty ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:424:1: (this_BaseQuantitativeProperty_0= ruleBaseQuantitativeProperty | this_DerivedQuantitativeProperty_1= ruleDerivedQuantitativeProperty )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:424:1: (this_BaseQuantitativeProperty_0= ruleBaseQuantitativeProperty | this_DerivedQuantitativeProperty_1= ruleDerivedQuantitativeProperty )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==30) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:425:5: this_BaseQuantitativeProperty_0= ruleBaseQuantitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuantitativePropertyAccess().getBaseQuantitativePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBaseQuantitativeProperty_in_ruleQuantitativeProperty907);
                    this_BaseQuantitativeProperty_0=ruleBaseQuantitativeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BaseQuantitativeProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:435:5: this_DerivedQuantitativeProperty_1= ruleDerivedQuantitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuantitativePropertyAccess().getDerivedQuantitativePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDerivedQuantitativeProperty_in_ruleQuantitativeProperty934);
                    this_DerivedQuantitativeProperty_1=ruleDerivedQuantitativeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DerivedQuantitativeProperty_1; 
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
    // $ANTLR end "ruleQuantitativeProperty"


    // $ANTLR start "entryRuleBaseQuantitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:451:1: entryRuleBaseQuantitativeProperty returns [EObject current=null] : iv_ruleBaseQuantitativeProperty= ruleBaseQuantitativeProperty EOF ;
    public final EObject entryRuleBaseQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseQuantitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:452:2: (iv_ruleBaseQuantitativeProperty= ruleBaseQuantitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:453:2: iv_ruleBaseQuantitativeProperty= ruleBaseQuantitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseQuantitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleBaseQuantitativeProperty_in_entryRuleBaseQuantitativeProperty969);
            iv_ruleBaseQuantitativeProperty=ruleBaseQuantitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseQuantitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseQuantitativeProperty979); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseQuantitativeProperty"


    // $ANTLR start "ruleBaseQuantitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:460:1: ruleBaseQuantitativeProperty returns [EObject current=null] : (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )? (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? otherlv_18= '}' ) ;
    public final EObject ruleBaseQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Enumerator lv_direction_10_0 = null;

        EObject lv_impacts_14_0 = null;

        EObject lv_impacts_16_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:463:28: ( (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )? (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? otherlv_18= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:464:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )? (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? otherlv_18= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:464:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )? (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? otherlv_18= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:464:3: otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )? (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleBaseQuantitativeProperty1016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBaseQuantitativePropertyAccess().getQuantitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:468:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:469:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:469:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:470:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseQuantitativeProperty1033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBaseQuantitativePropertyAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBaseQuantitativePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleBaseQuantitativeProperty1050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBaseQuantitativePropertyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBaseQuantitativeProperty1062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBaseQuantitativePropertyAccess().getDescriptionKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:494:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:495:1: (lv_description_4_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:495:1: (lv_description_4_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:496:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBaseQuantitativeProperty1079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_description_4_0, grammarAccess.getBaseQuantitativePropertyAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBaseQuantitativePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"description",
                      		lv_description_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleBaseQuantitativeProperty1096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBaseQuantitativePropertyAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleBaseQuantitativeProperty1108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBaseQuantitativePropertyAccess().getTypeKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:520:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:521:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:521:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:522:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBaseQuantitativePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBaseQuantitativePropertyAccess().getTypeDataTypeCrossReference_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBaseQuantitativeProperty1131);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:535:2: (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==23) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:535:4: otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleBaseQuantitativeProperty1144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBaseQuantitativePropertyAccess().getCommaKeyword_8_0());
                          
                    }
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleBaseQuantitativeProperty1156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getBaseQuantitativePropertyAccess().getDirectionKeyword_8_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:543:1: ( (lv_direction_10_0= ruleDirectionKind ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:544:1: (lv_direction_10_0= ruleDirectionKind )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:544:1: (lv_direction_10_0= ruleDirectionKind )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:545:3: lv_direction_10_0= ruleDirectionKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBaseQuantitativePropertyAccess().getDirectionDirectionKindEnumRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirectionKind_in_ruleBaseQuantitativeProperty1177);
                    lv_direction_10_0=ruleDirectionKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBaseQuantitativePropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"direction",
                              		lv_direction_10_0, 
                              		"DirectionKind");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:561:4: (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:561:6: otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleBaseQuantitativeProperty1192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBaseQuantitativePropertyAccess().getCommaKeyword_9_0());
                          
                    }
                    otherlv_12=(Token)match(input,27,FOLLOW_27_in_ruleBaseQuantitativeProperty1204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getBaseQuantitativePropertyAccess().getImpactsKeyword_9_1());
                          
                    }
                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleBaseQuantitativeProperty1216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getBaseQuantitativePropertyAccess().getLeftSquareBracketKeyword_9_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:573:1: ( (lv_impacts_14_0= rulePropertyImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:574:1: (lv_impacts_14_0= rulePropertyImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:574:1: (lv_impacts_14_0= rulePropertyImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:575:3: lv_impacts_14_0= rulePropertyImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBaseQuantitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyImpact_in_ruleBaseQuantitativeProperty1237);
                    lv_impacts_14_0=rulePropertyImpact();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBaseQuantitativePropertyRule());
                      	        }
                             		add(
                             			current, 
                             			"impacts",
                              		lv_impacts_14_0, 
                              		"PropertyImpact");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:591:2: (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==22) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:591:4: otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) )
                    	    {
                    	    otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleBaseQuantitativeProperty1250); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_15, grammarAccess.getBaseQuantitativePropertyAccess().getCommaKeyword_9_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:595:1: ( (lv_impacts_16_0= rulePropertyImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:596:1: (lv_impacts_16_0= rulePropertyImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:596:1: (lv_impacts_16_0= rulePropertyImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:597:3: lv_impacts_16_0= rulePropertyImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBaseQuantitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_9_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyImpact_in_ruleBaseQuantitativeProperty1271);
                    	    lv_impacts_16_0=rulePropertyImpact();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBaseQuantitativePropertyRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"impacts",
                    	              		lv_impacts_16_0, 
                    	              		"PropertyImpact");
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

                    otherlv_17=(Token)match(input,26,FOLLOW_26_in_ruleBaseQuantitativeProperty1285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getBaseQuantitativePropertyAccess().getRightSquareBracketKeyword_9_5());
                          
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleBaseQuantitativeProperty1299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getBaseQuantitativePropertyAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseQuantitativeProperty"


    // $ANTLR start "entryRuleDerivedQuantitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:629:1: entryRuleDerivedQuantitativeProperty returns [EObject current=null] : iv_ruleDerivedQuantitativeProperty= ruleDerivedQuantitativeProperty EOF ;
    public final EObject entryRuleDerivedQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedQuantitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:630:2: (iv_ruleDerivedQuantitativeProperty= ruleDerivedQuantitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:631:2: iv_ruleDerivedQuantitativeProperty= ruleDerivedQuantitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDerivedQuantitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleDerivedQuantitativeProperty_in_entryRuleDerivedQuantitativeProperty1335);
            iv_ruleDerivedQuantitativeProperty=ruleDerivedQuantitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDerivedQuantitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDerivedQuantitativeProperty1345); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDerivedQuantitativeProperty"


    // $ANTLR start "ruleDerivedQuantitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:638:1: ruleDerivedQuantitativeProperty returns [EObject current=null] : (otherlv_0= 'derived' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) otherlv_11= ',' otherlv_12= 'expression' ( (lv_expression_13_0= ruleArithmeticExpression ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' ) ;
    public final EObject ruleDerivedQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
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
        Enumerator lv_direction_10_0 = null;

        EObject lv_expression_13_0 = null;

        EObject lv_impacts_17_0 = null;

        EObject lv_impacts_19_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:641:28: ( (otherlv_0= 'derived' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) otherlv_11= ',' otherlv_12= 'expression' ( (lv_expression_13_0= ruleArithmeticExpression ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:642:1: (otherlv_0= 'derived' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) otherlv_11= ',' otherlv_12= 'expression' ( (lv_expression_13_0= ruleArithmeticExpression ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:642:1: (otherlv_0= 'derived' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) otherlv_11= ',' otherlv_12= 'expression' ( (lv_expression_13_0= ruleArithmeticExpression ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:642:3: otherlv_0= 'derived' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) otherlv_11= ',' otherlv_12= 'expression' ( (lv_expression_13_0= ruleArithmeticExpression ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleDerivedQuantitativeProperty1382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDerivedQuantitativePropertyAccess().getDerivedKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:646:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:647:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:647:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:648:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDerivedQuantitativeProperty1399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDerivedQuantitativePropertyAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDerivedQuantitativePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDerivedQuantitativeProperty1416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDerivedQuantitativePropertyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleDerivedQuantitativeProperty1428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDerivedQuantitativePropertyAccess().getDescriptionKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:672:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:673:1: (lv_description_4_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:673:1: (lv_description_4_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:674:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDerivedQuantitativeProperty1445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_description_4_0, grammarAccess.getDerivedQuantitativePropertyAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDerivedQuantitativePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"description",
                      		lv_description_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleDerivedQuantitativeProperty1462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDerivedQuantitativePropertyAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleDerivedQuantitativeProperty1474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDerivedQuantitativePropertyAccess().getTypeKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:698:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:699:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:699:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:700:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDerivedQuantitativePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDerivedQuantitativePropertyAccess().getTypeDataTypeCrossReference_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDerivedQuantitativeProperty1497);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleDerivedQuantitativeProperty1509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getDerivedQuantitativePropertyAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleDerivedQuantitativeProperty1521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getDerivedQuantitativePropertyAccess().getDirectionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:721:1: ( (lv_direction_10_0= ruleDirectionKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:722:1: (lv_direction_10_0= ruleDirectionKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:722:1: (lv_direction_10_0= ruleDirectionKind )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:723:3: lv_direction_10_0= ruleDirectionKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDerivedQuantitativePropertyAccess().getDirectionDirectionKindEnumRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDirectionKind_in_ruleDerivedQuantitativeProperty1542);
            lv_direction_10_0=ruleDirectionKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDerivedQuantitativePropertyRule());
              	        }
                     		set(
                     			current, 
                     			"direction",
                      		lv_direction_10_0, 
                      		"DirectionKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleDerivedQuantitativeProperty1554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getDerivedQuantitativePropertyAccess().getCommaKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleDerivedQuantitativeProperty1566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getDerivedQuantitativePropertyAccess().getExpressionKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:747:1: ( (lv_expression_13_0= ruleArithmeticExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:748:1: (lv_expression_13_0= ruleArithmeticExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:748:1: (lv_expression_13_0= ruleArithmeticExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:749:3: lv_expression_13_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDerivedQuantitativePropertyAccess().getExpressionArithmeticExpressionParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleDerivedQuantitativeProperty1587);
            lv_expression_13_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDerivedQuantitativePropertyRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_13_0, 
                      		"ArithmeticExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:765:2: (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:765:4: otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']'
                    {
                    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleDerivedQuantitativeProperty1600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getDerivedQuantitativePropertyAccess().getCommaKeyword_14_0());
                          
                    }
                    otherlv_15=(Token)match(input,27,FOLLOW_27_in_ruleDerivedQuantitativeProperty1612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getDerivedQuantitativePropertyAccess().getImpactsKeyword_14_1());
                          
                    }
                    otherlv_16=(Token)match(input,25,FOLLOW_25_in_ruleDerivedQuantitativeProperty1624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getDerivedQuantitativePropertyAccess().getLeftSquareBracketKeyword_14_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:777:1: ( (lv_impacts_17_0= rulePropertyImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:778:1: (lv_impacts_17_0= rulePropertyImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:778:1: (lv_impacts_17_0= rulePropertyImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:779:3: lv_impacts_17_0= rulePropertyImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDerivedQuantitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_14_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyImpact_in_ruleDerivedQuantitativeProperty1645);
                    lv_impacts_17_0=rulePropertyImpact();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDerivedQuantitativePropertyRule());
                      	        }
                             		add(
                             			current, 
                             			"impacts",
                              		lv_impacts_17_0, 
                              		"PropertyImpact");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:795:2: (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==22) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:795:4: otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) )
                    	    {
                    	    otherlv_18=(Token)match(input,22,FOLLOW_22_in_ruleDerivedQuantitativeProperty1658); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_18, grammarAccess.getDerivedQuantitativePropertyAccess().getCommaKeyword_14_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:799:1: ( (lv_impacts_19_0= rulePropertyImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:800:1: (lv_impacts_19_0= rulePropertyImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:800:1: (lv_impacts_19_0= rulePropertyImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:801:3: lv_impacts_19_0= rulePropertyImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDerivedQuantitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_14_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyImpact_in_ruleDerivedQuantitativeProperty1679);
                    	    lv_impacts_19_0=rulePropertyImpact();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDerivedQuantitativePropertyRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"impacts",
                    	              		lv_impacts_19_0, 
                    	              		"PropertyImpact");
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

                    otherlv_20=(Token)match(input,26,FOLLOW_26_in_ruleDerivedQuantitativeProperty1693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getDerivedQuantitativePropertyAccess().getRightSquareBracketKeyword_14_5());
                          
                    }

                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FOLLOW_19_in_ruleDerivedQuantitativeProperty1707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getDerivedQuantitativePropertyAccess().getRightCurlyBracketKeyword_15());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDerivedQuantitativeProperty"


    // $ANTLR start "entryRuleComparableExpression"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:833:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:834:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:835:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression1743);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression1753); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:842:1: ruleComparableExpression returns [EObject current=null] : this_NumberExpression_0= ruleNumberExpression ;
    public final EObject ruleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:845:28: (this_NumberExpression_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:847:5: this_NumberExpression_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparableExpressionAccess().getNumberExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleComparableExpression1799);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
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
    // $ANTLR end "ruleComparableExpression"


    // $ANTLR start "entryRuleNumberExpression"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:863:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:864:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:865:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression1833);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression1843); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:872:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_ParenthesizedArithmeticExpression_2= ruleParenthesizedArithmeticExpression | this_QuantitativePropertyExpression_3= ruleQuantitativePropertyExpression ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;

        EObject this_ParenthesizedArithmeticExpression_2 = null;

        EObject this_QuantitativePropertyExpression_3 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:875:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_ParenthesizedArithmeticExpression_2= ruleParenthesizedArithmeticExpression | this_QuantitativePropertyExpression_3= ruleQuantitativePropertyExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:876:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_ParenthesizedArithmeticExpression_2= ruleParenthesizedArithmeticExpression | this_QuantitativePropertyExpression_3= ruleQuantitativePropertyExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:876:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_ParenthesizedArithmeticExpression_2= ruleParenthesizedArithmeticExpression | this_QuantitativePropertyExpression_3= ruleQuantitativePropertyExpression )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt15=1;
                }
                break;
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:877:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression1890);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:887:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression1917);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:897:5: this_ParenthesizedArithmeticExpression_2= ruleParenthesizedArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getParenthesizedArithmeticExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedArithmeticExpression_in_ruleNumberExpression1944);
                    this_ParenthesizedArithmeticExpression_2=ruleParenthesizedArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedArithmeticExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:907:5: this_QuantitativePropertyExpression_3= ruleQuantitativePropertyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getQuantitativePropertyExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuantitativePropertyExpression_in_ruleNumberExpression1971);
                    this_QuantitativePropertyExpression_3=ruleQuantitativePropertyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuantitativePropertyExpression_3; 
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


    // $ANTLR start "entryRuleParenthesizedArithmeticExpression"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:923:1: entryRuleParenthesizedArithmeticExpression returns [EObject current=null] : iv_ruleParenthesizedArithmeticExpression= ruleParenthesizedArithmeticExpression EOF ;
    public final EObject entryRuleParenthesizedArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:924:2: (iv_ruleParenthesizedArithmeticExpression= ruleParenthesizedArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:925:2: iv_ruleParenthesizedArithmeticExpression= ruleParenthesizedArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedArithmeticExpression_in_entryRuleParenthesizedArithmeticExpression2006);
            iv_ruleParenthesizedArithmeticExpression=ruleParenthesizedArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedArithmeticExpression2016); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedArithmeticExpression"


    // $ANTLR start "ruleParenthesizedArithmeticExpression"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:932:1: ruleParenthesizedArithmeticExpression returns [EObject current=null] : ( () ruleLeftParenthesis ( (lv_value_2_0= ruleArithmeticExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:935:28: ( ( () ruleLeftParenthesis ( (lv_value_2_0= ruleArithmeticExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:936:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleArithmeticExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:936:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleArithmeticExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:936:2: () ruleLeftParenthesis ( (lv_value_2_0= ruleArithmeticExpression ) ) ruleRightParenthesis
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:936:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:937:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedArithmeticExpressionAccess().getParenthesizedArithmeticExpressionAction_0(),
                          current);
                  
            }

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedArithmeticExpressionAccess().getLeftParenthesisParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedArithmeticExpression2066);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:950:1: ( (lv_value_2_0= ruleArithmeticExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:951:1: (lv_value_2_0= ruleArithmeticExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:951:1: (lv_value_2_0= ruleArithmeticExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:952:3: lv_value_2_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedArithmeticExpressionAccess().getValueArithmeticExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleParenthesizedArithmeticExpression2086);
            lv_value_2_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesizedArithmeticExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"ArithmeticExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedArithmeticExpressionAccess().getRightParenthesisParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedArithmeticExpression2102);
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
    // $ANTLR end "ruleParenthesizedArithmeticExpression"


    // $ANTLR start "entryRuleQuantitativePropertyExpression"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:984:1: entryRuleQuantitativePropertyExpression returns [EObject current=null] : iv_ruleQuantitativePropertyExpression= ruleQuantitativePropertyExpression EOF ;
    public final EObject entryRuleQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantitativePropertyExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:985:2: (iv_ruleQuantitativePropertyExpression= ruleQuantitativePropertyExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:986:2: iv_ruleQuantitativePropertyExpression= ruleQuantitativePropertyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantitativePropertyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleQuantitativePropertyExpression_in_entryRuleQuantitativePropertyExpression2137);
            iv_ruleQuantitativePropertyExpression=ruleQuantitativePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantitativePropertyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantitativePropertyExpression2147); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantitativePropertyExpression"


    // $ANTLR start "ruleQuantitativePropertyExpression"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:993:1: ruleQuantitativePropertyExpression returns [EObject current=null] : ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:996:28: ( ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:997:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:997:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:997:2: () otherlv_1= '$' ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:997:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:998:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getQuantitativePropertyExpressionAccess().getQuantitativePropertyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleQuantitativePropertyExpression2193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQuantitativePropertyExpressionAccess().getDollarSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1007:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1008:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1008:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1009:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQuantitativePropertyExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuantitativePropertyExpressionAccess().getValueQuantitativePropertyCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQuantitativePropertyExpression2216);
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
    // $ANTLR end "ruleQuantitativePropertyExpression"


    // $ANTLR start "entryRulePropertyImpact"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1030:1: entryRulePropertyImpact returns [EObject current=null] : iv_rulePropertyImpact= rulePropertyImpact EOF ;
    public final EObject entryRulePropertyImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1031:2: (iv_rulePropertyImpact= rulePropertyImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1032:2: iv_rulePropertyImpact= rulePropertyImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyImpactRule()); 
            }
            pushFollow(FOLLOW_rulePropertyImpact_in_entryRulePropertyImpact2252);
            iv_rulePropertyImpact=rulePropertyImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyImpact; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyImpact2262); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1039:1: rulePropertyImpact returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) ;
    public final EObject rulePropertyImpact() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_impact_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1042:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1043:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1043:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1043:2: ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1043:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1044:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1044:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1045:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyImpactRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyImpactAccess().getTargetPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyImpact2310);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1058:2: ( (lv_impact_1_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1059:1: (lv_impact_1_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1059:1: (lv_impact_1_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1060:3: lv_impact_1_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyImpactAccess().getImpactImpactParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_rulePropertyImpact2331);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1084:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1085:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1086:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2367);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2377); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1093:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1096:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1098:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression2423);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1114:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1115:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1116:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication2457);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication2467); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1123:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1126:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1127:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1127:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1128:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication2514);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1136:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=43 && LA16_0<=44)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1136:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1136:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1137:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1142:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1143:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1143:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1144:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication2544);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1160:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1161:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1161:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1162:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication2565);
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
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1186:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1187:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1188:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction2603);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction2613); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1195:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1198:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1199:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1199:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1200:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction2660);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1208:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=37 && LA18_0<=40)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1208:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1208:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1209:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1214:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1215:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1215:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1216:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1216:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( ((LA17_0>=37 && LA17_0<=38)) ) {
            	        alt17=1;
            	    }
            	    else if ( ((LA17_0>=39 && LA17_0<=40)) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1217:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction2692);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1232:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction2711);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1250:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1251:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1251:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1252:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction2735);
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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1276:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1277:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1278:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction2773);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction2783); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1285:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1288:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1289:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1289:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1290:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction2830);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1298:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=41 && LA19_0<=42)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1298:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1298:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1299:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1304:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1305:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1305:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1306:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction2860);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1322:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1323:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1323:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1324:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction2881);
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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleComparison"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1348:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1349:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1350:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2919);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2929); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1357:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1360:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1361:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1361:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1362:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison2976);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1370:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=45 && LA21_0<=47)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1370:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1370:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1371:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1376:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1377:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1377:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1378:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1378:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==45) ) {
            	        alt20=1;
            	    }
            	    else if ( ((LA20_0>=46 && LA20_0<=47)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1379:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison3008);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1394:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison3027);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1412:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1413:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1413:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1414:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison3051);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleBooleanUnit"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1438:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1439:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1440:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit3089);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit3099); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1447:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1450:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1451:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1451:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 48:
            case 49:
                {
                alt22=1;
                }
                break;
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
            case 32:
            case 33:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt22=2;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1452:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit3146);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1462:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit3173);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1472:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit3200);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1488:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1489:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1490:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation3235);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation3245); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1497:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1500:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1501:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1501:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1501:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1501:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1502:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1502:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1503:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation3291);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1519:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1520:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1520:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1521:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation3312);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1545:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1546:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1547:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3348);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression3358); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1554:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1557:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1558:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1558:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1559:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3405);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1567:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=50 && LA24_0<=53)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1567:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1567:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt23=4;
            	    switch ( input.LA(1) ) {
            	    case 50:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1567:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1567:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1567:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1567:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1568:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1573:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1574:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1574:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1575:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression3437);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1592:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1592:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1592:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1592:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1593:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1598:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1599:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1599:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1600:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression3475);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1617:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1617:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1617:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1617:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1618:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1623:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1624:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1624:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1625:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression3513);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1642:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1642:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1642:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1642:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1643:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1648:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1649:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1649:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1650:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression3551);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1666:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1667:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1667:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1668:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3574);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1692:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1693:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1694:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression3612);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression3622); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1701:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1704:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1706:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression3668);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1722:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1723:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1724:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3702);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression3712); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1731:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1734:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1735:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1735:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1736:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3759);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1744:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=54 && LA26_0<=55)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1744:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1744:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1745:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1750:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1751:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1751:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1752:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1752:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==55) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==54) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1753:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression3791);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1768:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression3810);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1786:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1787:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1787:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1788:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3834);
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1812:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1813:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1814:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3872);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression3882); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1821:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1824:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1825:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1825:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1826:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression3929);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1834:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==36||(LA28_0>=56 && LA28_0<=57)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1834:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1834:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1835:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1840:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1841:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1841:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1842:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1842:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 57:
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1843:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression3961);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1858:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression3980);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1873:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression3999);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1891:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1892:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1892:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1893:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression4023);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleNumberFunction"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1917:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1918:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1919:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction4061);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction4071); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1926:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1929:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1930:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1930:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt29=8;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt29=1;
                }
                break;
            case 59:
                {
                alt29=2;
                }
                break;
            case 60:
                {
                alt29=3;
                }
                break;
            case 61:
                {
                alt29=4;
                }
                break;
            case 62:
                {
                alt29=5;
                }
                break;
            case 63:
                {
                alt29=6;
                }
                break;
            case 64:
                {
                alt29=7;
                }
                break;
            case 65:
                {
                alt29=8;
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1931:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction4118);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1941:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction4145);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1951:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction4172);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1961:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction4199);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1971:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction4226);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1981:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction4253);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1991:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction4280);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2001:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction4307);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2017:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2018:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2019:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction4342);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction4352); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2026:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2029:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2030:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2030:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2030:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2030:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2031:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2031:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2032:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction4398);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleMaximumFunction4410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2052:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2053:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2053:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2054:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4431);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2070:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2070:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleMaximumFunction4444); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2074:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2075:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2075:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2076:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4465);
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
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleMaximumFunction4479); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2104:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2105:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2106:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction4515);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction4525); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2113:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2116:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2117:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2117:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2117:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2117:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2118:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2118:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2119:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction4571);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleMinimumFunction4583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2139:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2140:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2140:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2141:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction4604);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2157:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2157:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleMinimumFunction4617); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2161:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2162:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2162:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2163:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction4638);
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
            	    break loop31;
                }
            } while (true);

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleMinimumFunction4652); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2191:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2192:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2193:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction4688);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction4698); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2200:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2203:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2204:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2204:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2204:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2204:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2205:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2205:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2206:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction4744);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleAverageFunction4756); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2226:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2227:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2227:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2228:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction4777);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2244:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==22) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2244:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAverageFunction4790); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2248:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2249:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2249:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2250:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction4811);
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
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleAverageFunction4825); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2278:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2279:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2280:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction4861);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction4871); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2287:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2290:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2291:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2291:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2291:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2291:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2292:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2292:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2293:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction4917);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleSumFunction4929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2313:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2314:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2314:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2315:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction4950);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2331:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2331:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSumFunction4963); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2335:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2336:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2336:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2337:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction4984);
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
            	    break loop33;
                }
            } while (true);

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleSumFunction4998); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2365:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2366:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2367:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction5034);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction5044); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2374:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2377:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2378:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2378:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2378:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2378:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2379:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2379:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2380:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction5090);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleExponentialFunction5102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2400:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2401:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2401:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2402:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5123);
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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleExponentialFunction5135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2422:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2423:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2423:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2424:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5156);
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

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleExponentialFunction5168); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2452:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2453:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2454:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction5204);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction5214); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2461:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2464:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2465:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2465:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2465:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2465:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2466:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2466:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2467:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction5260);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleAbsoluteFunction5272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2487:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2488:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2488:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2489:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction5293);
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleAbsoluteFunction5305); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2517:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2518:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2519:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction5341);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction5351); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2526:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2529:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2530:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2530:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2530:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2530:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2531:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2531:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2532:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction5397);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleNaturalLogarithmFunction5409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2552:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2553:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2553:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2554:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction5430);
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleNaturalLogarithmFunction5442); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2582:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2583:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2584:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction5478);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction5488); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2591:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2594:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2595:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2595:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2595:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2595:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2596:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2596:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2597:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction5534);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleCommonLogarithmFunction5546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2617:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2618:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2618:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2619:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction5567);
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleCommonLogarithmFunction5579); if (state.failed) return current;
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


    // $ANTLR start "entryRuleValueSpecification"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2649:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2650:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2651:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification5617);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification5627); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2658:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2661:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2662:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2662:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt34=3;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2663:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification5674);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2673:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification5701);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2683:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification5728);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2699:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2700:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2701:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression5763);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression5773); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2708:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2711:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2712:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2712:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2712:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2712:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2713:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2713:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2714:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression5821);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2727:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            else if ( (LA35_0==18) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2727:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2727:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2728:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2728:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2729:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression5843);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2746:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2746:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2747:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2747:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2748:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression5870);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2772:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2773:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2774:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection5907);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection5917); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2781:1: ruleCollection returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2784:28: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2785:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2785:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2785:2: () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2785:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2786:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCollectionAccess().getCollectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleCollection5963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2795:1: ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_EBIGDECIMAL)||LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2795:2: ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2795:2: ( (lv_values_2_0= ruleValueSpecification ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2796:1: (lv_values_2_0= ruleValueSpecification )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2796:1: (lv_values_2_0= ruleValueSpecification )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2797:3: lv_values_2_0= ruleValueSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection5985);
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

                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2813:2: (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==22) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2813:4: otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleCollection5998); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2817:1: ( (lv_values_4_0= ruleValueSpecification ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2818:1: (lv_values_4_0= ruleValueSpecification )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2818:1: (lv_values_4_0= ruleValueSpecification )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2819:3: lv_values_4_0= ruleValueSpecification
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection6019);
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
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleCollection6035); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2847:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2848:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2849:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple6071);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple6081); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2856:1: ruleTuple returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tuples_2_0 = null;

        EObject lv_tuples_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2859:28: ( ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2860:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2860:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2860:2: () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2860:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2861:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTupleAccess().getTupleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTuple6127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2870:1: ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2870:2: ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2870:2: ( (lv_tuples_2_0= rulePropertyValuePair ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2871:1: (lv_tuples_2_0= rulePropertyValuePair )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2871:1: (lv_tuples_2_0= rulePropertyValuePair )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2872:3: lv_tuples_2_0= rulePropertyValuePair
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple6149);
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

                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2888:2: (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==22) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2888:4: otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleTuple6162); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2892:1: ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2893:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2893:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2894:3: lv_tuples_4_0= rulePropertyValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple6183);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleTuple6199); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2922:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2923:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2924:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair6235);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair6245); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2931:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2934:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2935:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2935:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2935:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2935:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2936:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2936:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2937:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair6293);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_rulePropertyValuePair6305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2954:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2955:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2955:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2956:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair6326);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2980:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2981:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2982:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression6362);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression6372); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2989:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2992:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2993:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2993:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2994:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2994:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2995:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression6419);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3016:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3017:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3018:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression6454);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression6464); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3025:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3028:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3029:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3029:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt40=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt40=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt40=2;
                }
                break;
            case RULE_NULL:
                {
                alt40=3;
                }
                break;
            case RULE_STRING:
                {
                alt40=4;
                }
                break;
            case 36:
                {
                alt40=5;
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3030:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression6511);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3040:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression6538);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3050:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression6565);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3060:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression6592);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3070:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression6619);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3086:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3087:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3088:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6654);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral6664); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3095:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3098:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3099:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3099:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3100:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3100:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3101:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral6705); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3125:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3126:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3127:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6745);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral6755); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3134:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3137:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3138:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3138:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3139:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3139:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3140:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral6800);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3164:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3165:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3166:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral6835);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral6845); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3173:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3176:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3177:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3177:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3178:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3178:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3179:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral6886); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3203:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3204:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3205:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6926);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6936); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3212:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3215:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3216:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3216:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3217:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3217:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3218:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral6977); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3242:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3243:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3244:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral7017);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral7027); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3251:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3254:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3255:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3255:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3256:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3256:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3257:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,36,FOLLOW_36_in_ruleUnlimitedLiteral7069); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3278:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3279:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3280:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator7117);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator7127); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3287:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3290:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3291:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3291:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3291:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3291:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3292:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3297:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            else if ( (LA41_0==38) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3297:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleOrOperator7174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3302:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleOrOperator7192); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3314:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3315:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3316:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator7229);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator7239); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3323:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3326:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3327:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3327:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3327:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3327:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3328:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3333:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            else if ( (LA42_0==40) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3333:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleXOrOperator7286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3338:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXOrOperator7304); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3350:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3351:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3352:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator7341);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator7351); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3359:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3362:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3363:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3363:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3363:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3363:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3364:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3369:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==41) ) {
                alt43=1;
            }
            else if ( (LA43_0==42) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3369:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleAndOperator7398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3374:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleAndOperator7416); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3386:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3387:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3388:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator7453);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator7463); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3395:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3398:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3399:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3399:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3399:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3399:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3400:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3405:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            else if ( (LA44_0==44) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3405:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleImplicationOperator7510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3410:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleImplicationOperator7528); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3422:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3423:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3424:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator7565);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator7575); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3431:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3434:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3435:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3435:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3435:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3435:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3436:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleEqualsOperator7621); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3453:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3454:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3455:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator7657);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator7667); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3462:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3465:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3466:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3466:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3466:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3466:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3467:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3472:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==46) ) {
                alt45=1;
            }
            else if ( (LA45_0==47) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3472:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleNotEqualsOperator7714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3477:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleNotEqualsOperator7732); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3489:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3490:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3491:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator7769);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator7779); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3498:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3501:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3502:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3502:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3502:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3502:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3503:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3508:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            else if ( (LA46_0==49) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3508:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleNotOperator7826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3513:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleNotOperator7844); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3525:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3526:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3527:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator7881);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator7891); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3534:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3537:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3538:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3538:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3538:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3538:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3539:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleGreaterThanOperator7937); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3556:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3557:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3558:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator7973);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator7983); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3565:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3568:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3569:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3569:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3569:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3569:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3570:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleGreaterOrEqualThanOperator8029); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3587:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3588:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3589:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator8065);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator8075); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3596:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3599:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3600:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3600:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3600:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3600:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3601:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleLessThanOperator8121); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3618:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3619:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3620:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator8157);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator8167); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3627:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3630:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3631:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3631:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3631:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3631:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3632:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleLessOrEqualThanOperator8213); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3649:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3650:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3651:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator8249);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator8259); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3658:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3661:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3662:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3662:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3662:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3662:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3663:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleAdditionOperator8305); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3680:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3681:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3682:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator8341);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator8351); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3689:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3692:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3693:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3693:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3693:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3693:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3694:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleSubstractionOperator8397); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3711:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3712:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3713:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator8433);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator8443); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3720:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3723:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3724:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3724:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3724:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3724:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3725:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleMultiplicationOperator8489); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3742:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3743:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3744:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator8525);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator8535); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3751:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3754:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3755:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3755:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3755:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3755:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3756:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleDivisionOperator8581); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3773:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3774:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3775:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator8617);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator8627); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3782:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3785:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3786:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3786:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3786:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3786:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3787:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleModulusOperator8673); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3804:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3805:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3806:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator8709);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator8719); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3813:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3816:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3817:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3817:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3817:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3817:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3818:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleMaxOperator8765); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3835:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3836:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3837:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator8801);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator8811); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3844:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3847:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3848:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3848:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3848:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3848:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3849:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleMinOperator8857); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3866:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3867:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3868:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator8893);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator8903); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3875:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3878:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3879:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3879:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3879:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3879:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3880:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleAvgOperator8949); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3897:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3898:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3899:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator8985);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator8995); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3906:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3909:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3910:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3910:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3910:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3910:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3911:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleSumOperator9041); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3928:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3929:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3930:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator9077);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator9087); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3937:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3940:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3941:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3941:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3941:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3941:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3942:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleExponentialOperator9133); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3959:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3960:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3961:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator9169);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator9179); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3968:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3971:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3972:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3972:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3972:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3972:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3973:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleAbsoluteOperator9225); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3990:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3991:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3992:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator9261);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator9271); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3999:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4002:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4003:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4003:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4003:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4003:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4004:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleNaturalLogarithmOperator9317); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4021:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4022:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4023:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator9353);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator9363); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4030:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4033:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4034:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4034:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4034:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4034:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4035:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleCommonLogarithmOperator9409); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4052:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4053:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4054:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis9446);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis9457); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4061:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4064:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4066:2: kw= '('
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleLeftParenthesis9494); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4079:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4080:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4081:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis9534);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis9545); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4088:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4091:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4093:2: kw= ')'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleRightParenthesis9582); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4106:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4107:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4108:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9622);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9633); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4115:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4118:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4119:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4119:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4119:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4126:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==66) && (synpred1_InternalNSL())) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4126:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4126:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4126:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,66,FOLLOW_66_in_ruleQualifiedName9701); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9717); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4151:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4152:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4153:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9767);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9778); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4160:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4163:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4164:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4164:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4165:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9825);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4175:1: (kw= '.*' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==67) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4176:2: kw= '.*'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleQualifiedNameWithWildcard9844); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4193:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4194:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4195:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace9890);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace9900); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4202:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4205:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4206:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4206:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4206:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleImportNamespace9937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4210:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4211:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4211:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4212:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace9958);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4236:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4237:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4238:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber9995);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10006); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4245:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4248:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4249:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4249:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt49=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt49=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt49=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt49=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt49=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4249:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4257:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber10072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4265:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber10098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4273:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber10124); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4288:1: entryRuleImpact returns [String current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final String entryRuleImpact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4289:2: (iv_ruleImpact= ruleImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4290:2: iv_ruleImpact= ruleImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpactRule()); 
            }
            pushFollow(FOLLOW_ruleImpact_in_entryRuleImpact10170);
            iv_ruleImpact=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpact.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpact10181); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4297:1: ruleImpact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleImpact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_POSITIVE_SMALL_DECIMAL_0=null;
        Token this_SMALL_DECIMAL_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4300:28: ( (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4301:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4301:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_POSITIVE_SMALL_DECIMAL) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_SMALL_DECIMAL) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4301:6: this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact10221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_0, grammarAccess.getImpactAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4309:10: this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_1=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact10247); if (state.failed) return current;
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


    // $ANTLR start "ruleDirectionKind"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4326:1: ruleDirectionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'increasing' ) | (enumLiteral_1= 'decreasing' ) | (enumLiteral_2= 'range' ) ) ;
    public final Enumerator ruleDirectionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4328:28: ( ( (enumLiteral_0= 'increasing' ) | (enumLiteral_1= 'decreasing' ) | (enumLiteral_2= 'range' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4329:1: ( (enumLiteral_0= 'increasing' ) | (enumLiteral_1= 'decreasing' ) | (enumLiteral_2= 'range' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4329:1: ( (enumLiteral_0= 'increasing' ) | (enumLiteral_1= 'decreasing' ) | (enumLiteral_2= 'range' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt51=1;
                }
                break;
            case 70:
                {
                alt51=2;
                }
                break;
            case 71:
                {
                alt51=3;
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4329:2: (enumLiteral_0= 'increasing' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4329:2: (enumLiteral_0= 'increasing' )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4329:4: enumLiteral_0= 'increasing'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleDirectionKind10308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionKindAccess().getINCREASINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionKindAccess().getINCREASINGEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4335:6: (enumLiteral_1= 'decreasing' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4335:6: (enumLiteral_1= 'decreasing' )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4335:8: enumLiteral_1= 'decreasing'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleDirectionKind10325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionKindAccess().getDECREASINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionKindAccess().getDECREASINGEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4341:6: (enumLiteral_2= 'range' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4341:6: (enumLiteral_2= 'range' )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4341:8: enumLiteral_2= 'range'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_71_in_ruleDirectionKind10342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionKindAccess().getRANGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDirectionKindAccess().getRANGEEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleDirectionKind"

    // $ANTLR start synpred1_InternalNSL
    public final void synpred1_InternalNSL_fragment() throws RecognitionException {   
        // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4126:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4127:2: '.'
        {
        match(input,66,FOLLOW_66_in_synpred1_InternalNSL9692); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalNSL

    // Delegated rules

    public final boolean synpred1_InternalNSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalNSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA34_eotS =
        "\7\uffff";
    static final String DFA34_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA34_minS =
        "\1\4\1\uffff\1\22\1\4\2\uffff\1\22";
    static final String DFA34_maxS =
        "\1\44\1\uffff\1\102\1\4\2\uffff\1\102";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA34_specialS =
        "\7\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\2\7\1\30\uffff\1\1",
            "",
            "\1\5\1\4\2\uffff\1\4\2\uffff\1\5\1\4\47\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\5\1\4\2\uffff\1\4\2\uffff\1\5\1\4\47\uffff\1\3"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2662:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleARTISTModel_in_entryRuleARTISTModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleARTISTModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCatalogue_in_ruleARTISTModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCatalogue_in_entryRulePropertyCatalogue165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyCatalogue175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_rulePropertyCatalogue221 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000010L});
    public static final BitSet FOLLOW_17_in_rulePropertyCatalogue234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyCatalogue255 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePropertyCatalogue267 = new BitSet(new long[]{0x0000000050180000L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePropertyCatalogue288 = new BitSet(new long[]{0x0000000050180000L});
    public static final BitSet FOLLOW_19_in_rulePropertyCatalogue301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeProperty_in_ruleProperty394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantitativeProperty_in_ruleProperty421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeProperty_in_entryRuleQualitativeProperty456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeProperty466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleQualitativeProperty503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeProperty520 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeProperty537 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQualitativeProperty549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQualitativeProperty566 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleQualitativeProperty584 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleQualitativeProperty596 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleDirectionKind_in_ruleQualitativeProperty617 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleQualitativeProperty632 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQualitativeProperty644 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQualitativeProperty656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualitativeProperty679 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_ruleQualitativeProperty692 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleQualitativeProperty707 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleQualitativeProperty719 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQualitativeProperty731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleQualitativeProperty752 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleQualitativeProperty765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleQualitativeProperty786 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleQualitativeProperty800 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeProperty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantitativeProperty_in_entryRuleQuantitativeProperty850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantitativeProperty860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseQuantitativeProperty_in_ruleQuantitativeProperty907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDerivedQuantitativeProperty_in_ruleQuantitativeProperty934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseQuantitativeProperty_in_entryRuleBaseQuantitativeProperty969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseQuantitativeProperty979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBaseQuantitativeProperty1016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseQuantitativeProperty1033 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBaseQuantitativeProperty1050 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBaseQuantitativeProperty1062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBaseQuantitativeProperty1079 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBaseQuantitativeProperty1096 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBaseQuantitativeProperty1108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBaseQuantitativeProperty1131 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleBaseQuantitativeProperty1144 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBaseQuantitativeProperty1156 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleDirectionKind_in_ruleBaseQuantitativeProperty1177 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleBaseQuantitativeProperty1192 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBaseQuantitativeProperty1204 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleBaseQuantitativeProperty1216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleBaseQuantitativeProperty1237 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleBaseQuantitativeProperty1250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleBaseQuantitativeProperty1271 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleBaseQuantitativeProperty1285 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBaseQuantitativeProperty1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDerivedQuantitativeProperty_in_entryRuleDerivedQuantitativeProperty1335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDerivedQuantitativeProperty1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDerivedQuantitativeProperty1382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDerivedQuantitativeProperty1399 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDerivedQuantitativeProperty1416 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDerivedQuantitativeProperty1428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDerivedQuantitativeProperty1445 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDerivedQuantitativeProperty1462 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDerivedQuantitativeProperty1474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDerivedQuantitativeProperty1497 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDerivedQuantitativeProperty1509 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDerivedQuantitativeProperty1521 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleDirectionKind_in_ruleDerivedQuantitativeProperty1542 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDerivedQuantitativeProperty1554 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDerivedQuantitativeProperty1566 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleDerivedQuantitativeProperty1587 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleDerivedQuantitativeProperty1600 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDerivedQuantitativeProperty1612 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDerivedQuantitativeProperty1624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleDerivedQuantitativeProperty1645 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleDerivedQuantitativeProperty1658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleDerivedQuantitativeProperty1679 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleDerivedQuantitativeProperty1693 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDerivedQuantitativeProperty1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleComparableExpression1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression1833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedArithmeticExpression_in_ruleNumberExpression1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantitativePropertyExpression_in_ruleNumberExpression1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedArithmeticExpression_in_entryRuleParenthesizedArithmeticExpression2006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedArithmeticExpression2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedArithmeticExpression2066 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleParenthesizedArithmeticExpression2086 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedArithmeticExpression2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantitativePropertyExpression_in_entryRuleQuantitativePropertyExpression2137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantitativePropertyExpression2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleQuantitativePropertyExpression2193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQuantitativePropertyExpression2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_entryRulePropertyImpact2252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyImpact2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyImpact2310 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_ruleImpact_in_rulePropertyImpact2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication2457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication2514 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication2544 = new BitSet(new long[]{0xFC03000300000F40L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication2565 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction2603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction2660 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction2692 = new BitSet(new long[]{0xFC03000300000F40L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction2711 = new BitSet(new long[]{0xFC03000300000F40L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction2735 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction2773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction2830 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction2860 = new BitSet(new long[]{0xFC03000300000F40L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction2881 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison2976 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison3008 = new BitSet(new long[]{0xFC03000300000F40L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison3027 = new BitSet(new long[]{0xFC03000300000F40L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison3051 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit3089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation3235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation3291 = new BitSet(new long[]{0xFC03000300000F40L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3405 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression3437 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression3475 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression3513 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression3551 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3574 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression3612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3759 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression3791 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression3810 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3834 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression3929 = new BitSet(new long[]{0x0300001000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression3961 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression3980 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression3999 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression4023 = new BitSet(new long[]{0x0300001000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction4061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction4342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction4398 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMaximumFunction4410 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4431 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_22_in_ruleMaximumFunction4444 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4465 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_34_in_ruleMaximumFunction4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction4515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction4571 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMinimumFunction4583 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction4604 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_22_in_ruleMinimumFunction4617 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction4638 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_34_in_ruleMinimumFunction4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction4688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction4744 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAverageFunction4756 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction4777 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_22_in_ruleAverageFunction4790 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction4811 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_34_in_ruleAverageFunction4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction4861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction4917 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSumFunction4929 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction4950 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_22_in_ruleSumFunction4963 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction4984 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_34_in_ruleSumFunction4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction5034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction5090 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleExponentialFunction5102 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5123 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExponentialFunction5135 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5156 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleExponentialFunction5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction5204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction5260 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAbsoluteFunction5272 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction5293 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAbsoluteFunction5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction5341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction5397 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleNaturalLogarithmFunction5409 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction5430 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleNaturalLogarithmFunction5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction5478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction5534 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCommonLogarithmFunction5546 = new BitSet(new long[]{0xFC00000300000F00L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction5567 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCommonLogarithmFunction5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification5617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression5763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression5821 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection5907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCollection5963 = new BitSet(new long[]{0xFC03001304000FF0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection5985 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleCollection5998 = new BitSet(new long[]{0xFC03001300000FF0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection6019 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleCollection6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple6071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTuple6127 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple6149 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleTuple6162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple6183 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleTuple6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair6235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair6293 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulePropertyValuePair6305 = new BitSet(new long[]{0xFC03001300000FF0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair6326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression6362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression6454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression6464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression6619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral6755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral6835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral7017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUnlimitedLiteral7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator7117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOrOperator7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOrOperator7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator7229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXOrOperator7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXOrOperator7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator7341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator7351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAndOperator7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAndOperator7416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator7453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleImplicationOperator7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleImplicationOperator7528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator7565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleEqualsOperator7621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator7657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleNotEqualsOperator7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNotEqualsOperator7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator7769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNotOperator7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNotOperator7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator7881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleGreaterThanOperator7937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator7973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleGreaterOrEqualThanOperator8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator8065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator8075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLessThanOperator8121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator8157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLessOrEqualThanOperator8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator8249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAdditionOperator8305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator8341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator8351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSubstractionOperator8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator8433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMultiplicationOperator8489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator8525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDivisionOperator8581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator8617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleModulusOperator8673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator8709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleMaxOperator8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator8801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMinOperator8857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator8893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleAvgOperator8949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator8985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator8995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleSumOperator9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator9077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleExponentialOperator9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator9169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator9179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleAbsoluteOperator9225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator9261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator9271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleNaturalLogarithmOperator9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator9353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator9363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCommonLogarithmOperator9409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis9446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLeftParenthesis9494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis9534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis9545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRightParenthesis9582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleQualifiedName9701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9825 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleQualifiedNameWithWildcard9844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace9890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace9900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleImportNamespace9937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber9995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber10072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber10124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpact_in_entryRuleImpact10170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpact10181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact10221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact10247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDirectionKind10308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDirectionKind10325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDirectionKind10342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_synpred1_InternalNSL9692 = new BitSet(new long[]{0x0000000000000002L});

}