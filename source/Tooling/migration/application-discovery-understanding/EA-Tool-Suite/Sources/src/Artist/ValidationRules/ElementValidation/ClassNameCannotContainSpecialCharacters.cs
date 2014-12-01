namespace LL.MDE.Components.ModelValidation.Rules.Artist.ElementValidation
{
    using System.Runtime.Remoting;

    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class ClassNameCannotContainSpecialCharacters : ValidationRuleWithAutoCorrection<IMyClass>
    {
        private string id;

        protected override void Correct(IMyClass elementToCorrect)
        {
            EA.Element element = Repository.GetElementByGuid(elementToCorrect.Guid);
            element.Name = elementToCorrect.Name.FilterSpecialCharacters();
            element.Update();
        }

        protected override string CorrectionMessage(IMyClass elementToCorrect)
        {
            return string.Format("The class will be renamed to {0}", elementToCorrect.Name.FilterSpecialCharacters());
        }

        protected override string GetErrorMessage(IMyClass elementToCheck)
        {
            return string.Format(
                "The class '{0}' has special characters in its name or starts with a number",
                elementToCheck.Name);
        }

        protected override bool IsOk(IMyClass elementToCheck)
        {
            return elementToCheck.Name.ContainsOnlyLettersAndDigitsAndSpacesAndUnderscoresAndDoesNotStartWithNumber();
        }

        public override string RuleGuid
        {
            get { return "{CDEDEC7D-E571-4FB8-B673-93B2505BB7E8}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Class names can not contain special characters or start with numbers"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All classnames do not contain special characters or start with numbers"; }
        }

        public override string RuleType
        {
            get { return "Class Rule"; }
        }

        public ClassNameCannotContainSpecialCharacters(string id)
        {
            this.id = id;
        }
    }
}
