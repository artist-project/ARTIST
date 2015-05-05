namespace LL.MDE.Components.ModelValidation.Rules.Artist.ElementValidation
{
    using System.Linq;
    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class ClassNameCannotBeCsharpKeyword : ValidationRuleWithAutoCorrection<IMyClass>
    {
        private string id;


        protected override string GetErrorMessage(IMyClass elementToCheck)
        {
            return string.Format("The class '{0}' has a C# keyword as name.", elementToCheck.Name);
        }

        protected override bool IsOk(IMyClass elementToCheck)
        {
            return !CSharpKeyWords.KeyWords.Contains(elementToCheck.Name);
        }

        public override string RuleGuid
        {
            get { return "{9A2661DF-C8BE-42E5-B52E-9A0CB892FFFB}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Class names can not be c# keywords"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All classes have names that are not c# keywords"; }
        }

        public override string RuleType
        {
            get { return "Class Rule"; }
        }

        protected override void Correct(IMyClass elementToCorrect)
        {
            EA.Element classToUpdate = Repository.GetElementByGuid(elementToCorrect.Guid);
            classToUpdate.Name =  "_" + elementToCorrect.Name;
            classToUpdate.Update();
        }

        protected override string CorrectionMessage(IMyClass elementToCorrect)
        {
            return string.Format("The Class will be renamed to _{0}", elementToCorrect.Name);
        }

        public ClassNameCannotBeCsharpKeyword(string id)
        {
            this.id = id;
        }
    }
}
