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
package eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtistCommonFactoryImpl extends EFactoryImpl implements ArtistCommonFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ArtistCommonFactory init()
  {
    try
    {
      ArtistCommonFactory theArtistCommonFactory = (ArtistCommonFactory)EPackage.Registry.INSTANCE.getEFactory(ArtistCommonPackage.eNS_URI);
      if (theArtistCommonFactory != null)
      {
        return theArtistCommonFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArtistCommonFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtistCommonFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ArtistCommonPackage.EXPRESSION: return createExpression();
      case ArtistCommonPackage.IMPLICATION: return createImplication();
      case ArtistCommonPackage.DISJUNCTION: return createDisjunction();
      case ArtistCommonPackage.CONJUNCTION: return createConjunction();
      case ArtistCommonPackage.COMPARISON: return createComparison();
      case ArtistCommonPackage.BOOLEAN_UNIT: return createBooleanUnit();
      case ArtistCommonPackage.NEGATION: return createNegation();
      case ArtistCommonPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
      case ArtistCommonPackage.COMPARABLE_EXPRESSION: return createComparableExpression();
      case ArtistCommonPackage.ARITHMETIC_EXPRESSION: return createArithmeticExpression();
      case ArtistCommonPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case ArtistCommonPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case ArtistCommonPackage.NUMBER_EXPRESSION: return createNumberExpression();
      case ArtistCommonPackage.NUMBER_FUNCTION: return createNumberFunction();
      case ArtistCommonPackage.MAXIMUM_FUNCTION: return createMaximumFunction();
      case ArtistCommonPackage.MINIMUM_FUNCTION: return createMinimumFunction();
      case ArtistCommonPackage.AVERAGE_FUNCTION: return createAverageFunction();
      case ArtistCommonPackage.SUM_FUNCTION: return createSumFunction();
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION: return createExponentialFunction();
      case ArtistCommonPackage.ABSOLUTE_FUNCTION: return createAbsoluteFunction();
      case ArtistCommonPackage.NATURAL_LOGARITHM_FUNCTION: return createNaturalLogarithmFunction();
      case ArtistCommonPackage.COMMON_LOGARITHM_FUNCTION: return createCommonLogarithmFunction();
      case ArtistCommonPackage.PARENTHESIZED_EXPRESSION: return createParenthesizedExpression();
      case ArtistCommonPackage.VALUE_SPECIFICATION: return createValueSpecification();
      case ArtistCommonPackage.OBJECT_SPECIFICATION_EXPRESSION: return createObjectSpecificationExpression();
      case ArtistCommonPackage.COLLECTION: return createCollection();
      case ArtistCommonPackage.TUPLE: return createTuple();
      case ArtistCommonPackage.PROPERTY_VALUE_PAIR: return createPropertyValuePair();
      case ArtistCommonPackage.INSTANCE_SPECIFICATION_EXPRESSION: return createInstanceSpecificationExpression();
      case ArtistCommonPackage.LITERAL_VALUE_EXPRESSION: return createLiteralValueExpression();
      case ArtistCommonPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case ArtistCommonPackage.NUMBER_LITERAL: return createNumberLiteral();
      case ArtistCommonPackage.NULL_LITERAL: return createNullLiteral();
      case ArtistCommonPackage.STRING_LITERAL: return createStringLiteral();
      case ArtistCommonPackage.UNLIMITED_LITERAL: return createUnlimitedLiteral();
      case ArtistCommonPackage.OPERATOR: return createOperator();
      case ArtistCommonPackage.IMPORT_UR_IOR_NAMESPACE: return createImportURIorNamespace();
      case ArtistCommonPackage.IMPORT_URI: return createImportURI();
      case ArtistCommonPackage.IMPORT_NAMESPACE: return createImportNamespace();
      case ArtistCommonPackage.OR_OPERATOR: return createOrOperator();
      case ArtistCommonPackage.XOR_OPERATOR: return createXOrOperator();
      case ArtistCommonPackage.AND_OPERATOR: return createAndOperator();
      case ArtistCommonPackage.IMPLICATION_OPERATOR: return createImplicationOperator();
      case ArtistCommonPackage.EQUALS_OPERATOR: return createEqualsOperator();
      case ArtistCommonPackage.NOT_EQUALS_OPERATOR: return createNotEqualsOperator();
      case ArtistCommonPackage.NOT_OPERATOR: return createNotOperator();
      case ArtistCommonPackage.GREATER_THAN_OPERATOR: return createGreaterThanOperator();
      case ArtistCommonPackage.GREATER_OR_EQUAL_THAN_OPERATOR: return createGreaterOrEqualThanOperator();
      case ArtistCommonPackage.LESS_THAN_OPERATOR: return createLessThanOperator();
      case ArtistCommonPackage.LESS_OR_EQUAL_THAN_OPERATOR: return createLessOrEqualThanOperator();
      case ArtistCommonPackage.ADDITION_OPERATOR: return createAdditionOperator();
      case ArtistCommonPackage.SUBSTRACTION_OPERATOR: return createSubstractionOperator();
      case ArtistCommonPackage.MULTIPLICATION_OPERATOR: return createMultiplicationOperator();
      case ArtistCommonPackage.DIVISION_OPERATOR: return createDivisionOperator();
      case ArtistCommonPackage.MODULUS_OPERATOR: return createModulusOperator();
      case ArtistCommonPackage.MAX_OPERATOR: return createMaxOperator();
      case ArtistCommonPackage.MIN_OPERATOR: return createMinOperator();
      case ArtistCommonPackage.AVG_OPERATOR: return createAvgOperator();
      case ArtistCommonPackage.SUM_OPERATOR: return createSumOperator();
      case ArtistCommonPackage.EXPONENTIAL_OPERATOR: return createExponentialOperator();
      case ArtistCommonPackage.ABSOLUTE_OPERATOR: return createAbsoluteOperator();
      case ArtistCommonPackage.NATURAL_LOGARITHM_OPERATOR: return createNaturalLogarithmOperator();
      case ArtistCommonPackage.COMMON_LOGARITHM_OPERATOR: return createCommonLogarithmOperator();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implication createImplication()
  {
    ImplicationImpl implication = new ImplicationImpl();
    return implication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disjunction createDisjunction()
  {
    DisjunctionImpl disjunction = new DisjunctionImpl();
    return disjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conjunction createConjunction()
  {
    ConjunctionImpl conjunction = new ConjunctionImpl();
    return conjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanUnit createBooleanUnit()
  {
    BooleanUnitImpl booleanUnit = new BooleanUnitImpl();
    return booleanUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Negation createNegation()
  {
    NegationImpl negation = new NegationImpl();
    return negation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalExpression createRelationalExpression()
  {
    RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
    return relationalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparableExpression createComparableExpression()
  {
    ComparableExpressionImpl comparableExpression = new ComparableExpressionImpl();
    return comparableExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticExpression createArithmeticExpression()
  {
    ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
    return arithmeticExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression createNumberExpression()
  {
    NumberExpressionImpl numberExpression = new NumberExpressionImpl();
    return numberExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberFunction createNumberFunction()
  {
    NumberFunctionImpl numberFunction = new NumberFunctionImpl();
    return numberFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaximumFunction createMaximumFunction()
  {
    MaximumFunctionImpl maximumFunction = new MaximumFunctionImpl();
    return maximumFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinimumFunction createMinimumFunction()
  {
    MinimumFunctionImpl minimumFunction = new MinimumFunctionImpl();
    return minimumFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AverageFunction createAverageFunction()
  {
    AverageFunctionImpl averageFunction = new AverageFunctionImpl();
    return averageFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumFunction createSumFunction()
  {
    SumFunctionImpl sumFunction = new SumFunctionImpl();
    return sumFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExponentialFunction createExponentialFunction()
  {
    ExponentialFunctionImpl exponentialFunction = new ExponentialFunctionImpl();
    return exponentialFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsoluteFunction createAbsoluteFunction()
  {
    AbsoluteFunctionImpl absoluteFunction = new AbsoluteFunctionImpl();
    return absoluteFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaturalLogarithmFunction createNaturalLogarithmFunction()
  {
    NaturalLogarithmFunctionImpl naturalLogarithmFunction = new NaturalLogarithmFunctionImpl();
    return naturalLogarithmFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonLogarithmFunction createCommonLogarithmFunction()
  {
    CommonLogarithmFunctionImpl commonLogarithmFunction = new CommonLogarithmFunctionImpl();
    return commonLogarithmFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesizedExpression createParenthesizedExpression()
  {
    ParenthesizedExpressionImpl parenthesizedExpression = new ParenthesizedExpressionImpl();
    return parenthesizedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueSpecification createValueSpecification()
  {
    ValueSpecificationImpl valueSpecification = new ValueSpecificationImpl();
    return valueSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectSpecificationExpression createObjectSpecificationExpression()
  {
    ObjectSpecificationExpressionImpl objectSpecificationExpression = new ObjectSpecificationExpressionImpl();
    return objectSpecificationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection createCollection()
  {
    CollectionImpl collection = new CollectionImpl();
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tuple createTuple()
  {
    TupleImpl tuple = new TupleImpl();
    return tuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyValuePair createPropertyValuePair()
  {
    PropertyValuePairImpl propertyValuePair = new PropertyValuePairImpl();
    return propertyValuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceSpecificationExpression createInstanceSpecificationExpression()
  {
    InstanceSpecificationExpressionImpl instanceSpecificationExpression = new InstanceSpecificationExpressionImpl();
    return instanceSpecificationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralValueExpression createLiteralValueExpression()
  {
    LiteralValueExpressionImpl literalValueExpression = new LiteralValueExpressionImpl();
    return literalValueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnlimitedLiteral createUnlimitedLiteral()
  {
    UnlimitedLiteralImpl unlimitedLiteral = new UnlimitedLiteralImpl();
    return unlimitedLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportURIorNamespace createImportURIorNamespace()
  {
    ImportURIorNamespaceImpl importURIorNamespace = new ImportURIorNamespaceImpl();
    return importURIorNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportURI createImportURI()
  {
    ImportURIImpl importURI = new ImportURIImpl();
    return importURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportNamespace createImportNamespace()
  {
    ImportNamespaceImpl importNamespace = new ImportNamespaceImpl();
    return importNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrOperator createOrOperator()
  {
    OrOperatorImpl orOperator = new OrOperatorImpl();
    return orOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XOrOperator createXOrOperator()
  {
    XOrOperatorImpl xOrOperator = new XOrOperatorImpl();
    return xOrOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndOperator createAndOperator()
  {
    AndOperatorImpl andOperator = new AndOperatorImpl();
    return andOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplicationOperator createImplicationOperator()
  {
    ImplicationOperatorImpl implicationOperator = new ImplicationOperatorImpl();
    return implicationOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualsOperator createEqualsOperator()
  {
    EqualsOperatorImpl equalsOperator = new EqualsOperatorImpl();
    return equalsOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotEqualsOperator createNotEqualsOperator()
  {
    NotEqualsOperatorImpl notEqualsOperator = new NotEqualsOperatorImpl();
    return notEqualsOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotOperator createNotOperator()
  {
    NotOperatorImpl notOperator = new NotOperatorImpl();
    return notOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreaterThanOperator createGreaterThanOperator()
  {
    GreaterThanOperatorImpl greaterThanOperator = new GreaterThanOperatorImpl();
    return greaterThanOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreaterOrEqualThanOperator createGreaterOrEqualThanOperator()
  {
    GreaterOrEqualThanOperatorImpl greaterOrEqualThanOperator = new GreaterOrEqualThanOperatorImpl();
    return greaterOrEqualThanOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LessThanOperator createLessThanOperator()
  {
    LessThanOperatorImpl lessThanOperator = new LessThanOperatorImpl();
    return lessThanOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LessOrEqualThanOperator createLessOrEqualThanOperator()
  {
    LessOrEqualThanOperatorImpl lessOrEqualThanOperator = new LessOrEqualThanOperatorImpl();
    return lessOrEqualThanOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditionOperator createAdditionOperator()
  {
    AdditionOperatorImpl additionOperator = new AdditionOperatorImpl();
    return additionOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstractionOperator createSubstractionOperator()
  {
    SubstractionOperatorImpl substractionOperator = new SubstractionOperatorImpl();
    return substractionOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicationOperator createMultiplicationOperator()
  {
    MultiplicationOperatorImpl multiplicationOperator = new MultiplicationOperatorImpl();
    return multiplicationOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DivisionOperator createDivisionOperator()
  {
    DivisionOperatorImpl divisionOperator = new DivisionOperatorImpl();
    return divisionOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModulusOperator createModulusOperator()
  {
    ModulusOperatorImpl modulusOperator = new ModulusOperatorImpl();
    return modulusOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxOperator createMaxOperator()
  {
    MaxOperatorImpl maxOperator = new MaxOperatorImpl();
    return maxOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinOperator createMinOperator()
  {
    MinOperatorImpl minOperator = new MinOperatorImpl();
    return minOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvgOperator createAvgOperator()
  {
    AvgOperatorImpl avgOperator = new AvgOperatorImpl();
    return avgOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumOperator createSumOperator()
  {
    SumOperatorImpl sumOperator = new SumOperatorImpl();
    return sumOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExponentialOperator createExponentialOperator()
  {
    ExponentialOperatorImpl exponentialOperator = new ExponentialOperatorImpl();
    return exponentialOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsoluteOperator createAbsoluteOperator()
  {
    AbsoluteOperatorImpl absoluteOperator = new AbsoluteOperatorImpl();
    return absoluteOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaturalLogarithmOperator createNaturalLogarithmOperator()
  {
    NaturalLogarithmOperatorImpl naturalLogarithmOperator = new NaturalLogarithmOperatorImpl();
    return naturalLogarithmOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonLogarithmOperator createCommonLogarithmOperator()
  {
    CommonLogarithmOperatorImpl commonLogarithmOperator = new CommonLogarithmOperatorImpl();
    return commonLogarithmOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtistCommonPackage getArtistCommonPackage()
  {
    return (ArtistCommonPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ArtistCommonPackage getPackage()
  {
    return ArtistCommonPackage.eINSTANCE;
  }

} //ArtistCommonFactoryImpl
