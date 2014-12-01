namespace LL.MDE.Components.ModelValidation.Rules.Artist
{
    using System.Collections.Generic;

    internal class CSharpKeyWords
    {
        private static string[] keywords;
        private static string[] contextualKeywords;

        public static IEnumerable<string> KeyWords
        {
            get
            {
                if (keywords == null)
                {
                    CreateKeywords();
                }
                return keywords;
            }
        }

        public static IEnumerable<string> ContextualKeyWords
        {
            get 
            {
                if (contextualKeywords == null)
                {
                    CreateContextualKeyWords();
                }
                return contextualKeywords;
            }
        }

        private static void CreateContextualKeyWords()
        {

            contextualKeywords = new[]{
                "add",
                "async",
                "dynamic",
                "global",
                "join",
                "partial",
                "select",
                "var",
                "yield",
                "alias",
                "await",
                "from",
                "group",
                "let",
                "set",
                "where",
                "ascending",
                "descending",
                "get",
                "into",
                "orderby",
                "remove",
                "value"};
        }

        private static void CreateKeywords()
        {
            keywords = new[]
            {
                "abstract",
                "break",
                "char",
                "continue",
                "do",
                "event",
                "finally",
                "foreach",
                "in",
                "internal",
                "namespace",
                "operator",
                "params",
                "readonly",
                "sealed",
                "static",
                "this",
                "typeof",
                "unsafe",
                "void",
                "as",
                "byte",
                "checked",
                "decimal",
                "double",
                "explicit",
                "fixed",
                "goto",
                "is",
                "new",
                "out",
                "private",
                "ref",
                "short",
                "string",
                "throw",
                "uint",
                "ushort",
                "volatile",
                "base",
                "case",
                "class",
                "default",
                "else",
                "extern",
                "float",
                "if",
                "int",
                "lock",
                "null",
                "protected",
                "return",
                "sizeof",
                "struct",
                "true",
                "ulong",
                "using",
                "while",
                "bool",
                "catch",
                "const",
                "delegate",
                "enum",
                "false",
                "for",
                "implicit",
                "interface",
                "long",
                "object",
                "override",
                "public",
                "sbyte",
                "stackalloc",
                "switch",
                "try",
                "unchecked",
                "virtual"                
            };
        }
    }
}
