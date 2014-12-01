namespace LL.MDE.Components.ModelValidation.Rules.Artist.ParameterValidation
{
    using System.Linq;
    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class ParameterNamesCannotContainSpecialCharacters : ValidationRuleWithAutoCorrection<IMyParameter>
    {
        private readonly string id;

        protected override void Correct(IMyParameter elementToCorrect)
        {
            EA.Method element = Repository.GetMethodByGuid(elementToCorrect.Owner.Guid);
            EA.Parameter parameter = element.Parameters.Cast<EA.Parameter>().SingleOrDefault(p => p.ParameterGUID == elementToCorrect.Guid);
            if (parameter == null)
            {
                return;
            }
            parameter.Name = elementToCorrect.Name.FilterSpecialCharacters();
            parameter.Update();
        }

        protected override string CorrectionMessage(IMyParameter elementToCorrect)
        {
            return string.Format("The parameter will be renamed to '{0}'", elementToCorrect.Name.FilterSpecialCharacters());
        }

        protected override string GetErrorMessage(IMyParameter elementToCheck)
        {
            return
                string.Format(
                    "The parameter '{0}' of operation '{1}' of class '{2}' contains special characters or starts with a number",
                    elementToCheck.Name,elementToCheck.Owner.Name, elementToCheck.Owner.Owner.Name);
        }

        protected override bool IsOk(IMyParameter elementToCheck)
        {
            return elementToCheck.Name.ContainsOnlyLettersAndDigitsAndSpacesAndUnderscoresAndDoesNotStartWithNumber();
        }

        public override string RuleGuid
        {
            get { return "{AC811AFF-FC11-4407-96E1-C2C0C83759E7}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Parameter names can not contain special characters or start with a number"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All parameter names do not contain special characters or start with a number"; }
        }

        public override string RuleType
        {
            get { return "Parameter Rule"; }
        }

        public ParameterNamesCannotContainSpecialCharacters(string id)
        {
            this.id = id;
        }
    }
}
