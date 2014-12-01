namespace LL.MDE.Components.ModelValidation.Rules.Artist.ElementValidation
{
    using System.CodeDom;

    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;
    
    internal class ClassNameCannotContainSpacesValidationRule : ValidationRuleWithAutoCorrection<IMyClass>
    {
        private string id;

        public override string RuleGuid
        {
            get { return "{5DDDA414-5925-4290-A81C-CF3BB4D44864}"; }
        }

        protected override string GetErrorMessage(IMyClass elementToCheck)
        {
            return string.Format("The Class {0} has one or more spaces in it's name", elementToCheck.Name);
        }

        protected override bool IsOk(IMyClass elementToCheck)
        {
            return !elementToCheck.Name.Trim().Contains(" ");
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Class names can not contain spaces"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All Classes have names without spaces"; }
        }

        public override string RuleType
        {
            get { return "Class Rule"; }
        }

        protected override void Correct(IMyClass elementToCorrect)
        {
            EA.Element element = Repository.GetElementByGuid(elementToCorrect.Guid);
            element.Name = elementToCorrect.Name.TrimSpacesToCamelCase();
            element.Update();
        }

        protected override string CorrectionMessage(IMyClass elementToCorrect)
        {
            return string.Format("The class is renamed to {0}", elementToCorrect.Name.TrimSpacesToCamelCase());
        }

        public ClassNameCannotContainSpacesValidationRule(string id)
        {
            this.id = id;
        }
    }
}
