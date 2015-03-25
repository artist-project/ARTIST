package parts;

import org.eclipse.emf.henshin.interpreter.EGraph;

import at.ac.tuwien.big.moea.fitness.dimension.IFitnessDimension.FunctionType;
import at.ac.tuwien.big.momot.fitness.EGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.fitness.dimension.AbstractEGraphFitnessDimension;
import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.match.MatchHelper;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class ArchitectureFitnessFunction extends EGraphMultiDimensionalFitnessFunction {

	public static final String ATTRIBUTE_CALCULATION_MODEL = "ArchitectureCalculationModel";
	private static final int PENALTY = 1000;
	
	// provide simple access to cached calculation model for fitness dimensions (objectives, constraints)
	public abstract class ArchitectureFitnessDimension extends AbstractEGraphFitnessDimension {
		public ArchitectureFitnessDimension(String name) {
			super(name);
		}
		
		public ArchitectureFitnessDimension(String name, FunctionType type) {
			super(name, type);
		}

		@Override
		protected double evaluate(MatchSolution solution, ExecutionResult result) {
			ArchitectureCalculationModel model = solution.getAttribute(
					ArchitectureFitnessFunction.ATTRIBUTE_CALCULATION_MODEL, 
					ArchitectureCalculationModel.class);			
			if(model == null)
				return WORST_FITNESS;
			return evaluate(solution, result.getResultGraph(), model);
		}

		protected abstract double evaluate(MatchSolution solution, EGraph eGraph,
				ArchitectureCalculationModel model);
	}	
	
	public ArchitectureFitnessFunction(EGraph initialGraph, MatchHelper matchHelper) {
		super(initialGraph, matchHelper);

//		addObjective(new ArchitectureFitnessDimension("CRA-Index", FunctionType.Maximum) { // quality metric
//			@Override
//			protected double evaluate(MatchSolution solution, EGraph eGraph, ArchitectureCalculationModel model) {
//				return model.calculateCohesion() - model.calculateCoupling();
//			}
//		});
		
		addObjective(new ArchitectureFitnessDimension("Coupling") {		
			@Override
			protected double evaluate(MatchSolution solution, EGraph eGraph, ArchitectureCalculationModel model) {
				return model.calculateCoupling();
			}
		});
		
		addObjective(new ArchitectureFitnessDimension("Cohesion", FunctionType.Maximum) {		
			@Override
			protected double evaluate(MatchSolution solution, EGraph eGraph, ArchitectureCalculationModel model) {
				return model.calculateCohesion();
			}
		});
		
//		addObjective(new ArchitectureFitnessDimension("NrClasses") { // quality metric
//			@Override
//			protected double evaluate(MatchSolution solution, EGraph eGraph, ArchitectureCalculationModel model) {
//				return model.getClasses().size();
//			}
//		});
		
		addObjective(new ArchitectureFitnessDimension("NrComponents") { // quality metric
			@Override
			protected double evaluate(MatchSolution solution, EGraph eGraph, ArchitectureCalculationModel model) {
				return model.getComponentNames().size();
			}
		});
		
//		addConstraint(new ArchitectureFitnessDimension("UnassignedFeatures") {	// constraint
//			@Override
//			protected double evaluate(MatchSolution solution, EGraph eGraph, ArchitectureCalculationModel model) {
//				return (model.getUnassignedAttributes().size() + model.getUnassignedMethods().size()) * FEATURE_PENALTY;
//			}
//		});
		
		addConstraint(new ArchitectureFitnessDimension("UnassignedClasses") {		
			@Override
			protected double evaluate(MatchSolution solution, EGraph eGraph, ArchitectureCalculationModel model) {
				return model.getUnassignedClasses().size() * PENALTY;
			}
		});
	}
	
	@Override
	protected void preprocessEvaluation(MatchSolution solution,	ExecutionResult executionResult) {
		super.preprocessEvaluation(solution, executionResult);
		// cache calculation model
		ArchitectureCalculationModel architectureModel = new ArchitectureCalculationModel(solution.getStoredResultGraph());
		solution.setAttribute(ATTRIBUTE_CALCULATION_MODEL, architectureModel);
	}
}
