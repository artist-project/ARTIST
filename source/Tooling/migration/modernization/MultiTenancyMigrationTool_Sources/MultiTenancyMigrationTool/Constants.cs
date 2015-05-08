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

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MultiTenancyMigrationTool
{
    public static class Constants
    {
        public const string TenantIdTypeName = "string";
        public const string DefaultTenantIdPropertyName = "TenantId";
        public const string TenantAwareAttributeName = "TenantAware";

        public const string ModelBuilderVariableName = "modelBuilder";
        public const string DefaultConventionVariableName = "conv";

        public const string DefaultFileExtension = ".cs";
    }

    public static class Templates
    {
        public const string EntityFrameworkConfigurationTemplate = "EntityFrameworkConfiguration.template";
        public const string TenantAwareAttributeTemplate = "TenantAwareAttribute.template";
        public const string TenantAwareUtilityTemplate = "TenantAwareUtility.template";
        public const string TenantCommandInterceptorTemplate = "TenantCommandInterceptor.template";
        public const string TenantCommandTreeInterceptorTemplate = "TenantCommandTreeInterceptor.template";
        public const string TenantQueryVisitorTemplate = "TenantQueryVisitor.template";
    }

    public static class ClassNames
    {
        public const string EntityFrameworkConfigurationClassName = "EntityFrameworkConfiguration.cs";
        public const string TenantAwareAttributeClassName = "TenantAwareAttribute.cs";
        public const string TenantAwareUtilityClassName = "TenantAwareUtility.cs";
        public const string TenantCommandInterceptorClassName = "TenantCommandInterceptor.cs";
        public const string TenantCommandTreeInterceptorClassName = "TenantCommandTreeInterceptor.cs";
        public const string TenantQueryVisitorClassName = "TenantQueryVisitor.cs";
    }
}
