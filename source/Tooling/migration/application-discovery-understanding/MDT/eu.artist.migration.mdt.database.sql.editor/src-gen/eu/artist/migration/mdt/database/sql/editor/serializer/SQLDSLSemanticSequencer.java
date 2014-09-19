package eu.artist.migration.mdt.database.sql.editor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Column;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Database;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Field;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Model;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Tab;
import eu.artist.migration.mdt.database.sql.editor.services.SQLDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SQLDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SQLDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == InsertSQLDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case InsertSQLDSLPackage.COLUMN:
				if(context == grammarAccess.getColumnRule()) {
					sequence_Column(context, (Column) semanticObject); 
					return; 
				}
				else break;
			case InsertSQLDSLPackage.DATABASE:
				if(context == grammarAccess.getDatabaseRule()) {
					sequence_Database(context, (Database) semanticObject); 
					return; 
				}
				else break;
			case InsertSQLDSLPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case InsertSQLDSLPackage.INSERT_SQL:
				if(context == grammarAccess.getInsertSQLRule()) {
					sequence_InsertSQL(context, (InsertSQL) semanticObject); 
					return; 
				}
				else break;
			case InsertSQLDSLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case InsertSQLDSLPackage.TAB:
				if(context == grammarAccess.getTabRule()) {
					sequence_Tab(context, (Tab) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_Column(EObject context, Column semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InsertSQLDSLPackage.Literals.COLUMN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InsertSQLDSLPackage.Literals.COLUMN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColumnAccess().getValueIDTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_Database(EObject context, Database semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InsertSQLDSLPackage.Literals.DATABASE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InsertSQLDSLPackage.Literals.DATABASE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDatabaseAccess().getValueIDTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value=EString | 
	 *         value=N_SPEC_CHAR | 
	 *         value=N_ESTRING | 
	 *         value=CAST_HEXA_VALUE_TO_DATETIME | 
	 *         value=EStringAsInt | 
	 *         value=ESTRING_AS_DOUBLE | 
	 *         value='NULL'
	 *     )
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         database=Database 
	 *         tab=Tab 
	 *         columns+=Column 
	 *         columns+=Column* 
	 *         fields+=Field 
	 *         fields+=Field*
	 *     )
	 */
	protected void sequence_InsertSQL(EObject context, InsertSQL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (insertSQL+=InsertSQL*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_Tab(EObject context, Tab semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InsertSQLDSLPackage.Literals.TAB__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InsertSQLDSLPackage.Literals.TAB__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTabAccess().getValueIDTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
}
