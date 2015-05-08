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

using Microsoft.CodeAnalysis.CSharp;
using Microsoft.CodeAnalysis.CSharp.Syntax;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MultiTenancyMigrationTool
{
    public static class SyntaxBuilder
    {
        public static PropertyDeclarationSyntax BuildTenantIdProperty(string identifier = Constants.DefaultTenantIdPropertyName)
        {
            var property = SyntaxFactory.PropertyDeclaration(SyntaxFactory.ParseTypeName(Constants.TenantIdTypeName), identifier)
                .WithModifiers(SyntaxFactory.TokenList(SyntaxFactory.Token(SyntaxKind.PublicKeyword)))
                .WithAccessorList(SyntaxFactory.AccessorList(
                    SyntaxFactory.List<AccessorDeclarationSyntax>(
                        new List<AccessorDeclarationSyntax>()
                        {
                            SyntaxFactory.AccessorDeclaration(SyntaxKind.GetAccessorDeclaration)
                                .WithSemicolonToken(SyntaxFactory.Token(SyntaxKind.SemicolonToken)),
                            SyntaxFactory.AccessorDeclaration(SyntaxKind.SetAccessorDeclaration)
                                .WithSemicolonToken(SyntaxFactory.Token(SyntaxKind.SemicolonToken))
                        })));

            return property;
        }

        public static AttributeListSyntax BuildTenantAwareAttribute(string colunmName = Constants.DefaultTenantIdPropertyName)
        {
            var attributeList = SyntaxFactory.AttributeList(
                SyntaxFactory.SeparatedList<AttributeSyntax>(
                    new List<AttributeSyntax>()
                    {
                        SyntaxFactory.Attribute(SyntaxFactory.ParseName(Constants.TenantAwareAttributeName))
                            .WithArgumentList(SyntaxFactory.AttributeArgumentList(
                                SyntaxFactory.SeparatedList<AttributeArgumentSyntax>(
                                    new List<AttributeArgumentSyntax>()
                                    {
                                        SyntaxFactory.AttributeArgument(
                                            SyntaxFactory.LiteralExpression(
                                            SyntaxKind.StringLiteralExpression,
                                            SyntaxFactory.Literal(colunmName)))
                                    }
                            )))
                    }));
            
            return attributeList;
        }

        public static List<StatementSyntax> BuildEntityFrameworkConventionBlock(string conventionVariableName = Constants.DefaultConventionVariableName)
        {
            var statements = new List<StatementSyntax>();

            var convention = BuildConvention(conventionVariableName);
            statements.Add(convention);

            var addStatement = BuildAddStatement("modelBuilder", conventionVariableName);
            statements.Add(addStatement);
            return statements;
        }

        private static LocalDeclarationStatementSyntax BuildConvention(string conventionVariableName)
        {
            var convention = SyntaxFactory.LocalDeclarationStatement(
                SyntaxFactory.VariableDeclaration(
                    SyntaxFactory.IdentifierName("var"),
                    SyntaxFactory.SeparatedList<VariableDeclaratorSyntax>(
                        new List<VariableDeclaratorSyntax>()
                        {
                            SyntaxFactory.VariableDeclarator(
                                SyntaxFactory.Identifier(conventionVariableName),
                                null,
                                SyntaxFactory.EqualsValueClause(
                                    SyntaxFactory.ObjectCreationExpression(
                                        SyntaxFactory.GenericName(
                                            SyntaxFactory.Identifier("System.Data.Entity.ModelConfiguration.Conventions.AttributeToTableAnnotationConvention"))
                                            .WithTypeArgumentList(SyntaxFactory.TypeArgumentList(
                                                SyntaxFactory.SeparatedList<TypeSyntax>(
                                                    new List<TypeSyntax>()
                                                    {
                                                        SyntaxFactory.ParseTypeName("TenantAwareAttribute"),
                                                        SyntaxFactory.ParseTypeName("string")
                                                    }))))
                                        .WithArgumentList(SyntaxFactory.ArgumentList(
                                            SyntaxFactory.SeparatedList<ArgumentSyntax>(
                                                new List<ArgumentSyntax>()
                                                {
                                                    SyntaxFactory.Argument(
                                                        SyntaxFactory.MemberAccessExpression(
                                                            SyntaxKind.SimpleMemberAccessExpression,
                                                            SyntaxFactory.IdentifierName("TenantAwareUtility"),
                                                            SyntaxFactory.IdentifierName("TenantAnnotation")
                                                    )),
                                                    SyntaxFactory.Argument(
                                                        SyntaxFactory.ParenthesizedLambdaExpression(
                                                            SyntaxFactory.ParameterList(
                                                                SyntaxFactory.SeparatedList<ParameterSyntax>(
                                                                    new List<ParameterSyntax>()
                                                                    {
                                                                        SyntaxFactory.Parameter(SyntaxFactory.Identifier("type")),
                                                                        SyntaxFactory.Parameter(SyntaxFactory.Identifier("attributes"))
                                                                    }
                                                                )
                                                            ),
                                                            SyntaxFactory.MemberAccessExpression(
                                                                SyntaxKind.SimpleMemberAccessExpression,
                                                                SyntaxFactory.InvocationExpression(
                                                                    SyntaxFactory.MemberAccessExpression(
                                                                        SyntaxKind.SimpleMemberAccessExpression,
                                                                        SyntaxFactory.IdentifierName("attributes"),
                                                                        SyntaxFactory.IdentifierName("Single")
                                                                    ),
                                                                    SyntaxFactory.ArgumentList()
                                                                ),
                                                                SyntaxFactory.IdentifierName("ColumnName")
                                                            )
                                                        )
                                                    )
                                                }
                                            )
                                        ))))
                        })));

            return convention;
        }

        private static ExpressionStatementSyntax BuildAddStatement(string modelBuilderVariableName, string conventionVariableName)
        {
            var expression = SyntaxFactory.ExpressionStatement(
                SyntaxFactory.InvocationExpression(
                    SyntaxFactory.MemberAccessExpression(
                        SyntaxKind.SimpleMemberAccessExpression,
                        SyntaxFactory.MemberAccessExpression(
                            SyntaxKind.SimpleMemberAccessExpression,
                            SyntaxFactory.IdentifierName(modelBuilderVariableName),
                            SyntaxFactory.IdentifierName("Conventions")),
                        SyntaxFactory.IdentifierName("Add")
                    ),
                    SyntaxFactory.ArgumentList(
                        SyntaxFactory.SeparatedList<ArgumentSyntax>(
                            new List<ArgumentSyntax>()
                            {
                                SyntaxFactory.Argument(SyntaxFactory.IdentifierName(conventionVariableName))
                            }
                        )
                    )
                )
            );

            return expression;
        }
    }
}
