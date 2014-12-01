namespace LL.MDE.Components.ModelValidation.Rules.Artist.ParameterValidation
{
    using System.CodeDom;
    using System.Linq;
    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class ParameterNameCannotBeCsharpKeyword : ValidationRuleWithAutoCorrection<IMyParameter>
    {
        private string id;

        protected override string GetErrorMessage(IMyParameter elementToCheck)
        {
            return string.Format(
                "The Parameter '{0}' of operation '{1}' in class {2} has a c# keyword as name",
                elementToCheck.Name,
                elementToCheck.Owner.Name,
                elementToCheck.Owner.Owner.Name);
        }

        protected override bool IsOk(IMyParameter elementToCheck)
        {
            return !CSharpKeyWords.KeyWords.Contains(elementToCheck.Name);
        }

        public override string RuleGuid
        {
            get { return "{B592FFFB-E77A-4BEF-9796-9E816282292C}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Parameter names can not be c# keywords"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All Parameters have names other than c# keywords"; }
        }

        public override string RuleType
        {
            get { return "Parameter Rules"; }
        }

        protected override void Correct(IMyParameter elementToCorrect)
        {
            EA.Method element = Repository.GetMethodByGuid(elementToCorrect.Owner.Guid);
            EA.Parameter parameter = element.Parameters.Cast<EA.Parameter>().SingleOrDefault(p => p.ParameterGUID == elementToCorrect.Guid);
            if (parameter == null)
            {
                return;
            }
            parameter.Name = "_" + elementToCorrect.Name;
            parameter.Update();
        }

        protected override string CorrectionMessage(IMyParameter elementToCorrect)
        {
            return string.Format("The parameter will be renamed to _{0}", elementToCorrect.Name);
        }

        public ParameterNameCannotBeCsharpKeyword(string id)
        {
            this.id = id;
        }
    }
}
