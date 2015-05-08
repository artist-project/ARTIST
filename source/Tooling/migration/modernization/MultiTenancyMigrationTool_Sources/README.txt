MultitenancyMigrationTool, Version 1.0.0

=================================

ABOUT
-----
The MultitenancyMigrationTool is a command-line tool enabling the migration/optimization
of a Visual Studio solution/project based on Entity Framework from a single-tenant 
application towards a multitenant application. In essence this tool performs one single
application of a migration pattern on an application's source base. 


=========================================================================================

INCLUDED FUNCTIONALITIES
------------------------

=========================================================================================

KNOWN ISSUES
------------	

=========================================================================================

EXPECTED FUNCTIONALITIES
------------------------
- Perform migration of source base into a modified source base implementing the multi-
tenancy optimization pattern.

=========================================================================================

INSTALLATION AND USER MANUAL
----------------------------
The tool is a commandline tool and therefore does not require any installation. However,
at the moment of writing there are a number of requirements in order to execute the tool:

- Visual Studio 2015
- Visual Studio 2015 SDK
- SDK Templates VSIX package
- Syntax Visualizer VSIX package

The tool can be executed as follows:

MultitenancyMigrationTool 
	--SolutionFilePath C:\Repositories\artist-tiab\SingleTenantApplication\SingleTenantApplication.sln 
	--ContextProjectName SingleTenantApplication.Core 
	--ContextTypeName ApplicationDbContext 
	--InfrastructureProjectName SingleTenantApplication.Core

--SolutionFilePath: The path to the main solution one wants to transform/modernize
--ContextProjectName: The name of the project (inside the solution) that contains the DatabaseContext (Entity Framework)
--ContextTypeName: The name of the class that refers to the Database/Code we want to transform/modernize 
	(in case there are multiple DbContext elements)
--InfrastructureProjectName: The project inside the solution which contains infrastructure code
	(in case there are multiple projects). 