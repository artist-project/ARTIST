namespace LL.MDE.Components.ModelValidation.Rules.Artist.ParameterValidation
{
    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;
    using System.Linq;

    internal class ParameterNameCannotContainSpaces : ValidationRuleWithAutoCorrection<IMyParameter>
    {
        private string id;

        protected override void Correct(IMyParameter elementToCorrect)
        {
            EA.Parameter parameter =
                Repository.GetMethodByGuid(elementToCorrect.Owner.Guid)
                    .Parameters.Cast<EA.Parameter>()
                    .SingleOrDefault(p => p.ParameterGUID == elementToCorrect.Guid);
            if (parameter != null)
            {
                parameter.Name = elementToCorrect.Name.TrimSpacesToCamelCase();
                parameter.Update();
            }
        }

        protected override string CorrectionMessage(IMyParameter elementToCorrect)
        {
            return string.Format("The parameter will be renamed to {0}", elementToCorrect.Name.TrimSpacesToCamelCase());
        }

        protected override string GetErrorMessage(IMyParameter elementToCheck)
        {
            return string.Format(
                "The name parameter '{0}' of method '{1}' of class '{2}' contains spaces",
                elementToCheck.Name,
                elementToCheck.Owner.Name,
                elementToCheck.Owner.Owner.Name);
        }

        protected override bool IsOk(IMyParameter elementToCheck)
        {
            return !elementToCheck.Name.Trim().Contains(" ");
        }

        public override string RuleGuid
        {
            get { return "{D13E4A73-32BD-4D1D-B422-0625343F73E9}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Parameters must have names without spaces"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All Parameters have names without spaces"; }
        }

        public override string RuleType
        {
            get { return "Parameter Rule"; }
        }

        public ParameterNameCannotContainSpaces(string id)
        {
            this.id = id;
        }
    }
}
