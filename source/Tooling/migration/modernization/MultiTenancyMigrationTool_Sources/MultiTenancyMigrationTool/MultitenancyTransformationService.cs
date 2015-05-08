/*
Copyright 2015 Spikes N.V.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Initially developed in the context of ARTIST EU project www.artist-project.eu
*/

using Microsoft.CodeAnalysis;
using Microsoft.CodeAnalysis.CSharp.Syntax;
using Microsoft.CodeAnalysis.Formatting;
using Microsoft.CodeAnalysis.MSBuild;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MultiTenancyMigrationTool
{
    public class MultitenancyTransformationService
    {
        private const string templatesFolder = "templates";
        private Options configuration;
        private Solution originalSolution;
        private Solution solution;
        private List<string> entities = new List<string>();

        public MultitenancyTransformationService()
        {
            
        }

        public void Transform(Options configuration)
        {
            if (configuration == null)
            {
                throw new ArgumentNullException("configuration");
            }

            this.configuration = configuration;
            entities = new List<string>();

            TransformSolution();
        }

        private void TransformSolution()
        {
            MSBuildWorkspace workspace = MSBuildWorkspace.Create();

            try
            {
                originalSolution = workspace.OpenSolutionAsync(configuration.SolutionFilePath).Result;
            }
            catch(Exception ex)
            {
                Console.WriteLine("Could not load the solution");
            }
            
            solution = originalSolution;

            // Step 1: Transform the Infrastructure project
            TransformInfrastructureProject();
            // Step 2: Transform the project containing the DbContext and populate the entities
            TransformDbContextProjectAndPopulateEntities();
            // Step 3: Make the entities tenant aware.
            TransformEntities();

            if (workspace.TryApplyChanges(solution))
            {
                Console.WriteLine("The solution has been transformed.");
            }
            else
            {
                Console.WriteLine("Transforming the solution failed!");
            }
        }

        private void TransformInfrastructureProject()
        {
            Console.WriteLine("Transforming Infrastructure project");

            var project = solution.Projects.FirstOrDefault(x => x.Name == configuration.InfrastructureProjectName);

            if (project == null)
                return;

            string template = Path.Combine(templatesFolder, Templates.TenantAwareAttributeTemplate);
            var parameters = new Dictionary<string, string>()
            {
                { "Namespace", project.AssemblyName }
            };

            string content = TemplateEngine.GetEngine().ProcessTemplate(template, parameters);
            
            Document newDocument = project.AddDocument(ClassNames.TenantAwareAttributeClassName, content);
            Document formattedDocument = Formatter.FormatAsync(newDocument).Result;

            solution = formattedDocument.Project.Solution;
        }

        private void TransformDbContextProjectAndPopulateEntities()
        {
            Console.WriteLine("Transforming project containing the DbContext");

            InsertFile(configuration.ContextProjectName, Templates.EntityFrameworkConfigurationTemplate, ClassNames.EntityFrameworkConfigurationClassName, new Dictionary<string, string>()
            {
                { "Namespace", configuration.ContextProjectName }
            });

            InsertFile(configuration.ContextProjectName, Templates.TenantCommandInterceptorTemplate, ClassNames.TenantCommandInterceptorClassName, new Dictionary<string, string>()
            {
                { "Namespace", configuration.ContextProjectName }
            });

            InsertFile(configuration.ContextProjectName, Templates.TenantCommandTreeInterceptorTemplate, ClassNames.TenantCommandTreeInterceptorClassName, new Dictionary<string, string>()
            {
                { "Namespace", configuration.ContextProjectName }
            });

            InsertFile(configuration.ContextProjectName, Templates.TenantQueryVisitorTemplate, ClassNames.TenantQueryVisitorClassName, new Dictionary<string, string>()
            {
                { "Namespace", configuration.ContextProjectName }
            });

            InsertFile(configuration.ContextProjectName, Templates.TenantAwareUtilityTemplate, ClassNames.TenantAwareUtilityClassName, new Dictionary<string, string>()
            {
                { "Namespace", configuration.ContextProjectName },
                { "Context", configuration.ContextTypeName }
            });

            var project = solution.Projects.FirstOrDefault(x => x.Name == configuration.ContextProjectName);

            if (project == null)
                return;

            foreach (Document document in project.Documents)
            {
                var syntaxTree = document.GetSyntaxTreeAsync().Result;
                var root = syntaxTree.GetRoot();

                var contextClass = root.DescendantNodes().OfType<ClassDeclarationSyntax>().FirstOrDefault(_ => _.Identifier.Text == configuration.ContextTypeName);
                
                if (contextClass != null)
                {
                    var properties = contextClass.DescendantNodes().OfType<PropertyDeclarationSyntax>();

                    Console.WriteLine("Retrieving the different entities");

                    foreach (var p in properties)
                    {
                        var type = (GenericNameSyntax)p.Type;

                        if (type.Identifier.Text == "DbSet")
                        {
                            var entity = (IdentifierNameSyntax)type.TypeArgumentList.Arguments[0];
                            entities.Add(entity.Identifier.Text);
                            Console.WriteLine("    -Entity: " + entity.Identifier.Text);
                        }
                    }

                    Console.WriteLine("Modifying the " + configuration.ContextTypeName + " class.");

                    var modelCreatingMethod = contextClass.DescendantNodes().OfType<MethodDeclarationSyntax>().FirstOrDefault(_ => _.Identifier.Text == "OnModelCreating");
                    var enrichedMethod = modelCreatingMethod.AddBodyStatements(SyntaxBuilder.BuildEntityFrameworkConventionBlock().ToArray());

                    var updatedClass = contextClass.ReplaceNode(modelCreatingMethod, enrichedMethod);
                    var newRoot = root.ReplaceNode(contextClass, updatedClass);

                    var newDocument = document.WithSyntaxRoot(newRoot);
                    var formattedDocument = Formatter.FormatAsync(newDocument).Result;
                    solution = formattedDocument.Project.Solution;
                }
            }
        }

        private void InsertFile(string projectName, string templateName, string className, Dictionary<string,string> parameters)
        {
            Console.WriteLine("Inserting " + className);

            var project = solution.Projects.FirstOrDefault(x => x.Name == projectName);

            if (project == null)
                return;

            string template = Path.Combine(templatesFolder, templateName);
            
            string content = TemplateEngine.GetEngine().ProcessTemplate(template, parameters);

            Document newDocument = project.AddDocument(className, content);
            Document formattedDocument = Formatter.FormatAsync(newDocument).Result;

            solution = formattedDocument.Project.Solution;
        }

        private void TransformEntities()
        {
            Console.WriteLine("Transforming the different entities");

            foreach (var projectId in originalSolution.ProjectIds)
            {
                var project = solution.GetProject(projectId);

                foreach(var documentId in project.DocumentIds)
                {
                    var document = solution.GetDocument(documentId);

                    var syntaxTree = document.GetSyntaxTreeAsync().Result;
                    var root = syntaxTree.GetRoot();

                    var cls = root.DescendantNodes().OfType<ClassDeclarationSyntax>().FirstOrDefault();

                    if (cls == null)
                        continue;

                    // If the class identifier is one of the elements inside the list of entities, we process it.
                    if (entities.Contains(cls.Identifier.Text))
                    {
                        Console.WriteLine("    -Entity: " + cls.Identifier.Text);
                        var classWithTenantIdProperty = cls.AddMembers(SyntaxBuilder.BuildTenantIdProperty());

                        var classWithAttribute = classWithTenantIdProperty.AddAttributeLists(SyntaxBuilder.BuildTenantAwareAttribute());

                        var newRoot = root.ReplaceNode(cls, classWithAttribute);

                        var newDocument = document.WithSyntaxRoot(newRoot);
                        var formattedDocument = Formatter.FormatAsync(newDocument).Result;
                        solution = formattedDocument.Project.Solution;
                    }
                }
            }
        }
    }
}
