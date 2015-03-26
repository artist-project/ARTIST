/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Fx Assembly Entry Point Element</b></em>'.
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
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement#getAssemblyName <em>Assembly Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement#getTargetFrameworkVersion <em>Target Framework Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getNetFxAssemblyEntryPointElement()
 * @model extendedMetaData="name='NetFxAssemblyEntryPointElement' kind='empty'"
 * @generated
 */
public interface NetFxAssemblyEntryPointElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Name of assembly to load.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assembly Name</em>' attribute.
	 * @see #setAssemblyName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getNetFxAssemblyEntryPointElement_AssemblyName()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NonEmptyString" required="true"
	 *        extendedMetaData="kind='attribute' name='assemblyName'"
	 * @generated
	 */
	String getAssemblyName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement#getAssemblyName <em>Assembly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Name</em>' attribute.
	 * @see #getAssemblyName()
	 * @generated
	 */
	void setAssemblyName(String value);

	/**
	 * Returns the value of the '<em><b>Target Framework Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           .NET Framework Version
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Framework Version</em>' attribute.
	 * @see #setTargetFrameworkVersion(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getNetFxAssemblyEntryPointElement_TargetFrameworkVersion()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NonEmptyString"
	 *        extendedMetaData="kind='attribute' name='targetFrameworkVersion'"
	 * @generated
	 */
	String getTargetFrameworkVersion();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement#getTargetFrameworkVersion <em>Target Framework Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Framework Version</em>' attribute.
	 * @see #getTargetFrameworkVersion()
	 * @generated
	 */
	void setTargetFrameworkVersion(String value);

} // NetFxAssemblyEntryPointElement
