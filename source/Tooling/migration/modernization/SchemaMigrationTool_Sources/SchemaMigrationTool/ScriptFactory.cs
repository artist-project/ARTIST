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

namespace SchemaMigrationTool
{
    public static class ScriptFactory
    {
        public static string CreateUseStatement(string database)
        {
            StringBuilder builder = new StringBuilder();

            builder.AppendLine("GO");
            builder.AppendLine(string.Format("USE {0};", database));

            return builder.ToString();
        }

        public static string InsertTenantIdColumn(string table)
        {
            StringBuilder builder = new StringBuilder();

            builder.AppendLine("GO");
            builder.AppendLine(string.Format("PRINT N'Altering {0}...';", table));
            builder.AppendLine();
            builder.AppendLine("GO");
            builder.AppendLine(string.Format("ALTER TABLE {0}", table));
            builder.AppendLine(Indent(3) + "ADD TenantId NVARCHAR(MAX)NULL;");

            return builder.ToString();
        }

        public static string CreateFinalMessage()
        {
            StringBuilder builder = new StringBuilder();

            builder.AppendLine("GO");
            builder.AppendLine("PRINT N'Update complete.';");
            builder.AppendLine();
            builder.AppendLine("GO");

            return builder.ToString();
        }

        public static string Indent(int count)
        {
            return "".PadLeft(count);
        }
    }
}
