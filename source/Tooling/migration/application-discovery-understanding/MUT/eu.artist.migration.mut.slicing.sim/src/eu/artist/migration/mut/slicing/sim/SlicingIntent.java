/**
 */
package eu.artist.migration.mut.slicing.sim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slicing Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getInject <em>Inject</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getExtract <em>Extract</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent()
 * @model
 * @generated
 */
public interface SlicingIntent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Inject</b></em>' attribute list.
	 * The list contents are of type {@link eu.artist.migration.mut.slicing.sim.ModelType}.
	 * The literals are from the enumeration {@link eu.artist.migration.mut.slicing.sim.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inject</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inject</em>' attribute list.
	 * @see eu.artist.migration.mut.slicing.sim.ModelType
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent_Inject()
	 * @model required="true"
	 * @generated
	 */
	EList<ModelType> getInject();

	/**
	 * Returns the value of the '<em><b>Extract</b></em>' attribute list.
	 * The list contents are of type {@link eu.artist.migration.mut.slicing.sim.ModelType}.
	 * The literals are from the enumeration {@link eu.artist.migration.mut.slicing.sim.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extract</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extract</em>' attribute list.
	 * @see eu.artist.migration.mut.slicing.sim.ModelType
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent_Extract()
	 * @model required="true"
	 * @generated
	 */
	EList<ModelType> getExtract();

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.mut.slicing.sim.SlicingCriterion}.
	 * It is bidirectional and its opposite is '{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent_Criteria()
	 * @see eu.artist.migration.mut.slicing.sim.SlicingCriterion#getIntent
	 * @model opposite="intent" containment="true" required="true"
	 * @generated
	 */
	EList<SlicingCriterion> getCriteria();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(SlicingConfiguration)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent_Configuration()
	 * @see eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getIntent
	 * @model opposite="intent" containment="true"
	 * @generated
	 */
	SlicingConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(SlicingConfiguration value);

} // SlicingIntent
