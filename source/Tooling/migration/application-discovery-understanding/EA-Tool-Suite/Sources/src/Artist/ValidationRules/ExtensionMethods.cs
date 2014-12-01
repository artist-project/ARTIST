namespace LL.MDE.Components.ModelValidation.Rules.Artist
{
    using System.Text;

    internal static class ExtensionMethods

    {
        public static string TrimSpacesToCamelCase(this string original)
        {
            string[] name = original.Split(' ');
            StringBuilder result = new StringBuilder(name[0]);

            for (int i = 1; i < name.Length; i++)
            {
                result.Append(name[i].Substring(0, 1).ToUpper());
                result.Append(name[i].Substring(1).ToLower());
            }
            return result.ToString();
        }

        public static string FilterSpecialCharacters(this string original)
        {
            StringBuilder result = new StringBuilder();
            
            if (char.IsLetter(original[0]) || original[0] == '_')
            {
                result.Append(original[0]);
            }

            for (int i = 1; i < original.Length; i++)
            {
                if (original[i].IsLetterOrDigitOrUnderscoreOrSpace())
                {
                    result.Append(original[i]);
                }
            }
            return result.ToString();
        }

        public static bool IsLetterOrDigitOrUnderscoreOrSpace(this char character)
        {
            return char.IsLetterOrDigit(character) || character == '_' || character == ' ';
        }

        public static bool ContainsOnlyLettersAndDigitsAndSpacesAndUnderscoresAndDoesNotStartWithNumber(this string name)
        {
            name = name.Trim();
            if (name[0] != '_' && !char.IsLetter(name[0]))
            {
                return false;
            }

            for (int i = 1; i < name.Length; i++)
            {
                if (!name[i].IsLetterOrDigitOrUnderscoreOrSpace())
                {
                    return false;
                }
            }

            return true;
        }
    }
}
