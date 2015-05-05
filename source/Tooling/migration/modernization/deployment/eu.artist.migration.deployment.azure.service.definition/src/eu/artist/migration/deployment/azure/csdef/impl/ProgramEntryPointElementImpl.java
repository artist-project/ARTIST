/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Entry Point Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ProgramEntryPointElementImpl#getCommandLine <em>Command Line</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ProgramEntryPointElementImpl#isSetReadyOnProcessStart <em>Set Ready On Process Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramEntryPointElementImpl extends MinimalEObjectImpl.Container implements ProgramEntryPointElement {
	/**
	 * The default value of the '{@link #getCommandLine() <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLine()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandLine() <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLine()
	 * @generated
	 * @ordered
	 */
	protected String commandLine = COMMAND_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSetReadyOnProcessStart() <em>Set Ready On Process Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadyOnProcessStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SET_READY_ON_PROCESS_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSetReadyOnProcessStart() <em>Set Ready On Process Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadyOnProcessStart()
	 * @generated
	 * @ordered
	 */
	protected boolean setReadyOnProcessStart = SET_READY_ON_PROCESS_START_EDEFAULT;

	/**
	 * This is true if the Set Ready On Process Start attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean setReadyOnProcessStartESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramEntryPointElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.PROGRAM_ENTRY_POINT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommandLine() {
		return commandLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandLine(String newCommandLine) {
		String oldCommandLine = commandLine;
		commandLine = newCommandLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT__COMMAND_LINE, oldCommandLine, commandLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadyOnProcessStart() {
		return setReadyOnProcessStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetReadyOnProcessStart(boolean newSetReadyOnProcessStart) {
		boolean oldSetReadyOnProcessStart = setReadyOnProcessStart;
		setReadyOnProcessStart = newSetReadyOnProcessStart;
		boolean oldSetReadyOnProcessStartESet = setReadyOnProcessStartESet;
		setReadyOnProcessStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT__SET_READY_ON_PROCESS_START, oldSetReadyOnProcessStart, setReadyOnProcessStart, !oldSetReadyOnProcessStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSetReadyOnProcessStart() {
		boolean oldSetReadyOnProcessStart = setReadyOnProcessStart;
		boolean oldSetReadyOnProcessStartESet = setReadyOnProcessStartESet;
		setReadyOnProcessStart = SET_READY_ON_PROCESS_START_EDEFAULT;
		setReadyOnProcessStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT__SET_READY_ON_PROCESS_START, oldSetReadyOnProcessStart, SET_READY_ON_PROCESS_START_EDEFAULT, oldSetReadyOnProcessStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSetReadyOnProcessStart() {
		return setReadyOnProcessStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT__COMMAND_LINE:
				return getCommandLine();
			case AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT__SET_READY_ON_PROCESS_START:
				return isSetReadyOnProcessStart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT__COMMAND_LINE:
				setCommandLine((String)newValue);
				return;
			case AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT__SET_READY_ON_PROCESS_START:
				setSetReadyOnProcessStart((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT__COMMAND_LINE:
				setCommandLine(COMMAND_LINE_EDEFAULT);
				return;
			case AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT__SET_READY_ON_PROCESS_START:
				unsetSetReadyOnProcessStart();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT__COMMAND_LINE:
				return COMMAND_LINE_EDEFAULT == null ? commandLine != null : !COMMAND_LINE_EDEFAULT.equals(commandLine);
			case AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT__SET_READY_ON_PROCESS_START:
				return isSetSetReadyOnProcessStart();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (commandLine: ");
		result.append(commandLine);
		result.append(", setReadyOnProcessStart: ");
		if (setReadyOnProcessStartESet) result.append(setReadyOnProcessStart); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProgramEntryPointElementImpl
