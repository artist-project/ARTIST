/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fuml.convert.uml2.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Clause;
import org.eclipse.uml2.uml.ClearAssociationAction;
import org.eclipse.uml2.uml.ClearStructuralFeatureAction;
import org.eclipse.uml2.uml.ConditionalNode;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.CreateLinkAction;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.DestroyLinkAction;
import org.eclipse.uml2.uml.DestroyObjectAction;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.LinkEndCreationData;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.LinkEndDestructionData;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralNull;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ReadExtentAction;
import org.eclipse.uml2.uml.ReadIsClassifiedObjectAction;
import org.eclipse.uml2.uml.ReadLinkAction;
import org.eclipse.uml2.uml.ReadSelfAction;
import org.eclipse.uml2.uml.ReadStructuralFeatureAction;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.ReclassifyObjectAction;
import org.eclipse.uml2.uml.ReduceAction;
import org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StartClassifierBehaviorAction;
import org.eclipse.uml2.uml.StartObjectBehaviorAction;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.TestIdentityAction;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.ValueSpecificationAction;

/**
 * Factory for {@link fUML.Syntax.Classes.Kernel.Element fUML elements}.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public class ElementFactory {

	public fUML.Syntax.Classes.Kernel.Element create(EObject element) {
		String className = element.eClass().getName();
		switch (className) {
		case "Association":
			return create((Association) element);
		case "Class":
			return create((org.eclipse.uml2.uml.Class) element);
		case "DataType":
			return create((DataType) element);
		case "ElementImport":
			return create((ElementImport) element);
		case "Enumeration":
			return create((Enumeration) element);
		case "EnumerationLiteral":
			return create((EnumerationLiteral) element);
		case "Generalization":
			return create((Generalization) element);
		case "InstanceSpecification":
			return create((InstanceSpecification) element);
		case "InstanceValue":
			return create((InstanceValue) element);
		case "LiteralBoolean":
			return create((LiteralBoolean) element);
		case "LiteralInteger":
			return create((LiteralInteger) element);
		case "LiteralNull":
			return create((LiteralNull) element);
		case "LiteralString":
			return create((LiteralString) element);
		case "LiteralUnlimitedNatural":
			return create((LiteralUnlimitedNatural) element);
		case "MultiplicityElement":
			return create((MultiplicityElement) element);
		case "Operation":
			return create((Operation) element);
		case "Package":
			return create((Package) element);
		case "PackageImport":
			return create((PackageImport) element);
		case "Parameter":
			return create((Parameter) element);
		case "PrimitiveType":
			return create((PrimitiveType) element);
		case "Property":
			return create((Property) element);
		case "Slot":
			return create((Slot) element);
		case "TypedElement":
			return create((TypedElement) element);
		case "FunctionBehavior":
			return create((FunctionBehavior) element);
		case "OpaqueBehavior":
			return create((OpaqueBehavior) element);
		case "Reception":
			return create((Reception) element);
		case "Signal":
			return create((Signal) element);
		case "SignalEvent":
			return create((SignalEvent) element);
		case "Trigger":
			return create((Trigger) element);
		case "CallBehaviorAction":
			return create((CallBehaviorAction) element);
		case "CallOperationAction":
			return create((CallOperationAction) element);
		case "InputPin":
			return create((InputPin) element);
		case "OutputPin":
			return create((OutputPin) element);
		case "SendSignalAction":
			return create((SendSignalAction) element);
		case "AddStructuralFeatureValueAction":
			return create((AddStructuralFeatureValueAction) element);
		case "ClearAssociationAction":
			return create((ClearAssociationAction) element);
		case "ClearStructuralFeatureAction":
			return create((ClearStructuralFeatureAction) element);
		case "CreateLinkAction":
			return create((CreateLinkAction) element);
		case "CreateObjectAction":
			return create((CreateObjectAction) element);
		case "DestroyLinkAction":
			return create((DestroyLinkAction) element);
		case "DestroyObjectAction":
			return create((DestroyObjectAction) element);
		case "LinkEndCreationData":
			return create((LinkEndCreationData) element);
		case "LinkEndData":
			return create((LinkEndData) element);
		case "LinkEndDestructionData":
			return create((LinkEndDestructionData) element);
		case "ReadLinkAction":
			return create((ReadLinkAction) element);
		case "ReadSelfAction":
			return create((ReadSelfAction) element);
		case "ReadStructuralFeatureAction":
			return create((ReadStructuralFeatureAction) element);
		case "TestIdentityAction":
			return create((TestIdentityAction) element);
		case "ValueSpecificationAction":
			return create((ValueSpecificationAction) element);
		case "AcceptEventAction":
			return create((AcceptEventAction) element);
		case "ReadExtentAction":
			return create((ReadExtentAction) element);
		case "ReadIsClassifiedObjectAction":
			return create((ReadIsClassifiedObjectAction) element);
		case "ReclassifyObjectAction":
			return create((ReclassifyObjectAction) element);
		case "ReduceAction":
			return create((ReduceAction) element);
		case "StartClassifierBehaviorAction":
			return create((StartClassifierBehaviorAction) element);
		case "StartObjectBehaviorAction":
			return create((StartObjectBehaviorAction) element);
		case "Activity":
			return create((Activity) element);
		case "ActivityFinalNode":
			return create((ActivityFinalNode) element);
		case "ActivityParameterNode":
			return create((ActivityParameterNode) element);
		case "ControlFlow":
			return create((ControlFlow) element);
		case "DecisionNode":
			return create((DecisionNode) element);
		case "ForkNode":
			return create((ForkNode) element);
		case "InitialNode":
			return create((InitialNode) element);
		case "JoinNode":
			return create((JoinNode) element);
		case "MergeNode":
			return create((MergeNode) element);
		case "ObjectFlow":
			return create((ObjectFlow) element);
		case "Clause":
			return create((Clause) element);
		case "ConditionalNode":
			return create((ConditionalNode) element);
		case "LoopNode":
			return create((LoopNode) element);
		case "StructuredActivityNode":
			return create((StructuredActivityNode) element);
		case "ExpansionNode":
			return create((ExpansionNode) element);
		case "ExpansionRegion":
			return create((ExpansionRegion) element);
		case "RemoveStructuralFeatureValueAction":
			return create((RemoveStructuralFeatureValueAction) element);
		}
		return null;
	}

	public fUML.Syntax.Classes.Kernel.Association create(Association element) {
		return new fUML.Syntax.Classes.Kernel.Association();
	}

	public fUML.Syntax.Classes.Kernel.Class_ create(
			org.eclipse.uml2.uml.Class element) {
		return new fUML.Syntax.Classes.Kernel.Class_();
	}

	public fUML.Syntax.Classes.Kernel.DataType create(
			org.eclipse.uml2.uml.DataType element) {
		return new fUML.Syntax.Classes.Kernel.DataType();
	}

	public fUML.Syntax.Classes.Kernel.ElementImport create(
			org.eclipse.uml2.uml.ElementImport element) {
		return new fUML.Syntax.Classes.Kernel.ElementImport();
	}

	public fUML.Syntax.Classes.Kernel.Enumeration create(
			org.eclipse.uml2.uml.Enumeration element) {
		return new fUML.Syntax.Classes.Kernel.Enumeration();
	}

	public fUML.Syntax.Classes.Kernel.EnumerationLiteral create(
			org.eclipse.uml2.uml.EnumerationLiteral element) {
		return new fUML.Syntax.Classes.Kernel.EnumerationLiteral();
	}

	public fUML.Syntax.Classes.Kernel.Generalization create(
			org.eclipse.uml2.uml.Generalization element) {
		return new fUML.Syntax.Classes.Kernel.Generalization();
	}

	public fUML.Syntax.Classes.Kernel.InstanceSpecification create(
			org.eclipse.uml2.uml.InstanceSpecification element) {
		return new fUML.Syntax.Classes.Kernel.InstanceSpecification();
	}

	public fUML.Syntax.Classes.Kernel.InstanceValue create(
			org.eclipse.uml2.uml.InstanceValue element) {
		return new fUML.Syntax.Classes.Kernel.InstanceValue();
	}

	public fUML.Syntax.Classes.Kernel.LiteralBoolean create(
			org.eclipse.uml2.uml.LiteralBoolean element) {
		return new fUML.Syntax.Classes.Kernel.LiteralBoolean();
	}

	public fUML.Syntax.Classes.Kernel.LiteralInteger create(
			org.eclipse.uml2.uml.LiteralInteger element) {
		return new fUML.Syntax.Classes.Kernel.LiteralInteger();
	}

	public fUML.Syntax.Classes.Kernel.LiteralNull create(
			org.eclipse.uml2.uml.LiteralNull element) {
		return new fUML.Syntax.Classes.Kernel.LiteralNull();
	}

	public fUML.Syntax.Classes.Kernel.LiteralString create(
			org.eclipse.uml2.uml.LiteralString element) {
		return new fUML.Syntax.Classes.Kernel.LiteralString();
	}

	public fUML.Syntax.Classes.Kernel.LiteralUnlimitedNatural create(
			org.eclipse.uml2.uml.LiteralUnlimitedNatural element) {
		return new fUML.Syntax.Classes.Kernel.LiteralUnlimitedNatural();
	}

	public fUML.Syntax.Classes.Kernel.MultiplicityElement create(
			org.eclipse.uml2.uml.MultiplicityElement element) {
		return new fUML.Syntax.Classes.Kernel.MultiplicityElement();
	}

	public fUML.Syntax.Classes.Kernel.Operation create(
			org.eclipse.uml2.uml.Operation element) {
		return new fUML.Syntax.Classes.Kernel.Operation();
	}

	public fUML.Syntax.Classes.Kernel.Package create(
			org.eclipse.uml2.uml.Package element) {
		return new fUML.Syntax.Classes.Kernel.Package();
	}

	public fUML.Syntax.Classes.Kernel.PackageImport create(
			org.eclipse.uml2.uml.PackageImport element) {
		return new fUML.Syntax.Classes.Kernel.PackageImport();
	}

	public fUML.Syntax.Classes.Kernel.Parameter create(
			org.eclipse.uml2.uml.Parameter element) {
		return new fUML.Syntax.Classes.Kernel.Parameter();
	}

	public fUML.Syntax.Classes.Kernel.PrimitiveType create(
			org.eclipse.uml2.uml.PrimitiveType element) {
		return new fUML.Syntax.Classes.Kernel.PrimitiveType();
	}

	public fUML.Syntax.Classes.Kernel.Property create(
			org.eclipse.uml2.uml.Property element) {
		return new fUML.Syntax.Classes.Kernel.Property();
	}

	public fUML.Syntax.Classes.Kernel.Slot create(
			org.eclipse.uml2.uml.Slot element) {
		return new fUML.Syntax.Classes.Kernel.Slot();
	}

	public fUML.Syntax.Classes.Kernel.TypedElement create(
			org.eclipse.uml2.uml.TypedElement element) {
		return new fUML.Syntax.Classes.Kernel.TypedElement();
	}

	public fUML.Syntax.CommonBehaviors.BasicBehaviors.FunctionBehavior create(
			org.eclipse.uml2.uml.FunctionBehavior element) {
		return new fUML.Syntax.CommonBehaviors.BasicBehaviors.FunctionBehavior();
	}

	public fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior create(
			org.eclipse.uml2.uml.OpaqueBehavior element) {
		return new fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior();
	}

	public fUML.Syntax.CommonBehaviors.Communications.Reception create(
			org.eclipse.uml2.uml.Reception element) {
		return new fUML.Syntax.CommonBehaviors.Communications.Reception();
	}

	public fUML.Syntax.CommonBehaviors.Communications.Signal create(
			org.eclipse.uml2.uml.Signal element) {
		return new fUML.Syntax.CommonBehaviors.Communications.Signal();
	}

	public fUML.Syntax.CommonBehaviors.Communications.SignalEvent create(
			org.eclipse.uml2.uml.SignalEvent element) {
		return new fUML.Syntax.CommonBehaviors.Communications.SignalEvent();
	}

	public fUML.Syntax.CommonBehaviors.Communications.Trigger create(
			org.eclipse.uml2.uml.Trigger element) {
		return new fUML.Syntax.CommonBehaviors.Communications.Trigger();
	}

	public fUML.Syntax.Actions.BasicActions.CallBehaviorAction create(
			org.eclipse.uml2.uml.CallBehaviorAction element) {
		return new fUML.Syntax.Actions.BasicActions.CallBehaviorAction();
	}

	public fUML.Syntax.Actions.BasicActions.CallOperationAction create(
			org.eclipse.uml2.uml.CallOperationAction element) {
		return new fUML.Syntax.Actions.BasicActions.CallOperationAction();
	}

	public fUML.Syntax.Actions.BasicActions.InputPin create(
			org.eclipse.uml2.uml.InputPin element) {
		return new fUML.Syntax.Actions.BasicActions.InputPin();
	}

	public fUML.Syntax.Actions.BasicActions.OutputPin create(
			org.eclipse.uml2.uml.OutputPin element) {
		return new fUML.Syntax.Actions.BasicActions.OutputPin();
	}

	public fUML.Syntax.Actions.BasicActions.SendSignalAction create(
			org.eclipse.uml2.uml.SendSignalAction element) {
		return new fUML.Syntax.Actions.BasicActions.SendSignalAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction create(
			org.eclipse.uml2.uml.AddStructuralFeatureValueAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.ClearAssociationAction create(
			org.eclipse.uml2.uml.ClearAssociationAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ClearAssociationAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction create(
			org.eclipse.uml2.uml.ClearStructuralFeatureAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.CreateLinkAction create(
			org.eclipse.uml2.uml.CreateLinkAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.CreateLinkAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.CreateObjectAction create(
			org.eclipse.uml2.uml.CreateObjectAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.CreateObjectAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.DestroyLinkAction create(
			org.eclipse.uml2.uml.DestroyLinkAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.DestroyLinkAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.DestroyObjectAction create(
			org.eclipse.uml2.uml.DestroyObjectAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.DestroyObjectAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.LinkEndCreationData create(
			org.eclipse.uml2.uml.LinkEndCreationData element) {
		return new fUML.Syntax.Actions.IntermediateActions.LinkEndCreationData();
	}

	public fUML.Syntax.Actions.IntermediateActions.LinkEndData create(
			org.eclipse.uml2.uml.LinkEndData element) {
		return new fUML.Syntax.Actions.IntermediateActions.LinkEndData();
	}

	public fUML.Syntax.Actions.IntermediateActions.LinkEndDestructionData create(
			org.eclipse.uml2.uml.LinkEndDestructionData element) {
		return new fUML.Syntax.Actions.IntermediateActions.LinkEndDestructionData();
	}

	public fUML.Syntax.Actions.IntermediateActions.ReadLinkAction create(
			org.eclipse.uml2.uml.ReadLinkAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ReadLinkAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.ReadSelfAction create(
			org.eclipse.uml2.uml.ReadSelfAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ReadSelfAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction create(
			org.eclipse.uml2.uml.ReadStructuralFeatureAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction create(
			org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.TestIdentityAction create(
			org.eclipse.uml2.uml.TestIdentityAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.TestIdentityAction();
	}

	public fUML.Syntax.Actions.IntermediateActions.ValueSpecificationAction create(
			org.eclipse.uml2.uml.ValueSpecificationAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ValueSpecificationAction();
	}

	public fUML.Syntax.Actions.CompleteActions.AcceptEventAction create(
			org.eclipse.uml2.uml.AcceptEventAction element) {
		return new fUML.Syntax.Actions.CompleteActions.AcceptEventAction();
	}

	public fUML.Syntax.Actions.CompleteActions.ReadExtentAction create(
			org.eclipse.uml2.uml.ReadExtentAction element) {
		return new fUML.Syntax.Actions.CompleteActions.ReadExtentAction();
	}

	public fUML.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction create(
			org.eclipse.uml2.uml.ReadIsClassifiedObjectAction element) {
		return new fUML.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction();
	}

	public fUML.Syntax.Actions.CompleteActions.ReclassifyObjectAction create(
			org.eclipse.uml2.uml.ReclassifyObjectAction element) {
		return new fUML.Syntax.Actions.CompleteActions.ReclassifyObjectAction();
	}

	public fUML.Syntax.Actions.CompleteActions.ReduceAction create(
			org.eclipse.uml2.uml.ReduceAction element) {
		return new fUML.Syntax.Actions.CompleteActions.ReduceAction();
	}

	public fUML.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction create(
			org.eclipse.uml2.uml.StartClassifierBehaviorAction element) {
		return new fUML.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction();
	}

	public fUML.Syntax.Actions.CompleteActions.StartObjectBehaviorAction create(
			org.eclipse.uml2.uml.StartObjectBehaviorAction element) {
		return new fUML.Syntax.Actions.CompleteActions.StartObjectBehaviorAction();
	}

	public fUML.Syntax.Activities.IntermediateActivities.Activity create(
			org.eclipse.uml2.uml.Activity element) {
		return new fUML.Syntax.Activities.IntermediateActivities.Activity();
	}

	public fUML.Syntax.Activities.IntermediateActivities.ActivityFinalNode create(
			org.eclipse.uml2.uml.ActivityFinalNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.ActivityFinalNode();
	}

	public fUML.Syntax.Activities.IntermediateActivities.ActivityParameterNode create(
			org.eclipse.uml2.uml.ActivityParameterNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.ActivityParameterNode();
	}

	public fUML.Syntax.Activities.IntermediateActivities.ControlFlow create(
			org.eclipse.uml2.uml.ControlFlow element) {
		return new fUML.Syntax.Activities.IntermediateActivities.ControlFlow();
	}

	public fUML.Syntax.Activities.IntermediateActivities.DecisionNode create(
			org.eclipse.uml2.uml.DecisionNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.DecisionNode();
	}

	public fUML.Syntax.Activities.IntermediateActivities.ForkNode create(
			org.eclipse.uml2.uml.ForkNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.ForkNode();
	}

	public fUML.Syntax.Activities.IntermediateActivities.InitialNode create(
			org.eclipse.uml2.uml.InitialNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.InitialNode();
	}

	public fUML.Syntax.Activities.IntermediateActivities.JoinNode create(
			org.eclipse.uml2.uml.JoinNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.JoinNode();
	}

	public fUML.Syntax.Activities.IntermediateActivities.MergeNode create(
			org.eclipse.uml2.uml.MergeNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.MergeNode();
	}

	public fUML.Syntax.Activities.IntermediateActivities.ObjectFlow create(
			org.eclipse.uml2.uml.ObjectFlow element) {
		return new fUML.Syntax.Activities.IntermediateActivities.ObjectFlow();
	}

	public fUML.Syntax.Activities.CompleteStructuredActivities.Clause create(
			org.eclipse.uml2.uml.Clause element) {
		return new fUML.Syntax.Activities.CompleteStructuredActivities.Clause();
	}

	public fUML.Syntax.Activities.CompleteStructuredActivities.ConditionalNode create(
			org.eclipse.uml2.uml.ConditionalNode element) {
		return new fUML.Syntax.Activities.CompleteStructuredActivities.ConditionalNode();
	}

	public fUML.Syntax.Activities.CompleteStructuredActivities.LoopNode create(
			org.eclipse.uml2.uml.LoopNode element) {
		return new fUML.Syntax.Activities.CompleteStructuredActivities.LoopNode();
	}

	public fUML.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode create(
			org.eclipse.uml2.uml.StructuredActivityNode element) {
		return new fUML.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode();
	}

	public fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionNode create(
			org.eclipse.uml2.uml.ExpansionNode element) {
		return new fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionNode();
	}

	public fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion create(
			org.eclipse.uml2.uml.ExpansionRegion element) {
		return new fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion();
	}

}
