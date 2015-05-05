package at.ac.tuwien.big.moea.operator.mutation;

import java.util.List;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.operator.IProbabilityVariation;
import at.ac.tuwien.big.moea.util.CollectionUtil;

public class CompoundMutationVariation extends AbstractMutationVariation {
	
	private List<IProbabilityVariation> operators;

	public CompoundMutationVariation(double probability) {
		this(probability, new IProbabilityVariation[] { });
	}
	
	public CompoundMutationVariation(double probability, IProbabilityVariation... operators) {
		super(probability);
		this.operators = CollectionUtil.newList(operators);
	}
	
	public CompoundMutationVariation addOperator(IProbabilityVariation operator) {
		this.operators.add(operator);
		return this;
	}

	public List<IProbabilityVariation> getOperators() {
		return operators;
	}
	
	@Override
	public Solution[] doEvolve(Solution[] parents) {
		Solution[] evolved = parents;
		for(IProbabilityVariation op : getOperators())
			evolved = op.evolve(evolved);
		return evolved;
	}

}
