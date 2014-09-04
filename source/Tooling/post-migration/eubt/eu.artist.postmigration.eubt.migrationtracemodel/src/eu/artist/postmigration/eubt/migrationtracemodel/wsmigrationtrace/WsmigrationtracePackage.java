/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/**
 */
package eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtraceFactory
 * @model kind="package"
 * @generated
 */
public interface WsmigrationtracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wsmigrationtrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://wsmigrationtrace/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wsmigrationtrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WsmigrationtracePackage eINSTANCE = eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TraceImpl
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NAMESPACES = 1;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.ElementImpl
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Element Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_NAMESPACE = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceElementImpl <em>Source Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceElementImpl
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getSourceElement()
	 * @generated
	 */
	int SOURCE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__ELEMENT_NAME = ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Element Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__ELEMENT_NAMESPACE = ELEMENT__ELEMENT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__TARGET_ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__PARAMETERS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Source Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__CHILD_SOURCE_ELEMENT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TargetElementImpl <em>Target Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TargetElementImpl
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getTargetElement()
	 * @generated
	 */
	int TARGET_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__ELEMENT_NAME = ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Element Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__ELEMENT_NAMESPACE = ELEMENT__ELEMENT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__PARAMETERS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Target Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__CHILD_TARGET_ELEMENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.ParameterImpl
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parameter Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_NAMESPACE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceParameterImpl <em>Source Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceParameterImpl
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getSourceParameter()
	 * @generated
	 */
	int SOURCE_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER__PARAMETER_NAME = PARAMETER__PARAMETER_NAME;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER__PARAMETER_TYPE = PARAMETER__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Parameter Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER__PARAMETER_NAMESPACE = PARAMETER__PARAMETER_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Target Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER__TARGET_PARAMETER = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Source Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER__CHILD_SOURCE_PARAMETER = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Source Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TargetParameterImpl <em>Target Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TargetParameterImpl
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getTargetParameter()
	 * @generated
	 */
	int TARGET_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER__PARAMETER_NAME = PARAMETER__PARAMETER_NAME;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER__PARAMETER_TYPE = PARAMETER__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Parameter Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER__PARAMETER_NAMESPACE = PARAMETER__PARAMETER_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Child Target Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER__CHILD_TARGET_PARAMETER = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Target Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.NamespaceImpl
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 7;

	/**
	 * The feature id for the '<em><b>Namespace URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAMESPACE_URI = 0;

	/**
	 * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAMESPACE_PREFIX = 1;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Trace#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Trace#getElements()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Trace#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespaces</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Trace#getNamespaces()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Namespaces();

	/**
	 * Returns the meta object for class '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Element#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Element#getElementName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ElementName();

	/**
	 * Returns the meta object for the reference '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Element#getElementNamespace <em>Element Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Namespace</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Element#getElementNamespace()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ElementNamespace();

	/**
	 * Returns the meta object for class '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement
	 * @generated
	 */
	EClass getSourceElement();

	/**
	 * Returns the meta object for the reference list '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Element</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement#getTargetElement()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_TargetElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement#getParameters()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement#getChildSourceElement <em>Child Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Source Element</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement#getChildSourceElement()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_ChildSourceElement();

	/**
	 * Returns the meta object for class '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Element</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement
	 * @generated
	 */
	EClass getTargetElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement#getParameters()
	 * @see #getTargetElement()
	 * @generated
	 */
	EReference getTargetElement_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement#getChildTargetElement <em>Child Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Target Element</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement#getChildTargetElement()
	 * @see #getTargetElement()
	 * @generated
	 */
	EReference getTargetElement_ChildTargetElement();

	/**
	 * Returns the meta object for class '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Parameter#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Parameter#getParameterName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Parameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Parameter#getParameterType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterType();

	/**
	 * Returns the meta object for the reference '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Parameter#getParameterNamespace <em>Parameter Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Namespace</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Parameter#getParameterNamespace()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterNamespace();

	/**
	 * Returns the meta object for class '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter <em>Source Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Parameter</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter
	 * @generated
	 */
	EClass getSourceParameter();

	/**
	 * Returns the meta object for the reference list '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter#getTargetParameter <em>Target Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Parameter</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter#getTargetParameter()
	 * @see #getSourceParameter()
	 * @generated
	 */
	EReference getSourceParameter_TargetParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter#getChildSourceParameter <em>Child Source Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Source Parameter</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter#getChildSourceParameter()
	 * @see #getSourceParameter()
	 * @generated
	 */
	EReference getSourceParameter_ChildSourceParameter();

	/**
	 * Returns the meta object for class '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetParameter <em>Target Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Parameter</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetParameter
	 * @generated
	 */
	EClass getTargetParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetParameter#getChildTargetParameter <em>Child Target Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Target Parameter</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetParameter#getChildTargetParameter()
	 * @see #getTargetParameter()
	 * @generated
	 */
	EReference getTargetParameter_ChildTargetParameter();

	/**
	 * Returns the meta object for class '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Namespace#getNamespaceURI <em>Namespace URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace URI</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Namespace#getNamespaceURI()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_NamespaceURI();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Namespace#getNamespacePrefix <em>Namespace Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Namespace#getNamespacePrefix()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_NamespacePrefix();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WsmigrationtraceFactory getWsmigrationtraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TraceImpl
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ELEMENTS = eINSTANCE.getTrace_Elements();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__NAMESPACES = eINSTANCE.getTrace_Namespaces();

		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.ElementImpl
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ELEMENT_NAME = eINSTANCE.getElement_ElementName();

		/**
		 * The meta object literal for the '<em><b>Element Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ELEMENT_NAMESPACE = eINSTANCE.getElement_ElementNamespace();

		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceElementImpl <em>Source Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceElementImpl
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getSourceElement()
		 * @generated
		 */
		EClass SOURCE_ELEMENT = eINSTANCE.getSourceElement();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__TARGET_ELEMENT = eINSTANCE.getSourceElement_TargetElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__PARAMETERS = eINSTANCE.getSourceElement_Parameters();

		/**
		 * The meta object literal for the '<em><b>Child Source Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__CHILD_SOURCE_ELEMENT = eINSTANCE.getSourceElement_ChildSourceElement();

		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TargetElementImpl <em>Target Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TargetElementImpl
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getTargetElement()
		 * @generated
		 */
		EClass TARGET_ELEMENT = eINSTANCE.getTargetElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT__PARAMETERS = eINSTANCE.getTargetElement_Parameters();

		/**
		 * The meta object literal for the '<em><b>Child Target Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT__CHILD_TARGET_ELEMENT = eINSTANCE.getTargetElement_ChildTargetElement();

		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.ParameterImpl
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_NAME = eINSTANCE.getParameter_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_TYPE = eINSTANCE.getParameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Parameter Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_NAMESPACE = eINSTANCE.getParameter_ParameterNamespace();

		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceParameterImpl <em>Source Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceParameterImpl
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getSourceParameter()
		 * @generated
		 */
		EClass SOURCE_PARAMETER = eINSTANCE.getSourceParameter();

		/**
		 * The meta object literal for the '<em><b>Target Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_PARAMETER__TARGET_PARAMETER = eINSTANCE.getSourceParameter_TargetParameter();

		/**
		 * The meta object literal for the '<em><b>Child Source Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_PARAMETER__CHILD_SOURCE_PARAMETER = eINSTANCE.getSourceParameter_ChildSourceParameter();

		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TargetParameterImpl <em>Target Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TargetParameterImpl
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getTargetParameter()
		 * @generated
		 */
		EClass TARGET_PARAMETER = eINSTANCE.getTargetParameter();

		/**
		 * The meta object literal for the '<em><b>Child Target Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PARAMETER__CHILD_TARGET_PARAMETER = eINSTANCE.getTargetParameter_ChildTargetParameter();

		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.NamespaceImpl
		 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.WsmigrationtracePackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Namespace URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__NAMESPACE_URI = eINSTANCE.getNamespace_NamespaceURI();

		/**
		 * The meta object literal for the '<em><b>Namespace Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__NAMESPACE_PREFIX = eINSTANCE.getNamespace_NamespacePrefix();

	}

} //WsmigrationtracePackage
