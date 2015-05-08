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

using CommandLine;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SchemaMigrationTool
{
    public class Options
    {
        [Option("Server", HelpText = "The Server name.")]
        public string ServerName { get; set; }

        [Option("Database", HelpText = "The Database name.")]
        public string DatabaseName { get; set; }

        [Option("Generic", HelpText = "Generate generic script or not")]
        public bool Generic { get; set; }

        [Option("Script", HelpText = "The file name of the script to be generated.", Required = true, DefaultValue = "script.sql")]
        public string ScriptFilename { get; set; }
    }
}
