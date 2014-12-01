namespace LL.MDE.Components.ModelValidation.Rules.Artist.OperationValidation
{
    using System.Linq;

    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class OperationNamesCannotContainSpaces : ValidationRuleWithAutoCorrection<IMyOperation>
    {
        private readonly string id;

        protected override void Correct(IMyOperation elementToCorrect)
        {
            EA.Element theClass = Repository.GetElementByGuid(elementToCorrect.Owner.Guid);
            EA.Method theMethod = theClass.Methods.Cast<EA.Method>().SingleOrDefault(m => m.MethodGUID == elementToCorrect.Guid);
            if (theMethod == null)
            {
                return;
            }
            theMethod.Name = elementToCorrect.Name.TrimSpacesToCamelCase();
            theMethod.Update();
        }

        protected override string CorrectionMessage(IMyOperation elementToCorrect)
        {
            return string.Format("The operation will be renamed to '{0}'", elementToCorrect.Name.TrimSpacesToCamelCase());
        }

        protected override string GetErrorMessage(IMyOperation elementToCheck)
        {
            return string.Format("The name of operation '{0}' of class '{1}' contains one or more spaces.",elementToCheck.Name,elementToCheck.Owner.Name);
        }

        protected override bool IsOk(IMyOperation elementToCheck)
        {
            return !elementToCheck.Name.Contains(" ");
        }

        public override string RuleGuid
        {
            get { return "{526C50F0-83B5-4E11-958B-43BF704F3AE9}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Operation names can not contain spaces"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All operations do not have spaces in their names"; }
        }

        public override string RuleType
        {
            get { return "Operation Rule"; }
        }

        public OperationNamesCannotContainSpaces(string id)
        {
            this.id = id;
        }
    }
}
