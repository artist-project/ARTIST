/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.ContentElement;
import eu.artist.migration.deployment.azure.csdef.SourceDirectoryElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ContentElementImpl#getSourceDirectory <em>Source Directory</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ContentElementImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentElementImpl extends MinimalEObjectImpl.Container implements ContentElement {
	/**
	 * The cached value of the '{@link #getSourceDirectory() <em>Source Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDirectory()
	 * @generated
	 * @ordered
	 */
	protected SourceDirectoryElement sourceDirectory;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.CONTENT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDirectoryElement getSourceDirectory() {
		return sourceDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceDirectory(SourceDirectoryElement newSourceDirectory, NotificationChain msgs) {
		SourceDirectoryElement oldSourceDirectory = sourceDirectory;
		sourceDirectory = newSourceDirectory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.CONTENT_ELEMENT__SOURCE_DIRECTORY, oldSourceDirectory, newSourceDirectory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDirectory(SourceDirectoryElement newSourceDirectory) {
		if (newSourceDirectory != sourceDirectory) {
			NotificationChain msgs = null;
			if (sourceDirectory != null)
				msgs = ((InternalEObject)sourceDirectory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.CONTENT_ELEMENT__SOURCE_DIRECTORY, null, msgs);
			if (newSourceDirectory != null)
				msgs = ((InternalEObject)newSourceDirectory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.CONTENT_ELEMENT__SOURCE_DIRECTORY, null, msgs);
			msgs = basicSetSourceDirectory(newSourceDirectory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.CONTENT_ELEMENT__SOURCE_DIRECTORY, newSourceDirectory, newSourceDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.CONTENT_ELEMENT__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.CONTENT_ELEMENT__SOURCE_DIRECTORY:
				return basicSetSourceDirectory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSDefPackage.CONTENT_ELEMENT__SOURCE_DIRECTORY:
				return getSourceDirectory();
			case AzureCSDefPackage.CONTENT_ELEMENT__DESTINATION:
				return getDestination();
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
			case AzureCSDefPackage.CONTENT_ELEMENT__SOURCE_DIRECTORY:
				setSourceDirectory((SourceDirectoryElement)newValue);
				return;
			case AzureCSDefPackage.CONTENT_ELEMENT__DESTINATION:
				setDestination((String)newValue);
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
			case AzureCSDefPackage.CONTENT_ELEMENT__SOURCE_DIRECTORY:
				setSourceDirectory((SourceDirectoryElement)null);
				return;
			case AzureCSDefPackage.CONTENT_ELEMENT__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
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
			case AzureCSDefPackage.CONTENT_ELEMENT__SOURCE_DIRECTORY:
				return sourceDirectory != null;
			case AzureCSDefPackage.CONTENT_ELEMENT__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
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
		result.append(" (destination: ");
		result.append(destination);
		result.append(')');
		return result.toString();
	}

} //ContentElementImpl
