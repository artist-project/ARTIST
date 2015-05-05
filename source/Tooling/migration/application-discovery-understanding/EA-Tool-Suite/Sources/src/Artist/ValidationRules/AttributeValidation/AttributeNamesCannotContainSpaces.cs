namespace LL.MDE.Components.ModelValidation.Rules.Artist.AttributeValidation
{
    using System.Linq;
    using System.Text;

    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class AttributeNamesCannotContainSpaces : ValidationRuleWithAutoCorrection<IMyProperty>
    {
        private string id;

        protected override string GetErrorMessage(IMyProperty elementToCheck)
        {
            return string.Format(
                "The attribute '{0}' of the class '{1}' has one or more spaces in the name",
                elementToCheck.Name,
                elementToCheck.Owner.Name);
        }

        protected override bool IsOk(IMyProperty elementToCheck)
        {
            return !elementToCheck.Name.Trim().Contains(" ");
        }

        public override string RuleGuid
        {
            get { return "{FB184091-DDA0-4014-9D56-89DE558DDE28}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Attribute names can not contain spaces"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All Attributes have names without spaces"; }
        }

        public override string RuleType
        {
            get { return "Attribute Rule"; }
        }

      

        protected override void Correct(IMyProperty elementToCorrect)
        {
            EA.Attribute element = Repository.GetAttributeByGuid(elementToCorrect.Guid);
            element.Name = elementToCorrect.Name.TrimSpacesToCamelCase();
            element.Update();
        }

        protected override string CorrectionMessage(IMyProperty elementToCorrect)
        {
            return string.Format("The attribute will be renamed to {0}", elementToCorrect.Name.TrimSpacesToCamelCase());
        }

        public AttributeNamesCannotContainSpaces(string id)
        {
            this.id = id;
        }
    }
}
