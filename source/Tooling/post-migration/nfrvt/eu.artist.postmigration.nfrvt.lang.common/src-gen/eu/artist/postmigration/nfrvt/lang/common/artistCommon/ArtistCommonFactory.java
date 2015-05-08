/**
 */
package eu.artist.postmigration.nfrvt.lang.common.artistCommon;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage
 * @generated
 */
public interface ArtistCommonFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArtistCommonFactory eINSTANCE = eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Implication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implication</em>'.
   * @generated
   */
  Implication createImplication();

  /**
   * Returns a new object of class '<em>Disjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjunction</em>'.
   * @generated
   */
  Disjunction createDisjunction();

  /**
   * Returns a new object of class '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conjunction</em>'.
   * @generated
   */
  Conjunction createConjunction();

  /**
   * Returns a new object of class '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison</em>'.
   * @generated
   */
  Comparison createComparison();

  /**
   * Returns a new object of class '<em>Boolean Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Unit</em>'.
   * @generated
   */
  BooleanUnit createBooleanUnit();

  /**
   * Returns a new object of class '<em>Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negation</em>'.
   * @generated
   */
  Negation createNegation();

  /**
   * Returns a new object of class '<em>Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relational Expression</em>'.
   * @generated
   */
  RelationalExpression createRelationalExpression();

  /**
   * Returns a new object of class '<em>Comparable Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparable Expression</em>'.
   * @generated
   */
  ComparableExpression createComparableExpression();

  /**
   * Returns a new object of class '<em>Arithmetic Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arithmetic Expression</em>'.
   * @generated
   */
  ArithmeticExpression createArithmeticExpression();

  /**
   * Returns a new object of class '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Additive Expression</em>'.
   * @generated
   */
  AdditiveExpression createAdditiveExpression();

  /**
   * Returns a new object of class '<em>Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicative Expression</em>'.
   * @generated
   */
  MultiplicativeExpression createMultiplicativeExpression();

  /**
   * Returns a new object of class '<em>Number Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Expression</em>'.
   * @generated
   */
  NumberExpression createNumberExpression();

  /**
   * Returns a new object of class '<em>Number Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Function</em>'.
   * @generated
   */
  NumberFunction createNumberFunction();

  /**
   * Returns a new object of class '<em>Maximum Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Maximum Function</em>'.
   * @generated
   */
  MaximumFunction createMaximumFunction();

  /**
   * Returns a new object of class '<em>Minimum Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minimum Function</em>'.
   * @generated
   */
  MinimumFunction createMinimumFunction();

  /**
   * Returns a new object of class '<em>Average Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Average Function</em>'.
   * @generated
   */
  AverageFunction createAverageFunction();

  /**
   * Returns a new object of class '<em>Sum Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Function</em>'.
   * @generated
   */
  SumFunction createSumFunction();

  /**
   * Returns a new object of class '<em>Exponential Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exponential Function</em>'.
   * @generated
   */
  ExponentialFunction createExponentialFunction();

  /**
   * Returns a new object of class '<em>Absolute Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Absolute Function</em>'.
   * @generated
   */
  AbsoluteFunction createAbsoluteFunction();

  /**
   * Returns a new object of class '<em>Natural Logarithm Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Natural Logarithm Function</em>'.
   * @generated
   */
  NaturalLogarithmFunction createNaturalLogarithmFunction();

  /**
   * Returns a new object of class '<em>Common Logarithm Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Common Logarithm Function</em>'.
   * @generated
   */
  CommonLogarithmFunction createCommonLogarithmFunction();

  /**
   * Returns a new object of class '<em>Parenthesized Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenthesized Expression</em>'.
   * @generated
   */
  ParenthesizedExpression createParenthesizedExpression();

  /**
   * Returns a new object of class '<em>Value Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Specification</em>'.
   * @generated
   */
  ValueSpecification createValueSpecification();

  /**
   * Returns a new object of class '<em>Object Specification Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Specification Expression</em>'.
   * @generated
   */
  ObjectSpecificationExpression createObjectSpecificationExpression();

  /**
   * Returns a new object of class '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection</em>'.
   * @generated
   */
  Collection createCollection();

  /**
   * Returns a new object of class '<em>Tuple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple</em>'.
   * @generated
   */
  Tuple createTuple();

  /**
   * Returns a new object of class '<em>Property Value Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Value Pair</em>'.
   * @generated
   */
  PropertyValuePair createPropertyValuePair();

  /**
   * Returns a new object of class '<em>Instance Specification Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Specification Expression</em>'.
   * @generated
   */
  InstanceSpecificationExpression createInstanceSpecificationExpression();

  /**
   * Returns a new object of class '<em>Literal Value Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Value Expression</em>'.
   * @generated
   */
  LiteralValueExpression createLiteralValueExpression();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal</em>'.
   * @generated
   */
  NullLiteral createNullLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Unlimited Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unlimited Literal</em>'.
   * @generated
   */
  UnlimitedLiteral createUnlimitedLiteral();

  /**
   * Returns a new object of class '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator</em>'.
   * @generated
   */
  Operator createOperator();

  /**
   * Returns a new object of class '<em>ARTIST Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ARTIST Model</em>'.
   * @generated
   */
  ARTISTModel createARTISTModel();

  /**
   * Returns a new object of class '<em>Workload</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workload</em>'.
   * @generated
   */
  Workload createWorkload();

  /**
   * Returns a new object of class '<em>Import UR Ior Namespace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import UR Ior Namespace</em>'.
   * @generated
   */
  ImportURIorNamespace createImportURIorNamespace();

  /**
   * Returns a new object of class '<em>Import URI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import URI</em>'.
   * @generated
   */
  ImportURI createImportURI();

  /**
   * Returns a new object of class '<em>Import Namespace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Namespace</em>'.
   * @generated
   */
  ImportNamespace createImportNamespace();

  /**
   * Returns a new object of class '<em>Or Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Operator</em>'.
   * @generated
   */
  OrOperator createOrOperator();

  /**
   * Returns a new object of class '<em>XOr Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XOr Operator</em>'.
   * @generated
   */
  XOrOperator createXOrOperator();

  /**
   * Returns a new object of class '<em>And Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Operator</em>'.
   * @generated
   */
  AndOperator createAndOperator();

  /**
   * Returns a new object of class '<em>Implication Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implication Operator</em>'.
   * @generated
   */
  ImplicationOperator createImplicationOperator();

  /**
   * Returns a new object of class '<em>Equals Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equals Operator</em>'.
   * @generated
   */
  EqualsOperator createEqualsOperator();

  /**
   * Returns a new object of class '<em>Not Equals Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Equals Operator</em>'.
   * @generated
   */
  NotEqualsOperator createNotEqualsOperator();

  /**
   * Returns a new object of class '<em>Not Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Operator</em>'.
   * @generated
   */
  NotOperator createNotOperator();

  /**
   * Returns a new object of class '<em>Greater Than Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greater Than Operator</em>'.
   * @generated
   */
  GreaterThanOperator createGreaterThanOperator();

  /**
   * Returns a new object of class '<em>Greater Or Equal Than Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greater Or Equal Than Operator</em>'.
   * @generated
   */
  GreaterOrEqualThanOperator createGreaterOrEqualThanOperator();

  /**
   * Returns a new object of class '<em>Less Than Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Less Than Operator</em>'.
   * @generated
   */
  LessThanOperator createLessThanOperator();

  /**
   * Returns a new object of class '<em>Less Or Equal Than Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Less Or Equal Than Operator</em>'.
   * @generated
   */
  LessOrEqualThanOperator createLessOrEqualThanOperator();

  /**
   * Returns a new object of class '<em>Addition Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Addition Operator</em>'.
   * @generated
   */
  AdditionOperator createAdditionOperator();

  /**
   * Returns a new object of class '<em>Substraction Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Substraction Operator</em>'.
   * @generated
   */
  SubstractionOperator createSubstractionOperator();

  /**
   * Returns a new object of class '<em>Multiplication Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication Operator</em>'.
   * @generated
   */
  MultiplicationOperator createMultiplicationOperator();

  /**
   * Returns a new object of class '<em>Division Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Division Operator</em>'.
   * @generated
   */
  DivisionOperator createDivisionOperator();

  /**
   * Returns a new object of class '<em>Modulus Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modulus Operator</em>'.
   * @generated
   */
  ModulusOperator createModulusOperator();

  /**
   * Returns a new object of class '<em>Max Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max Operator</em>'.
   * @generated
   */
  MaxOperator createMaxOperator();

  /**
   * Returns a new object of class '<em>Min Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Min Operator</em>'.
   * @generated
   */
  MinOperator createMinOperator();

  /**
   * Returns a new object of class '<em>Avg Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Avg Operator</em>'.
   * @generated
   */
  AvgOperator createAvgOperator();

  /**
   * Returns a new object of class '<em>Sum Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Operator</em>'.
   * @generated
   */
  SumOperator createSumOperator();

  /**
   * Returns a new object of class '<em>Exponential Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exponential Operator</em>'.
   * @generated
   */
  ExponentialOperator createExponentialOperator();

  /**
   * Returns a new object of class '<em>Absolute Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Absolute Operator</em>'.
   * @generated
   */
  AbsoluteOperator createAbsoluteOperator();

  /**
   * Returns a new object of class '<em>Natural Logarithm Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Natural Logarithm Operator</em>'.
   * @generated
   */
  NaturalLogarithmOperator createNaturalLogarithmOperator();

  /**
   * Returns a new object of class '<em>Common Logarithm Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Common Logarithm Operator</em>'.
   * @generated
   */
  CommonLogarithmOperator createCommonLogarithmOperator();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArtistCommonPackage getArtistCommonPackage();

} //ArtistCommonFactory
