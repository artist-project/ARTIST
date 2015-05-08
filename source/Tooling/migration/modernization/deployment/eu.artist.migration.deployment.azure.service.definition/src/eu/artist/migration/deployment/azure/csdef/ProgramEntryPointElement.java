/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Entry Point Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Defines the entry point of a role.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement#getCommandLine <em>Command Line</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement#isSetReadyOnProcessStart <em>Set Ready On Process Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getProgramEntryPointElement()
 * @model extendedMetaData="name='ProgramEntryPointElement' kind='empty'"
 * @generated
 */
public interface ProgramEntryPointElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Command Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Command line of program to start.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Line</em>' attribute.
	 * @see #setCommandLine(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getProgramEntryPointElement_CommandLine()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NonEmptyString" required="true"
	 *        extendedMetaData="kind='attribute' name='commandLine'"
	 * @generated
	 */
	String getCommandLine();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement#getCommandLine <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Line</em>' attribute.
	 * @see #getCommandLine()
	 * @generated
	 */
	void setCommandLine(String value);

	/**
	 * Returns the value of the '<em><b>Set Ready On Process Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The role is not started until the program explicitly signals started.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Ready On Process Start</em>' attribute.
	 * @see #isSetSetReadyOnProcessStart()
	 * @see #unsetSetReadyOnProcessStart()
	 * @see #setSetReadyOnProcessStart(boolean)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getProgramEntryPointElement_SetReadyOnProcessStart()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='setReadyOnProcessStart'"
	 * @generated
	 */
	boolean isSetReadyOnProcessStart();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement#isSetReadyOnProcessStart <em>Set Ready On Process Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Ready On Process Start</em>' attribute.
	 * @see #isSetSetReadyOnProcessStart()
	 * @see #unsetSetReadyOnProcessStart()
	 * @see #isSetReadyOnProcessStart()
	 * @generated
	 */
	void setSetReadyOnProcessStart(boolean value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement#isSetReadyOnProcessStart <em>Set Ready On Process Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSetReadyOnProcessStart()
	 * @see #isSetReadyOnProcessStart()
	 * @see #setSetReadyOnProcessStart(boolean)
	 * @generated
	 */
	void unsetSetReadyOnProcessStart();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement#isSetReadyOnProcessStart <em>Set Ready On Process Start</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Set Ready On Process Start</em>' attribute is set.
	 * @see #unsetSetReadyOnProcessStart()
	 * @see #isSetReadyOnProcessStart()
	 * @see #setSetReadyOnProcessStart(boolean)
	 * @generated
	 */
	boolean isSetSetReadyOnProcessStart();

} // ProgramEntryPointElement
