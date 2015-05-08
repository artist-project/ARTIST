namespace LL.MDE.Components.ModelValidation.Rules.Artist.ElementValidation
{
    using System.Linq;

    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.BuiltInQueries;
    using LL.MDE.DataModels.MyUml.Uml2;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;
    using LL.MDE.DataModels.MyUml.Uml2.CompositeStructure;
    using LL.MDE.DataModels.MyUml.Uml2.ICommonalities;

    internal class InheritanceOfLeafClassIsNotAllowed : ValidationRule<IMyClass>
    {
        private readonly string id;

        protected override bool ShouldCheck(IMyClass elementToCheck)
        {
            return elementToCheck.GetRelatedSuccessors(1, AllUmlTypes.Generalization).Any();
        }

        protected override string GetErrorMessage(IMyClass elementToCheck)
        {
            return string.Format("The class '{0}' is inheriting from a leaf class", elementToCheck.Name);
        }

        protected override bool IsOk(IMyClass elementToCheck)
        {
            return elementToCheck
                .GetRelatedSuccessors(1, AllUmlTypes.Generalization)
                .OfType<IMyClass>()
                .All(item => !Repository.GetElementByGuid(item.Guid).IsLeaf);
        }

        public override string RuleGuid
        {
            get { return "{1FE3BD53-D4C4-450B-9036-21F44970ED5B}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "A class can not inherit from a leaf class"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All classes are not inheriting from leaf classes"; }
        }

        public override string RuleType
        {
            get { return "Class Rule"; }
        }

        public InheritanceOfLeafClassIsNotAllowed(string id)
        {
            this.id = id;
        }
    }
}
