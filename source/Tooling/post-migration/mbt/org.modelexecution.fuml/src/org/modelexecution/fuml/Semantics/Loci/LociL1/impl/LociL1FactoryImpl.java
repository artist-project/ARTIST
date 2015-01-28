/**
 */
package org.modelexecution.fuml.Semantics.Loci.LociL1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Factory;
import org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Package;
import org.modelexecution.fuml.Semantics.Loci.LociL1.Locus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LociL1FactoryImpl extends EFactoryImpl implements LociL1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LociL1Factory init() {
		try {
			LociL1Factory theLociL1Factory = (LociL1Factory)EPackage.Registry.INSTANCE.getEFactory(LociL1Package.eNS_URI);
			if (theLociL1Factory != null) {
				return theLociL1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LociL1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LociL1FactoryImpl() {
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
			case LociL1Package.LOCUS: return createLocus();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus createLocus() {
		LocusImpl locus = new LocusImpl();
		return locus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LociL1Package getLociL1Package() {
		return (LociL1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LociL1Package getPackage() {
		return LociL1Package.eINSTANCE;
	}

} //LociL1FactoryImpl
