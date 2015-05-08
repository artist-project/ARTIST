namespace ValidationRules
{
    using LL.MDE.Components.ModelValidation.ValdationRule;
    using LL.MDE.Components.ModelValidation.Rules.Artist.AttributeValidation;
    using LL.MDE.Components.ModelValidation.Rules.Artist.OperationValidation;
    using LL.MDE.Components.ModelValidation.Rules.Artist.ParameterValidation;
    using LL.MDE.Components.ModelValidation.Rules.Artist.ElementValidation;
    using LL.EAAddin.IntegrationArchitect.Foundation.Options;

    public class RuleFactory : ValidationRuleFactoryBase
    {
        protected override void GenerateAllValidationRules()
        {
            int i = 1;

            // classes
            this.AllRules.Add(new ClassNameCannotContainSpacesValidationRule(i++.ToString("00")));
            this.AllRules.Add(new ClassNameCannotBeCsharpKeyword(i++.ToString("00")));
            this.AllRules.Add(new ClassNameCannotContainSpecialCharacters(i++.ToString("00")));

            //inheritance
            this.AllRules.Add(new InheritanceOfLeafClassIsNotAllowed(i++.ToString("00")));
            this.AllRules.Add(new MultipleInheritanceIsNotAllowed(i++.ToString("00")));

            //attributes
            this.AllRules.Add(new AttributeNamesCannotContainSpaces(i++.ToString("00")));
            this.AllRules.Add(new AttributeNameCannotBeCsharpKeyword(i++.ToString("00")));
            this.AllRules.Add(new AttributeNameCannotContainSpecialCharacters(i++.ToString("00")));
            this.AllRules.Add(new AttributesMustNotHaveTheSameNameAsMethodsValidationRule(i++.ToString("00")));

            //operations
            this.AllRules.Add(new OperationNamesCannotBeCsharpKeyword(i++.ToString("00")));
            this.AllRules.Add(new OperationNamesCannotContainSpaces(i++.ToString("00")));
            this.AllRules.Add(new OperationNamesCannotContainSpecialCharacters(i++.ToString("00")));
            this.AllRules.Add(new MethodsCannotBeOverloadedWithSameSignature(i++.ToString("00")));

            //parameters
            this.AllRules.Add(new ParameterNameCannotBeCsharpKeyword(i++.ToString("00")));
            this.AllRules.Add(new ParameterNameCannotContainSpaces(i++.ToString("00")));
            this.AllRules.Add(new ParameterNamesCannotContainSpecialCharacters(i++.ToString("00")));






        }

        public override string GetRuleCategoryName()
        {
            return "Artist Rules";
        }

        public override IOptions RuleOptions
        {
            get
            {
                return null;
            }
        }

    }
}
