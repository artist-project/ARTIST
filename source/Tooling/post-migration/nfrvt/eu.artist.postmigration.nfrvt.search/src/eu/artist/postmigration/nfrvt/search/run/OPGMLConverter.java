package eu.artist.postmigration.nfrvt.search.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadBehavior;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.modelexecution.fuml.nfr.MarteUtil;
import org.modelexecution.fuml.nfr.simulation.workload.ServiceCenter;
import org.modelexecution.fuml.nfr.simulation.workload.Workload;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadScenario;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadScenarioStep;
import org.moeaframework.core.variable.RealVariable;

import com.google.common.collect.Lists;

import at.ac.tuwien.big.moea.variable.RandomIntegerVariable;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.selector.UMLPackageSelector;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.ClassQuery;
import eu.artist.postmigration.nfrvt.resources.constants.ARTIST_PatternCatalogue;
import eu.artist.postmigration.opgml.gml.Property;
import eu.artist.postmigration.opgml.gml.Property.Direction;
import eu.artist.postmigration.opgml.gml.RealGoal;
import eu.artist.postmigration.opgml.gml.uml.UMLClass;
import eu.artist.postmigration.opgml.gml.uml.UMLElement;
import eu.artist.postmigration.opgml.gml.uml.UMLMethod;
import eu.artist.postmigration.opgml.gml.uml.UMLModel;
import eu.artist.postmigration.opgml.gml.uml.UMLScenario;
import eu.artist.postmigration.opgml.input.PatternImpactEstimates;
import eu.artist.postmigration.opgml.variable.AutoScalingTemplate;
import eu.artist.postmigration.opgml.variable.AutoScalingTemplate.AutoScalingValue;
import eu.artist.postmigration.opgml.variable.CacheTemplate;
import eu.artist.postmigration.opgml.variable.FederatedIdentityTemplate;
import eu.artist.postmigration.opgml.variable.FixedScalingTemplate;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;

public class OPGMLConverter {
	private UMLModel umlModel = new UMLModel();
	private List<UMLScenario> umlScenarios = new ArrayList<>();
	private eu.artist.postmigration.opgml.gml.GoalModel goalModel = new eu.artist.postmigration.opgml.gml.GoalModel();
	private PatternImpactEstimates impactEstimates = new PatternImpactEstimates();
	
	private Map<IPatternTemplateVariable, Pattern> opgmlToPatternMap = new HashMap<>();
	private Map<AppliedProperty, Property> propertyToOpgmlMap = new HashMap<>();
	private Map<UMLClass, NamedElement> opgmlToNamedElementMap = new TreeMap<>();
	
	public OPGMLConverter(MigrationResourceSet set, GoalModel goals, Workload workload) {
		
		opgmlToNamedElementMap.put(UMLModel.COMPLETE_APPLICATION, workload.getModelElement());
		for(ServiceCenter center : workload.getServiceCenters()) {
			getUmlModel().addServiceClass(center.getName());
			opgmlToNamedElementMap.put(getUmlModel().getElement(center.getName()), center.getUmlElement());
		}
		
		UMLPackageSelector selector = new UMLPackageSelector(workload.getModelElement());
		List<Class> modelClasses = selector.selectFromModel(new ClassQuery<>(Class.class).setStrictType(true));
		for(Class clazz : modelClasses) {
			EcoreUtil.resolve(clazz, set.getResourceSet());
			if(!getUmlModel().isServiceClass(clazz.getName()) && 
					MarteUtil.getFirstStereotype(clazz, GaAnalysisContext.class) == null &&
					MarteUtil.getFirstStereotype(clazz, GaResourcesPlatform.class) == null &&
					MarteUtil.getFirstStereotype(clazz, GaWorkloadBehavior.class) == null &&
					MarteUtil.getFirstStereotype(clazz, HwComputingResource.class) == null) {
				getUmlModel().addEntityClass(clazz.getName());
				opgmlToNamedElementMap.put(getUmlModel().getElement(clazz.getName()), clazz);
			}
		}
	
		for(WorkloadScenario scenario : workload.getScenarios()) {
			UMLScenario umlScenario = new UMLScenario(scenario.getName());
			for(WorkloadScenarioStep step : scenario.getSteps())
				umlScenario.addStep(new UMLMethod(
						getUmlModel().getElement(step.getServiceCenter().getName()), 
						step.getName(), 
						Double.parseDouble(step.getGaStep().getExecTime().get(0))));
			umlScenarios.add(umlScenario);
		}
		
		opgmlToPatternMap.put(
				new CacheTemplate(
						getUmlModel().getEntityClassesArray()), 
				ARTIST_PatternCatalogue.Element.CACHING_PATTERN);
		
		opgmlToPatternMap.put(
				new FixedScalingTemplate(
						getUmlModel().getServiceClassesArray(), 
						new RandomIntegerVariable(2, 5)), 
				ARTIST_PatternCatalogue.Element.HORIZONTALLY_SCALING_COMPUTE_PATTERN);
		
		opgmlToPatternMap.put(
				new AutoScalingTemplate(
						getUmlModel().getServiceClassesArray(), 
						new RandomIntegerVariable(1, 4),
						new RandomIntegerVariable(3, 5),
						AutoScalingValue.values(),
						new RealVariable(0.0, 1.0),
						new RealVariable(0.0, 1.0)), 
				ARTIST_PatternCatalogue.Element.AUTO_SCALING_PATTERN);
		
		opgmlToPatternMap.put(new FederatedIdentityTemplate(getUmlModel().getModel()), 
				ARTIST_PatternCatalogue.Element.FEDERATED_IDENTITY);
		
		
		
		impactEstimates
			.setPriceOfChachePerTimeUnit(0.0015)
			.setPriceOfInstancePerTimeUnit(0.0010);
		
		for(UMLClass serviceClass : getUmlModel().getServiceClasses())
			impactEstimates.addInstanceSpeedUp(serviceClass, 0.9);
		
		for(UMLClass entityClass : getUmlModel().getEntityClasses())
			impactEstimates.addCacheSpeedUp(entityClass, 1.0);
		
		
		for(AppliedProperty property : goals.getAppliedProperties()) {
			propertyToOpgmlMap.put(property,
					new Property(
							property.getProperty().getName(),
							getRange(property.getProperty()), 
							getDirection(property.getProperty().getDirection())));
		}
		
		for(Goal goal : goals.getGoals()) {
			if(goal instanceof SoftGoal) {
				getGoalModel().addGoal(
						new RealGoal(
								getUMLElement(((SoftGoal) goal).getProperty()), 
								propertyToOpgmlMap.get(((SoftGoal) goal).getProperty()), 
								((SoftGoal) goal).getThreshold().doubleValue(), 
								goal.getPriority()));
			}
		}
	}
	
