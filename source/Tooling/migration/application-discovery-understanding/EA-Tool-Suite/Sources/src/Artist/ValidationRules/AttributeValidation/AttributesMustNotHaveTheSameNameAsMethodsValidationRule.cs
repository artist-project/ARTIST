namespace LL.MDE.Components.ModelValidation.Rules.Artist.AttributeValidation
{
    using System.Collections.Generic;
    using System.Linq;
    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class AttributesMustNotHaveTheSameNameAsMethodsValidationRule : ValidationRule<IMyClass>
    {
        private string id;

        protected override string GetErrorMessage(IMyClass elementToCheck)
        {
            return string.Format("The class '{0}' has attributes with the same name as a method", elementToCheck.Name);
        }

        protected override bool IsOk(IMyClass elementToCheck)
        {
            IEnumerable<string> attributeNames = elementToCheck.OwnedElements.OfType<IMyProperty>().Select(a => a.Name).ToArray();
            IEnumerable<string> methodNames = elementToCheck.OwnedElements.OfType<IMyOperation>().Select(m => m.Name).ToArray();

            return !attributeNames.Any(methodNames.Contains);
        }

        public override string RuleGuid
        {
            get { return "{B77787E9-A9D9-4F22-B139-3880AEF40548}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Attributes must not have the same name as Methods"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All Attributes in Classes do not have the same Name as a Method"; }
        }

        public override string RuleType
        {
            get { return "Class Rules"; }
        }

        public AttributesMustNotHaveTheSameNameAsMethodsValidationRule(string id)
        {
            this.id = id;
        }
    }
}
