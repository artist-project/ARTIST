goalmodel MATGeneratedGoalModel {
	workloads [
	]
	applied-properties [
		quantitative ApplicationProgrammingLanguage {
			property eu.artist.^property.catalogue.static.ProgrammingLanguage
		},
		quantitative ApplicationCloudProvider {
			property eu.artist.^property.catalogue.static.CloudProvider
		},
		qualitative ApplicationSecurity {
			property eu.artist.^property.catalogue.nonfunctional.Security
		},
		qualitative ApplicationPerformanceEfficiency {
			property eu.artist.^property.catalogue.nonfunctional.PerformanceEfficiency
		},
		qualitative ApplicationReliability {
			property eu.artist.^property.catalogue.nonfunctional.Reliability
		},
		qualitative ApplicationScalability {
			property eu.artist.^property.catalogue.nonfunctional.Scalability
		},
		qualitative ApplicationElasticity {
			property eu.artist.^property.catalogue.nonfunctional.Elasticity
		},
		qualitative ApplicationMaintainability {
			property eu.artist.^property.catalogue.nonfunctional.Maintainability
		}
	]
	goals [
		hardgoal ProgrammingLanguageGoal {
			kind required,
			priority 1,
			condition $ApplicationProgrammingLanguage ==
			ARTISTPrimitiveTypes.ProgrammingLanguage.Java
		},
		hardgoal CorrectCloudProvider {
			kind required,
			priority 1,
			condition $ChosenCloudProvider == ARTISTTypes.CloudProvider.GoogleAppEngine	
		},
		softgoal SecurityGoal {
			kind required,
			priority 1,
			property $ApplicationSecurity,
			threshold 0.2000000000000000
		},
		softgoal PerformanceEfficiencyGoal {
			kind required,
			priority 1,
			property $ApplicationPerformanceEfficiency,
			threshold 0.7000000000000000
		},
		softgoal ReliabilityGoal {
			kind required,
			priority 1,
			property $ApplicationReliability,
			threshold 0.8900000000000000
		},
		softgoal ScalabilityGoal {
			kind required,
			priority 1,
			property $ApplicationScalability,
			threshold 0.3400000000000000
		},
		softgoal ElasticityGoal {
			kind required,
			priority 1,
			property $ApplicationElasticity,
			threshold 0.6000000000000000
		},
		softgoal MaintainabilityGoal {
			kind required,
			priority 1,
			property $ApplicationMaintainability,
			threshold 0.4700000000000000
		}
	]
}