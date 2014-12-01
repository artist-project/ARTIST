namespace LL.MDE.Components.ModelValidation.Rules.Artist.AttributeValidation
{
    using LL.MDE.Components.ModelValidation.ValdationRule;
    using System.Linq;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class AttributeNameCannotBeCsharpKeyword : ValidationRuleWithAutoCorrection<IMyProperty>
    {
        private string id;

        protected override string GetErrorMessage(IMyProperty elementToCheck)
        {
            return string.Format("The attribute '{0}' of the class '{1}' has a C# keyword as name.", elementToCheck.Name, elementToCheck.Class.Name);
        }

        protected override bool IsOk(IMyProperty elementToCheck)
        {
            return !CSharpKeyWords.KeyWords.Contains(elementToCheck.Name);
        }

        public override string RuleGuid
        {
            get { return "{1E469A98-0D56-4CA3-A541-940C2441B4E8}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Attribute names can not be c# keywords"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All Attributes have names that are not C# keywords"; }
        }

        public override string RuleType
        {
            get { return "Attribute Rule"; }
        }

        protected override void Correct(IMyProperty elementToCorrect)
        {
            EA.Attribute element = Repository.GetAttributeByGuid(elementToCorrect.Guid);
            element.Name = "_" + elementToCorrect.Name;
            element.Update();
        }

        protected override string CorrectionMessage(IMyProperty elementToCorrect)
        {
            return string.Format("The attribute is renamed to _{0}", elementToCorrect.Name);
        }

        public AttributeNameCannotBeCsharpKeyword(string id)
        {
            this.id = id;
        }
    }
}
