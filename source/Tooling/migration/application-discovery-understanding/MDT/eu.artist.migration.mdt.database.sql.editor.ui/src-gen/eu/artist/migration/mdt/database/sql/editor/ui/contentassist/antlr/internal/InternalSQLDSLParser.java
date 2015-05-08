package eu.artist.migration.mdt.database.sql.editor.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import eu.artist.migration.mdt.database.sql.editor.services.SQLDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_CAST_HEXA_VALUE_TO_DATETIME", "RULE_ESTRING_AS_DOUBLE", "RULE_N_SPEC_CHAR", "RULE_N_ESTRING", "RULE_ML_COMMENT", "RULE_OTHER_COMMAND", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "' '", "'NULL'", "'INSERT'", "'.'", "'('", "')'", "'VALUES'", "','", "'['", "']'"
    };
    public static final int RULE_ID=12;
    public static final int RULE_ESTRING_AS_DOUBLE=7;
    public static final int RULE_N_SPEC_CHAR=8;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_OTHER_COMMAND=11;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_CAST_HEXA_VALUE_TO_DATETIME=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int RULE_N_ESTRING=9;
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
    public String getGrammarFileName() { return "../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g"; }


     
     	private SQLDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SQLDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:61:1: ( ruleModel EOF )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:76:1: ( rule__Model__Group__0 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInsertSQL"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:88:1: entryRuleInsertSQL : ruleInsertSQL EOF ;
    public final void entryRuleInsertSQL() throws RecognitionException {
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:89:1: ( ruleInsertSQL EOF )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:90:1: ruleInsertSQL EOF
            {
             before(grammarAccess.getInsertSQLRule()); 
            pushFollow(FOLLOW_ruleInsertSQL_in_entryRuleInsertSQL121);
            ruleInsertSQL();

            state._fsp--;

             after(grammarAccess.getInsertSQLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertSQL128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsertSQL"


    // $ANTLR start "ruleInsertSQL"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:97:1: ruleInsertSQL : ( ( rule__InsertSQL__Group__0 ) ) ;
    public final void ruleInsertSQL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:101:2: ( ( ( rule__InsertSQL__Group__0 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:102:1: ( ( rule__InsertSQL__Group__0 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:102:1: ( ( rule__InsertSQL__Group__0 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:103:1: ( rule__InsertSQL__Group__0 )
            {
             before(grammarAccess.getInsertSQLAccess().getGroup()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:104:1: ( rule__InsertSQL__Group__0 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:104:2: rule__InsertSQL__Group__0
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group__0_in_ruleInsertSQL154);
            rule__InsertSQL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertSQLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsertSQL"


    // $ANTLR start "entryRuleDatabase"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:116:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:117:1: ( ruleDatabase EOF )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:118:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase181);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:125:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:129:2: ( ( ( rule__Database__Group__0 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:130:1: ( ( rule__Database__Group__0 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:130:1: ( ( rule__Database__Group__0 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:131:1: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:132:1: ( rule__Database__Group__0 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:132:2: rule__Database__Group__0
            {
            pushFollow(FOLLOW_rule__Database__Group__0_in_ruleDatabase214);
            rule__Database__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTab"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:144:1: entryRuleTab : ruleTab EOF ;
    public final void entryRuleTab() throws RecognitionException {
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:145:1: ( ruleTab EOF )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:146:1: ruleTab EOF
            {
             before(grammarAccess.getTabRule()); 
            pushFollow(FOLLOW_ruleTab_in_entryRuleTab241);
            ruleTab();

            state._fsp--;

             after(grammarAccess.getTabRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTab248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTab"


    // $ANTLR start "ruleTab"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:153:1: ruleTab : ( ( rule__Tab__Group__0 ) ) ;
    public final void ruleTab() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:157:2: ( ( ( rule__Tab__Group__0 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:158:1: ( ( rule__Tab__Group__0 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:158:1: ( ( rule__Tab__Group__0 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:159:1: ( rule__Tab__Group__0 )
            {
             before(grammarAccess.getTabAccess().getGroup()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:160:1: ( rule__Tab__Group__0 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:160:2: rule__Tab__Group__0
            {
            pushFollow(FOLLOW_rule__Tab__Group__0_in_ruleTab274);
            rule__Tab__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTabAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTab"


    // $ANTLR start "entryRuleColumn"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:172:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:173:1: ( ruleColumn EOF )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:174:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn301);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:181:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:185:2: ( ( ( rule__Column__Group__0 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:186:1: ( ( rule__Column__Group__0 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:186:1: ( ( rule__Column__Group__0 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:187:1: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:188:1: ( rule__Column__Group__0 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:188:2: rule__Column__Group__0
            {
            pushFollow(FOLLOW_rule__Column__Group__0_in_ruleColumn334);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleField"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:200:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:201:1: ( ruleField EOF )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:202:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField361);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:209:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:213:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:214:1: ( ( rule__Field__Group__0 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:214:1: ( ( rule__Field__Group__0 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:215:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:216:1: ( rule__Field__Group__0 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:216:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField394);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleSpace"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:228:1: entryRuleSpace : ruleSpace EOF ;
    public final void entryRuleSpace() throws RecognitionException {
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:229:1: ( ruleSpace EOF )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:230:1: ruleSpace EOF
            {
             before(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_ruleSpace_in_entryRuleSpace421);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getSpaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpace428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:237:1: ruleSpace : ( ( ' ' )* ) ;
    public final void ruleSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:241:2: ( ( ( ' ' )* ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:242:1: ( ( ' ' )* )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:242:1: ( ( ' ' )* )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:243:1: ( ' ' )*
            {
             before(grammarAccess.getSpaceAccess().getSpaceKeyword()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:244:1: ( ' ' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:245:2: ' '
            	    {
            	    match(input,16,FOLLOW_16_in_ruleSpace456); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSpaceAccess().getSpaceKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleEStringAsInt"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:258:1: entryRuleEStringAsInt : ruleEStringAsInt EOF ;
    public final void entryRuleEStringAsInt() throws RecognitionException {
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:259:1: ( ruleEStringAsInt EOF )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:260:1: ruleEStringAsInt EOF
            {
             before(grammarAccess.getEStringAsIntRule()); 
            pushFollow(FOLLOW_ruleEStringAsInt_in_entryRuleEStringAsInt486);
            ruleEStringAsInt();

            state._fsp--;

             after(grammarAccess.getEStringAsIntRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringAsInt493); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEStringAsInt"


    // $ANTLR start "ruleEStringAsInt"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:267:1: ruleEStringAsInt : ( RULE_INT ) ;
    public final void ruleEStringAsInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:271:2: ( ( RULE_INT ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:272:1: ( RULE_INT )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:272:1: ( RULE_INT )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:273:1: RULE_INT
            {
             before(grammarAccess.getEStringAsIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEStringAsInt519); 
             after(grammarAccess.getEStringAsIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEStringAsInt"


    // $ANTLR start "entryRuleEString"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:286:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:287:1: ( ruleEString EOF )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:288:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString545);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString552); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:295:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:299:2: ( ( RULE_STRING ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:300:1: ( RULE_STRING )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:300:1: ( RULE_STRING )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:301:1: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString578); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleother"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:314:1: entryRuleother : ruleother EOF ;
    public final void entryRuleother() throws RecognitionException {
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:315:1: ( ruleother EOF )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:316:1: ruleother EOF
            {
             before(grammarAccess.getOtherRule()); 
            pushFollow(FOLLOW_ruleother_in_entryRuleother604);
            ruleother();

            state._fsp--;

             after(grammarAccess.getOtherRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleother611); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleother"


    // $ANTLR start "ruleother"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:323:1: ruleother : ( ( rule__Other__Alternatives ) ) ;
    public final void ruleother() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:327:2: ( ( ( rule__Other__Alternatives ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:328:1: ( ( rule__Other__Alternatives ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:328:1: ( ( rule__Other__Alternatives ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:329:1: ( rule__Other__Alternatives )
            {
             before(grammarAccess.getOtherAccess().getAlternatives()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:330:1: ( rule__Other__Alternatives )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:330:2: rule__Other__Alternatives
            {
            pushFollow(FOLLOW_rule__Other__Alternatives_in_ruleother637);
            rule__Other__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOtherAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleother"


    // $ANTLR start "rule__Field__ValueAlternatives_1_0"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:342:1: rule__Field__ValueAlternatives_1_0 : ( ( ruleEString ) | ( ( rule__Field__ValueAlternatives_1_0_1 ) ) | ( RULE_CAST_HEXA_VALUE_TO_DATETIME ) | ( ruleEStringAsInt ) | ( RULE_ESTRING_AS_DOUBLE ) | ( 'NULL' ) );
    public final void rule__Field__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:346:1: ( ( ruleEString ) | ( ( rule__Field__ValueAlternatives_1_0_1 ) ) | ( RULE_CAST_HEXA_VALUE_TO_DATETIME ) | ( ruleEStringAsInt ) | ( RULE_ESTRING_AS_DOUBLE ) | ( 'NULL' ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case RULE_N_SPEC_CHAR:
            case RULE_N_ESTRING:
                {
                alt2=2;
                }
                break;
            case RULE_CAST_HEXA_VALUE_TO_DATETIME:
                {
                alt2=3;
                }
                break;
            case RULE_INT:
                {
                alt2=4;
                }
                break;
            case RULE_ESTRING_AS_DOUBLE:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:347:1: ( ruleEString )
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:347:1: ( ruleEString )
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:348:1: ruleEString
                    {
                     before(grammarAccess.getFieldAccess().getValueEStringParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleEString_in_rule__Field__ValueAlternatives_1_0673);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getValueEStringParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:353:6: ( ( rule__Field__ValueAlternatives_1_0_1 ) )
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:353:6: ( ( rule__Field__ValueAlternatives_1_0_1 ) )
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:354:1: ( rule__Field__ValueAlternatives_1_0_1 )
                    {
                     before(grammarAccess.getFieldAccess().getValueAlternatives_1_0_1()); 
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:355:1: ( rule__Field__ValueAlternatives_1_0_1 )
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:355:2: rule__Field__ValueAlternatives_1_0_1
                    {
                    pushFollow(FOLLOW_rule__Field__ValueAlternatives_1_0_1_in_rule__Field__ValueAlternatives_1_0690);
                    rule__Field__ValueAlternatives_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getValueAlternatives_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:359:6: ( RULE_CAST_HEXA_VALUE_TO_DATETIME )
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:359:6: ( RULE_CAST_HEXA_VALUE_TO_DATETIME )
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:360:1: RULE_CAST_HEXA_VALUE_TO_DATETIME
                    {
                     before(grammarAccess.getFieldAccess().getValueCAST_HEXA_VALUE_TO_DATETIMETerminalRuleCall_1_0_2()); 
                    match(input,RULE_CAST_HEXA_VALUE_TO_DATETIME,FOLLOW_RULE_CAST_HEXA_VALUE_TO_DATETIME_in_rule__Field__ValueAlternatives_1_0708); 
                     after(grammarAccess.getFieldAccess().getValueCAST_HEXA_VALUE_TO_DATETIMETerminalRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:365:6: ( ruleEStringAsInt )
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:365:6: ( ruleEStringAsInt )
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:366:1: ruleEStringAsInt
                    {
                     before(grammarAccess.getFieldAccess().getValueEStringAsIntParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_ruleEStringAsInt_in_rule__Field__ValueAlternatives_1_0725);
                    ruleEStringAsInt();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getValueEStringAsIntParserRuleCall_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:371:6: ( RULE_ESTRING_AS_DOUBLE )
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:371:6: ( RULE_ESTRING_AS_DOUBLE )
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:372:1: RULE_ESTRING_AS_DOUBLE
                    {
                     before(grammarAccess.getFieldAccess().getValueESTRING_AS_DOUBLETerminalRuleCall_1_0_4()); 
                    match(input,RULE_ESTRING_AS_DOUBLE,FOLLOW_RULE_ESTRING_AS_DOUBLE_in_rule__Field__ValueAlternatives_1_0742); 
                     after(grammarAccess.getFieldAccess().getValueESTRING_AS_DOUBLETerminalRuleCall_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:377:6: ( 'NULL' )
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:377:6: ( 'NULL' )
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:378:1: 'NULL'
                    {
                     before(grammarAccess.getFieldAccess().getValueNULLKeyword_1_0_5()); 
                    match(input,17,FOLLOW_17_in_rule__Field__ValueAlternatives_1_0760); 
                     after(grammarAccess.getFieldAccess().getValueNULLKeyword_1_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ValueAlternatives_1_0"


    // $ANTLR start "rule__Field__ValueAlternatives_1_0_1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:390:1: rule__Field__ValueAlternatives_1_0_1 : ( ( RULE_N_SPEC_CHAR ) | ( RULE_N_ESTRING ) );
    public final void rule__Field__ValueAlternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:394:1: ( ( RULE_N_SPEC_CHAR ) | ( RULE_N_ESTRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_N_SPEC_CHAR) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_N_ESTRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:395:1: ( RULE_N_SPEC_CHAR )
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:395:1: ( RULE_N_SPEC_CHAR )
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:396:1: RULE_N_SPEC_CHAR
                    {
                     before(grammarAccess.getFieldAccess().getValueN_SPEC_CHARTerminalRuleCall_1_0_1_0()); 
                    match(input,RULE_N_SPEC_CHAR,FOLLOW_RULE_N_SPEC_CHAR_in_rule__Field__ValueAlternatives_1_0_1794); 
                     after(grammarAccess.getFieldAccess().getValueN_SPEC_CHARTerminalRuleCall_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:401:6: ( RULE_N_ESTRING )
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:401:6: ( RULE_N_ESTRING )
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:402:1: RULE_N_ESTRING
                    {
                     before(grammarAccess.getFieldAccess().getValueN_ESTRINGTerminalRuleCall_1_0_1_1()); 
                    match(input,RULE_N_ESTRING,FOLLOW_RULE_N_ESTRING_in_rule__Field__ValueAlternatives_1_0_1811); 
                     after(grammarAccess.getFieldAccess().getValueN_ESTRINGTerminalRuleCall_1_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ValueAlternatives_1_0_1"


    // $ANTLR start "rule__Other__Alternatives"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:412:1: rule__Other__Alternatives : ( ( RULE_ML_COMMENT ) | ( RULE_OTHER_COMMAND ) );
    public final void rule__Other__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:416:1: ( ( RULE_ML_COMMENT ) | ( RULE_OTHER_COMMAND ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ML_COMMENT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_OTHER_COMMAND) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:417:1: ( RULE_ML_COMMENT )
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:417:1: ( RULE_ML_COMMENT )
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:418:1: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getOtherAccess().getML_COMMENTTerminalRuleCall_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Other__Alternatives843); 
                     after(grammarAccess.getOtherAccess().getML_COMMENTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:423:6: ( RULE_OTHER_COMMAND )
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:423:6: ( RULE_OTHER_COMMAND )
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:424:1: RULE_OTHER_COMMAND
                    {
                     before(grammarAccess.getOtherAccess().getOTHER_COMMANDTerminalRuleCall_1()); 
                    match(input,RULE_OTHER_COMMAND,FOLLOW_RULE_OTHER_COMMAND_in_rule__Other__Alternatives860); 
                     after(grammarAccess.getOtherAccess().getOTHER_COMMANDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Other__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:436:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:440:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:441:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0890);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0893);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:448:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:452:1: ( ( () ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:453:1: ( () )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:453:1: ( () )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:454:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:455:1: ()
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:457:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:467:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:471:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:472:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1951);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1954);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:479:1: rule__Model__Group__1__Impl : ( ( ruleother )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:483:1: ( ( ( ruleother )* ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:484:1: ( ( ruleother )* )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:484:1: ( ( ruleother )* )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:485:1: ( ruleother )*
            {
             before(grammarAccess.getModelAccess().getOtherParserRuleCall_1()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:486:1: ( ruleother )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ML_COMMENT && LA5_0<=RULE_OTHER_COMMAND)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:486:3: ruleother
            	    {
            	    pushFollow(FOLLOW_ruleother_in_rule__Model__Group__1__Impl982);
            	    ruleother();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getOtherParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:496:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:500:1: ( rule__Model__Group__2__Impl )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:501:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21013);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:507:1: rule__Model__Group__2__Impl : ( ( rule__Model__InsertSQLAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:511:1: ( ( ( rule__Model__InsertSQLAssignment_2 )* ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:512:1: ( ( rule__Model__InsertSQLAssignment_2 )* )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:512:1: ( ( rule__Model__InsertSQLAssignment_2 )* )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:513:1: ( rule__Model__InsertSQLAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getInsertSQLAssignment_2()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:514:1: ( rule__Model__InsertSQLAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:514:2: rule__Model__InsertSQLAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__InsertSQLAssignment_2_in_rule__Model__Group__2__Impl1040);
            	    rule__Model__InsertSQLAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getInsertSQLAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__InsertSQL__Group__0"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:530:1: rule__InsertSQL__Group__0 : rule__InsertSQL__Group__0__Impl rule__InsertSQL__Group__1 ;
    public final void rule__InsertSQL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:534:1: ( rule__InsertSQL__Group__0__Impl rule__InsertSQL__Group__1 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:535:2: rule__InsertSQL__Group__0__Impl rule__InsertSQL__Group__1
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group__0__Impl_in_rule__InsertSQL__Group__01077);
            rule__InsertSQL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group__1_in_rule__InsertSQL__Group__01080);
            rule__InsertSQL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group__0"


    // $ANTLR start "rule__InsertSQL__Group__0__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:542:1: rule__InsertSQL__Group__0__Impl : ( () ) ;
    public final void rule__InsertSQL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:546:1: ( ( () ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:547:1: ( () )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:547:1: ( () )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:548:1: ()
            {
             before(grammarAccess.getInsertSQLAccess().getInsertSQLAction_0()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:549:1: ()
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:551:1: 
            {
            }

             after(grammarAccess.getInsertSQLAccess().getInsertSQLAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group__0__Impl"


    // $ANTLR start "rule__InsertSQL__Group__1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:561:1: rule__InsertSQL__Group__1 : rule__InsertSQL__Group__1__Impl rule__InsertSQL__Group__2 ;
    public final void rule__InsertSQL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:565:1: ( rule__InsertSQL__Group__1__Impl rule__InsertSQL__Group__2 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:566:2: rule__InsertSQL__Group__1__Impl rule__InsertSQL__Group__2
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group__1__Impl_in_rule__InsertSQL__Group__11138);
            rule__InsertSQL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group__2_in_rule__InsertSQL__Group__11141);
            rule__InsertSQL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group__1"


    // $ANTLR start "rule__InsertSQL__Group__1__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:573:1: rule__InsertSQL__Group__1__Impl : ( 'INSERT' ) ;
    public final void rule__InsertSQL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:577:1: ( ( 'INSERT' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:578:1: ( 'INSERT' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:578:1: ( 'INSERT' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:579:1: 'INSERT'
            {
             before(grammarAccess.getInsertSQLAccess().getINSERTKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__InsertSQL__Group__1__Impl1169); 
             after(grammarAccess.getInsertSQLAccess().getINSERTKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group__1__Impl"


    // $ANTLR start "rule__InsertSQL__Group__2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:592:1: rule__InsertSQL__Group__2 : rule__InsertSQL__Group__2__Impl rule__InsertSQL__Group__3 ;
    public final void rule__InsertSQL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:596:1: ( rule__InsertSQL__Group__2__Impl rule__InsertSQL__Group__3 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:597:2: rule__InsertSQL__Group__2__Impl rule__InsertSQL__Group__3
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group__2__Impl_in_rule__InsertSQL__Group__21200);
            rule__InsertSQL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group__3_in_rule__InsertSQL__Group__21203);
            rule__InsertSQL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group__2"


    // $ANTLR start "rule__InsertSQL__Group__2__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:604:1: rule__InsertSQL__Group__2__Impl : ( ( rule__InsertSQL__Group_2__0 ) ) ;
    public final void rule__InsertSQL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:608:1: ( ( ( rule__InsertSQL__Group_2__0 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:609:1: ( ( rule__InsertSQL__Group_2__0 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:609:1: ( ( rule__InsertSQL__Group_2__0 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:610:1: ( rule__InsertSQL__Group_2__0 )
            {
             before(grammarAccess.getInsertSQLAccess().getGroup_2()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:611:1: ( rule__InsertSQL__Group_2__0 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:611:2: rule__InsertSQL__Group_2__0
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__0_in_rule__InsertSQL__Group__2__Impl1230);
            rule__InsertSQL__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertSQLAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group__2__Impl"


    // $ANTLR start "rule__InsertSQL__Group__3"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:621:1: rule__InsertSQL__Group__3 : rule__InsertSQL__Group__3__Impl ;
    public final void rule__InsertSQL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:625:1: ( rule__InsertSQL__Group__3__Impl )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:626:2: rule__InsertSQL__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group__3__Impl_in_rule__InsertSQL__Group__31260);
            rule__InsertSQL__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group__3"


    // $ANTLR start "rule__InsertSQL__Group__3__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:632:1: rule__InsertSQL__Group__3__Impl : ( ( ruleother )* ) ;
    public final void rule__InsertSQL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:636:1: ( ( ( ruleother )* ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:637:1: ( ( ruleother )* )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:637:1: ( ( ruleother )* )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:638:1: ( ruleother )*
            {
             before(grammarAccess.getInsertSQLAccess().getOtherParserRuleCall_3()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:639:1: ( ruleother )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ML_COMMENT && LA7_0<=RULE_OTHER_COMMAND)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:639:3: ruleother
            	    {
            	    pushFollow(FOLLOW_ruleother_in_rule__InsertSQL__Group__3__Impl1288);
            	    ruleother();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getInsertSQLAccess().getOtherParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group__3__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__0"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:657:1: rule__InsertSQL__Group_2__0 : rule__InsertSQL__Group_2__0__Impl rule__InsertSQL__Group_2__1 ;
    public final void rule__InsertSQL__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:661:1: ( rule__InsertSQL__Group_2__0__Impl rule__InsertSQL__Group_2__1 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:662:2: rule__InsertSQL__Group_2__0__Impl rule__InsertSQL__Group_2__1
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__0__Impl_in_rule__InsertSQL__Group_2__01327);
            rule__InsertSQL__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__1_in_rule__InsertSQL__Group_2__01330);
            rule__InsertSQL__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__0"


    // $ANTLR start "rule__InsertSQL__Group_2__0__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:669:1: rule__InsertSQL__Group_2__0__Impl : ( ruleSpace ) ;
    public final void rule__InsertSQL__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:673:1: ( ( ruleSpace ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:674:1: ( ruleSpace )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:674:1: ( ruleSpace )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:675:1: ruleSpace
            {
             before(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2__0__Impl1357);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__0__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:686:1: rule__InsertSQL__Group_2__1 : rule__InsertSQL__Group_2__1__Impl rule__InsertSQL__Group_2__2 ;
    public final void rule__InsertSQL__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:690:1: ( rule__InsertSQL__Group_2__1__Impl rule__InsertSQL__Group_2__2 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:691:2: rule__InsertSQL__Group_2__1__Impl rule__InsertSQL__Group_2__2
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__1__Impl_in_rule__InsertSQL__Group_2__11386);
            rule__InsertSQL__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__2_in_rule__InsertSQL__Group_2__11389);
            rule__InsertSQL__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__1"


    // $ANTLR start "rule__InsertSQL__Group_2__1__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:698:1: rule__InsertSQL__Group_2__1__Impl : ( ( rule__InsertSQL__DatabaseAssignment_2_1 ) ) ;
    public final void rule__InsertSQL__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:702:1: ( ( ( rule__InsertSQL__DatabaseAssignment_2_1 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:703:1: ( ( rule__InsertSQL__DatabaseAssignment_2_1 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:703:1: ( ( rule__InsertSQL__DatabaseAssignment_2_1 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:704:1: ( rule__InsertSQL__DatabaseAssignment_2_1 )
            {
             before(grammarAccess.getInsertSQLAccess().getDatabaseAssignment_2_1()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:705:1: ( rule__InsertSQL__DatabaseAssignment_2_1 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:705:2: rule__InsertSQL__DatabaseAssignment_2_1
            {
            pushFollow(FOLLOW_rule__InsertSQL__DatabaseAssignment_2_1_in_rule__InsertSQL__Group_2__1__Impl1416);
            rule__InsertSQL__DatabaseAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertSQLAccess().getDatabaseAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__1__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:715:1: rule__InsertSQL__Group_2__2 : rule__InsertSQL__Group_2__2__Impl rule__InsertSQL__Group_2__3 ;
    public final void rule__InsertSQL__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:719:1: ( rule__InsertSQL__Group_2__2__Impl rule__InsertSQL__Group_2__3 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:720:2: rule__InsertSQL__Group_2__2__Impl rule__InsertSQL__Group_2__3
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__2__Impl_in_rule__InsertSQL__Group_2__21446);
            rule__InsertSQL__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__3_in_rule__InsertSQL__Group_2__21449);
            rule__InsertSQL__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__2"


    // $ANTLR start "rule__InsertSQL__Group_2__2__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:727:1: rule__InsertSQL__Group_2__2__Impl : ( '.' ) ;
    public final void rule__InsertSQL__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:731:1: ( ( '.' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:732:1: ( '.' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:732:1: ( '.' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:733:1: '.'
            {
             before(grammarAccess.getInsertSQLAccess().getFullStopKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__InsertSQL__Group_2__2__Impl1477); 
             after(grammarAccess.getInsertSQLAccess().getFullStopKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__2__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__3"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:746:1: rule__InsertSQL__Group_2__3 : rule__InsertSQL__Group_2__3__Impl rule__InsertSQL__Group_2__4 ;
    public final void rule__InsertSQL__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:750:1: ( rule__InsertSQL__Group_2__3__Impl rule__InsertSQL__Group_2__4 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:751:2: rule__InsertSQL__Group_2__3__Impl rule__InsertSQL__Group_2__4
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__3__Impl_in_rule__InsertSQL__Group_2__31508);
            rule__InsertSQL__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__4_in_rule__InsertSQL__Group_2__31511);
            rule__InsertSQL__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__3"


    // $ANTLR start "rule__InsertSQL__Group_2__3__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:758:1: rule__InsertSQL__Group_2__3__Impl : ( ( rule__InsertSQL__TabAssignment_2_3 ) ) ;
    public final void rule__InsertSQL__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:762:1: ( ( ( rule__InsertSQL__TabAssignment_2_3 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:763:1: ( ( rule__InsertSQL__TabAssignment_2_3 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:763:1: ( ( rule__InsertSQL__TabAssignment_2_3 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:764:1: ( rule__InsertSQL__TabAssignment_2_3 )
            {
             before(grammarAccess.getInsertSQLAccess().getTabAssignment_2_3()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:765:1: ( rule__InsertSQL__TabAssignment_2_3 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:765:2: rule__InsertSQL__TabAssignment_2_3
            {
            pushFollow(FOLLOW_rule__InsertSQL__TabAssignment_2_3_in_rule__InsertSQL__Group_2__3__Impl1538);
            rule__InsertSQL__TabAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertSQLAccess().getTabAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__3__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__4"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:775:1: rule__InsertSQL__Group_2__4 : rule__InsertSQL__Group_2__4__Impl rule__InsertSQL__Group_2__5 ;
    public final void rule__InsertSQL__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:779:1: ( rule__InsertSQL__Group_2__4__Impl rule__InsertSQL__Group_2__5 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:780:2: rule__InsertSQL__Group_2__4__Impl rule__InsertSQL__Group_2__5
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__4__Impl_in_rule__InsertSQL__Group_2__41568);
            rule__InsertSQL__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__5_in_rule__InsertSQL__Group_2__41571);
            rule__InsertSQL__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__4"


    // $ANTLR start "rule__InsertSQL__Group_2__4__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:787:1: rule__InsertSQL__Group_2__4__Impl : ( ruleSpace ) ;
    public final void rule__InsertSQL__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:791:1: ( ( ruleSpace ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:792:1: ( ruleSpace )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:792:1: ( ruleSpace )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:793:1: ruleSpace
            {
             before(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_4()); 
            pushFollow(FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2__4__Impl1598);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__4__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__5"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:804:1: rule__InsertSQL__Group_2__5 : rule__InsertSQL__Group_2__5__Impl rule__InsertSQL__Group_2__6 ;
    public final void rule__InsertSQL__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:808:1: ( rule__InsertSQL__Group_2__5__Impl rule__InsertSQL__Group_2__6 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:809:2: rule__InsertSQL__Group_2__5__Impl rule__InsertSQL__Group_2__6
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__5__Impl_in_rule__InsertSQL__Group_2__51627);
            rule__InsertSQL__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__6_in_rule__InsertSQL__Group_2__51630);
            rule__InsertSQL__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__5"


    // $ANTLR start "rule__InsertSQL__Group_2__5__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:816:1: rule__InsertSQL__Group_2__5__Impl : ( '(' ) ;
    public final void rule__InsertSQL__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:820:1: ( ( '(' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:821:1: ( '(' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:821:1: ( '(' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:822:1: '('
            {
             before(grammarAccess.getInsertSQLAccess().getLeftParenthesisKeyword_2_5()); 
            match(input,20,FOLLOW_20_in_rule__InsertSQL__Group_2__5__Impl1658); 
             after(grammarAccess.getInsertSQLAccess().getLeftParenthesisKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__5__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__6"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:835:1: rule__InsertSQL__Group_2__6 : rule__InsertSQL__Group_2__6__Impl rule__InsertSQL__Group_2__7 ;
    public final void rule__InsertSQL__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:839:1: ( rule__InsertSQL__Group_2__6__Impl rule__InsertSQL__Group_2__7 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:840:2: rule__InsertSQL__Group_2__6__Impl rule__InsertSQL__Group_2__7
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__6__Impl_in_rule__InsertSQL__Group_2__61689);
            rule__InsertSQL__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__7_in_rule__InsertSQL__Group_2__61692);
            rule__InsertSQL__Group_2__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__6"


    // $ANTLR start "rule__InsertSQL__Group_2__6__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:847:1: rule__InsertSQL__Group_2__6__Impl : ( ( rule__InsertSQL__ColumnsAssignment_2_6 ) ) ;
    public final void rule__InsertSQL__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:851:1: ( ( ( rule__InsertSQL__ColumnsAssignment_2_6 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:852:1: ( ( rule__InsertSQL__ColumnsAssignment_2_6 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:852:1: ( ( rule__InsertSQL__ColumnsAssignment_2_6 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:853:1: ( rule__InsertSQL__ColumnsAssignment_2_6 )
            {
             before(grammarAccess.getInsertSQLAccess().getColumnsAssignment_2_6()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:854:1: ( rule__InsertSQL__ColumnsAssignment_2_6 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:854:2: rule__InsertSQL__ColumnsAssignment_2_6
            {
            pushFollow(FOLLOW_rule__InsertSQL__ColumnsAssignment_2_6_in_rule__InsertSQL__Group_2__6__Impl1719);
            rule__InsertSQL__ColumnsAssignment_2_6();

            state._fsp--;


            }

             after(grammarAccess.getInsertSQLAccess().getColumnsAssignment_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__6__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__7"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:864:1: rule__InsertSQL__Group_2__7 : rule__InsertSQL__Group_2__7__Impl rule__InsertSQL__Group_2__8 ;
    public final void rule__InsertSQL__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:868:1: ( rule__InsertSQL__Group_2__7__Impl rule__InsertSQL__Group_2__8 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:869:2: rule__InsertSQL__Group_2__7__Impl rule__InsertSQL__Group_2__8
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__7__Impl_in_rule__InsertSQL__Group_2__71749);
            rule__InsertSQL__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__8_in_rule__InsertSQL__Group_2__71752);
            rule__InsertSQL__Group_2__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__7"


    // $ANTLR start "rule__InsertSQL__Group_2__7__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:876:1: rule__InsertSQL__Group_2__7__Impl : ( ( rule__InsertSQL__Group_2_7__0 )* ) ;
    public final void rule__InsertSQL__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:880:1: ( ( ( rule__InsertSQL__Group_2_7__0 )* ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:881:1: ( ( rule__InsertSQL__Group_2_7__0 )* )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:881:1: ( ( rule__InsertSQL__Group_2_7__0 )* )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:882:1: ( rule__InsertSQL__Group_2_7__0 )*
            {
             before(grammarAccess.getInsertSQLAccess().getGroup_2_7()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:883:1: ( rule__InsertSQL__Group_2_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==EOF||(LA8_0>=RULE_INT && LA8_0<=RULE_N_ESTRING)||(LA8_0>=16 && LA8_0<=17)||LA8_0==20||(LA8_0>=22 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:883:2: rule__InsertSQL__Group_2_7__0
            	    {
            	    pushFollow(FOLLOW_rule__InsertSQL__Group_2_7__0_in_rule__InsertSQL__Group_2__7__Impl1779);
            	    rule__InsertSQL__Group_2_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getInsertSQLAccess().getGroup_2_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__7__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__8"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:893:1: rule__InsertSQL__Group_2__8 : rule__InsertSQL__Group_2__8__Impl rule__InsertSQL__Group_2__9 ;
    public final void rule__InsertSQL__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:897:1: ( rule__InsertSQL__Group_2__8__Impl rule__InsertSQL__Group_2__9 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:898:2: rule__InsertSQL__Group_2__8__Impl rule__InsertSQL__Group_2__9
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__8__Impl_in_rule__InsertSQL__Group_2__81810);
            rule__InsertSQL__Group_2__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__9_in_rule__InsertSQL__Group_2__81813);
            rule__InsertSQL__Group_2__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__8"


    // $ANTLR start "rule__InsertSQL__Group_2__8__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:905:1: rule__InsertSQL__Group_2__8__Impl : ( ')' ) ;
    public final void rule__InsertSQL__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:909:1: ( ( ')' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:910:1: ( ')' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:910:1: ( ')' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:911:1: ')'
            {
             before(grammarAccess.getInsertSQLAccess().getRightParenthesisKeyword_2_8()); 
            match(input,21,FOLLOW_21_in_rule__InsertSQL__Group_2__8__Impl1841); 
             after(grammarAccess.getInsertSQLAccess().getRightParenthesisKeyword_2_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__8__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__9"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:924:1: rule__InsertSQL__Group_2__9 : rule__InsertSQL__Group_2__9__Impl rule__InsertSQL__Group_2__10 ;
    public final void rule__InsertSQL__Group_2__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:928:1: ( rule__InsertSQL__Group_2__9__Impl rule__InsertSQL__Group_2__10 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:929:2: rule__InsertSQL__Group_2__9__Impl rule__InsertSQL__Group_2__10
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__9__Impl_in_rule__InsertSQL__Group_2__91872);
            rule__InsertSQL__Group_2__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__10_in_rule__InsertSQL__Group_2__91875);
            rule__InsertSQL__Group_2__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__9"


    // $ANTLR start "rule__InsertSQL__Group_2__9__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:936:1: rule__InsertSQL__Group_2__9__Impl : ( ruleSpace ) ;
    public final void rule__InsertSQL__Group_2__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:940:1: ( ( ruleSpace ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:941:1: ( ruleSpace )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:941:1: ( ruleSpace )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:942:1: ruleSpace
            {
             before(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_9()); 
            pushFollow(FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2__9__Impl1902);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__9__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__10"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:953:1: rule__InsertSQL__Group_2__10 : rule__InsertSQL__Group_2__10__Impl rule__InsertSQL__Group_2__11 ;
    public final void rule__InsertSQL__Group_2__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:957:1: ( rule__InsertSQL__Group_2__10__Impl rule__InsertSQL__Group_2__11 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:958:2: rule__InsertSQL__Group_2__10__Impl rule__InsertSQL__Group_2__11
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__10__Impl_in_rule__InsertSQL__Group_2__101931);
            rule__InsertSQL__Group_2__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__11_in_rule__InsertSQL__Group_2__101934);
            rule__InsertSQL__Group_2__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__10"


    // $ANTLR start "rule__InsertSQL__Group_2__10__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:965:1: rule__InsertSQL__Group_2__10__Impl : ( 'VALUES' ) ;
    public final void rule__InsertSQL__Group_2__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:969:1: ( ( 'VALUES' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:970:1: ( 'VALUES' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:970:1: ( 'VALUES' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:971:1: 'VALUES'
            {
             before(grammarAccess.getInsertSQLAccess().getVALUESKeyword_2_10()); 
            match(input,22,FOLLOW_22_in_rule__InsertSQL__Group_2__10__Impl1962); 
             after(grammarAccess.getInsertSQLAccess().getVALUESKeyword_2_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__10__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__11"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:984:1: rule__InsertSQL__Group_2__11 : rule__InsertSQL__Group_2__11__Impl rule__InsertSQL__Group_2__12 ;
    public final void rule__InsertSQL__Group_2__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:988:1: ( rule__InsertSQL__Group_2__11__Impl rule__InsertSQL__Group_2__12 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:989:2: rule__InsertSQL__Group_2__11__Impl rule__InsertSQL__Group_2__12
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__11__Impl_in_rule__InsertSQL__Group_2__111993);
            rule__InsertSQL__Group_2__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__12_in_rule__InsertSQL__Group_2__111996);
            rule__InsertSQL__Group_2__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__11"


    // $ANTLR start "rule__InsertSQL__Group_2__11__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:996:1: rule__InsertSQL__Group_2__11__Impl : ( ruleSpace ) ;
    public final void rule__InsertSQL__Group_2__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1000:1: ( ( ruleSpace ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1001:1: ( ruleSpace )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1001:1: ( ruleSpace )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1002:1: ruleSpace
            {
             before(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_11()); 
            pushFollow(FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2__11__Impl2023);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__11__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__12"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1013:1: rule__InsertSQL__Group_2__12 : rule__InsertSQL__Group_2__12__Impl rule__InsertSQL__Group_2__13 ;
    public final void rule__InsertSQL__Group_2__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1017:1: ( rule__InsertSQL__Group_2__12__Impl rule__InsertSQL__Group_2__13 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1018:2: rule__InsertSQL__Group_2__12__Impl rule__InsertSQL__Group_2__13
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__12__Impl_in_rule__InsertSQL__Group_2__122052);
            rule__InsertSQL__Group_2__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__13_in_rule__InsertSQL__Group_2__122055);
            rule__InsertSQL__Group_2__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__12"


    // $ANTLR start "rule__InsertSQL__Group_2__12__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1025:1: rule__InsertSQL__Group_2__12__Impl : ( '(' ) ;
    public final void rule__InsertSQL__Group_2__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1029:1: ( ( '(' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1030:1: ( '(' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1030:1: ( '(' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1031:1: '('
            {
             before(grammarAccess.getInsertSQLAccess().getLeftParenthesisKeyword_2_12()); 
            match(input,20,FOLLOW_20_in_rule__InsertSQL__Group_2__12__Impl2083); 
             after(grammarAccess.getInsertSQLAccess().getLeftParenthesisKeyword_2_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__12__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__13"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1044:1: rule__InsertSQL__Group_2__13 : rule__InsertSQL__Group_2__13__Impl rule__InsertSQL__Group_2__14 ;
    public final void rule__InsertSQL__Group_2__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1048:1: ( rule__InsertSQL__Group_2__13__Impl rule__InsertSQL__Group_2__14 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1049:2: rule__InsertSQL__Group_2__13__Impl rule__InsertSQL__Group_2__14
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__13__Impl_in_rule__InsertSQL__Group_2__132114);
            rule__InsertSQL__Group_2__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__14_in_rule__InsertSQL__Group_2__132117);
            rule__InsertSQL__Group_2__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__13"


    // $ANTLR start "rule__InsertSQL__Group_2__13__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1056:1: rule__InsertSQL__Group_2__13__Impl : ( ( rule__InsertSQL__FieldsAssignment_2_13 ) ) ;
    public final void rule__InsertSQL__Group_2__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1060:1: ( ( ( rule__InsertSQL__FieldsAssignment_2_13 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1061:1: ( ( rule__InsertSQL__FieldsAssignment_2_13 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1061:1: ( ( rule__InsertSQL__FieldsAssignment_2_13 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1062:1: ( rule__InsertSQL__FieldsAssignment_2_13 )
            {
             before(grammarAccess.getInsertSQLAccess().getFieldsAssignment_2_13()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1063:1: ( rule__InsertSQL__FieldsAssignment_2_13 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1063:2: rule__InsertSQL__FieldsAssignment_2_13
            {
            pushFollow(FOLLOW_rule__InsertSQL__FieldsAssignment_2_13_in_rule__InsertSQL__Group_2__13__Impl2144);
            rule__InsertSQL__FieldsAssignment_2_13();

            state._fsp--;


            }

             after(grammarAccess.getInsertSQLAccess().getFieldsAssignment_2_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__13__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__14"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1073:1: rule__InsertSQL__Group_2__14 : rule__InsertSQL__Group_2__14__Impl rule__InsertSQL__Group_2__15 ;
    public final void rule__InsertSQL__Group_2__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1077:1: ( rule__InsertSQL__Group_2__14__Impl rule__InsertSQL__Group_2__15 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1078:2: rule__InsertSQL__Group_2__14__Impl rule__InsertSQL__Group_2__15
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__14__Impl_in_rule__InsertSQL__Group_2__142174);
            rule__InsertSQL__Group_2__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2__15_in_rule__InsertSQL__Group_2__142177);
            rule__InsertSQL__Group_2__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__14"


    // $ANTLR start "rule__InsertSQL__Group_2__14__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1085:1: rule__InsertSQL__Group_2__14__Impl : ( ( rule__InsertSQL__Group_2_14__0 )* ) ;
    public final void rule__InsertSQL__Group_2__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1089:1: ( ( ( rule__InsertSQL__Group_2_14__0 )* ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1090:1: ( ( rule__InsertSQL__Group_2_14__0 )* )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1090:1: ( ( rule__InsertSQL__Group_2_14__0 )* )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1091:1: ( rule__InsertSQL__Group_2_14__0 )*
            {
             before(grammarAccess.getInsertSQLAccess().getGroup_2_14()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1092:1: ( rule__InsertSQL__Group_2_14__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==EOF||(LA9_0>=RULE_INT && LA9_0<=RULE_N_ESTRING)||(LA9_0>=16 && LA9_0<=17)||LA9_0==20||(LA9_0>=22 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1092:2: rule__InsertSQL__Group_2_14__0
            	    {
            	    pushFollow(FOLLOW_rule__InsertSQL__Group_2_14__0_in_rule__InsertSQL__Group_2__14__Impl2204);
            	    rule__InsertSQL__Group_2_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getInsertSQLAccess().getGroup_2_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__14__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2__15"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1102:1: rule__InsertSQL__Group_2__15 : rule__InsertSQL__Group_2__15__Impl ;
    public final void rule__InsertSQL__Group_2__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1106:1: ( rule__InsertSQL__Group_2__15__Impl )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1107:2: rule__InsertSQL__Group_2__15__Impl
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2__15__Impl_in_rule__InsertSQL__Group_2__152235);
            rule__InsertSQL__Group_2__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__15"


    // $ANTLR start "rule__InsertSQL__Group_2__15__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1113:1: rule__InsertSQL__Group_2__15__Impl : ( ')' ) ;
    public final void rule__InsertSQL__Group_2__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1117:1: ( ( ')' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1118:1: ( ')' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1118:1: ( ')' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1119:1: ')'
            {
             before(grammarAccess.getInsertSQLAccess().getRightParenthesisKeyword_2_15()); 
            match(input,21,FOLLOW_21_in_rule__InsertSQL__Group_2__15__Impl2263); 
             after(grammarAccess.getInsertSQLAccess().getRightParenthesisKeyword_2_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2__15__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2_7__0"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1164:1: rule__InsertSQL__Group_2_7__0 : rule__InsertSQL__Group_2_7__0__Impl rule__InsertSQL__Group_2_7__1 ;
    public final void rule__InsertSQL__Group_2_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1168:1: ( rule__InsertSQL__Group_2_7__0__Impl rule__InsertSQL__Group_2_7__1 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1169:2: rule__InsertSQL__Group_2_7__0__Impl rule__InsertSQL__Group_2_7__1
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2_7__0__Impl_in_rule__InsertSQL__Group_2_7__02326);
            rule__InsertSQL__Group_2_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2_7__1_in_rule__InsertSQL__Group_2_7__02329);
            rule__InsertSQL__Group_2_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_7__0"


    // $ANTLR start "rule__InsertSQL__Group_2_7__0__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1176:1: rule__InsertSQL__Group_2_7__0__Impl : ( ruleSpace ) ;
    public final void rule__InsertSQL__Group_2_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1180:1: ( ( ruleSpace ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1181:1: ( ruleSpace )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1181:1: ( ruleSpace )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1182:1: ruleSpace
            {
             before(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_7_0()); 
            pushFollow(FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2_7__0__Impl2356);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_7__0__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2_7__1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1193:1: rule__InsertSQL__Group_2_7__1 : rule__InsertSQL__Group_2_7__1__Impl rule__InsertSQL__Group_2_7__2 ;
    public final void rule__InsertSQL__Group_2_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1197:1: ( rule__InsertSQL__Group_2_7__1__Impl rule__InsertSQL__Group_2_7__2 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1198:2: rule__InsertSQL__Group_2_7__1__Impl rule__InsertSQL__Group_2_7__2
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2_7__1__Impl_in_rule__InsertSQL__Group_2_7__12385);
            rule__InsertSQL__Group_2_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2_7__2_in_rule__InsertSQL__Group_2_7__12388);
            rule__InsertSQL__Group_2_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_7__1"


    // $ANTLR start "rule__InsertSQL__Group_2_7__1__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1205:1: rule__InsertSQL__Group_2_7__1__Impl : ( ',' ) ;
    public final void rule__InsertSQL__Group_2_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1209:1: ( ( ',' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1210:1: ( ',' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1210:1: ( ',' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1211:1: ','
            {
             before(grammarAccess.getInsertSQLAccess().getCommaKeyword_2_7_1()); 
            match(input,23,FOLLOW_23_in_rule__InsertSQL__Group_2_7__1__Impl2416); 
             after(grammarAccess.getInsertSQLAccess().getCommaKeyword_2_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_7__1__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2_7__2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1224:1: rule__InsertSQL__Group_2_7__2 : rule__InsertSQL__Group_2_7__2__Impl rule__InsertSQL__Group_2_7__3 ;
    public final void rule__InsertSQL__Group_2_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1228:1: ( rule__InsertSQL__Group_2_7__2__Impl rule__InsertSQL__Group_2_7__3 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1229:2: rule__InsertSQL__Group_2_7__2__Impl rule__InsertSQL__Group_2_7__3
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2_7__2__Impl_in_rule__InsertSQL__Group_2_7__22447);
            rule__InsertSQL__Group_2_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2_7__3_in_rule__InsertSQL__Group_2_7__22450);
            rule__InsertSQL__Group_2_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_7__2"


    // $ANTLR start "rule__InsertSQL__Group_2_7__2__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1236:1: rule__InsertSQL__Group_2_7__2__Impl : ( ruleSpace ) ;
    public final void rule__InsertSQL__Group_2_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1240:1: ( ( ruleSpace ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1241:1: ( ruleSpace )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1241:1: ( ruleSpace )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1242:1: ruleSpace
            {
             before(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_7_2()); 
            pushFollow(FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2_7__2__Impl2477);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_7__2__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2_7__3"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1253:1: rule__InsertSQL__Group_2_7__3 : rule__InsertSQL__Group_2_7__3__Impl ;
    public final void rule__InsertSQL__Group_2_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1257:1: ( rule__InsertSQL__Group_2_7__3__Impl )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1258:2: rule__InsertSQL__Group_2_7__3__Impl
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2_7__3__Impl_in_rule__InsertSQL__Group_2_7__32506);
            rule__InsertSQL__Group_2_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_7__3"


    // $ANTLR start "rule__InsertSQL__Group_2_7__3__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1264:1: rule__InsertSQL__Group_2_7__3__Impl : ( ( rule__InsertSQL__ColumnsAssignment_2_7_3 ) ) ;
    public final void rule__InsertSQL__Group_2_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1268:1: ( ( ( rule__InsertSQL__ColumnsAssignment_2_7_3 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1269:1: ( ( rule__InsertSQL__ColumnsAssignment_2_7_3 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1269:1: ( ( rule__InsertSQL__ColumnsAssignment_2_7_3 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1270:1: ( rule__InsertSQL__ColumnsAssignment_2_7_3 )
            {
             before(grammarAccess.getInsertSQLAccess().getColumnsAssignment_2_7_3()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1271:1: ( rule__InsertSQL__ColumnsAssignment_2_7_3 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1271:2: rule__InsertSQL__ColumnsAssignment_2_7_3
            {
            pushFollow(FOLLOW_rule__InsertSQL__ColumnsAssignment_2_7_3_in_rule__InsertSQL__Group_2_7__3__Impl2533);
            rule__InsertSQL__ColumnsAssignment_2_7_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertSQLAccess().getColumnsAssignment_2_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_7__3__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2_14__0"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1289:1: rule__InsertSQL__Group_2_14__0 : rule__InsertSQL__Group_2_14__0__Impl rule__InsertSQL__Group_2_14__1 ;
    public final void rule__InsertSQL__Group_2_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1293:1: ( rule__InsertSQL__Group_2_14__0__Impl rule__InsertSQL__Group_2_14__1 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1294:2: rule__InsertSQL__Group_2_14__0__Impl rule__InsertSQL__Group_2_14__1
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2_14__0__Impl_in_rule__InsertSQL__Group_2_14__02571);
            rule__InsertSQL__Group_2_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2_14__1_in_rule__InsertSQL__Group_2_14__02574);
            rule__InsertSQL__Group_2_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_14__0"


    // $ANTLR start "rule__InsertSQL__Group_2_14__0__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1301:1: rule__InsertSQL__Group_2_14__0__Impl : ( ruleSpace ) ;
    public final void rule__InsertSQL__Group_2_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1305:1: ( ( ruleSpace ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1306:1: ( ruleSpace )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1306:1: ( ruleSpace )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1307:1: ruleSpace
            {
             before(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_14_0()); 
            pushFollow(FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2_14__0__Impl2601);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_14__0__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2_14__1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1318:1: rule__InsertSQL__Group_2_14__1 : rule__InsertSQL__Group_2_14__1__Impl rule__InsertSQL__Group_2_14__2 ;
    public final void rule__InsertSQL__Group_2_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1322:1: ( rule__InsertSQL__Group_2_14__1__Impl rule__InsertSQL__Group_2_14__2 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1323:2: rule__InsertSQL__Group_2_14__1__Impl rule__InsertSQL__Group_2_14__2
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2_14__1__Impl_in_rule__InsertSQL__Group_2_14__12630);
            rule__InsertSQL__Group_2_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2_14__2_in_rule__InsertSQL__Group_2_14__12633);
            rule__InsertSQL__Group_2_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_14__1"


    // $ANTLR start "rule__InsertSQL__Group_2_14__1__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1330:1: rule__InsertSQL__Group_2_14__1__Impl : ( ',' ) ;
    public final void rule__InsertSQL__Group_2_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1334:1: ( ( ',' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1335:1: ( ',' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1335:1: ( ',' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1336:1: ','
            {
             before(grammarAccess.getInsertSQLAccess().getCommaKeyword_2_14_1()); 
            match(input,23,FOLLOW_23_in_rule__InsertSQL__Group_2_14__1__Impl2661); 
             after(grammarAccess.getInsertSQLAccess().getCommaKeyword_2_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_14__1__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2_14__2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1349:1: rule__InsertSQL__Group_2_14__2 : rule__InsertSQL__Group_2_14__2__Impl rule__InsertSQL__Group_2_14__3 ;
    public final void rule__InsertSQL__Group_2_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1353:1: ( rule__InsertSQL__Group_2_14__2__Impl rule__InsertSQL__Group_2_14__3 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1354:2: rule__InsertSQL__Group_2_14__2__Impl rule__InsertSQL__Group_2_14__3
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2_14__2__Impl_in_rule__InsertSQL__Group_2_14__22692);
            rule__InsertSQL__Group_2_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InsertSQL__Group_2_14__3_in_rule__InsertSQL__Group_2_14__22695);
            rule__InsertSQL__Group_2_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_14__2"


    // $ANTLR start "rule__InsertSQL__Group_2_14__2__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1361:1: rule__InsertSQL__Group_2_14__2__Impl : ( ruleSpace ) ;
    public final void rule__InsertSQL__Group_2_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1365:1: ( ( ruleSpace ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1366:1: ( ruleSpace )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1366:1: ( ruleSpace )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1367:1: ruleSpace
            {
             before(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_14_2()); 
            pushFollow(FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2_14__2__Impl2722);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getSpaceParserRuleCall_2_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_14__2__Impl"


    // $ANTLR start "rule__InsertSQL__Group_2_14__3"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1378:1: rule__InsertSQL__Group_2_14__3 : rule__InsertSQL__Group_2_14__3__Impl ;
    public final void rule__InsertSQL__Group_2_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1382:1: ( rule__InsertSQL__Group_2_14__3__Impl )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1383:2: rule__InsertSQL__Group_2_14__3__Impl
            {
            pushFollow(FOLLOW_rule__InsertSQL__Group_2_14__3__Impl_in_rule__InsertSQL__Group_2_14__32751);
            rule__InsertSQL__Group_2_14__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_14__3"


    // $ANTLR start "rule__InsertSQL__Group_2_14__3__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1389:1: rule__InsertSQL__Group_2_14__3__Impl : ( ( rule__InsertSQL__FieldsAssignment_2_14_3 ) ) ;
    public final void rule__InsertSQL__Group_2_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1393:1: ( ( ( rule__InsertSQL__FieldsAssignment_2_14_3 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1394:1: ( ( rule__InsertSQL__FieldsAssignment_2_14_3 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1394:1: ( ( rule__InsertSQL__FieldsAssignment_2_14_3 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1395:1: ( rule__InsertSQL__FieldsAssignment_2_14_3 )
            {
             before(grammarAccess.getInsertSQLAccess().getFieldsAssignment_2_14_3()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1396:1: ( rule__InsertSQL__FieldsAssignment_2_14_3 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1396:2: rule__InsertSQL__FieldsAssignment_2_14_3
            {
            pushFollow(FOLLOW_rule__InsertSQL__FieldsAssignment_2_14_3_in_rule__InsertSQL__Group_2_14__3__Impl2778);
            rule__InsertSQL__FieldsAssignment_2_14_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertSQLAccess().getFieldsAssignment_2_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__Group_2_14__3__Impl"


    // $ANTLR start "rule__Database__Group__0"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1414:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1418:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1419:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__02816);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__1_in_rule__Database__Group__02819);
            rule__Database__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0"


    // $ANTLR start "rule__Database__Group__0__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1426:1: rule__Database__Group__0__Impl : ( () ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1430:1: ( ( () ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1431:1: ( () )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1431:1: ( () )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1432:1: ()
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseAction_0()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1433:1: ()
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1435:1: 
            {
            }

             after(grammarAccess.getDatabaseAccess().getDatabaseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0__Impl"


    // $ANTLR start "rule__Database__Group__1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1445:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1449:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1450:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__12877);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__2_in_rule__Database__Group__12880);
            rule__Database__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1"


    // $ANTLR start "rule__Database__Group__1__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1457:1: rule__Database__Group__1__Impl : ( '[' ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1461:1: ( ( '[' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1462:1: ( '[' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1462:1: ( '[' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1463:1: '['
            {
             before(grammarAccess.getDatabaseAccess().getLeftSquareBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Database__Group__1__Impl2908); 
             after(grammarAccess.getDatabaseAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Database__Group__2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1476:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1480:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1481:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__22939);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__3_in_rule__Database__Group__22942);
            rule__Database__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2"


    // $ANTLR start "rule__Database__Group__2__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1488:1: rule__Database__Group__2__Impl : ( ( rule__Database__ValueAssignment_2 ) ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1492:1: ( ( ( rule__Database__ValueAssignment_2 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1493:1: ( ( rule__Database__ValueAssignment_2 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1493:1: ( ( rule__Database__ValueAssignment_2 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1494:1: ( rule__Database__ValueAssignment_2 )
            {
             before(grammarAccess.getDatabaseAccess().getValueAssignment_2()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1495:1: ( rule__Database__ValueAssignment_2 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1495:2: rule__Database__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Database__ValueAssignment_2_in_rule__Database__Group__2__Impl2969);
            rule__Database__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2__Impl"


    // $ANTLR start "rule__Database__Group__3"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1505:1: rule__Database__Group__3 : rule__Database__Group__3__Impl ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1509:1: ( rule__Database__Group__3__Impl )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1510:2: rule__Database__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__32999);
            rule__Database__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3"


    // $ANTLR start "rule__Database__Group__3__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1516:1: rule__Database__Group__3__Impl : ( ']' ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1520:1: ( ( ']' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1521:1: ( ']' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1521:1: ( ']' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1522:1: ']'
            {
             before(grammarAccess.getDatabaseAccess().getRightSquareBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Database__Group__3__Impl3027); 
             after(grammarAccess.getDatabaseAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3__Impl"


    // $ANTLR start "rule__Tab__Group__0"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1543:1: rule__Tab__Group__0 : rule__Tab__Group__0__Impl rule__Tab__Group__1 ;
    public final void rule__Tab__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1547:1: ( rule__Tab__Group__0__Impl rule__Tab__Group__1 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1548:2: rule__Tab__Group__0__Impl rule__Tab__Group__1
            {
            pushFollow(FOLLOW_rule__Tab__Group__0__Impl_in_rule__Tab__Group__03066);
            rule__Tab__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tab__Group__1_in_rule__Tab__Group__03069);
            rule__Tab__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__0"


    // $ANTLR start "rule__Tab__Group__0__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1555:1: rule__Tab__Group__0__Impl : ( () ) ;
    public final void rule__Tab__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1559:1: ( ( () ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1560:1: ( () )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1560:1: ( () )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1561:1: ()
            {
             before(grammarAccess.getTabAccess().getTabAction_0()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1562:1: ()
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1564:1: 
            {
            }

             after(grammarAccess.getTabAccess().getTabAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__0__Impl"


    // $ANTLR start "rule__Tab__Group__1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1574:1: rule__Tab__Group__1 : rule__Tab__Group__1__Impl rule__Tab__Group__2 ;
    public final void rule__Tab__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1578:1: ( rule__Tab__Group__1__Impl rule__Tab__Group__2 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1579:2: rule__Tab__Group__1__Impl rule__Tab__Group__2
            {
            pushFollow(FOLLOW_rule__Tab__Group__1__Impl_in_rule__Tab__Group__13127);
            rule__Tab__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tab__Group__2_in_rule__Tab__Group__13130);
            rule__Tab__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__1"


    // $ANTLR start "rule__Tab__Group__1__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1586:1: rule__Tab__Group__1__Impl : ( '[' ) ;
    public final void rule__Tab__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1590:1: ( ( '[' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1591:1: ( '[' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1591:1: ( '[' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1592:1: '['
            {
             before(grammarAccess.getTabAccess().getLeftSquareBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Tab__Group__1__Impl3158); 
             after(grammarAccess.getTabAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__1__Impl"


    // $ANTLR start "rule__Tab__Group__2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1605:1: rule__Tab__Group__2 : rule__Tab__Group__2__Impl rule__Tab__Group__3 ;
    public final void rule__Tab__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1609:1: ( rule__Tab__Group__2__Impl rule__Tab__Group__3 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1610:2: rule__Tab__Group__2__Impl rule__Tab__Group__3
            {
            pushFollow(FOLLOW_rule__Tab__Group__2__Impl_in_rule__Tab__Group__23189);
            rule__Tab__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tab__Group__3_in_rule__Tab__Group__23192);
            rule__Tab__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__2"


    // $ANTLR start "rule__Tab__Group__2__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1617:1: rule__Tab__Group__2__Impl : ( ( rule__Tab__ValueAssignment_2 ) ) ;
    public final void rule__Tab__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1621:1: ( ( ( rule__Tab__ValueAssignment_2 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1622:1: ( ( rule__Tab__ValueAssignment_2 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1622:1: ( ( rule__Tab__ValueAssignment_2 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1623:1: ( rule__Tab__ValueAssignment_2 )
            {
             before(grammarAccess.getTabAccess().getValueAssignment_2()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1624:1: ( rule__Tab__ValueAssignment_2 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1624:2: rule__Tab__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Tab__ValueAssignment_2_in_rule__Tab__Group__2__Impl3219);
            rule__Tab__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTabAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__2__Impl"


    // $ANTLR start "rule__Tab__Group__3"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1634:1: rule__Tab__Group__3 : rule__Tab__Group__3__Impl ;
    public final void rule__Tab__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1638:1: ( rule__Tab__Group__3__Impl )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1639:2: rule__Tab__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Tab__Group__3__Impl_in_rule__Tab__Group__33249);
            rule__Tab__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__3"


    // $ANTLR start "rule__Tab__Group__3__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1645:1: rule__Tab__Group__3__Impl : ( ']' ) ;
    public final void rule__Tab__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1649:1: ( ( ']' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1650:1: ( ']' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1650:1: ( ']' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1651:1: ']'
            {
             before(grammarAccess.getTabAccess().getRightSquareBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Tab__Group__3__Impl3277); 
             after(grammarAccess.getTabAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1672:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1676:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1677:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__03316);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__1_in_rule__Column__Group__03319);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1684:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1688:1: ( ( () ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1689:1: ( () )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1689:1: ( () )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1690:1: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1691:1: ()
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1693:1: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1703:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1707:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1708:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__13377);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__2_in_rule__Column__Group__13380);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1715:1: rule__Column__Group__1__Impl : ( '[' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1719:1: ( ( '[' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1720:1: ( '[' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1720:1: ( '[' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1721:1: '['
            {
             before(grammarAccess.getColumnAccess().getLeftSquareBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Column__Group__1__Impl3408); 
             after(grammarAccess.getColumnAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1734:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1738:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1739:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__23439);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__3_in_rule__Column__Group__23442);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1746:1: rule__Column__Group__2__Impl : ( ( rule__Column__ValueAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1750:1: ( ( ( rule__Column__ValueAssignment_2 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1751:1: ( ( rule__Column__ValueAssignment_2 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1751:1: ( ( rule__Column__ValueAssignment_2 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1752:1: ( rule__Column__ValueAssignment_2 )
            {
             before(grammarAccess.getColumnAccess().getValueAssignment_2()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1753:1: ( rule__Column__ValueAssignment_2 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1753:2: rule__Column__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Column__ValueAssignment_2_in_rule__Column__Group__2__Impl3469);
            rule__Column__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1763:1: rule__Column__Group__3 : rule__Column__Group__3__Impl ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1767:1: ( rule__Column__Group__3__Impl )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1768:2: rule__Column__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__33499);
            rule__Column__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1774:1: rule__Column__Group__3__Impl : ( ']' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1778:1: ( ( ']' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1779:1: ( ']' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1779:1: ( ']' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1780:1: ']'
            {
             before(grammarAccess.getColumnAccess().getRightSquareBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Column__Group__3__Impl3527); 
             after(grammarAccess.getColumnAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1801:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1805:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1806:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03566);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03569);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1813:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1817:1: ( ( () ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1818:1: ( () )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1818:1: ( () )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1819:1: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1820:1: ()
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1822:1: 
            {
            }

             after(grammarAccess.getFieldAccess().getFieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1832:1: rule__Field__Group__1 : rule__Field__Group__1__Impl ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1836:1: ( rule__Field__Group__1__Impl )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1837:2: rule__Field__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13627);
            rule__Field__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1843:1: rule__Field__Group__1__Impl : ( ( rule__Field__ValueAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1847:1: ( ( ( rule__Field__ValueAssignment_1 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1848:1: ( ( rule__Field__ValueAssignment_1 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1848:1: ( ( rule__Field__ValueAssignment_1 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1849:1: ( rule__Field__ValueAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getValueAssignment_1()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1850:1: ( rule__Field__ValueAssignment_1 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1850:2: rule__Field__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__ValueAssignment_1_in_rule__Field__Group__1__Impl3654);
            rule__Field__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Model__InsertSQLAssignment_2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1865:1: rule__Model__InsertSQLAssignment_2 : ( ruleInsertSQL ) ;
    public final void rule__Model__InsertSQLAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1869:1: ( ( ruleInsertSQL ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1870:1: ( ruleInsertSQL )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1870:1: ( ruleInsertSQL )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1871:1: ruleInsertSQL
            {
             before(grammarAccess.getModelAccess().getInsertSQLInsertSQLParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInsertSQL_in_rule__Model__InsertSQLAssignment_23693);
            ruleInsertSQL();

            state._fsp--;

             after(grammarAccess.getModelAccess().getInsertSQLInsertSQLParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__InsertSQLAssignment_2"


    // $ANTLR start "rule__InsertSQL__DatabaseAssignment_2_1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1880:1: rule__InsertSQL__DatabaseAssignment_2_1 : ( ruleDatabase ) ;
    public final void rule__InsertSQL__DatabaseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1884:1: ( ( ruleDatabase ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1885:1: ( ruleDatabase )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1885:1: ( ruleDatabase )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1886:1: ruleDatabase
            {
             before(grammarAccess.getInsertSQLAccess().getDatabaseDatabaseParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDatabase_in_rule__InsertSQL__DatabaseAssignment_2_13724);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getDatabaseDatabaseParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__DatabaseAssignment_2_1"


    // $ANTLR start "rule__InsertSQL__TabAssignment_2_3"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1895:1: rule__InsertSQL__TabAssignment_2_3 : ( ruleTab ) ;
    public final void rule__InsertSQL__TabAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1899:1: ( ( ruleTab ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1900:1: ( ruleTab )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1900:1: ( ruleTab )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1901:1: ruleTab
            {
             before(grammarAccess.getInsertSQLAccess().getTabTabParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleTab_in_rule__InsertSQL__TabAssignment_2_33755);
            ruleTab();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getTabTabParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__TabAssignment_2_3"


    // $ANTLR start "rule__InsertSQL__ColumnsAssignment_2_6"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1910:1: rule__InsertSQL__ColumnsAssignment_2_6 : ( ruleColumn ) ;
    public final void rule__InsertSQL__ColumnsAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1914:1: ( ( ruleColumn ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1915:1: ( ruleColumn )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1915:1: ( ruleColumn )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1916:1: ruleColumn
            {
             before(grammarAccess.getInsertSQLAccess().getColumnsColumnParserRuleCall_2_6_0()); 
            pushFollow(FOLLOW_ruleColumn_in_rule__InsertSQL__ColumnsAssignment_2_63786);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getColumnsColumnParserRuleCall_2_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__ColumnsAssignment_2_6"


    // $ANTLR start "rule__InsertSQL__ColumnsAssignment_2_7_3"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1925:1: rule__InsertSQL__ColumnsAssignment_2_7_3 : ( ruleColumn ) ;
    public final void rule__InsertSQL__ColumnsAssignment_2_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1929:1: ( ( ruleColumn ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1930:1: ( ruleColumn )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1930:1: ( ruleColumn )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1931:1: ruleColumn
            {
             before(grammarAccess.getInsertSQLAccess().getColumnsColumnParserRuleCall_2_7_3_0()); 
            pushFollow(FOLLOW_ruleColumn_in_rule__InsertSQL__ColumnsAssignment_2_7_33817);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getColumnsColumnParserRuleCall_2_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__ColumnsAssignment_2_7_3"


    // $ANTLR start "rule__InsertSQL__FieldsAssignment_2_13"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1940:1: rule__InsertSQL__FieldsAssignment_2_13 : ( ruleField ) ;
    public final void rule__InsertSQL__FieldsAssignment_2_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1944:1: ( ( ruleField ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1945:1: ( ruleField )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1945:1: ( ruleField )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1946:1: ruleField
            {
             before(grammarAccess.getInsertSQLAccess().getFieldsFieldParserRuleCall_2_13_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__InsertSQL__FieldsAssignment_2_133848);
            ruleField();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getFieldsFieldParserRuleCall_2_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__FieldsAssignment_2_13"


    // $ANTLR start "rule__InsertSQL__FieldsAssignment_2_14_3"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1955:1: rule__InsertSQL__FieldsAssignment_2_14_3 : ( ruleField ) ;
    public final void rule__InsertSQL__FieldsAssignment_2_14_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1959:1: ( ( ruleField ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1960:1: ( ruleField )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1960:1: ( ruleField )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1961:1: ruleField
            {
             before(grammarAccess.getInsertSQLAccess().getFieldsFieldParserRuleCall_2_14_3_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__InsertSQL__FieldsAssignment_2_14_33879);
            ruleField();

            state._fsp--;

             after(grammarAccess.getInsertSQLAccess().getFieldsFieldParserRuleCall_2_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertSQL__FieldsAssignment_2_14_3"


    // $ANTLR start "rule__Database__ValueAssignment_2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1970:1: rule__Database__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__Database__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1974:1: ( ( RULE_ID ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1975:1: ( RULE_ID )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1975:1: ( RULE_ID )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1976:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__ValueAssignment_23910); 
             after(grammarAccess.getDatabaseAccess().getValueIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__ValueAssignment_2"


    // $ANTLR start "rule__Tab__ValueAssignment_2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1985:1: rule__Tab__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__Tab__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1989:1: ( ( RULE_ID ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1990:1: ( RULE_ID )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1990:1: ( RULE_ID )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1991:1: RULE_ID
            {
             before(grammarAccess.getTabAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Tab__ValueAssignment_23941); 
             after(grammarAccess.getTabAccess().getValueIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tab__ValueAssignment_2"


    // $ANTLR start "rule__Column__ValueAssignment_2"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2000:1: rule__Column__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__Column__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2004:1: ( ( RULE_ID ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2005:1: ( RULE_ID )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2005:1: ( RULE_ID )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2006:1: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Column__ValueAssignment_23972); 
             after(grammarAccess.getColumnAccess().getValueIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__ValueAssignment_2"


    // $ANTLR start "rule__Field__ValueAssignment_1"
    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2015:1: rule__Field__ValueAssignment_1 : ( ( rule__Field__ValueAlternatives_1_0 ) ) ;
    public final void rule__Field__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2019:1: ( ( ( rule__Field__ValueAlternatives_1_0 ) ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2020:1: ( ( rule__Field__ValueAlternatives_1_0 ) )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2020:1: ( ( rule__Field__ValueAlternatives_1_0 ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2021:1: ( rule__Field__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getFieldAccess().getValueAlternatives_1_0()); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2022:1: ( rule__Field__ValueAlternatives_1_0 )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2022:2: rule__Field__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Field__ValueAlternatives_1_0_in_rule__Field__ValueAssignment_14003);
            rule__Field__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getValueAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertSQL_in_entryRuleInsertSQL121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertSQL128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group__0_in_ruleInsertSQL154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0_in_ruleDatabase214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTab_in_entryRuleTab241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTab248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tab__Group__0_in_ruleTab274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__0_in_ruleColumn334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpace_in_entryRuleSpace421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpace428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSpace456 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleEStringAsInt_in_entryRuleEStringAsInt486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringAsInt493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEStringAsInt519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleother_in_entryRuleother604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleother611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__Alternatives_in_ruleother637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Field__ValueAlternatives_1_0673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ValueAlternatives_1_0_1_in_rule__Field__ValueAlternatives_1_0690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAST_HEXA_VALUE_TO_DATETIME_in_rule__Field__ValueAlternatives_1_0708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringAsInt_in_rule__Field__ValueAlternatives_1_0725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTRING_AS_DOUBLE_in_rule__Field__ValueAlternatives_1_0742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Field__ValueAlternatives_1_0760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_N_SPEC_CHAR_in_rule__Field__ValueAlternatives_1_0_1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_N_ESTRING_in_rule__Field__ValueAlternatives_1_0_1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Other__Alternatives843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OTHER_COMMAND_in_rule__Other__Alternatives860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0890 = new BitSet(new long[]{0x0000000000040C00L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1951 = new BitSet(new long[]{0x0000000000040C00L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleother_in_rule__Model__Group__1__Impl982 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__InsertSQLAssignment_2_in_rule__Model__Group__2__Impl1040 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group__0__Impl_in_rule__InsertSQL__Group__01077 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group__1_in_rule__InsertSQL__Group__01080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group__1__Impl_in_rule__InsertSQL__Group__11138 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group__2_in_rule__InsertSQL__Group__11141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__InsertSQL__Group__1__Impl1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group__2__Impl_in_rule__InsertSQL__Group__21200 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group__3_in_rule__InsertSQL__Group__21203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__0_in_rule__InsertSQL__Group__2__Impl1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group__3__Impl_in_rule__InsertSQL__Group__31260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleother_in_rule__InsertSQL__Group__3__Impl1288 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__0__Impl_in_rule__InsertSQL__Group_2__01327 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__1_in_rule__InsertSQL__Group_2__01330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2__0__Impl1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__1__Impl_in_rule__InsertSQL__Group_2__11386 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__2_in_rule__InsertSQL__Group_2__11389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__DatabaseAssignment_2_1_in_rule__InsertSQL__Group_2__1__Impl1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__2__Impl_in_rule__InsertSQL__Group_2__21446 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__3_in_rule__InsertSQL__Group_2__21449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__InsertSQL__Group_2__2__Impl1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__3__Impl_in_rule__InsertSQL__Group_2__31508 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__4_in_rule__InsertSQL__Group_2__31511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__TabAssignment_2_3_in_rule__InsertSQL__Group_2__3__Impl1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__4__Impl_in_rule__InsertSQL__Group_2__41568 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__5_in_rule__InsertSQL__Group_2__41571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2__4__Impl1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__5__Impl_in_rule__InsertSQL__Group_2__51627 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__6_in_rule__InsertSQL__Group_2__51630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__InsertSQL__Group_2__5__Impl1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__6__Impl_in_rule__InsertSQL__Group_2__61689 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__7_in_rule__InsertSQL__Group_2__61692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__ColumnsAssignment_2_6_in_rule__InsertSQL__Group_2__6__Impl1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__7__Impl_in_rule__InsertSQL__Group_2__71749 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__8_in_rule__InsertSQL__Group_2__71752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_7__0_in_rule__InsertSQL__Group_2__7__Impl1779 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__8__Impl_in_rule__InsertSQL__Group_2__81810 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__9_in_rule__InsertSQL__Group_2__81813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InsertSQL__Group_2__8__Impl1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__9__Impl_in_rule__InsertSQL__Group_2__91872 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__10_in_rule__InsertSQL__Group_2__91875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2__9__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__10__Impl_in_rule__InsertSQL__Group_2__101931 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__11_in_rule__InsertSQL__Group_2__101934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__InsertSQL__Group_2__10__Impl1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__11__Impl_in_rule__InsertSQL__Group_2__111993 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__12_in_rule__InsertSQL__Group_2__111996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2__11__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__12__Impl_in_rule__InsertSQL__Group_2__122052 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__13_in_rule__InsertSQL__Group_2__122055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__InsertSQL__Group_2__12__Impl2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__13__Impl_in_rule__InsertSQL__Group_2__132114 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__14_in_rule__InsertSQL__Group_2__132117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__FieldsAssignment_2_13_in_rule__InsertSQL__Group_2__13__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__14__Impl_in_rule__InsertSQL__Group_2__142174 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__15_in_rule__InsertSQL__Group_2__142177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_14__0_in_rule__InsertSQL__Group_2__14__Impl2204 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2__15__Impl_in_rule__InsertSQL__Group_2__152235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InsertSQL__Group_2__15__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_7__0__Impl_in_rule__InsertSQL__Group_2_7__02326 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_7__1_in_rule__InsertSQL__Group_2_7__02329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2_7__0__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_7__1__Impl_in_rule__InsertSQL__Group_2_7__12385 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_7__2_in_rule__InsertSQL__Group_2_7__12388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__InsertSQL__Group_2_7__1__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_7__2__Impl_in_rule__InsertSQL__Group_2_7__22447 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_7__3_in_rule__InsertSQL__Group_2_7__22450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2_7__2__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_7__3__Impl_in_rule__InsertSQL__Group_2_7__32506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__ColumnsAssignment_2_7_3_in_rule__InsertSQL__Group_2_7__3__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_14__0__Impl_in_rule__InsertSQL__Group_2_14__02571 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_14__1_in_rule__InsertSQL__Group_2_14__02574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2_14__0__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_14__1__Impl_in_rule__InsertSQL__Group_2_14__12630 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_14__2_in_rule__InsertSQL__Group_2_14__12633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__InsertSQL__Group_2_14__1__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_14__2__Impl_in_rule__InsertSQL__Group_2_14__22692 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_14__3_in_rule__InsertSQL__Group_2_14__22695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpace_in_rule__InsertSQL__Group_2_14__2__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__Group_2_14__3__Impl_in_rule__InsertSQL__Group_2_14__32751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertSQL__FieldsAssignment_2_14_3_in_rule__InsertSQL__Group_2_14__3__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__02816 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Database__Group__1_in_rule__Database__Group__02819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__12877 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Database__Group__2_in_rule__Database__Group__12880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Database__Group__1__Impl2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__22939 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Database__Group__3_in_rule__Database__Group__22942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__ValueAssignment_2_in_rule__Database__Group__2__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__32999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Database__Group__3__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tab__Group__0__Impl_in_rule__Tab__Group__03066 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Tab__Group__1_in_rule__Tab__Group__03069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tab__Group__1__Impl_in_rule__Tab__Group__13127 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Tab__Group__2_in_rule__Tab__Group__13130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Tab__Group__1__Impl3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tab__Group__2__Impl_in_rule__Tab__Group__23189 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Tab__Group__3_in_rule__Tab__Group__23192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tab__ValueAssignment_2_in_rule__Tab__Group__2__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tab__Group__3__Impl_in_rule__Tab__Group__33249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Tab__Group__3__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__03316 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Column__Group__1_in_rule__Column__Group__03319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__13377 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Column__Group__2_in_rule__Column__Group__13380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Column__Group__1__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__23439 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Column__Group__3_in_rule__Column__Group__23442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__ValueAssignment_2_in_rule__Column__Group__2__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__33499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Column__Group__3__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03566 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ValueAssignment_1_in_rule__Field__Group__1__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertSQL_in_rule__Model__InsertSQLAssignment_23693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_rule__InsertSQL__DatabaseAssignment_2_13724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTab_in_rule__InsertSQL__TabAssignment_2_33755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_rule__InsertSQL__ColumnsAssignment_2_63786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_rule__InsertSQL__ColumnsAssignment_2_7_33817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__InsertSQL__FieldsAssignment_2_133848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__InsertSQL__FieldsAssignment_2_14_33879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__ValueAssignment_23910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Tab__ValueAssignment_23941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Column__ValueAssignment_23972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ValueAlternatives_1_0_in_rule__Field__ValueAssignment_14003 = new BitSet(new long[]{0x0000000000000002L});

}