/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.henshin.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.Unit#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Unit#getParameterMappings <em>Parameter Mappings</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Unit#isActivated <em>Activated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.model.HenshinPackage#getUnit()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='parameterNamesUnique parameterMappingsPointToDirectSubUnit'"
 * @generated
 */
public interface Unit extends NamedElement {
	
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.model.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.henshin.model.Parameter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getUnit_Parameters()
	 * @see org.eclipse.emf.henshin.model.Parameter#getUnit
	 * @model opposite="unit" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.model.ParameterMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mappings</em>' containment reference list.
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getUnit_ParameterMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterMapping> getParameterMappings();

	/**
	 * Returns the value of the '<em><b>Activated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activated</em>' attribute.
	 * @see #setActivated(boolean)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getUnit_Activated()
	 * @model default="true"
	 * @generated
	 */
	boolean isActivated();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Unit#isActivated <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activated</em>' attribute.
	 * @see #isActivated()
	 * @generated
	 */
	void setActivated(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Module getModule();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Unit> getSubUnits(boolean deep);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Parameter getParameter(String parameter);

} // Unit
