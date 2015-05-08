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
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SchemaMigrationTool
{
    public class MigrationService
    {
        private HashSet<string> ExcludedTables = new HashSet<string>() { "dbo.__MigrationHistory" };

        public string GenerateScript(string serverName, string databaseName, bool generic)
        {
            StringBuilder builder = new StringBuilder();

            var connectionString = string.Format("Data Source={0};Initial Catalog={1};Integrated Security=True;MultipleActiveResultSets=True", serverName, databaseName);

            Console.WriteLine(string.Format("Contacting database ({0})", connectionString));

            if (generic)
            {
                Console.WriteLine("Inserting USE statement for standalone execution.");
                builder.AppendLine(ScriptFactory.CreateUseStatement(databaseName));
            }

            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                connection.Open();

                DataTable table = connection.GetSchema("Tables");

                foreach (System.Data.DataRow row in table.Rows)
                {
                    var tableName = string.Format("{0}.{1}", row[1], row[2]);

                    Console.WriteLine(string.Format("Create update script for table {0}", tableName));

                    if (!ExcludedTables.Contains(tableName))
                    {
                        var update = ScriptFactory.InsertTenantIdColumn(tableName);
                        builder.AppendLine(update);
                    }
                }
            }

            builder.AppendLine(ScriptFactory.CreateFinalMessage());

            return builder.ToString();
        }
    }
}
