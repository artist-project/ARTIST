package eu.artist.migration.mdt.database.sql.editor.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.artist.migration.mdt.database.sql.editor.services.SQLDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_N_SPEC_CHAR", "RULE_N_ESTRING", "RULE_CAST_HEXA_VALUE_TO_DATETIME", "RULE_ESTRING_AS_DOUBLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_OTHER_COMMAND", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INSERT'", "'.'", "'('", "','", "')'", "'VALUES'", "'['", "']'", "'NULL'", "' '"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ESTRING_AS_DOUBLE=8;
    public static final int RULE_N_SPEC_CHAR=5;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_OTHER_COMMAND=12;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_CAST_HEXA_VALUE_TO_DATETIME=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_STRING=10;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=9;
    public static final int RULE_N_ESTRING=6;
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalSQLDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSQLDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSQLDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g"; }



     	private SQLDSLGrammarAccess grammarAccess;
     	
        public InternalSQLDSLParser(TokenStream input, SQLDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SQLDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:76:1: ruleModel returns [EObject current=null] : ( () ( ruleother )* ( (lv_insertSQL_2_0= ruleInsertSQL ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_insertSQL_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:79:28: ( ( () ( ruleother )* ( (lv_insertSQL_2_0= ruleInsertSQL ) )* ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:80:1: ( () ( ruleother )* ( (lv_insertSQL_2_0= ruleInsertSQL ) )* )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:80:1: ( () ( ruleother )* ( (lv_insertSQL_2_0= ruleInsertSQL ) )* )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:80:2: () ( ruleother )* ( (lv_insertSQL_2_0= ruleInsertSQL ) )*
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:80:2: ()
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:86:2: ( ruleother )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ML_COMMENT && LA1_0<=RULE_OTHER_COMMAND)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:87:5: ruleother
            	    {
            	     
            	            newCompositeNode(grammarAccess.getModelAccess().getOtherParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleother_in_ruleModel136);
            	    ruleother();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:94:3: ( (lv_insertSQL_2_0= ruleInsertSQL ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:95:1: (lv_insertSQL_2_0= ruleInsertSQL )
            	    {
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:95:1: (lv_insertSQL_2_0= ruleInsertSQL )
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:96:3: lv_insertSQL_2_0= ruleInsertSQL
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getInsertSQLInsertSQLParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInsertSQL_in_ruleModel158);
            	    lv_insertSQL_2_0=ruleInsertSQL();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"insertSQL",
            	            		lv_insertSQL_2_0, 
            	            		"InsertSQL");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInsertSQL"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:120:1: entryRuleInsertSQL returns [EObject current=null] : iv_ruleInsertSQL= ruleInsertSQL EOF ;
    public final EObject entryRuleInsertSQL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertSQL = null;


        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:121:2: (iv_ruleInsertSQL= ruleInsertSQL EOF )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:122:2: iv_ruleInsertSQL= ruleInsertSQL EOF
            {
             newCompositeNode(grammarAccess.getInsertSQLRule()); 
            pushFollow(FOLLOW_ruleInsertSQL_in_entryRuleInsertSQL195);
            iv_ruleInsertSQL=ruleInsertSQL();

            state._fsp--;

             current =iv_ruleInsertSQL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertSQL205); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsertSQL"


    // $ANTLR start "ruleInsertSQL"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:129:1: ruleInsertSQL returns [EObject current=null] : ( () otherlv_1= 'INSERT' ( ruleSpace ( (lv_database_3_0= ruleDatabase ) ) otherlv_4= '.' ( (lv_tab_5_0= ruleTab ) ) ruleSpace otherlv_7= '(' ( (lv_columns_8_0= ruleColumn ) ) ( ruleSpace otherlv_10= ',' ruleSpace ( (lv_columns_12_0= ruleColumn ) ) )* otherlv_13= ')' ruleSpace otherlv_15= 'VALUES' ruleSpace otherlv_17= '(' ( (lv_fields_18_0= ruleField ) ) ( ruleSpace otherlv_20= ',' ruleSpace ( (lv_fields_22_0= ruleField ) ) )* otherlv_23= ')' ) ( ruleother )* ) ;
    public final EObject ruleInsertSQL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        EObject lv_database_3_0 = null;

        EObject lv_tab_5_0 = null;

        EObject lv_columns_8_0 = null;

        EObject lv_columns_12_0 = null;

        EObject lv_fields_18_0 = null;

        EObject lv_fields_22_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:132:28: ( ( () otherlv_1= 'INSERT' ( ruleSpace ( (lv_database_3_0= ruleDatabase ) ) otherlv_4= '.' ( (lv_tab_5_0= ruleTab ) ) ruleSpace otherlv_7= '(' ( (lv_columns_8_0= ruleColumn ) ) ( ruleSpace otherlv_10= ',' ruleSpace ( (lv_columns_12_0= ruleColumn ) ) )* otherlv_13= ')' ruleSpace otherlv_15= 'VALUES' ruleSpace otherlv_17= '(' ( (lv_fields_18_0= ruleField ) ) ( ruleSpace otherlv_20= ',' ruleSpace ( (lv_fields_22_0= ruleField ) ) )* otherlv_23= ')' ) ( ruleother )* ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:133:1: ( () otherlv_1= 'INSERT' ( ruleSpace ( (lv_database_3_0= ruleDatabase ) ) otherlv_4= '.' ( (lv_tab_5_0= ruleTab ) ) ruleSpace otherlv_7= '(' ( (lv_columns_8_0= ruleColumn ) ) ( ruleSpace otherlv_10= ',' ruleSpace ( (lv_columns_12_0= ruleColumn ) ) )* otherlv_13= ')' ruleSpace otherlv_15= 'VALUES' ruleSpace otherlv_17= '(' ( (lv_fields_18_0= ruleField ) ) ( ruleSpace otherlv_20= ',' ruleSpace ( (lv_fields_22_0= ruleField ) ) )* otherlv_23= ')' ) ( ruleother )* )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:133:1: ( () otherlv_1= 'INSERT' ( ruleSpace ( (lv_database_3_0= ruleDatabase ) ) otherlv_4= '.' ( (lv_tab_5_0= ruleTab ) ) ruleSpace otherlv_7= '(' ( (lv_columns_8_0= ruleColumn ) ) ( ruleSpace otherlv_10= ',' ruleSpace ( (lv_columns_12_0= ruleColumn ) ) )* otherlv_13= ')' ruleSpace otherlv_15= 'VALUES' ruleSpace otherlv_17= '(' ( (lv_fields_18_0= ruleField ) ) ( ruleSpace otherlv_20= ',' ruleSpace ( (lv_fields_22_0= ruleField ) ) )* otherlv_23= ')' ) ( ruleother )* )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:133:2: () otherlv_1= 'INSERT' ( ruleSpace ( (lv_database_3_0= ruleDatabase ) ) otherlv_4= '.' ( (lv_tab_5_0= ruleTab ) ) ruleSpace otherlv_7= '(' ( (lv_columns_8_0= ruleColumn ) ) ( ruleSpace otherlv_10= ',' ruleSpace ( (lv_columns_12_0= ruleColumn ) ) )* otherlv_13= ')' ruleSpace otherlv_15= 'VALUES' ruleSpace otherlv_17= '(' ( (lv_fields_18_0= ruleField ) ) ( ruleSpace otherlv_20= ',' ruleSpace ( (lv_fields_22_0= ruleField ) ) )* otherlv_23= ')' ) ( ruleother )*
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:133:2: ()
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:134:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInsertSQLAccess().getInsertSQLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleInsertSQL251); 

                	newLeafNode(otherlv_1, grammarAccess.getInsertSQLAccess().getINSERTKeyword_1());
                
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:143:1: ( ruleSpace ( (lv_database_3_0= ruleDatabase ) ) otherlv_4= '.' ( (lv_tab_5_0= ruleTab ) ) ruleSpace otherlv_7= '(' ( (lv_columns_8_0= ruleColumn ) ) ( ruleSpace otherlv_10= ',' ruleSpace ( (lv_columns_12_0= ruleColumn ) ) )* otherlv_13= ')' ruleSpace otherlv_15= 'VALUES' ruleSpace otherlv_17= '(' ( (lv_fields_18_0= ruleField ) ) ( ruleSpace otherlv_20= ',' ruleSpace ( (lv_fields_22_0= ruleField ) ) )* otherlv_23= ')' )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:144:5: ruleSpace ( (lv_database_3_0= ruleDatabase ) ) otherlv_4= '.' ( (lv_tab_5_0= ruleTab ) ) ruleSpace otherlv_7= '(' ( (lv_columns_8_0= ruleColumn ) ) ( ruleSpace otherlv_10= ',' ruleSpace ( (lv_columns_12_0= ruleColumn ) ) )* otherlv_13= ')' ruleSpace otherlv_15= 'VALUES' ruleSpace otherlv_17= '(' ( (lv_fields_18_0= ruleField ) ) ( ruleSpace otherlv_20= ',' ruleSpace ( (lv_fields_22_0= ruleField ) ) )* otherlv_23= ')'
            {
             
                    newCompositeNode(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_0()); 
                
            pushFollow(FOLLOW_ruleSpace_in_ruleInsertSQL268);
            ruleSpace();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:151:1: ( (lv_database_3_0= ruleDatabase ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:152:1: (lv_database_3_0= ruleDatabase )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:152:1: (lv_database_3_0= ruleDatabase )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:153:3: lv_database_3_0= ruleDatabase
            {
             
            	        newCompositeNode(grammarAccess.getInsertSQLAccess().getDatabaseDatabaseParserRuleCall_2_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDatabase_in_ruleInsertSQL288);
            lv_database_3_0=ruleDatabase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertSQLRule());
            	        }
                   		set(
                   			current, 
                   			"database",
                    		lv_database_3_0, 
                    		"Database");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleInsertSQL300); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertSQLAccess().getFullStopKeyword_2_2());
                
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:173:1: ( (lv_tab_5_0= ruleTab ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:174:1: (lv_tab_5_0= ruleTab )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:174:1: (lv_tab_5_0= ruleTab )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:175:3: lv_tab_5_0= ruleTab
            {
             
            	        newCompositeNode(grammarAccess.getInsertSQLAccess().getTabTabParserRuleCall_2_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTab_in_ruleInsertSQL321);
            lv_tab_5_0=ruleTab();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertSQLRule());
            	        }
                   		set(
                   			current, 
                   			"tab",
                    		lv_tab_5_0, 
                    		"Tab");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_4()); 
                
            pushFollow(FOLLOW_ruleSpace_in_ruleInsertSQL337);
            ruleSpace();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleInsertSQL348); 

                	newLeafNode(otherlv_7, grammarAccess.getInsertSQLAccess().getLeftParenthesisKeyword_2_5());
                
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:203:1: ( (lv_columns_8_0= ruleColumn ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:204:1: (lv_columns_8_0= ruleColumn )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:204:1: (lv_columns_8_0= ruleColumn )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:205:3: lv_columns_8_0= ruleColumn
            {
             
            	        newCompositeNode(grammarAccess.getInsertSQLAccess().getColumnsColumnParserRuleCall_2_6_0()); 
            	    
            pushFollow(FOLLOW_ruleColumn_in_ruleInsertSQL369);
            lv_columns_8_0=ruleColumn();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertSQLRule());
            	        }
                   		add(
                   			current, 
                   			"columns",
                    		lv_columns_8_0, 
                    		"Column");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:221:2: ( ruleSpace otherlv_10= ',' ruleSpace ( (lv_columns_12_0= ruleColumn ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EOF||(LA3_0>=RULE_N_SPEC_CHAR && LA3_0<=RULE_STRING)||(LA3_0>=18 && LA3_0<=19)||(LA3_0>=21 && LA3_0<=22)||(LA3_0>=24 && LA3_0<=25)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:222:5: ruleSpace otherlv_10= ',' ruleSpace ( (lv_columns_12_0= ruleColumn ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_7_0()); 
            	        
            	    pushFollow(FOLLOW_ruleSpace_in_ruleInsertSQL386);
            	    ruleSpace();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleInsertSQL397); 

            	        	newLeafNode(otherlv_10, grammarAccess.getInsertSQLAccess().getCommaKeyword_2_7_1());
            	        
            	     
            	            newCompositeNode(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_7_2()); 
            	        
            	    pushFollow(FOLLOW_ruleSpace_in_ruleInsertSQL413);
            	    ruleSpace();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:241:1: ( (lv_columns_12_0= ruleColumn ) )
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:242:1: (lv_columns_12_0= ruleColumn )
            	    {
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:242:1: (lv_columns_12_0= ruleColumn )
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:243:3: lv_columns_12_0= ruleColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInsertSQLAccess().getColumnsColumnParserRuleCall_2_7_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColumn_in_ruleInsertSQL433);
            	    lv_columns_12_0=ruleColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInsertSQLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"columns",
            	            		lv_columns_12_0, 
            	            		"Column");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleInsertSQL447); 

                	newLeafNode(otherlv_13, grammarAccess.getInsertSQLAccess().getRightParenthesisKeyword_2_8());
                
             
                    newCompositeNode(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_9()); 
                
            pushFollow(FOLLOW_ruleSpace_in_ruleInsertSQL463);
            ruleSpace();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleInsertSQL474); 

                	newLeafNode(otherlv_15, grammarAccess.getInsertSQLAccess().getVALUESKeyword_2_10());
                
             
                    newCompositeNode(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_11()); 
                
            pushFollow(FOLLOW_ruleSpace_in_ruleInsertSQL490);
            ruleSpace();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleInsertSQL501); 

                	newLeafNode(otherlv_17, grammarAccess.getInsertSQLAccess().getLeftParenthesisKeyword_2_12());
                
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:287:1: ( (lv_fields_18_0= ruleField ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:288:1: (lv_fields_18_0= ruleField )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:288:1: (lv_fields_18_0= ruleField )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:289:3: lv_fields_18_0= ruleField
            {
             
            	        newCompositeNode(grammarAccess.getInsertSQLAccess().getFieldsFieldParserRuleCall_2_13_0()); 
            	    
            pushFollow(FOLLOW_ruleField_in_ruleInsertSQL522);
            lv_fields_18_0=ruleField();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertSQLRule());
            	        }
                   		add(
                   			current, 
                   			"fields",
                    		lv_fields_18_0, 
                    		"Field");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:305:2: ( ruleSpace otherlv_20= ',' ruleSpace ( (lv_fields_22_0= ruleField ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==EOF||(LA4_0>=RULE_N_SPEC_CHAR && LA4_0<=RULE_STRING)||(LA4_0>=18 && LA4_0<=19)||(LA4_0>=21 && LA4_0<=22)||(LA4_0>=24 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:306:5: ruleSpace otherlv_20= ',' ruleSpace ( (lv_fields_22_0= ruleField ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_14_0()); 
            	        
            	    pushFollow(FOLLOW_ruleSpace_in_ruleInsertSQL539);
            	    ruleSpace();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleInsertSQL550); 

            	        	newLeafNode(otherlv_20, grammarAccess.getInsertSQLAccess().getCommaKeyword_2_14_1());
            	        
            	     
            	            newCompositeNode(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_14_2()); 
            	        
            	    pushFollow(FOLLOW_ruleSpace_in_ruleInsertSQL566);
            	    ruleSpace();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:325:1: ( (lv_fields_22_0= ruleField ) )
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:326:1: (lv_fields_22_0= ruleField )
            	    {
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:326:1: (lv_fields_22_0= ruleField )
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:327:3: lv_fields_22_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInsertSQLAccess().getFieldsFieldParserRuleCall_2_14_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleInsertSQL586);
            	    lv_fields_22_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInsertSQLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_22_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_23=(Token)match(input,20,FOLLOW_20_in_ruleInsertSQL600); 

                	newLeafNode(otherlv_23, grammarAccess.getInsertSQLAccess().getRightParenthesisKeyword_2_15());
                

            }

            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:347:2: ( ruleother )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ML_COMMENT && LA5_0<=RULE_OTHER_COMMAND)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:348:5: ruleother
            	    {
            	     
            	            newCompositeNode(grammarAccess.getInsertSQLAccess().getOtherParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleother_in_ruleInsertSQL618);
            	    ruleother();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsertSQL"


    // $ANTLR start "entryRuleDatabase"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:363:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:364:2: (iv_ruleDatabase= ruleDatabase EOF )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:365:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase655);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:372:1: ruleDatabase returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:375:28: ( ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:376:1: ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:376:1: ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:376:2: () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']'
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:376:2: ()
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:377:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDatabaseAccess().getDatabaseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleDatabase711); 

                	newLeafNode(otherlv_1, grammarAccess.getDatabaseAccess().getLeftSquareBracketKeyword_1());
                
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:386:1: ( (lv_value_2_0= RULE_ID ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:387:1: (lv_value_2_0= RULE_ID )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:387:1: (lv_value_2_0= RULE_ID )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:388:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabase728); 

            			newLeafNode(lv_value_2_0, grammarAccess.getDatabaseAccess().getValueIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleDatabase745); 

                	newLeafNode(otherlv_3, grammarAccess.getDatabaseAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTab"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:416:1: entryRuleTab returns [EObject current=null] : iv_ruleTab= ruleTab EOF ;
    public final EObject entryRuleTab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTab = null;


        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:417:2: (iv_ruleTab= ruleTab EOF )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:418:2: iv_ruleTab= ruleTab EOF
            {
             newCompositeNode(grammarAccess.getTabRule()); 
            pushFollow(FOLLOW_ruleTab_in_entryRuleTab781);
            iv_ruleTab=ruleTab();

            state._fsp--;

             current =iv_ruleTab; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTab791); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTab"


    // $ANTLR start "ruleTab"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:425:1: ruleTab returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' ) ;
    public final EObject ruleTab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:428:28: ( ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:429:1: ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:429:1: ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:429:2: () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']'
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:429:2: ()
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:430:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTabAccess().getTabAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleTab837); 

                	newLeafNode(otherlv_1, grammarAccess.getTabAccess().getLeftSquareBracketKeyword_1());
                
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:439:1: ( (lv_value_2_0= RULE_ID ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:440:1: (lv_value_2_0= RULE_ID )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:440:1: (lv_value_2_0= RULE_ID )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:441:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTab854); 

            			newLeafNode(lv_value_2_0, grammarAccess.getTabAccess().getValueIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTabRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleTab871); 

                	newLeafNode(otherlv_3, grammarAccess.getTabAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTab"


    // $ANTLR start "entryRuleColumn"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:469:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:470:2: (iv_ruleColumn= ruleColumn EOF )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:471:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn907);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn917); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:478:1: ruleColumn returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:481:28: ( ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:482:1: ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:482:1: ( () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']' )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:482:2: () otherlv_1= '[' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ']'
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:482:2: ()
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:483:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getColumnAccess().getColumnAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleColumn963); 

                	newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getLeftSquareBracketKeyword_1());
                
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:492:1: ( (lv_value_2_0= RULE_ID ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:493:1: (lv_value_2_0= RULE_ID )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:493:1: (lv_value_2_0= RULE_ID )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:494:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumn980); 

            			newLeafNode(lv_value_2_0, grammarAccess.getColumnAccess().getValueIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColumnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleColumn997); 

                	newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleField"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:522:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:523:2: (iv_ruleField= ruleField EOF )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:524:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1033);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1043); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:531:1: ruleField returns [EObject current=null] : ( () ( ( (lv_value_1_1= ruleEString | (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING ) | lv_value_1_5= RULE_CAST_HEXA_VALUE_TO_DATETIME | lv_value_1_6= ruleEStringAsInt | lv_value_1_7= RULE_ESTRING_AS_DOUBLE | lv_value_1_8= 'NULL' ) ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_3=null;
        Token lv_value_1_4=null;
        Token lv_value_1_5=null;
        Token lv_value_1_7=null;
        Token lv_value_1_8=null;
        AntlrDatatypeRuleToken lv_value_1_1 = null;

        AntlrDatatypeRuleToken lv_value_1_6 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:534:28: ( ( () ( ( (lv_value_1_1= ruleEString | (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING ) | lv_value_1_5= RULE_CAST_HEXA_VALUE_TO_DATETIME | lv_value_1_6= ruleEStringAsInt | lv_value_1_7= RULE_ESTRING_AS_DOUBLE | lv_value_1_8= 'NULL' ) ) ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:535:1: ( () ( ( (lv_value_1_1= ruleEString | (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING ) | lv_value_1_5= RULE_CAST_HEXA_VALUE_TO_DATETIME | lv_value_1_6= ruleEStringAsInt | lv_value_1_7= RULE_ESTRING_AS_DOUBLE | lv_value_1_8= 'NULL' ) ) ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:535:1: ( () ( ( (lv_value_1_1= ruleEString | (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING ) | lv_value_1_5= RULE_CAST_HEXA_VALUE_TO_DATETIME | lv_value_1_6= ruleEStringAsInt | lv_value_1_7= RULE_ESTRING_AS_DOUBLE | lv_value_1_8= 'NULL' ) ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:535:2: () ( ( (lv_value_1_1= ruleEString | (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING ) | lv_value_1_5= RULE_CAST_HEXA_VALUE_TO_DATETIME | lv_value_1_6= ruleEStringAsInt | lv_value_1_7= RULE_ESTRING_AS_DOUBLE | lv_value_1_8= 'NULL' ) ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:535:2: ()
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:536:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFieldAccess().getFieldAction_0(),
                        current);
                

            }

            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:541:2: ( ( (lv_value_1_1= ruleEString | (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING ) | lv_value_1_5= RULE_CAST_HEXA_VALUE_TO_DATETIME | lv_value_1_6= ruleEStringAsInt | lv_value_1_7= RULE_ESTRING_AS_DOUBLE | lv_value_1_8= 'NULL' ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:542:1: ( (lv_value_1_1= ruleEString | (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING ) | lv_value_1_5= RULE_CAST_HEXA_VALUE_TO_DATETIME | lv_value_1_6= ruleEStringAsInt | lv_value_1_7= RULE_ESTRING_AS_DOUBLE | lv_value_1_8= 'NULL' ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:542:1: ( (lv_value_1_1= ruleEString | (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING ) | lv_value_1_5= RULE_CAST_HEXA_VALUE_TO_DATETIME | lv_value_1_6= ruleEStringAsInt | lv_value_1_7= RULE_ESTRING_AS_DOUBLE | lv_value_1_8= 'NULL' ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:543:1: (lv_value_1_1= ruleEString | (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING ) | lv_value_1_5= RULE_CAST_HEXA_VALUE_TO_DATETIME | lv_value_1_6= ruleEStringAsInt | lv_value_1_7= RULE_ESTRING_AS_DOUBLE | lv_value_1_8= 'NULL' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:543:1: (lv_value_1_1= ruleEString | (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING ) | lv_value_1_5= RULE_CAST_HEXA_VALUE_TO_DATETIME | lv_value_1_6= ruleEStringAsInt | lv_value_1_7= RULE_ESTRING_AS_DOUBLE | lv_value_1_8= 'NULL' )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_N_SPEC_CHAR:
            case RULE_N_ESTRING:
                {
                alt7=2;
                }
                break;
            case RULE_CAST_HEXA_VALUE_TO_DATETIME:
                {
                alt7=3;
                }
                break;
            case RULE_INT:
                {
                alt7=4;
                }
                break;
            case RULE_ESTRING_AS_DOUBLE:
                {
                alt7=5;
                }
                break;
            case 24:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:544:3: lv_value_1_1= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getValueEStringParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleField1100);
                    lv_value_1_1=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_1, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:559:6: (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING )
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:559:6: (lv_value_1_3= RULE_N_SPEC_CHAR | lv_value_1_4= RULE_N_ESTRING )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_N_SPEC_CHAR) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_N_ESTRING) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:560:3: lv_value_1_3= RULE_N_SPEC_CHAR
                            {
                            lv_value_1_3=(Token)match(input,RULE_N_SPEC_CHAR,FOLLOW_RULE_N_SPEC_CHAR_in_ruleField1117); 

                            			newLeafNode(lv_value_1_3, grammarAccess.getFieldAccess().getValueN_SPEC_CHARTerminalRuleCall_1_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFieldRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"value",
                                    		lv_value_1_3, 
                                    		"N_SPEC_CHAR");
                            	    

                            }
                            break;
                        case 2 :
                            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:575:8: lv_value_1_4= RULE_N_ESTRING
                            {
                            lv_value_1_4=(Token)match(input,RULE_N_ESTRING,FOLLOW_RULE_N_ESTRING_in_ruleField1137); 

                            			newLeafNode(lv_value_1_4, grammarAccess.getFieldAccess().getValueN_ESTRINGTerminalRuleCall_1_0_1_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFieldRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"value",
                                    		lv_value_1_4, 
                                    		"N_ESTRING");
                            	    

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:592:8: lv_value_1_5= RULE_CAST_HEXA_VALUE_TO_DATETIME
                    {
                    lv_value_1_5=(Token)match(input,RULE_CAST_HEXA_VALUE_TO_DATETIME,FOLLOW_RULE_CAST_HEXA_VALUE_TO_DATETIME_in_ruleField1160); 

                    			newLeafNode(lv_value_1_5, grammarAccess.getFieldAccess().getValueCAST_HEXA_VALUE_TO_DATETIMETerminalRuleCall_1_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_5, 
                            		"CAST_HEXA_VALUE_TO_DATETIME");
                    	    

                    }
                    break;
                case 4 :
                    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:607:8: lv_value_1_6= ruleEStringAsInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getValueEStringAsIntParserRuleCall_1_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleEStringAsInt_in_ruleField1184);
                    lv_value_1_6=ruleEStringAsInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_6, 
                            		"EStringAsInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 5 :
                    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:622:8: lv_value_1_7= RULE_ESTRING_AS_DOUBLE
                    {
                    lv_value_1_7=(Token)match(input,RULE_ESTRING_AS_DOUBLE,FOLLOW_RULE_ESTRING_AS_DOUBLE_in_ruleField1199); 

                    			newLeafNode(lv_value_1_7, grammarAccess.getFieldAccess().getValueESTRING_AS_DOUBLETerminalRuleCall_1_0_4()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_7, 
                            		"ESTRING_AS_DOUBLE");
                    	    

                    }
                    break;
                case 6 :
                    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:637:8: lv_value_1_8= 'NULL'
                    {
                    lv_value_1_8=(Token)match(input,24,FOLLOW_24_in_ruleField1220); 

                            newLeafNode(lv_value_1_8, grammarAccess.getFieldAccess().getValueNULLKeyword_1_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_8, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleSpace"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:660:1: entryRuleSpace returns [String current=null] : iv_ruleSpace= ruleSpace EOF ;
    public final String entryRuleSpace() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpace = null;


        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:661:2: (iv_ruleSpace= ruleSpace EOF )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:662:2: iv_ruleSpace= ruleSpace EOF
            {
             newCompositeNode(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_ruleSpace_in_entryRuleSpace1273);
            iv_ruleSpace=ruleSpace();

            state._fsp--;

             current =iv_ruleSpace.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpace1284); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:669:1: ruleSpace returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ' ' )* ;
    public final AntlrDatatypeRuleToken ruleSpace() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:672:28: ( (kw= ' ' )* )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:673:1: (kw= ' ' )*
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:673:1: (kw= ' ' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:674:2: kw= ' '
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleSpace1322); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getSpaceAccess().getSpaceKeyword()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleEStringAsInt"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:687:1: entryRuleEStringAsInt returns [String current=null] : iv_ruleEStringAsInt= ruleEStringAsInt EOF ;
    public final String entryRuleEStringAsInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAsInt = null;


        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:688:2: (iv_ruleEStringAsInt= ruleEStringAsInt EOF )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:689:2: iv_ruleEStringAsInt= ruleEStringAsInt EOF
            {
             newCompositeNode(grammarAccess.getEStringAsIntRule()); 
            pushFollow(FOLLOW_ruleEStringAsInt_in_entryRuleEStringAsInt1364);
            iv_ruleEStringAsInt=ruleEStringAsInt();

            state._fsp--;

             current =iv_ruleEStringAsInt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringAsInt1375); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringAsInt"


    // $ANTLR start "ruleEStringAsInt"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:696:1: ruleEStringAsInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEStringAsInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:699:28: (this_INT_0= RULE_INT )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:700:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEStringAsInt1414); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEStringAsIntAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEStringAsInt"


    // $ANTLR start "entryRuleEString"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:715:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:716:2: (iv_ruleEString= ruleEString EOF )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:717:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1459);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:724:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:727:28: (this_STRING_0= RULE_STRING )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:728:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1509); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleother"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:743:1: entryRuleother returns [String current=null] : iv_ruleother= ruleother EOF ;
    public final String entryRuleother() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleother = null;


        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:744:2: (iv_ruleother= ruleother EOF )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:745:2: iv_ruleother= ruleother EOF
            {
             newCompositeNode(grammarAccess.getOtherRule()); 
            pushFollow(FOLLOW_ruleother_in_entryRuleother1554);
            iv_ruleother=ruleother();

            state._fsp--;

             current =iv_ruleother.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleother1565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleother"


    // $ANTLR start "ruleother"
    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:752:1: ruleother returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ML_COMMENT_0= RULE_ML_COMMENT | this_OTHER_COMMAND_1= RULE_OTHER_COMMAND ) ;
    public final AntlrDatatypeRuleToken ruleother() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ML_COMMENT_0=null;
        Token this_OTHER_COMMAND_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:755:28: ( (this_ML_COMMENT_0= RULE_ML_COMMENT | this_OTHER_COMMAND_1= RULE_OTHER_COMMAND ) )
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:756:1: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_OTHER_COMMAND_1= RULE_OTHER_COMMAND )
            {
            // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:756:1: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_OTHER_COMMAND_1= RULE_OTHER_COMMAND )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ML_COMMENT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_OTHER_COMMAND) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:756:6: this_ML_COMMENT_0= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleother1605); 

                    		current.merge(this_ML_COMMENT_0);
                        
                     
                        newLeafNode(this_ML_COMMENT_0, grammarAccess.getOtherAccess().getML_COMMENTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.artist.migration.mdt.database.sql.editor/src-gen/eu/artist/migration/mdt/database/sql/editor/parser/antlr/internal/InternalSQLDSL.g:764:10: this_OTHER_COMMAND_1= RULE_OTHER_COMMAND
                    {
                    this_OTHER_COMMAND_1=(Token)match(input,RULE_OTHER_COMMAND,FOLLOW_RULE_OTHER_COMMAND_in_ruleother1631); 

                    		current.merge(this_OTHER_COMMAND_1);
                        
                     
                        newLeafNode(this_OTHER_COMMAND_1, grammarAccess.getOtherAccess().getOTHER_COMMANDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleother"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleother_in_ruleModel136 = new BitSet(new long[]{0x0000000000011802L});
    public static final BitSet FOLLOW_ruleInsertSQL_in_ruleModel158 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleInsertSQL_in_entryRuleInsertSQL195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertSQL205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleInsertSQL251 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_ruleSpace_in_ruleInsertSQL268 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_ruleDatabase_in_ruleInsertSQL288 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInsertSQL300 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleTab_in_ruleInsertSQL321 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_ruleSpace_in_ruleInsertSQL337 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInsertSQL348 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleInsertSQL369 = new BitSet(new long[]{0x0000000002180000L});
    public static final BitSet FOLLOW_ruleSpace_in_ruleInsertSQL386 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInsertSQL397 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_ruleSpace_in_ruleInsertSQL413 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleInsertSQL433 = new BitSet(new long[]{0x0000000002180000L});
    public static final BitSet FOLLOW_20_in_ruleInsertSQL447 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_ruleSpace_in_ruleInsertSQL463 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInsertSQL474 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_ruleSpace_in_ruleInsertSQL490 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInsertSQL501 = new BitSet(new long[]{0x00000000010007E0L});
    public static final BitSet FOLLOW_ruleField_in_ruleInsertSQL522 = new BitSet(new long[]{0x0000000002180000L});
    public static final BitSet FOLLOW_ruleSpace_in_ruleInsertSQL539 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInsertSQL550 = new BitSet(new long[]{0x00000000030007E0L});
    public static final BitSet FOLLOW_ruleSpace_in_ruleInsertSQL566 = new BitSet(new long[]{0x00000000010007E0L});
    public static final BitSet FOLLOW_ruleField_in_ruleInsertSQL586 = new BitSet(new long[]{0x0000000002180000L});
    public static final BitSet FOLLOW_20_in_ruleInsertSQL600 = new BitSet(new long[]{0x0000000000011800L});
    public static final BitSet FOLLOW_ruleother_in_ruleInsertSQL618 = new BitSet(new long[]{0x0000000000011802L});
    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDatabase711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabase728 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDatabase745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTab_in_entryRuleTab781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTab791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTab837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTab854 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTab871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleColumn963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumn980 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleColumn997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleField1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_N_SPEC_CHAR_in_ruleField1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_N_ESTRING_in_ruleField1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAST_HEXA_VALUE_TO_DATETIME_in_ruleField1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringAsInt_in_ruleField1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTRING_AS_DOUBLE_in_ruleField1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleField1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpace_in_entryRuleSpace1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpace1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSpace1322 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleEStringAsInt_in_entryRuleEStringAsInt1364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringAsInt1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEStringAsInt1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleother_in_entryRuleother1554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleother1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleother1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OTHER_COMMAND_in_ruleother1631 = new BitSet(new long[]{0x0000000000000002L});

}