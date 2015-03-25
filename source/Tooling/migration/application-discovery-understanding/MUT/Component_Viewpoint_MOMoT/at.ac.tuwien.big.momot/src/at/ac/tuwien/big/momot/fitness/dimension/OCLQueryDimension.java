package at.ac.tuwien.big.momot.fitness.dimension;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCL.Query;

import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class OCLQueryDimension extends AbstractEGraphFitnessDimension {

	private Query oclQuery;

	public OCLQueryDimension(Query oclQuery) throws ParserException {
		this(oclQuery.getExpression().toString(), oclQuery);
	}
	
	public OCLQueryDimension(String name, Query oclQuery) throws ParserException {
		super(name);
		this.oclQuery = oclQuery;
	}
	
	public OCLQueryDimension(String name, FunctionType type, Query oclQuery) throws ParserException {
		super(name, type);
		this.oclQuery = oclQuery;
	}
		
	public OCLQueryDimension(String queryExpression, Helper helper, String... defExpressions) throws ParserException {
		this(queryExpression, createQuery(helper, queryExpression, defExpressions));
	}
	
	public OCLQueryDimension(String name, String queryExpression, Helper helper, String... defExpressions) throws ParserException {
		this(name, createQuery(helper, queryExpression, defExpressions));
	}
	
	public OCLQueryDimension(String name, FunctionType type, String queryExpression, Helper helper, String... defExpressions) throws ParserException {
		this(name, type, createQuery(helper, queryExpression, defExpressions));
	}
	
	public Query getOclQuery() {
		return oclQuery;
	}
	
	@Override
	protected double evaluate(MatchSolution solution, ExecutionResult executionResult) {
		EGraph resultGraph = executionResult.getResultGraph();
		if(resultGraph == null || getOclQuery() == null)
			return WORST_FITNESS;

		try {			
			EObject root = resultGraph.getRoots().get(0);
			Object result = getOclQuery().evaluate(root);
//			System.out.println(getName() + " = " + result);
			return Double.parseDouble(result.toString());
		} catch(NumberFormatException e) {
			return WORST_FITNESS;
		}
	}

	private static Query createQuery(Helper helper, String queryExpression, String... defExpressions) throws ParserException {
		if(helper.getEnvironment().getSelfVariable() == null)
			throw new IllegalArgumentException("Classifier context of the OCL Helper class must be set to the root element class of the graph.");
		
		for(String defExpression : defExpressions)
			helper.defineAttribute(defExpression);
		
		return helper.getOCL().createQuery(helper.createQuery(queryExpression));
	}
}
