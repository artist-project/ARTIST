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
package eu.artist.postmigration.nfrvt.lang.esl.esl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslFactory
 * @model kind="package"
 * @generated
 */
public interface EslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "esl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.artist.eu/postmigration/nfrvt/lang/esl/ESL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "esl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EslPackage eINSTANCE = eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EslPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyCatalogueImpl <em>Evaluation Strategy Catalogue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyCatalogueImpl
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EslPackageImpl#getEvaluationStrategyCatalogue()
   * @generated
   */
  int EVALUATION_STRATEGY_CATALOGUE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY_CATALOGUE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY_CATALOGUE__NAME = 1;

  /**
   * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY_CATALOGUE__STRATEGIES = 2;

  /**
   * The number of structural features of the '<em>Evaluation Strategy Catalogue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY_CATALOGUE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyImpl <em>Evaluation Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyImpl
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EslPackageImpl#getEvaluationStrategy()
   * @generated
   */
  int EVALUATION_STRATEGY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__NAME = 0;

  /**
   * The feature id for the '<em><b>Java Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__JAVA_CLASS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__LEVEL = 3;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__PROPERTIES = 4;

  /**
   * The number of structural features of the '<em>Evaluation Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind <em>Evaluation Strategy Level Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EslPackageImpl#getEvaluationStrategyLevelKind()
   * @generated
   */
  int EVALUATION_STRATEGY_LEVEL_KIND = 2;


  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue <em>Evaluation Strategy Catalogue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation Strategy Catalogue</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue
   * @generated
   */
  EClass getEvaluationStrategyCatalogue();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue#getImports()
   * @see #getEvaluationStrategyCatalogue()
   * @generated
   */
  EReference getEvaluationStrategyCatalogue_Imports();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue#getName()
   * @see #getEvaluationStrategyCatalogue()
   * @generated
   */
  EAttribute getEvaluationStrategyCatalogue_Name();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue#getStrategies <em>Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Strategies</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue#getStrategies()
   * @see #getEvaluationStrategyCatalogue()
   * @generated
   */
  EReference getEvaluationStrategyCatalogue_Strategies();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy <em>Evaluation Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation Strategy</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy
   * @generated
   */
  EClass getEvaluationStrategy();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getName()
   * @see #getEvaluationStrategy()
   * @generated
   */
  EAttribute getEvaluationStrategy_Name();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getJavaClass <em>Java Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Java Class</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getJavaClass()
   * @see #getEvaluationStrategy()
   * @generated
   */
  EReference getEvaluationStrategy_JavaClass();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getDescription()
   * @see #getEvaluationStrategy()
   * @generated
   */
  EAttribute getEvaluationStrategy_Description();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getLevel()
   * @see #getEvaluationStrategy()
   * @generated
   */
  EAttribute getEvaluationStrategy_Level();

  /**
   * Returns the meta object for the reference list '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Properties</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getProperties()
   * @see #getEvaluationStrategy()
   * @generated
   */
  EReference getEvaluationStrategy_Properties();

  /**
   * Returns the meta object for enum '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind <em>Evaluation Strategy Level Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Evaluation Strategy Level Kind</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind
   * @generated
   */
  EEnum getEvaluationStrategyLevelKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EslFactory getEslFactory();

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
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyCatalogueImpl <em>Evaluation Strategy Catalogue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyCatalogueImpl
     * @see eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EslPackageImpl#getEvaluationStrategyCatalogue()
     * @generated
     */
    EClass EVALUATION_STRATEGY_CATALOGUE = eINSTANCE.getEvaluationStrategyCatalogue();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_STRATEGY_CATALOGUE__IMPORTS = eINSTANCE.getEvaluationStrategyCatalogue_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION_STRATEGY_CATALOGUE__NAME = eINSTANCE.getEvaluationStrategyCatalogue_Name();

    /**
     * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_STRATEGY_CATALOGUE__STRATEGIES = eINSTANCE.getEvaluationStrategyCatalogue_Strategies();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyImpl <em>Evaluation Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyImpl
     * @see eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EslPackageImpl#getEvaluationStrategy()
     * @generated
     */
    EClass EVALUATION_STRATEGY = eINSTANCE.getEvaluationStrategy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION_STRATEGY__NAME = eINSTANCE.getEvaluationStrategy_Name();

    /**
     * The meta object literal for the '<em><b>Java Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_STRATEGY__JAVA_CLASS = eINSTANCE.getEvaluationStrategy_JavaClass();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION_STRATEGY__DESCRIPTION = eINSTANCE.getEvaluationStrategy_Description();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION_STRATEGY__LEVEL = eINSTANCE.getEvaluationStrategy_Level();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_STRATEGY__PROPERTIES = eINSTANCE.getEvaluationStrategy_Properties();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind <em>Evaluation Strategy Level Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind
     * @see eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EslPackageImpl#getEvaluationStrategyLevelKind()
     * @generated
     */
    EEnum EVALUATION_STRATEGY_LEVEL_KIND = eINSTANCE.getEvaluationStrategyLevelKind();

  }

} //EslPackage
