/**
 */
package org.modelexecution.fuml.Syntax.Actions.IntermediateActions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.Action;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateLinkAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyLinkAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadLinkAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadSelfAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.StructuralFeatureAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteLinkAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteStructuralFeatureAction;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Element;
import org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement;
import org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage
 * @generated
 */
public class IntermediateActionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediateActionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntermediateActionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateActionsSwitch<Adapter> modelSwitch =
		new IntermediateActionsSwitch<Adapter>() {
			@Override
			public Adapter caseStructuralFeatureAction(StructuralFeatureAction object) {
				return createStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseTestIdentityAction(TestIdentityAction object) {
				return createTestIdentityActionAdapter();
			}
			@Override
			public Adapter caseValueSpecificationAction(ValueSpecificationAction object) {
				return createValueSpecificationActionAdapter();
			}
			@Override
			public Adapter caseWriteLinkAction(WriteLinkAction object) {
				return createWriteLinkActionAdapter();
			}
			@Override
			public Adapter caseLinkAction(LinkAction object) {
				return createLinkActionAdapter();
			}
			@Override
			public Adapter caseLinkEndData(LinkEndData object) {
				return createLinkEndDataAdapter();
			}
			@Override
			public Adapter caseWriteStructuralFeatureAction(WriteStructuralFeatureAction object) {
				return createWriteStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction object) {
				return createRemoveStructuralFeatureValueActionAdapter();
			}
			@Override
			public Adapter caseReadLinkAction(ReadLinkAction object) {
				return createReadLinkActionAdapter();
			}
			@Override
			public Adapter caseReadSelfAction(ReadSelfAction object) {
				return createReadSelfActionAdapter();
			}
			@Override
			public Adapter caseReadStructuralFeatureAction(ReadStructuralFeatureAction object) {
				return createReadStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseLinkEndCreationData(LinkEndCreationData object) {
				return createLinkEndCreationDataAdapter();
			}
			@Override
			public Adapter caseLinkEndDestructionData(LinkEndDestructionData object) {
				return createLinkEndDestructionDataAdapter();
			}
			@Override
			public Adapter caseClearAssociationAction(ClearAssociationAction object) {
				return createClearAssociationActionAdapter();
			}
			@Override
			public Adapter caseClearStructuralFeatureAction(ClearStructuralFeatureAction object) {
				return createClearStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseCreateLinkAction(CreateLinkAction object) {
				return createCreateLinkActionAdapter();
			}
			@Override
			public Adapter caseCreateObjectAction(CreateObjectAction object) {
				return createCreateObjectActionAdapter();
			}
			@Override
			public Adapter caseDestroyLinkAction(DestroyLinkAction object) {
				return createDestroyLinkActionAdapter();
			}
			@Override
			public Adapter caseDestroyObjectAction(DestroyObjectAction object) {
				return createDestroyObjectActionAdapter();
			}
			@Override
			public Adapter caseAddStructuralFeatureValueAction(AddStructuralFeatureValueAction object) {
				return createAddStructuralFeatureValueActionAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseRedefinableElement(RedefinableElement object) {
				return createRedefinableElementAdapter();
			}
			@Override
			public Adapter caseActivityNode(ActivityNode object) {
				return createActivityNodeAdapter();
			}
			@Override
			public Adapter caseExecutableNode(ExecutableNode object) {
				return createExecutableNodeAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.StructuralFeatureAction <em>Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.StructuralFeatureAction
	 * @generated
	 */
	public Adapter createStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction <em>Test Identity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction
	 * @generated
	 */
	public Adapter createTestIdentityActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction <em>Value Specification Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction
	 * @generated
	 */
	public Adapter createValueSpecificationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteLinkAction <em>Write Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteLinkAction
	 * @generated
	 */
	public Adapter createWriteLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction <em>Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction
	 * @generated
	 */
	public Adapter createLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData <em>Link End Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData
	 * @generated
	 */
	public Adapter createLinkEndDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteStructuralFeatureAction <em>Write Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteStructuralFeatureAction
	 * @generated
	 */
	public Adapter createWriteStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction <em>Remove Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction
	 * @generated
	 */
	public Adapter createRemoveStructuralFeatureValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadLinkAction <em>Read Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadLinkAction
	 * @generated
	 */
	public Adapter createReadLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadSelfAction <em>Read Self Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadSelfAction
	 * @generated
	 */
	public Adapter createReadSelfActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction <em>Read Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction
	 * @generated
	 */
	public Adapter createReadStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData <em>Link End Creation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData
	 * @generated
	 */
	public Adapter createLinkEndCreationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData <em>Link End Destruction Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData
	 * @generated
	 */
	public Adapter createLinkEndDestructionDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction <em>Clear Association Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction
	 * @generated
	 */
	public Adapter createClearAssociationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction <em>Clear Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction
	 * @generated
	 */
	public Adapter createClearStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateLinkAction <em>Create Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateLinkAction
	 * @generated
	 */
	public Adapter createCreateLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction
	 * @generated
	 */
	public Adapter createCreateObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyLinkAction <em>Destroy Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyLinkAction
	 * @generated
	 */
	public Adapter createDestroyLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction <em>Destroy Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction
	 * @generated
	 */
	public Adapter createDestroyObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction <em>Add Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction
	 * @generated
	 */
	public Adapter createAddStructuralFeatureValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement
	 * @generated
	 */
	public Adapter createRedefinableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Actions.BasicActions.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IntermediateActionsAdapterFactory
