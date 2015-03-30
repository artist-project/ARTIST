package eu.artist.premigration.tft.tft.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;

import eu.artist.postmigration.nfrvt.eval.util.MigrationResourceUtil;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Comparison;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.EqualsOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.premigration.tft.nfrvt.resources.types.CloudProvider;
import eu.artist.premigration.tft.nfrvt.resources.types.ProgrammingLanguage;

public class MigrationGoals {

	List<HardGoal> hardGoals = new ArrayList<HardGoal>();
	List<SoftGoal> softGoals = new ArrayList<SoftGoal>();
	
	CloudProvider targetPlatform;
	ProgrammingLanguage programmingLanguage;
	
	private Map<String, Boolean> checkList = new HashMap<String, Boolean>();

	public List<HardGoal> getHardGoals() {
		return hardGoals;
	}
	public void setHardGoals(List<HardGoal> hardGoals) {
		this.hardGoals = hardGoals;
	}
	public List<SoftGoal> getSoftGoals() {
		return softGoals;
	}
	public void setSoftGoals(List<SoftGoal> softGoals) {
		this.softGoals = softGoals;
	}
	
	public void addHardGoal(HardGoal goal){
		hardGoals.add(goal);
	}
	
	public void addSoftGoal(SoftGoal goal){
		softGoals.add(goal);
	}
	
	public List<List<? extends Goal>> getAllGoals(){
		
		return Arrays.asList(hardGoals, softGoals);
	}
	
	public CloudProvider getTargetPlatform() {
		return targetPlatform;
	}
	public void setTargetPlatform(CloudProvider targetPlatform) {
		this.targetPlatform = targetPlatform;
	}
	
	public ProgrammingLanguage getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage (ProgrammingLanguage programmingLanguage){
		this.programmingLanguage = programmingLanguage;
	}
	
	public void changeItemsCheckStatus(String goal, boolean checkStatus){
		checkList.put(goal, checkStatus);
	}
	
	public boolean isItemChecked(String goal){
		return checkList.get(goal).booleanValue();
	}

	
	public boolean requiresHardGoal (String hGoal){
	//TODO: checking for the hardGoal name directly, this might cause an issue later on, think of a way to use the hardgoal properties for this check. 
		return hasHardGoal(hGoal + "Goal") && isItemChecked(hGoal + "Goal");
	}
	
	public boolean requiresSoftGoal (String sGoal){
		return hasSoftGoal(sGoal) &&  isItemChecked(sGoal);
		
	}
	
	public boolean hasHardGoal(String hGoal) {
		for (HardGoal goal : hardGoals) {
			if (goal.getName().trim().equals(hGoal)){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasSoftGoal (String sGoal){
		for (SoftGoal goal : softGoals) {
//			if (goal.getName().trim().equals(sGoal)){
			if (goal.getProperty().getProperty().getName().trim().equals(sGoal)){
				return true;
			}
		}
		return false;
	}
	
	public BigDecimal getSoftGoalThreshold (String sGoal){
		for (SoftGoal goal : softGoals) {
			if (goal.getName().trim().equals(sGoal)){
				return goal.getThreshold();
			}
		}
		return new BigDecimal(0);
	}
	
	public void setGoals(EList<Goal> goals){
		
		for (Goal goal : goals){
			
			if (goal instanceof SoftGoal){
				changeItemsCheckStatus(((SoftGoal) goal).getProperty().getProperty().getName(), true);
				softGoals.add((SoftGoal) goal);
			}
			else {
				changeItemsCheckStatus(goal.getName(), true);
				HardGoal hardGoal = (HardGoal) goal;
				hardGoals.add(hardGoal);
				
				Expression condition = hardGoal.getCondition();
				// check all comparisons, because provider condition could be nested
				List<Comparison> comparisons = MigrationResourceUtil.findByClass(condition, Comparison.class);
				for(Comparison comparison : comparisons) {
					// expect an equals comparison: ==
					if(comparison.getOperator() instanceof EqualsOperator) {
						List<InstanceSpecificationExpression> instances = MigrationResourceUtil.findByClass(comparison, InstanceSpecificationExpression.class);
						for(InstanceSpecificationExpression expr : instances) {
							InstanceSpecification instance = expr.getValue();
							if(instance instanceof EnumerationLiteral) {
								EnumerationLiteral literal = (EnumerationLiteral) instance;
								CloudProvider cProvider = CloudProvider.getByName(literal.getName());
								if (cProvider != null) {
									this.targetPlatform = cProvider;
								}
								ProgrammingLanguage pLanguage = ProgrammingLanguage.getByName(literal.getName());
								if (pLanguage != null){
									this.programmingLanguage = pLanguage;
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	//TODO: Needs to be modified to be more maintainable (more hard goals mean more if else statements at the end)
	public static final String findHardGoalLiteral(HardGoal hardGoal) {

		Expression condition = hardGoal.getCondition();
		// check all comparisons, because provider condition could be nested
		List<Comparison> comparisons = MigrationResourceUtil.findByClass(condition, Comparison.class);
		for(Comparison comparison : comparisons) {
			// expect an equals comparison: ==
			if(comparison.getOperator() instanceof EqualsOperator) {
				List<InstanceSpecificationExpression> instances = MigrationResourceUtil.findByClass(comparison, InstanceSpecificationExpression.class);
				for(InstanceSpecificationExpression expr : instances) {
					InstanceSpecification instance = expr.getValue();
					if(instance instanceof EnumerationLiteral) {
						EnumerationLiteral literal = (EnumerationLiteral) instance;
						CloudProvider cProvider = CloudProvider.getByName(literal.getName());
						if (cProvider != null) {
							return cProvider.getName();
						}
						else {
							ProgrammingLanguage pLanguage = ProgrammingLanguage.getByName(literal.getName());
							if (pLanguage != null){
								return pLanguage.getName();
							}
						}
					}
				}
			}
		}
		return null;
	}
}
