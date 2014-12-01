namespace LL.MDE.Components.ModelValidation.Rules.Artist.AttributeValidation
{
    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class AttributeNameCannotContainSpecialCharacters : ValidationRuleWithAutoCorrection<IMyProperty>
    {
        private readonly string id;

        protected override void Correct(IMyProperty elementToCorrect)
        {
            EA.Element element = Repository.GetElementByGuid(elementToCorrect.Guid);
            element.Name = elementToCorrect.Name.FilterSpecialCharacters();
            element.Update();
        }

        protected override string CorrectionMessage(IMyProperty elementToCorrect)
        {
            return string.Format("The attribute will be renamed to '{0}'",elementToCorrect.Name.FilterSpecialCharacters());
        }

        protected override string GetErrorMessage(IMyProperty elementToCheck)
        {
            return string.Format("The name of attribute '{0}' of class '{1}' contains special characters or starts with a number",elementToCheck.Name, elementToCheck.Owner.Name);
        }

        protected override bool IsOk(IMyProperty elementToCheck)
        {
            return elementToCheck.Name.ContainsOnlyLettersAndDigitsAndSpacesAndUnderscoresAndDoesNotStartWithNumber();
        }

        public override string RuleGuid
        {
            get { return "{9886A5FB-16CD-4948-AAE1-0BCC8EFDF795}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Attribute names can not contain special characters or start with numbers"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All attribute names do not contain special characters or start with a number"; }
        }

        public override string RuleType
        {
            get { return "Attribute Rule"; }
        }

        public AttributeNameCannotContainSpecialCharacters(string id)
        {
            this.id = id;
        }
    }
}
