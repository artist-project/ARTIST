/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/**
 */
package eu.artist.postmigration.nfrvt.lang.tsl.tsl;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslFactory
 * @model kind="package"
 * @generated
 */
public interface TslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.artist.eu/postmigration/nfrvt/lang/tsl/TSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TslPackage eINSTANCE = eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.TslPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternCatalogueImpl <em>Pattern Catalogue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternCatalogueImpl
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.TslPackageImpl#getPatternCatalogue()
   * @generated
   */
  int PATTERN_CATALOGUE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_CATALOGUE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_CATALOGUE__NAME = 1;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_CATALOGUE__PATTERNS = 2;

  /**
   * The number of structural features of the '<em>Pattern Catalogue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_CATALOGUE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpl
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.TslPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__NAME = 0;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__CONTEXT = 1;

  /**
   * The feature id for the '<em><b>Problem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__PROBLEM = 2;

  /**
   * The feature id for the '<em><b>Solution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__SOLUTION = 3;

  /**
   * The feature id for the '<em><b>Property Impacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__PROPERTY_IMPACTS = 4;

  /**
   * The feature id for the '<em><b>Pattern Impacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__PATTERN_IMPACTS = 5;

  /**
   * The feature id for the '<em><b>Related Patterns</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__RELATED_PATTERNS = 6;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpactImpl <em>Pattern Impact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpactImpl
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.TslPackageImpl#getPatternImpact()
   * @generated
   */
  int PATTERN_IMPACT = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_IMPACT__TARGET = 0;

  /**
   * The feature id for the '<em><b>Impact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_IMPACT__IMPACT = 1;

  /**
   * The number of structural features of the '<em>Pattern Impact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_IMPACT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue <em>Pattern Catalogue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern Catalogue</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue
   * @generated
   */
  EClass getPatternCatalogue();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue#getImports()
   * @see #getPatternCatalogue()
   * @generated
   */
  EReference getPatternCatalogue_Imports();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue#getName()
   * @see #getPatternCatalogue()
   * @generated
   */
  EAttribute getPatternCatalogue_Name();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue#getPatterns()
   * @see #getPatternCatalogue()
   * @generated
   */
  EReference getPatternCatalogue_Patterns();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getName()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getContext()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Context();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getProblem <em>Problem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Problem</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getProblem()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Problem();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getSolution <em>Solution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Solution</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getSolution()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Solution();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getPropertyImpacts <em>Property Impacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property Impacts</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getPropertyImpacts()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_PropertyImpacts();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getPatternImpacts <em>Pattern Impacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pattern Impacts</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getPatternImpacts()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_PatternImpacts();

  /**
   * Returns the meta object for the reference list '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getRelatedPatterns <em>Related Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Related Patterns</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getRelatedPatterns()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_RelatedPatterns();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact <em>Pattern Impact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern Impact</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact
   * @generated
   */
  EClass getPatternImpact();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact#getTarget()
   * @see #getPatternImpact()
   * @generated
   */
  EReference getPatternImpact_Target();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact#getImpact <em>Impact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impact</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact#getImpact()
   * @see #getPatternImpact()
   * @generated
   */
  EAttribute getPatternImpact_Impact();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TslFactory getTslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternCatalogueImpl <em>Pattern Catalogue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternCatalogueImpl
     * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.TslPackageImpl#getPatternCatalogue()
     * @generated
     */
    EClass PATTERN_CATALOGUE = eINSTANCE.getPatternCatalogue();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN_CATALOGUE__IMPORTS = eINSTANCE.getPatternCatalogue_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN_CATALOGUE__NAME = eINSTANCE.getPatternCatalogue_Name();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN_CATALOGUE__PATTERNS = eINSTANCE.getPatternCatalogue_Patterns();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpl
     * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.TslPackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__CONTEXT = eINSTANCE.getPattern_Context();

    /**
     * The meta object literal for the '<em><b>Problem</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__PROBLEM = eINSTANCE.getPattern_Problem();

    /**
     * The meta object literal for the '<em><b>Solution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__SOLUTION = eINSTANCE.getPattern_Solution();

    /**
     * The meta object literal for the '<em><b>Property Impacts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__PROPERTY_IMPACTS = eINSTANCE.getPattern_PropertyImpacts();

    /**
     * The meta object literal for the '<em><b>Pattern Impacts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__PATTERN_IMPACTS = eINSTANCE.getPattern_PatternImpacts();

    /**
     * The meta object literal for the '<em><b>Related Patterns</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__RELATED_PATTERNS = eINSTANCE.getPattern_RelatedPatterns();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpactImpl <em>Pattern Impact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpactImpl
     * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.TslPackageImpl#getPatternImpact()
     * @generated
     */
    EClass PATTERN_IMPACT = eINSTANCE.getPatternImpact();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN_IMPACT__TARGET = eINSTANCE.getPatternImpact_Target();

    /**
     * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN_IMPACT__IMPACT = eINSTANCE.getPatternImpact_Impact();

  }

} //TslPackage
