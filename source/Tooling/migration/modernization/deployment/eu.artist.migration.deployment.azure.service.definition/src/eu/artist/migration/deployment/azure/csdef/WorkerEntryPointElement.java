/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worker Entry Point Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Defines the entrypoint of a role.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement#getProgramEntryPoint <em>Program Entry Point</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement#getNetFxEntryPoint <em>Net Fx Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWorkerEntryPointElement()
 * @model extendedMetaData="name='WorkerEntryPointElement' kind='elementOnly'"
 * @generated
 */
public interface WorkerEntryPointElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Program Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Entry Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Entry Point</em>' containment reference.
	 * @see #setProgramEntryPoint(ProgramEntryPointElement)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWorkerEntryPointElement_ProgramEntryPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramEntryPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramEntryPointElement getProgramEntryPoint();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement#getProgramEntryPoint <em>Program Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Entry Point</em>' containment reference.
	 * @see #getProgramEntryPoint()
	 * @generated
	 */
	void setProgramEntryPoint(ProgramEntryPointElement value);

	/**
	 * Returns the value of the '<em><b>Net Fx Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Fx Entry Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Fx Entry Point</em>' containment reference.
	 * @see #setNetFxEntryPoint(NetFxAssemblyEntryPointElement)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWorkerEntryPointElement_NetFxEntryPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NetFxEntryPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	NetFxAssemblyEntryPointElement getNetFxEntryPoint();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement#getNetFxEntryPoint <em>Net Fx Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Fx Entry Point</em>' containment reference.
	 * @see #getNetFxEntryPoint()
	 * @generated
	 */
	void setNetFxEntryPoint(NetFxAssemblyEntryPointElement value);

} // WorkerEntryPointElement
