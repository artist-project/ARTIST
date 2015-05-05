/**
 */
package org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityFinalNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ControlFlow;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.DecisionNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ForkNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.InitialNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesFactory;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.JoinNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.MergeNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ObjectFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateActivitiesFactoryImpl extends EFactoryImpl implements IntermediateActivitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediateActivitiesFactory init() {
		try {
			IntermediateActivitiesFactory theIntermediateActivitiesFactory = (IntermediateActivitiesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.modelexecution.org/fuml/syntax/activities/intermediateactivities"); 
			if (theIntermediateActivitiesFactory != null) {
				return theIntermediateActivitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntermediateActivitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActivitiesFactoryImpl() {
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
			case IntermediateActivitiesPackage.OBJECT_FLOW: return createObjectFlow();
			case IntermediateActivitiesPackage.ACTIVITY: return createActivity();
			case IntermediateActivitiesPackage.MERGE_NODE: return createMergeNode();
			case IntermediateActivitiesPackage.JOIN_NODE: return createJoinNode();
			case IntermediateActivitiesPackage.INITIAL_NODE: return createInitialNode();
			case IntermediateActivitiesPackage.FORK_NODE: return createForkNode();
			case IntermediateActivitiesPackage.CONTROL_FLOW: return createControlFlow();
			case IntermediateActivitiesPackage.DECISION_NODE: return createDecisionNode();
			case IntermediateActivitiesPackage.ACTIVITY_FINAL_NODE: return createActivityFinalNode();
			case IntermediateActivitiesPackage.ACTIVITY_PARAMETER_NODE: return createActivityParameterNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow createObjectFlow() {
		ObjectFlowImpl objectFlow = new ObjectFlowImpl();
		return objectFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNode createActivityFinalNode() {
		ActivityFinalNodeImpl activityFinalNode = new ActivityFinalNodeImpl();
		return activityFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityParameterNode createActivityParameterNode() {
		ActivityParameterNodeImpl activityParameterNode = new ActivityParameterNodeImpl();
		return activityParameterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActivitiesPackage getIntermediateActivitiesPackage() {
		return (IntermediateActivitiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntermediateActivitiesPackage getPackage() {
		return IntermediateActivitiesPackage.eINSTANCE;
	}

} //IntermediateActivitiesFactoryImpl