	protected RealVariable getRange(eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property property) {
		if(property.getName().equals("AverageResponseTime"))
			return new RealVariable(0.0, Double.POSITIVE_INFINITY);
		if(property instanceof QualitativeProperty)
			return new RealVariable(0.0, 1.0);
		return new RealVariable(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
	}
	
	protected UMLElement getUMLElement(AppliedProperty property) {
		if(property.getContext().isEmpty() || property.getContext().get(0) instanceof Model)
			return getUmlModel().getModel();
		
		String name = property.getContext().get(0).getName();
		return getUmlModel().getElement(name);
	}
	
	protected Direction getDirection(DirectionKind kind) {
		switch(kind) {
		case DECREASING:
			return Direction.Decreasing;
		case INCREASING:
			return Direction.Increasing;
		case RANGE:
			return Direction.Range;
		}
		return null;
	}
	
	public UMLModel getUmlModel() {
		return umlModel;
	}
	
	public List<UMLScenario> getUmlScenarios() {
		return umlScenarios;
	}
	
	public IPatternTemplateVariable[] getConfigurations() {
		return opgmlToPatternMap.keySet().toArray(new IPatternTemplateVariable[0]);
	}
	
	public eu.artist.postmigration.opgml.gml.GoalModel getGoalModel() {
		return goalModel;
	}
	
	public PatternImpactEstimates getImpactEstimates() {
		return impactEstimates;
	}
	
	public Transformation toTransformation(IPatternTemplateVariable configuration) {
		Pattern pattern = opgmlToPatternMap.get(configuration);
		UMLElement application = configuration.getApplication();
		ArrayList<NamedElement> context = Lists.newArrayList(opgmlToNamedElementMap.get(application));
		
		if(configuration instanceof CacheTemplate)
			return MigrationFactory.createTransformation(
					pattern.getName() + "Transformation", 
					pattern, null, null, 
					context, null);
		if(configuration instanceof FederatedIdentityTemplate)
			return MigrationFactory.createTransformation(
					pattern.getName() + "Transformation", 
					pattern, null, null, 
					context, null);
		if(configuration instanceof FixedScalingTemplate)
			return MigrationFactory.createTransformation(
					pattern.getName() + "Transformation", 
					pattern, null, null, 
					context,
					"instances = " + configuration.getParameterValue(FixedScalingTemplate.getInstancesParameter()));
		if(configuration instanceof AutoScalingTemplate) {
			AutoScalingTemplate config = (AutoScalingTemplate) configuration;
			return MigrationFactory.createTransformation(
					pattern.getName() + "Transformation", 
					pattern, null, null, 
					context,
					"minInstances = " + config.getMinInstances() + ", " +
					"maxInstances = " + config.getMaxInstances() + ", " +
					"property = " + config.getAutoScalingValue());
		}
		return null;
	}
}
