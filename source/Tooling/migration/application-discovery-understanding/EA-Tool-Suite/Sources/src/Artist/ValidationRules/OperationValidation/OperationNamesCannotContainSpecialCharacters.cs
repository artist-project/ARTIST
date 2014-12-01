namespace LL.MDE.Components.ModelValidation.Rules.Artist.OperationValidation
{
    using System.Linq;
    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class OperationNamesCannotContainSpecialCharacters : ValidationRuleWithAutoCorrection<IMyOperation>
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
            theMethod.Name = elementToCorrect.Name.FilterSpecialCharacters();
            theMethod.Update();
        }

        protected override string CorrectionMessage(IMyOperation elementToCorrect)
        {
            return string.Format("The operation will be renamed to '{0}'", elementToCorrect.Name.FilterSpecialCharacters());
        }

        protected override string GetErrorMessage(IMyOperation elementToCheck)
        {
            return string.Format("The name of operation '{0}' of class '{1}' contains special characters or starts with a number", elementToCheck.Name, elementToCheck.Owner.Name);
        }

        protected override bool IsOk(IMyOperation elementToCheck)
        {
            return elementToCheck.Name.ContainsOnlyLettersAndDigitsAndSpacesAndUnderscoresAndDoesNotStartWithNumber();
        }

        public override string RuleGuid
        {
            get { return "{BC193DA0-DE98-4756-A2FF-584D30C3F16F}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Operation names can not contain special characters or start with a number."; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All operation names do not contain special characters or start with a number"; }
        }

        public override string RuleType
        {
            get { return "Operation Rule"; }
        }

        public OperationNamesCannotContainSpecialCharacters(string id)
        {
            this.id = id;
        }
    }
}
