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
		qualitative ApplicationReliability {
			property eu.artist.^property.catalogue.nonfunctional.Reliability
		},
		qualitative ApplicationCost {
			property eu.artist.^property.catalogue.nonfunctional.Cost
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
			ARTISTPrimitiveTypes.ProgrammingLanguage.C#
		},
		hardgoal CloudProviderGoal {
			kind required,
			priority 1,
			condition $ApplicationCloudProvider ==
			ARTISTPrimitiveTypes.CloudProvider.MicrosoftAzure
		},
		softgoal SecurityGoal {
			kind required,
			priority 1,
			property $ApplicationSecurity,
			threshold 0.2000000000000000
		},
		softgoal ReliabilityGoal {
			kind required,
			priority 1,
			property $ApplicationReliability,
			threshold 0.8900000000000000
		},
		softgoal CostGoal {
			kind required,
			priority 1,
			property $ApplicationCost,
			threshold 0.1200000000000000
		},
		softgoal MaintainabilityGoal {
			kind required,
			priority 1,
			property $ApplicationMaintainability,
			threshold 0.4700000000000000
		}
	]
}