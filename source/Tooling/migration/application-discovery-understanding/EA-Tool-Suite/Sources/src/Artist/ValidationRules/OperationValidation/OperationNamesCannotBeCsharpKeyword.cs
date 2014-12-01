namespace LL.MDE.Components.ModelValidation.Rules.Artist.OperationValidation
{
    using System.Linq;

    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class OperationNamesCannotBeCsharpKeyword:ValidationRuleWithAutoCorrection<IMyOperation>
    {
        private readonly string id;

        protected override void Correct(IMyOperation elementToCorrect)
        {
            EA.Element theClass = Repository.GetElementByGuid(elementToCorrect.Owner.Guid);
            EA.Method theOperation = theClass.Methods.Cast<EA.Method>().SingleOrDefault(m => m.MethodGUID == elementToCorrect.Guid);
            if (theOperation == null)
            {
                return;
            }
            theOperation.Name = "_" + elementToCorrect.Name;
            theOperation.Update();
        }

        protected override string CorrectionMessage(IMyOperation elementToCorrect)
        {
            return string.Format("The operation will be renamed to '{0}'", "_" + elementToCorrect.Name);
        }

        protected override string GetErrorMessage(IMyOperation elementToCheck)
        {
            return string.Format(
                "The operation '{0}' of class '{1}' has a name that is a c# keyword",
                elementToCheck.Name,
                elementToCheck.Owner.Name);
        }

        protected override bool IsOk(IMyOperation elementToCheck)
        {
            return !CSharpKeyWords.KeyWords.Contains(elementToCheck.Name);
        }

        public override string RuleGuid
        {
            get { return "{112A4D64-DB8B-4146-A09B-41EC61C41DAC}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Operation names can not be c# keywords"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All operations have names other than c# keywords"; }
        }

        public override string RuleType
        {
            get { return "Operation Rule"; }
        }

        public OperationNamesCannotBeCsharpKeyword(string id)
        {
            this.id = id;
        }
    }
}
