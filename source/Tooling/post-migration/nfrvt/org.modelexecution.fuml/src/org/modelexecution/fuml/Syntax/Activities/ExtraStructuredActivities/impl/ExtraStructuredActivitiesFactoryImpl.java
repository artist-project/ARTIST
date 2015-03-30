/**
 */
package org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionKind;
import org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode;
import org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion;
import org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesFactory;
import org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtraStructuredActivitiesFactoryImpl extends EFactoryImpl implements ExtraStructuredActivitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtraStructuredActivitiesFactory init() {
		try {
			ExtraStructuredActivitiesFactory theExtraStructuredActivitiesFactory = (ExtraStructuredActivitiesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.modelexecution.org/fuml/syntax/activities/extrastructuredactivities"); 
			if (theExtraStructuredActivitiesFactory != null) {
				return theExtraStructuredActivitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtraStructuredActivitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraStructuredActivitiesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExtraStructuredActivitiesPackage.EXPANSION_NODE: return createExpansionNode();
			case ExtraStructuredActivitiesPackage.EXPANSION_REGION: return createExpansionRegion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExtraStructuredActivitiesPackage.EXPANSION_KIND:
				return createExpansionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExtraStructuredActivitiesPackage.EXPANSION_KIND:
				return convertExpansionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode createExpansionNode() {
		ExpansionNodeImpl expansionNode = new ExpansionNodeImpl();
		return expansionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion createExpansionRegion() {
		ExpansionRegionImpl expansionRegion = new ExpansionRegionImpl();
		return expansionRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind createExpansionKindFromString(EDataType eDataType, String initialValue) {
		ExpansionKind result = ExpansionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpansionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraStructuredActivitiesPackage getExtraStructuredActivitiesPackage() {
		return (ExtraStructuredActivitiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtraStructuredActivitiesPackage getPackage() {
		return ExtraStructuredActivitiesPackage.eINSTANCE;
	}

} //ExtraStructuredActivitiesFactoryImpl
