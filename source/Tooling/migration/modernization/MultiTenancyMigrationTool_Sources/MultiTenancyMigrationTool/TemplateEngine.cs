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
using System.IO;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace MultiTenancyMigrationTool
{
    public class TemplateEngine
    {
        private const string tagPattern = @"<%=(?<name>.*?)%>";
        private const string defaultReplacement = "<<TO FILL>>";

        static readonly TemplateEngine instance = new TemplateEngine();

        private TemplateEngine()
        {
        }

        public static TemplateEngine GetEngine()
        {
            return instance;
        }

        public string ProcessTemplate(string template, Dictionary<string, string> parameters)
        {
            var file = File.ReadAllText(template);

            var result = Regex.Replace(file, tagPattern, (m) =>
            {
                var tag = m.Groups["name"].Value.Trim();
                return (parameters.ContainsKey(tag)) ? parameters[tag] : defaultReplacement;
            });

            return result;
        }
    }
}
