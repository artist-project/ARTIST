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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_EBOOLEAN", "RULE_NULL", "RULE_INT", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_SMALL_DECIMAL", "RULE_EBIGDECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'property-catalogue'", "'{'", "'}'", "'qualitative'", "'description'", "','", "'direction'", "'properties'", "'['", "']'", "'impacts'", "'quantitative'", "'type'", "'derived'", "'expression'", "'('", "')'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'", "'increasing'", "'decreasing'", "'range'"
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
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_NULL=7;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_POSITIVE_SMALL_DECIMAL=9;
    public static final int RULE_EBOOLEAN=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;

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
        	return "PropertyCatalogue";	
       	}
       	
       	@Override
       	protected NSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePropertyCatalogue"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:68:1: entryRulePropertyCatalogue returns [EObject current=null] : iv_rulePropertyCatalogue= rulePropertyCatalogue EOF ;
    public final EObject entryRulePropertyCatalogue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCatalogue = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:69:2: (iv_rulePropertyCatalogue= rulePropertyCatalogue EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:70:2: iv_rulePropertyCatalogue= rulePropertyCatalogue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyCatalogueRule()); 
            }
            pushFollow(FOLLOW_rulePropertyCatalogue_in_entryRulePropertyCatalogue75);
            iv_rulePropertyCatalogue=rulePropertyCatalogue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyCatalogue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyCatalogue85); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:77:1: rulePropertyCatalogue returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'property-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:80:28: ( ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'property-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:81:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'property-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:81:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'property-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:81:2: ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'property-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:81:2: ( (lv_imports_0_0= ruleImportNamespace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==66) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:82:1: (lv_imports_0_0= ruleImportNamespace )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:82:1: (lv_imports_0_0= ruleImportNamespace )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:83:3: lv_imports_0_0= ruleImportNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertyCatalogueAccess().getImportsImportNamespaceParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportNamespace_in_rulePropertyCatalogue131);
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulePropertyCatalogue144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyCatalogueAccess().getPropertyCatalogueKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:103:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:104:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:104:1: (lv_name_2_0= ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:105:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyCatalogueAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyCatalogue165);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulePropertyCatalogue177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropertyCatalogueAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:125:1: ( (lv_properties_4_0= ruleProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19||LA2_0==27||LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:126:1: (lv_properties_4_0= ruleProperty )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:126:1: (lv_properties_4_0= ruleProperty )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:127:3: lv_properties_4_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertyCatalogueAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_rulePropertyCatalogue198);
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

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulePropertyCatalogue211); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:155:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:156:2: (iv_ruleProperty= ruleProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:157:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty247);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty257); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:164:1: ruleProperty returns [EObject current=null] : (this_QualitativeProperty_0= ruleQualitativeProperty | this_QuantitativeProperty_1= ruleQuantitativeProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_QualitativeProperty_0 = null;

        EObject this_QuantitativeProperty_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:167:28: ( (this_QualitativeProperty_0= ruleQualitativeProperty | this_QuantitativeProperty_1= ruleQuantitativeProperty ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:168:1: (this_QualitativeProperty_0= ruleQualitativeProperty | this_QuantitativeProperty_1= ruleQuantitativeProperty )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:168:1: (this_QualitativeProperty_0= ruleQualitativeProperty | this_QuantitativeProperty_1= ruleQuantitativeProperty )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==27||LA3_0==29) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:169:5: this_QualitativeProperty_0= ruleQualitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getQualitativePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQualitativeProperty_in_ruleProperty304);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:179:5: this_QuantitativeProperty_1= ruleQuantitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getQuantitativePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuantitativeProperty_in_ruleProperty331);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:195:1: entryRuleQualitativeProperty returns [EObject current=null] : iv_ruleQualitativeProperty= ruleQualitativeProperty EOF ;
    public final EObject entryRuleQualitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:196:2: (iv_ruleQualitativeProperty= ruleQualitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:197:2: iv_ruleQualitativeProperty= ruleQualitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleQualitativeProperty_in_entryRuleQualitativeProperty366);
            iv_ruleQualitativeProperty=ruleQualitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitativeProperty376); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:204:1: ruleQualitativeProperty returns [EObject current=null] : (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )? (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )? (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )? otherlv_20= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:207:28: ( (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )? (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )? (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )? otherlv_20= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:208:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )? (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )? (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )? otherlv_20= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:208:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )? (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )? (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )? otherlv_20= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:208:3: otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )? (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )? (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeProperty413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQualitativePropertyAccess().getQualitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:212:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:213:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:213:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:214:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeProperty430); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleQualitativeProperty447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQualitativePropertyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleQualitativeProperty459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getQualitativePropertyAccess().getDescriptionKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:238:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:239:1: (lv_description_4_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:239:1: (lv_description_4_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:240:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQualitativeProperty476); if (state.failed) return current;
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:256:2: (otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:256:4: otherlv_5= ',' otherlv_6= 'direction' ( (lv_direction_7_0= ruleDirectionKind ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleQualitativeProperty494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getQualitativePropertyAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleQualitativeProperty506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getQualitativePropertyAccess().getDirectionKeyword_5_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:264:1: ( (lv_direction_7_0= ruleDirectionKind ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:265:1: (lv_direction_7_0= ruleDirectionKind )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:265:1: (lv_direction_7_0= ruleDirectionKind )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:266:3: lv_direction_7_0= ruleDirectionKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQualitativePropertyAccess().getDirectionDirectionKindEnumRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirectionKind_in_ruleQualitativeProperty527);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:282:4: (otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==23) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:282:6: otherlv_8= ',' otherlv_9= 'properties' otherlv_10= '[' ( ( ruleQualifiedName ) )+ otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleQualitativeProperty542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getQualitativePropertyAccess().getCommaKeyword_6_0());
                          
                    }
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleQualitativeProperty554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getQualitativePropertyAccess().getPropertiesKeyword_6_1());
                          
                    }
                    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleQualitativeProperty566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getQualitativePropertyAccess().getLeftSquareBracketKeyword_6_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:294:1: ( ( ruleQualifiedName ) )+
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
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:295:1: ( ruleQualifiedName )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:295:1: ( ruleQualifiedName )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:296:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getQualitativePropertyRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQualitativePropertyAccess().getPropertiesPropertyCrossReference_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualitativeProperty589);
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

                    otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleQualitativeProperty602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getQualitativePropertyAccess().getRightSquareBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:313:3: (otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:313:5: otherlv_13= ',' otherlv_14= 'impacts' otherlv_15= '[' ( (lv_impacts_16_0= rulePropertyImpact ) ) (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )* otherlv_19= ']'
                    {
                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleQualitativeProperty617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getQualitativePropertyAccess().getCommaKeyword_7_0());
                          
                    }
                    otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleQualitativeProperty629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getQualitativePropertyAccess().getImpactsKeyword_7_1());
                          
                    }
                    otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleQualitativeProperty641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getQualitativePropertyAccess().getLeftSquareBracketKeyword_7_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:325:1: ( (lv_impacts_16_0= rulePropertyImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:326:1: (lv_impacts_16_0= rulePropertyImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:326:1: (lv_impacts_16_0= rulePropertyImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:327:3: lv_impacts_16_0= rulePropertyImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQualitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyImpact_in_ruleQualitativeProperty662);
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

                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:343:2: (otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:343:4: otherlv_17= ',' ( (lv_impacts_18_0= rulePropertyImpact ) )
                    	    {
                    	    otherlv_17=(Token)match(input,21,FOLLOW_21_in_ruleQualitativeProperty675); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_17, grammarAccess.getQualitativePropertyAccess().getCommaKeyword_7_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:347:1: ( (lv_impacts_18_0= rulePropertyImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:348:1: (lv_impacts_18_0= rulePropertyImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:348:1: (lv_impacts_18_0= rulePropertyImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:349:3: lv_impacts_18_0= rulePropertyImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQualitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_7_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyImpact_in_ruleQualitativeProperty696);
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

                    otherlv_19=(Token)match(input,25,FOLLOW_25_in_ruleQualitativeProperty710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getQualitativePropertyAccess().getRightSquareBracketKeyword_7_5());
                          
                    }

                    }
                    break;

            }

            otherlv_20=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeProperty724); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:381:1: entryRuleQuantitativeProperty returns [EObject current=null] : iv_ruleQuantitativeProperty= ruleQuantitativeProperty EOF ;
    public final EObject entryRuleQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:382:2: (iv_ruleQuantitativeProperty= ruleQuantitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:383:2: iv_ruleQuantitativeProperty= ruleQuantitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleQuantitativeProperty_in_entryRuleQuantitativeProperty760);
            iv_ruleQuantitativeProperty=ruleQuantitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantitativeProperty770); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:390:1: ruleQuantitativeProperty returns [EObject current=null] : (this_BaseQuantitativeProperty_0= ruleBaseQuantitativeProperty | this_DerivedQuantitativeProperty_1= ruleDerivedQuantitativeProperty ) ;
    public final EObject ruleQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject this_BaseQuantitativeProperty_0 = null;

        EObject this_DerivedQuantitativeProperty_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:393:28: ( (this_BaseQuantitativeProperty_0= ruleBaseQuantitativeProperty | this_DerivedQuantitativeProperty_1= ruleDerivedQuantitativeProperty ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:394:1: (this_BaseQuantitativeProperty_0= ruleBaseQuantitativeProperty | this_DerivedQuantitativeProperty_1= ruleDerivedQuantitativeProperty )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:394:1: (this_BaseQuantitativeProperty_0= ruleBaseQuantitativeProperty | this_DerivedQuantitativeProperty_1= ruleDerivedQuantitativeProperty )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:395:5: this_BaseQuantitativeProperty_0= ruleBaseQuantitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuantitativePropertyAccess().getBaseQuantitativePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBaseQuantitativeProperty_in_ruleQuantitativeProperty817);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:405:5: this_DerivedQuantitativeProperty_1= ruleDerivedQuantitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuantitativePropertyAccess().getDerivedQuantitativePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDerivedQuantitativeProperty_in_ruleQuantitativeProperty844);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:421:1: entryRuleBaseQuantitativeProperty returns [EObject current=null] : iv_ruleBaseQuantitativeProperty= ruleBaseQuantitativeProperty EOF ;
    public final EObject entryRuleBaseQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseQuantitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:422:2: (iv_ruleBaseQuantitativeProperty= ruleBaseQuantitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:423:2: iv_ruleBaseQuantitativeProperty= ruleBaseQuantitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseQuantitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleBaseQuantitativeProperty_in_entryRuleBaseQuantitativeProperty879);
            iv_ruleBaseQuantitativeProperty=ruleBaseQuantitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseQuantitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseQuantitativeProperty889); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:430:1: ruleBaseQuantitativeProperty returns [EObject current=null] : (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )? (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? otherlv_18= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:433:28: ( (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )? (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? otherlv_18= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:434:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )? (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? otherlv_18= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:434:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )? (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? otherlv_18= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:434:3: otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )? (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleBaseQuantitativeProperty926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBaseQuantitativePropertyAccess().getQuantitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:438:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:439:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:439:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:440:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseQuantitativeProperty943); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBaseQuantitativeProperty960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBaseQuantitativePropertyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleBaseQuantitativeProperty972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBaseQuantitativePropertyAccess().getDescriptionKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:464:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:465:1: (lv_description_4_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:465:1: (lv_description_4_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:466:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBaseQuantitativeProperty989); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleBaseQuantitativeProperty1006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBaseQuantitativePropertyAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleBaseQuantitativeProperty1018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBaseQuantitativePropertyAccess().getTypeKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:490:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:491:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:491:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:492:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBaseQuantitativePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBaseQuantitativePropertyAccess().getTypeDataTypeCrossReference_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBaseQuantitativeProperty1041);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:505:2: (otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==22) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:505:4: otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleBaseQuantitativeProperty1054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBaseQuantitativePropertyAccess().getCommaKeyword_8_0());
                          
                    }
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleBaseQuantitativeProperty1066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getBaseQuantitativePropertyAccess().getDirectionKeyword_8_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:513:1: ( (lv_direction_10_0= ruleDirectionKind ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:514:1: (lv_direction_10_0= ruleDirectionKind )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:514:1: (lv_direction_10_0= ruleDirectionKind )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:515:3: lv_direction_10_0= ruleDirectionKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBaseQuantitativePropertyAccess().getDirectionDirectionKindEnumRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirectionKind_in_ruleBaseQuantitativeProperty1087);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:531:4: (otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:531:6: otherlv_11= ',' otherlv_12= 'impacts' otherlv_13= '[' ( (lv_impacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']'
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleBaseQuantitativeProperty1102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBaseQuantitativePropertyAccess().getCommaKeyword_9_0());
                          
                    }
                    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleBaseQuantitativeProperty1114); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getBaseQuantitativePropertyAccess().getImpactsKeyword_9_1());
                          
                    }
                    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleBaseQuantitativeProperty1126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getBaseQuantitativePropertyAccess().getLeftSquareBracketKeyword_9_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:543:1: ( (lv_impacts_14_0= rulePropertyImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:544:1: (lv_impacts_14_0= rulePropertyImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:544:1: (lv_impacts_14_0= rulePropertyImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:545:3: lv_impacts_14_0= rulePropertyImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBaseQuantitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyImpact_in_ruleBaseQuantitativeProperty1147);
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

                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:561:2: (otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:561:4: otherlv_15= ',' ( (lv_impacts_16_0= rulePropertyImpact ) )
                    	    {
                    	    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleBaseQuantitativeProperty1160); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_15, grammarAccess.getBaseQuantitativePropertyAccess().getCommaKeyword_9_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:565:1: ( (lv_impacts_16_0= rulePropertyImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:566:1: (lv_impacts_16_0= rulePropertyImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:566:1: (lv_impacts_16_0= rulePropertyImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:567:3: lv_impacts_16_0= rulePropertyImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBaseQuantitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_9_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyImpact_in_ruleBaseQuantitativeProperty1181);
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

                    otherlv_17=(Token)match(input,25,FOLLOW_25_in_ruleBaseQuantitativeProperty1195); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getBaseQuantitativePropertyAccess().getRightSquareBracketKeyword_9_5());
                          
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleBaseQuantitativeProperty1209); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:599:1: entryRuleDerivedQuantitativeProperty returns [EObject current=null] : iv_ruleDerivedQuantitativeProperty= ruleDerivedQuantitativeProperty EOF ;
    public final EObject entryRuleDerivedQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedQuantitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:600:2: (iv_ruleDerivedQuantitativeProperty= ruleDerivedQuantitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:601:2: iv_ruleDerivedQuantitativeProperty= ruleDerivedQuantitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDerivedQuantitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleDerivedQuantitativeProperty_in_entryRuleDerivedQuantitativeProperty1245);
            iv_ruleDerivedQuantitativeProperty=ruleDerivedQuantitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDerivedQuantitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDerivedQuantitativeProperty1255); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:608:1: ruleDerivedQuantitativeProperty returns [EObject current=null] : (otherlv_0= 'derived' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) otherlv_11= ',' otherlv_12= 'expression' ( (lv_expression_13_0= ruleArithmeticExpression ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:611:28: ( (otherlv_0= 'derived' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) otherlv_11= ',' otherlv_12= 'expression' ( (lv_expression_13_0= ruleArithmeticExpression ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:612:1: (otherlv_0= 'derived' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) otherlv_11= ',' otherlv_12= 'expression' ( (lv_expression_13_0= ruleArithmeticExpression ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:612:1: (otherlv_0= 'derived' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) otherlv_11= ',' otherlv_12= 'expression' ( (lv_expression_13_0= ruleArithmeticExpression ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:612:3: otherlv_0= 'derived' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' ( ( ruleQualifiedName ) ) otherlv_8= ',' otherlv_9= 'direction' ( (lv_direction_10_0= ruleDirectionKind ) ) otherlv_11= ',' otherlv_12= 'expression' ( (lv_expression_13_0= ruleArithmeticExpression ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleDerivedQuantitativeProperty1292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDerivedQuantitativePropertyAccess().getDerivedKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:616:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:617:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:617:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:618:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDerivedQuantitativeProperty1309); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleDerivedQuantitativeProperty1326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDerivedQuantitativePropertyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleDerivedQuantitativeProperty1338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDerivedQuantitativePropertyAccess().getDescriptionKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:642:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:643:1: (lv_description_4_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:643:1: (lv_description_4_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:644:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDerivedQuantitativeProperty1355); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleDerivedQuantitativeProperty1372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDerivedQuantitativePropertyAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleDerivedQuantitativeProperty1384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDerivedQuantitativePropertyAccess().getTypeKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:668:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:669:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:669:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:670:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDerivedQuantitativePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDerivedQuantitativePropertyAccess().getTypeDataTypeCrossReference_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDerivedQuantitativeProperty1407);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleDerivedQuantitativeProperty1419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getDerivedQuantitativePropertyAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleDerivedQuantitativeProperty1431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getDerivedQuantitativePropertyAccess().getDirectionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:691:1: ( (lv_direction_10_0= ruleDirectionKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:692:1: (lv_direction_10_0= ruleDirectionKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:692:1: (lv_direction_10_0= ruleDirectionKind )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:693:3: lv_direction_10_0= ruleDirectionKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDerivedQuantitativePropertyAccess().getDirectionDirectionKindEnumRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDirectionKind_in_ruleDerivedQuantitativeProperty1452);
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

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleDerivedQuantitativeProperty1464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getDerivedQuantitativePropertyAccess().getCommaKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleDerivedQuantitativeProperty1476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getDerivedQuantitativePropertyAccess().getExpressionKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:717:1: ( (lv_expression_13_0= ruleArithmeticExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:718:1: (lv_expression_13_0= ruleArithmeticExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:718:1: (lv_expression_13_0= ruleArithmeticExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:719:3: lv_expression_13_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDerivedQuantitativePropertyAccess().getExpressionArithmeticExpressionParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleDerivedQuantitativeProperty1497);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:735:2: (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:735:4: otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= rulePropertyImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )* otherlv_20= ']'
                    {
                    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleDerivedQuantitativeProperty1510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getDerivedQuantitativePropertyAccess().getCommaKeyword_14_0());
                          
                    }
                    otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleDerivedQuantitativeProperty1522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getDerivedQuantitativePropertyAccess().getImpactsKeyword_14_1());
                          
                    }
                    otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleDerivedQuantitativeProperty1534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getDerivedQuantitativePropertyAccess().getLeftSquareBracketKeyword_14_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:747:1: ( (lv_impacts_17_0= rulePropertyImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:748:1: (lv_impacts_17_0= rulePropertyImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:748:1: (lv_impacts_17_0= rulePropertyImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:749:3: lv_impacts_17_0= rulePropertyImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDerivedQuantitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_14_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyImpact_in_ruleDerivedQuantitativeProperty1555);
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

                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:765:2: (otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:765:4: otherlv_18= ',' ( (lv_impacts_19_0= rulePropertyImpact ) )
                    	    {
                    	    otherlv_18=(Token)match(input,21,FOLLOW_21_in_ruleDerivedQuantitativeProperty1568); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_18, grammarAccess.getDerivedQuantitativePropertyAccess().getCommaKeyword_14_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:769:1: ( (lv_impacts_19_0= rulePropertyImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:770:1: (lv_impacts_19_0= rulePropertyImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:770:1: (lv_impacts_19_0= rulePropertyImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:771:3: lv_impacts_19_0= rulePropertyImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDerivedQuantitativePropertyAccess().getImpactsPropertyImpactParserRuleCall_14_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyImpact_in_ruleDerivedQuantitativeProperty1589);
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

                    otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleDerivedQuantitativeProperty1603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getDerivedQuantitativePropertyAccess().getRightSquareBracketKeyword_14_5());
                          
                    }

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleDerivedQuantitativeProperty1617); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:803:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:804:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:805:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression1653);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression1663); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:812:1: ruleComparableExpression returns [EObject current=null] : this_NumberExpression_0= ruleNumberExpression ;
    public final EObject ruleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:815:28: (this_NumberExpression_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:817:5: this_NumberExpression_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparableExpressionAccess().getNumberExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleComparableExpression1709);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:833:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:834:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:835:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression1743);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression1753); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:842:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_ParenthesizedArithmeticExpression_2= ruleParenthesizedArithmeticExpression | this_QuantitativePropertyExpression_3= ruleQuantitativePropertyExpression ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;

        EObject this_ParenthesizedArithmeticExpression_2 = null;

        EObject this_QuantitativePropertyExpression_3 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:845:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_ParenthesizedArithmeticExpression_2= ruleParenthesizedArithmeticExpression | this_QuantitativePropertyExpression_3= ruleQuantitativePropertyExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:846:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_ParenthesizedArithmeticExpression_2= ruleParenthesizedArithmeticExpression | this_QuantitativePropertyExpression_3= ruleQuantitativePropertyExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:846:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_ParenthesizedArithmeticExpression_2= ruleParenthesizedArithmeticExpression | this_QuantitativePropertyExpression_3= ruleQuantitativePropertyExpression )
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
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case RULE_ID:
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:847:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression1800);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:857:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression1827);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:867:5: this_ParenthesizedArithmeticExpression_2= ruleParenthesizedArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getParenthesizedArithmeticExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedArithmeticExpression_in_ruleNumberExpression1854);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:877:5: this_QuantitativePropertyExpression_3= ruleQuantitativePropertyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getQuantitativePropertyExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuantitativePropertyExpression_in_ruleNumberExpression1881);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:893:1: entryRuleParenthesizedArithmeticExpression returns [EObject current=null] : iv_ruleParenthesizedArithmeticExpression= ruleParenthesizedArithmeticExpression EOF ;
    public final EObject entryRuleParenthesizedArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:894:2: (iv_ruleParenthesizedArithmeticExpression= ruleParenthesizedArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:895:2: iv_ruleParenthesizedArithmeticExpression= ruleParenthesizedArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedArithmeticExpression_in_entryRuleParenthesizedArithmeticExpression1916);
            iv_ruleParenthesizedArithmeticExpression=ruleParenthesizedArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedArithmeticExpression1926); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:902:1: ruleParenthesizedArithmeticExpression returns [EObject current=null] : ( () ruleLeftParenthesis ( (lv_value_2_0= ruleArithmeticExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:905:28: ( ( () ruleLeftParenthesis ( (lv_value_2_0= ruleArithmeticExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:906:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleArithmeticExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:906:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleArithmeticExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:906:2: () ruleLeftParenthesis ( (lv_value_2_0= ruleArithmeticExpression ) ) ruleRightParenthesis
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:906:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:907:5: 
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
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedArithmeticExpression1976);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:920:1: ( (lv_value_2_0= ruleArithmeticExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:921:1: (lv_value_2_0= ruleArithmeticExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:921:1: (lv_value_2_0= ruleArithmeticExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:922:3: lv_value_2_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedArithmeticExpressionAccess().getValueArithmeticExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleParenthesizedArithmeticExpression1996);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedArithmeticExpression2012);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:954:1: entryRuleQuantitativePropertyExpression returns [EObject current=null] : iv_ruleQuantitativePropertyExpression= ruleQuantitativePropertyExpression EOF ;
    public final EObject entryRuleQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantitativePropertyExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:955:2: (iv_ruleQuantitativePropertyExpression= ruleQuantitativePropertyExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:956:2: iv_ruleQuantitativePropertyExpression= ruleQuantitativePropertyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantitativePropertyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleQuantitativePropertyExpression_in_entryRuleQuantitativePropertyExpression2047);
            iv_ruleQuantitativePropertyExpression=ruleQuantitativePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantitativePropertyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantitativePropertyExpression2057); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:963:1: ruleQuantitativePropertyExpression returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:966:28: ( ( () ( ( ruleQualifiedName ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:967:1: ( () ( ( ruleQualifiedName ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:967:1: ( () ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:967:2: () ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:967:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:968:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getQuantitativePropertyExpressionAccess().getQuantitativePropertyExpressionAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:973:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:974:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:974:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:975:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQuantitativePropertyExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuantitativePropertyExpressionAccess().getValueQuantitativePropertyCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQuantitativePropertyExpression2114);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:996:1: entryRulePropertyImpact returns [EObject current=null] : iv_rulePropertyImpact= rulePropertyImpact EOF ;
    public final EObject entryRulePropertyImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:997:2: (iv_rulePropertyImpact= rulePropertyImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:998:2: iv_rulePropertyImpact= rulePropertyImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyImpactRule()); 
            }
            pushFollow(FOLLOW_rulePropertyImpact_in_entryRulePropertyImpact2150);
            iv_rulePropertyImpact=rulePropertyImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyImpact; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyImpact2160); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1005:1: rulePropertyImpact returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) ;
    public final EObject rulePropertyImpact() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_impact_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1008:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1009:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1009:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1009:2: ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1009:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1010:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1010:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1011:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyImpactRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyImpactAccess().getTargetPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyImpact2208);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1024:2: ( (lv_impact_1_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1025:1: (lv_impact_1_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1025:1: (lv_impact_1_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1026:3: lv_impact_1_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyImpactAccess().getImpactImpactParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_rulePropertyImpact2229);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1050:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1051:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1052:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2265);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2275); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1059:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1062:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1064:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression2321);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1080:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1081:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1082:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication2355);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication2365); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1089:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1092:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1093:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1093:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1094:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication2412);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1102:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=41 && LA16_0<=42)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1102:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1102:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1103:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1108:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1109:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1109:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1110:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication2442);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1126:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1127:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1127:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1128:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication2463);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1152:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1153:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1154:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction2501);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction2511); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1161:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1164:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1165:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1165:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1166:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction2558);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1174:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=35 && LA18_0<=38)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1174:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1174:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1175:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1180:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1181:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1181:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1182:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1182:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( ((LA17_0>=35 && LA17_0<=36)) ) {
            	        alt17=1;
            	    }
            	    else if ( ((LA17_0>=37 && LA17_0<=38)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1183:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction2590);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1198:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction2609);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1216:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1217:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1217:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1218:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction2633);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1242:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1243:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1244:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction2671);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction2681); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1251:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1254:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1255:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1255:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1256:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction2728);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1264:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=39 && LA19_0<=40)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1264:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1264:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1265:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1270:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1271:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1271:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1272:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction2758);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1288:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1289:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1289:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1290:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction2779);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1314:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1315:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1316:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2817);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2827); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1323:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1326:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1327:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1327:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1328:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison2874);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1336:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=43 && LA21_0<=45)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1336:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1336:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1337:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1342:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1343:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1343:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1344:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1344:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==43) ) {
            	        alt20=1;
            	    }
            	    else if ( ((LA20_0>=44 && LA20_0<=45)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1345:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison2906);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1360:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison2925);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1378:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1379:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1379:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1380:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison2949);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1404:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1405:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1406:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit2987);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit2997); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1413:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1416:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1417:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1417:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 46:
            case 47:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
            case 31:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1418:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit3044);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1428:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit3071);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1438:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit3098);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1454:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1455:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1456:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation3133);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation3143); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1463:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1466:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1467:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1467:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1467:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1467:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1468:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1468:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1469:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation3189);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1485:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1486:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1486:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1487:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation3210);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1511:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1512:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1513:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3246);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression3256); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1520:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1523:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1524:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1524:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1525:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3303);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1533:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=48 && LA24_0<=51)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1533:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1533:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt23=4;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 50:
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1533:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1533:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1533:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1533:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1534:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1539:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1540:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1540:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1541:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression3335);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1558:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1558:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1558:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1558:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1559:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1564:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1565:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1565:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1566:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression3373);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1583:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1583:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1583:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1583:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1584:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1589:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1590:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1590:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1591:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression3411);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1608:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1608:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1608:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1608:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1609:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1614:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1615:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1615:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1616:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression3449);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1632:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1633:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1633:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1634:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3472);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1658:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1659:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1660:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression3510);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression3520); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1667:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1670:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1672:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression3566);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1688:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1689:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1690:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3600);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression3610); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1697:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1700:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1701:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1701:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1702:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3657);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1710:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=52 && LA26_0<=53)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1710:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1710:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1711:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1716:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1717:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1717:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1718:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1718:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==53) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==52) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1719:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression3689);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1734:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression3708);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1752:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1753:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1753:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1754:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3732);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1778:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1779:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1780:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3770);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression3780); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1787:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1790:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1791:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1791:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1792:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression3827);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1800:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==34||(LA28_0>=54 && LA28_0<=55)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1800:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1800:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1801:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1806:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1807:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1807:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1808:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1808:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 55:
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1809:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression3859);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1824:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression3878);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1839:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression3897);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1857:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1858:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1858:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1859:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression3921);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1883:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1884:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1885:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction3959);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction3969); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1892:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1895:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1896:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1896:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt29=8;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt29=1;
                }
                break;
            case 57:
                {
                alt29=2;
                }
                break;
            case 58:
                {
                alt29=3;
                }
                break;
            case 59:
                {
                alt29=4;
                }
                break;
            case 60:
                {
                alt29=5;
                }
                break;
            case 61:
                {
                alt29=6;
                }
                break;
            case 62:
                {
                alt29=7;
                }
                break;
            case 63:
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1897:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction4016);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1907:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction4043);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1917:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction4070);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1927:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction4097);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1937:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction4124);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1947:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction4151);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1957:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction4178);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1967:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction4205);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1983:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1984:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1985:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction4240);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction4250); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1992:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1995:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1996:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1996:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1996:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1996:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1997:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1997:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1998:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction4296);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleMaximumFunction4308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2018:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2019:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2019:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2020:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4329);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2036:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==21) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2036:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleMaximumFunction4342); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2040:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2041:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2041:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2042:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4363);
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

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleMaximumFunction4377); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2070:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2071:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2072:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction4413);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction4423); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2079:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2082:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2083:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2083:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2083:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2083:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2084:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2084:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2085:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction4469);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleMinimumFunction4481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2105:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2106:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2106:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2107:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction4502);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2123:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==21) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2123:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleMinimumFunction4515); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2127:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2128:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2128:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2129:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction4536);
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

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleMinimumFunction4550); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2157:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2158:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2159:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction4586);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction4596); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2166:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2169:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2170:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2170:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2170:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2170:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2171:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2171:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2172:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction4642);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleAverageFunction4654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2192:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2193:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2193:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2194:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction4675);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2210:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==21) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2210:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAverageFunction4688); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2214:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2215:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2215:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2216:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction4709);
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

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleAverageFunction4723); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2244:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2245:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2246:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction4759);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction4769); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2253:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2256:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2257:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2257:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2257:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2257:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2258:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2258:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2259:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction4815);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleSumFunction4827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2279:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2280:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2280:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2281:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction4848);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2297:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==21) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2297:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleSumFunction4861); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2301:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2302:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2302:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2303:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction4882);
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

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleSumFunction4896); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2331:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2332:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2333:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction4932);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction4942); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2340:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2343:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2344:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2344:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2344:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2344:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2345:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2345:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2346:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction4988);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleExponentialFunction5000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2366:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2367:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2367:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2368:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5021);
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleExponentialFunction5033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2388:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2389:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2389:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2390:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5054);
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

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleExponentialFunction5066); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2418:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2419:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2420:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction5102);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction5112); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2427:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2430:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2431:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2431:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2431:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2431:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2432:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2432:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2433:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction5158);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleAbsoluteFunction5170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2453:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2454:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2454:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2455:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction5191);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleAbsoluteFunction5203); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2483:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2484:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2485:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction5239);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction5249); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2492:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2495:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2496:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2496:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2496:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2496:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2497:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2497:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2498:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction5295);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleNaturalLogarithmFunction5307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2518:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2519:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2519:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2520:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction5328);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleNaturalLogarithmFunction5340); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2548:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2549:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2550:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction5376);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction5386); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2557:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2560:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2561:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2561:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2561:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2561:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2562:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2562:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2563:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction5432);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleCommonLogarithmFunction5444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2583:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2584:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2584:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2585:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction5465);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleCommonLogarithmFunction5477); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2615:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2616:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2617:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification5515);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification5525); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2624:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2627:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2628:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2628:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt34=3;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2629:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification5572);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2639:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification5599);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2649:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification5626);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2665:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2666:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2667:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression5661);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression5671); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2674:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2677:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2678:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2678:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2678:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2678:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2679:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2679:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2680:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression5719);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2693:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                alt35=1;
            }
            else if ( (LA35_0==17) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2693:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2693:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2694:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2694:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2695:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression5741);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2712:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2712:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2713:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2713:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2714:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression5768);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2738:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2739:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2740:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection5805);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection5815); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2747:1: ruleCollection returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2750:28: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2751:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2751:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2751:3: otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCollection5852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2755:1: ( (lv_values_1_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2756:1: (lv_values_1_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2756:1: (lv_values_1_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2757:3: lv_values_1_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection5873);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2773:2: (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2773:4: otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleCollection5886); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2777:1: ( (lv_values_3_0= ruleValueSpecification ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2778:1: (lv_values_3_0= ruleValueSpecification )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2778:1: (lv_values_3_0= ruleValueSpecification )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2779:3: lv_values_3_0= ruleValueSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection5907);
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
            	    break loop36;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleCollection5921); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2807:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2808:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2809:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple5957);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple5967); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2816:1: ruleTuple returns [EObject current=null] : (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tuples_1_0 = null;

        EObject lv_tuples_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2819:28: ( (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2820:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2820:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2820:3: otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTuple6004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2824:1: ( (lv_tuples_1_0= rulePropertyValuePair ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2825:1: (lv_tuples_1_0= rulePropertyValuePair )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2825:1: (lv_tuples_1_0= rulePropertyValuePair )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2826:3: lv_tuples_1_0= rulePropertyValuePair
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple6025);
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2842:2: (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==21) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2842:4: otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleTuple6038); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTupleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2846:1: ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2847:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2847:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2848:3: lv_tuples_3_0= rulePropertyValuePair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple6059);
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
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleTuple6073); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2876:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2877:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2878:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair6109);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair6119); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2885:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2888:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2889:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2889:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2889:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2889:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2890:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2890:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2891:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair6167);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_rulePropertyValuePair6179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2908:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2909:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2909:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2910:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair6200);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2934:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2935:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2936:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression6236);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression6246); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2943:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2946:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2947:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2947:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2948:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2948:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2949:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression6293);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2970:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2971:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2972:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression6328);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression6338); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2979:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2982:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2983:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2983:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt38=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt38=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt38=2;
                }
                break;
            case RULE_NULL:
                {
                alt38=3;
                }
                break;
            case RULE_STRING:
                {
                alt38=4;
                }
                break;
            case 34:
                {
                alt38=5;
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2984:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression6385);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:2994:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression6412);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3004:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression6439);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3014:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression6466);
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3024:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression6493);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3040:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3041:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3042:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6528);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral6538); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3049:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3052:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3053:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3053:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3054:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3054:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3055:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral6579); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3079:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3080:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3081:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6619);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral6629); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3088:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3091:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3092:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3092:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3093:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3093:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3094:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral6674);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3118:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3119:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3120:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral6709);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral6719); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3127:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3130:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3131:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3131:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3132:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3132:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3133:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral6760); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3157:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3158:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3159:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6800);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6810); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3166:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3169:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3170:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3170:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3171:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3171:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3172:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral6851); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3196:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3197:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3198:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral6891);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral6901); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3205:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3208:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3209:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3209:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3210:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3210:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3211:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,34,FOLLOW_34_in_ruleUnlimitedLiteral6943); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3232:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3233:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3234:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator6991);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator7001); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3241:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3244:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3245:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3245:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3245:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3245:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3246:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3251:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            else if ( (LA39_0==36) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3251:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleOrOperator7048); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3256:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleOrOperator7066); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3268:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3269:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3270:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator7103);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator7113); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3277:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3280:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3281:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3281:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3281:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3281:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3282:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3287:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            else if ( (LA40_0==38) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3287:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleXOrOperator7160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3292:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXOrOperator7178); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3304:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3305:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3306:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator7215);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator7225); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3313:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3316:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3317:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3317:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3317:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3317:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3318:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3323:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            else if ( (LA41_0==40) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3323:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleAndOperator7272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3328:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleAndOperator7290); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3340:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3341:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3342:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator7327);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator7337); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3349:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3352:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3353:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3353:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3353:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3353:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3354:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3359:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            else if ( (LA42_0==42) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3359:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleImplicationOperator7384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3364:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleImplicationOperator7402); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3376:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3377:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3378:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator7439);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator7449); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3385:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3388:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3389:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3389:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3389:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3389:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3390:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleEqualsOperator7495); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3407:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3408:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3409:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator7531);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator7541); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3416:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3419:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3420:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3420:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3420:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3420:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3421:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3426:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                alt43=1;
            }
            else if ( (LA43_0==45) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3426:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleNotEqualsOperator7588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3431:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleNotEqualsOperator7606); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3443:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3444:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3445:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator7643);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator7653); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3452:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3455:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3456:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3456:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3456:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3456:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3457:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3462:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            else if ( (LA44_0==47) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3462:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleNotOperator7700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3467:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleNotOperator7718); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3479:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3480:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3481:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator7755);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator7765); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3488:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3491:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3492:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3492:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3492:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3492:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3493:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleGreaterThanOperator7811); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3510:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3511:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3512:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator7847);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator7857); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3519:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3522:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3523:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3523:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3523:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3523:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3524:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleGreaterOrEqualThanOperator7903); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3541:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3542:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3543:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator7939);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator7949); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3550:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3553:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3554:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3554:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3554:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3554:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3555:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleLessThanOperator7995); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3572:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3573:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3574:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator8031);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator8041); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3581:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3584:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3585:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3585:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3585:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3585:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3586:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleLessOrEqualThanOperator8087); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3603:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3604:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3605:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator8123);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator8133); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3612:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3615:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3616:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3616:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3616:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3616:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3617:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleAdditionOperator8179); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3634:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3635:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3636:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator8215);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator8225); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3643:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3646:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3647:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3647:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3647:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3647:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3648:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleSubstractionOperator8271); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3665:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3666:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3667:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator8307);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator8317); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3674:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3677:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3678:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3678:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3678:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3678:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3679:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleMultiplicationOperator8363); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3696:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3697:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3698:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator8399);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator8409); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3705:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3708:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3709:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3709:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3709:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3709:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3710:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleDivisionOperator8455); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3727:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3728:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3729:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator8491);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator8501); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3736:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3739:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3740:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3740:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3740:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3740:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3741:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleModulusOperator8547); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3758:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3759:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3760:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator8583);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator8593); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3767:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3770:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3771:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3771:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3771:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3771:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3772:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleMaxOperator8639); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3789:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3790:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3791:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator8675);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator8685); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3798:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3801:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3802:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3802:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3802:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3802:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3803:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleMinOperator8731); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3820:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3821:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3822:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator8767);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator8777); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3829:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3832:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3833:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3833:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3833:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3833:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3834:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleAvgOperator8823); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3851:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3852:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3853:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator8859);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator8869); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3860:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3863:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3864:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3864:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3864:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3864:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3865:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleSumOperator8915); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3882:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3883:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3884:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator8951);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator8961); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3891:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3894:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3895:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3895:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3895:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3895:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3896:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleExponentialOperator9007); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3913:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3914:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3915:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator9043);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator9053); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3922:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3925:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3926:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3926:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3926:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3926:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3927:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleAbsoluteOperator9099); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3944:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3945:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3946:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator9135);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator9145); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3953:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3956:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3957:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3957:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3957:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3957:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3958:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleNaturalLogarithmOperator9191); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3975:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3976:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3977:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator9227);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator9237); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3984:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3987:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3988:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3988:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3988:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3988:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:3989:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleCommonLogarithmOperator9283); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4006:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4007:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4008:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis9320);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis9331); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4015:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4018:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4020:2: kw= '('
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleLeftParenthesis9368); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4033:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4034:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4035:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis9408);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis9419); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4042:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4045:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4047:2: kw= ')'
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleRightParenthesis9456); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4060:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4061:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4062:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9496);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9507); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4069:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4072:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4073:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4073:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4073:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4080:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==64) && (synpred1_InternalNSL())) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4080:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4080:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4080:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,64,FOLLOW_64_in_ruleQualifiedName9575); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9591); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4103:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4104:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4105:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9639);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9650); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4112:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4115:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4116:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4116:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4117:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9697);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4127:1: (kw= '.*' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==65) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4128:2: kw= '.*'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleQualifiedNameWithWildcard9716); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4145:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4146:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4147:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace9762);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace9772); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4154:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4157:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4158:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4158:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4158:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleImportNamespace9809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4162:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4163:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4163:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4164:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace9830);
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4188:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4189:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4190:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber9867);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber9878); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4197:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4200:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4201:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4201:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt47=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt47=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt47=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt47=4;
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4201:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber9918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4209:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber9944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4217:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber9970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4225:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber9996); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4240:1: entryRuleImpact returns [String current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final String entryRuleImpact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4241:2: (iv_ruleImpact= ruleImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4242:2: iv_ruleImpact= ruleImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpactRule()); 
            }
            pushFollow(FOLLOW_ruleImpact_in_entryRuleImpact10042);
            iv_ruleImpact=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpact.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpact10053); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4249:1: ruleImpact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleImpact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_POSITIVE_SMALL_DECIMAL_0=null;
        Token this_SMALL_DECIMAL_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4252:28: ( (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4253:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4253:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_POSITIVE_SMALL_DECIMAL) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_SMALL_DECIMAL) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4253:6: this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact10093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_0, grammarAccess.getImpactAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4261:10: this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_1=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact10119); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4278:1: ruleDirectionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'increasing' ) | (enumLiteral_1= 'decreasing' ) | (enumLiteral_2= 'range' ) ) ;
    public final Enumerator ruleDirectionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4280:28: ( ( (enumLiteral_0= 'increasing' ) | (enumLiteral_1= 'decreasing' ) | (enumLiteral_2= 'range' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4281:1: ( (enumLiteral_0= 'increasing' ) | (enumLiteral_1= 'decreasing' ) | (enumLiteral_2= 'range' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4281:1: ( (enumLiteral_0= 'increasing' ) | (enumLiteral_1= 'decreasing' ) | (enumLiteral_2= 'range' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt49=1;
                }
                break;
            case 68:
                {
                alt49=2;
                }
                break;
            case 69:
                {
                alt49=3;
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4281:2: (enumLiteral_0= 'increasing' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4281:2: (enumLiteral_0= 'increasing' )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4281:4: enumLiteral_0= 'increasing'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleDirectionKind10180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionKindAccess().getINCREASINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionKindAccess().getINCREASINGEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4287:6: (enumLiteral_1= 'decreasing' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4287:6: (enumLiteral_1= 'decreasing' )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4287:8: enumLiteral_1= 'decreasing'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleDirectionKind10197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionKindAccess().getDECREASINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionKindAccess().getDECREASINGEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4293:6: (enumLiteral_2= 'range' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4293:6: (enumLiteral_2= 'range' )
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4293:8: enumLiteral_2= 'range'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_69_in_ruleDirectionKind10214); if (state.failed) return current;
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
        // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4080:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4081:2: '.'
        {
        match(input,64,FOLLOW_64_in_synpred1_InternalNSL9566); if (state.failed) return ;

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
        "\2\uffff\1\5\3\uffff\1\5";
    static final String DFA34_minS =
        "\1\4\1\uffff\1\21\1\4\2\uffff\1\21";
    static final String DFA34_maxS =
        "\1\42\1\uffff\1\100\1\4\2\uffff\1\100";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String DFA34_specialS =
        "\7\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\2\7\1\26\uffff\1\1",
            "",
            "\1\4\1\5\2\uffff\1\5\2\uffff\1\4\1\5\46\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\1\5\2\uffff\1\5\2\uffff\1\4\1\5\46\uffff\1\3"
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
            return "2628:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
        }
    }
 

    public static final BitSet FOLLOW_rulePropertyCatalogue_in_entryRulePropertyCatalogue75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyCatalogue85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_rulePropertyCatalogue131 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000004L});
    public static final BitSet FOLLOW_16_in_rulePropertyCatalogue144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyCatalogue165 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePropertyCatalogue177 = new BitSet(new long[]{0x00000000280C0000L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePropertyCatalogue198 = new BitSet(new long[]{0x00000000280C0000L});
    public static final BitSet FOLLOW_18_in_rulePropertyCatalogue211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeProperty_in_ruleProperty304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantitativeProperty_in_ruleProperty331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeProperty_in_entryRuleQualitativeProperty366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeProperty376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeProperty413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeProperty430 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQualitativeProperty447 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQualitativeProperty459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQualitativeProperty476 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleQualitativeProperty494 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQualitativeProperty506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleDirectionKind_in_ruleQualitativeProperty527 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleQualitativeProperty542 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleQualitativeProperty554 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQualitativeProperty566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualitativeProperty589 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleQualitativeProperty602 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleQualitativeProperty617 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleQualitativeProperty629 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQualitativeProperty641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleQualitativeProperty662 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleQualitativeProperty675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleQualitativeProperty696 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleQualitativeProperty710 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeProperty724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantitativeProperty_in_entryRuleQuantitativeProperty760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantitativeProperty770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseQuantitativeProperty_in_ruleQuantitativeProperty817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDerivedQuantitativeProperty_in_ruleQuantitativeProperty844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseQuantitativeProperty_in_entryRuleBaseQuantitativeProperty879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseQuantitativeProperty889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBaseQuantitativeProperty926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseQuantitativeProperty943 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBaseQuantitativeProperty960 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBaseQuantitativeProperty972 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBaseQuantitativeProperty989 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBaseQuantitativeProperty1006 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleBaseQuantitativeProperty1018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBaseQuantitativeProperty1041 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleBaseQuantitativeProperty1054 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBaseQuantitativeProperty1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleDirectionKind_in_ruleBaseQuantitativeProperty1087 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleBaseQuantitativeProperty1102 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBaseQuantitativeProperty1114 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBaseQuantitativeProperty1126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleBaseQuantitativeProperty1147 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleBaseQuantitativeProperty1160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleBaseQuantitativeProperty1181 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleBaseQuantitativeProperty1195 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBaseQuantitativeProperty1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDerivedQuantitativeProperty_in_entryRuleDerivedQuantitativeProperty1245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDerivedQuantitativeProperty1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDerivedQuantitativeProperty1292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDerivedQuantitativeProperty1309 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDerivedQuantitativeProperty1326 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDerivedQuantitativeProperty1338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDerivedQuantitativeProperty1355 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDerivedQuantitativeProperty1372 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDerivedQuantitativeProperty1384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDerivedQuantitativeProperty1407 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDerivedQuantitativeProperty1419 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDerivedQuantitativeProperty1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleDirectionKind_in_ruleDerivedQuantitativeProperty1452 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDerivedQuantitativeProperty1464 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDerivedQuantitativeProperty1476 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleDerivedQuantitativeProperty1497 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleDerivedQuantitativeProperty1510 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDerivedQuantitativeProperty1522 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDerivedQuantitativeProperty1534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleDerivedQuantitativeProperty1555 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleDerivedQuantitativeProperty1568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_ruleDerivedQuantitativeProperty1589 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleDerivedQuantitativeProperty1603 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDerivedQuantitativeProperty1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression1653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleComparableExpression1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedArithmeticExpression_in_ruleNumberExpression1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantitativePropertyExpression_in_ruleNumberExpression1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedArithmeticExpression_in_entryRuleParenthesizedArithmeticExpression1916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedArithmeticExpression1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedArithmeticExpression1976 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleParenthesizedArithmeticExpression1996 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedArithmeticExpression2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantitativePropertyExpression_in_entryRuleQuantitativePropertyExpression2047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantitativePropertyExpression2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQuantitativePropertyExpression2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_entryRulePropertyImpact2150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyImpact2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyImpact2208 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_ruleImpact_in_rulePropertyImpact2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication2355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication2412 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication2442 = new BitSet(new long[]{0xFF00C00080000F50L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication2463 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction2501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction2558 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction2590 = new BitSet(new long[]{0xFF00C00080000F50L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction2609 = new BitSet(new long[]{0xFF00C00080000F50L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction2633 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction2671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction2728 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction2758 = new BitSet(new long[]{0xFF00C00080000F50L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction2779 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison2874 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison2906 = new BitSet(new long[]{0xFF00C00080000F50L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison2925 = new BitSet(new long[]{0xFF00C00080000F50L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison2949 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit2987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation3133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation3189 = new BitSet(new long[]{0xFF00C00080000F50L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3303 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression3335 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression3373 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression3411 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression3449 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression3472 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression3510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3657 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression3689 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression3708 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3732 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression3827 = new BitSet(new long[]{0x00C0000400000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression3859 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression3878 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression3897 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression3921 = new BitSet(new long[]{0x00C0000400000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction3959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction4240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction4296 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMaximumFunction4308 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4329 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_21_in_ruleMaximumFunction4342 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction4363 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_32_in_ruleMaximumFunction4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction4413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction4469 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMinimumFunction4481 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction4502 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_21_in_ruleMinimumFunction4515 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction4536 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_32_in_ruleMinimumFunction4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction4586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction4642 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAverageFunction4654 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction4675 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_21_in_ruleAverageFunction4688 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction4709 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_32_in_ruleAverageFunction4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction4759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction4815 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSumFunction4827 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction4848 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_21_in_ruleSumFunction4861 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction4882 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_32_in_ruleSumFunction4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction4932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction4988 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleExponentialFunction5000 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5021 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExponentialFunction5033 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction5054 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleExponentialFunction5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction5102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction5158 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAbsoluteFunction5170 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction5191 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleAbsoluteFunction5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction5239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction5295 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNaturalLogarithmFunction5307 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction5328 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleNaturalLogarithmFunction5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction5376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction5432 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCommonLogarithmFunction5444 = new BitSet(new long[]{0xFF00000080000F10L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction5465 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCommonLogarithmFunction5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification5515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression5661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression5719 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection5805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection5815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCollection5852 = new BitSet(new long[]{0xFF00C00480000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection5873 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleCollection5886 = new BitSet(new long[]{0xFF00C00480000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection5907 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleCollection5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple5957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple5967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTuple6004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple6025 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleTuple6038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple6059 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_ruleTuple6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair6109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair6167 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePropertyValuePair6179 = new BitSet(new long[]{0xFF00C00480000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression6236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression6328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression6338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression6439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral6579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral6709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral6891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleUnlimitedLiteral6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator6991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator7001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOrOperator7048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOrOperator7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator7103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleXOrOperator7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXOrOperator7178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator7215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAndOperator7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAndOperator7290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator7327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleImplicationOperator7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleImplicationOperator7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator7439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEqualsOperator7495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator7531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator7541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleNotEqualsOperator7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleNotEqualsOperator7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator7643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleNotOperator7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNotOperator7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator7755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleGreaterThanOperator7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator7847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator7857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleGreaterOrEqualThanOperator7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator7939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLessThanOperator7995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator8031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLessOrEqualThanOperator8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator8123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator8133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAdditionOperator8179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator8215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSubstractionOperator8271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator8307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMultiplicationOperator8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator8399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleDivisionOperator8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator8491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator8501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleModulusOperator8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator8583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMaxOperator8639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator8675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleMinOperator8731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator8767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator8777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleAvgOperator8823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator8859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSumOperator8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator8951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleExponentialOperator9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator9043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator9053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAbsoluteOperator9099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator9135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator9145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleNaturalLogarithmOperator9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator9227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator9237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCommonLogarithmOperator9283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis9320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis9331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLeftParenthesis9368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis9408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis9419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRightParenthesis9456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleQualifiedName9575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9697 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleQualifiedNameWithWildcard9716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace9762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace9772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleImportNamespace9809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace9830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber9867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber9878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber9918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber9944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber9970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber9996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpact_in_entryRuleImpact10042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpact10053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact10093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact10119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDirectionKind10180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDirectionKind10197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDirectionKind10214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_synpred1_InternalNSL9566 = new BitSet(new long[]{0x0000000000000002L});

}