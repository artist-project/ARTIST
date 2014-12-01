namespace LL.MDE.Components.ModelValidation.Rules.Artist.ElementValidation
{
    using System.Collections.Generic;
    using System.Linq;
    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.DataModels.MyUml.Uml2.Classes;

    internal class MethodsCannotBeOverloadedWithSameSignature : ValidationRule<IMyOperation>
    {
        private readonly string id;

        protected override bool ShouldCheck(IMyOperation elementToCheck)
        {
            return ((IMyClass)elementToCheck.Owner).OwnedOperations.Count(o => o.Name == elementToCheck.Name) > 1;
        }

        protected override string GetErrorMessage(IMyOperation elementToCheck)
        {
            return string.Format("The Method '{0}' of class '{1}' has an overload with the same signature" ,elementToCheck.Name, elementToCheck.Owner.Name);
        }

        protected override bool IsOk(IMyOperation elementToCheck)
        {
            IMyClass owner = elementToCheck.Owner as IMyClass;

            if (owner == null)
            {
                return true;
            }

            IEnumerable<IMyOperation> otherOverloads = owner.OwnedOperations.Where(o => o.Name == elementToCheck.Name && o.Guid != elementToCheck.Guid);

            return !otherOverloads.Any(o => GetSignature(o).SequenceEqual(GetSignature(elementToCheck)));
        }

        public override string RuleGuid
        {
            get { return "{20FAE8B4-EAF7-4EA3-8CD6-A47366121F54}"; }
        }

        public override string RuleId
        {
            get { return id; }
        }

        public override string RuleName
        {
            get { return "Operations can not be overloaded with the same signature"; }
        }

        public override Priority RulePriority
        {
            get { return Priority.High; }
        }

        public override string RuleSuccessMessage
        {
            get { return "All operations are overloaded with unique signatures"; }
        }

        public override string RuleType
        {
            get { return "Operation Rule"; }
        }

        #region constructor

        public MethodsCannotBeOverloadedWithSameSignature(string id)
        {
            this.id = id;
        }

        #endregion

        #region helper methods

        private static IEnumerable<string> GetSignature(IMyOperation operation)
        {
            return operation.OwnedParameters.Select(p => p.TypeString).ToArray();
        }



        #endregion
    }
}
