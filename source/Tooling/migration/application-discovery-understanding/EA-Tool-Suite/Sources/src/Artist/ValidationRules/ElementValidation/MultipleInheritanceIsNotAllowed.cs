namespace LL.MDE.Components.ModelValidation.Rules.Artist.ElementValidation
{
    using System.Linq;

    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.BuiltInQueries;
    using LL.MDE.DataModels.MyUml.Uml2;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class MultipleInheritanceIsNotAllowed : ValidationRule<IMyClass>
    {
        private readonly string id;

        protected override bool ShouldCheck(IMyClass elementToCheck)
        {
            return elementToCheck.GetRelatedSuccessors(1, AllUmlTypes.Generalization).Any();
        }

        protected override string GetErrorMessage(IMyClass elementToCheck)
        {
            return string.Format("The class '{0}' is inheriting from more than one class", elementToCheck.Name);
        }

        protected override bool IsOk(IMyClass elementToCheck)
        {
            return elementToCheck.GetRelatedSuccessors(1, AllUmlTypes.Generalization).OfType<IMyClass>().Count() <= 1;
        }

        public override string RuleGuid
        {
            get { return "{5AFCC636-966F-46CA-B2A3-9CFC3F3979D9}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Multiple Inheritance is not allowed."; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "No multiple inheritance was found."; }
        }

        public override string RuleType
        {
            get { return "Class Rule"; }
        }

        public MultipleInheritanceIsNotAllowed(string id)
        {
            this.id = id;
        }
    }
}
