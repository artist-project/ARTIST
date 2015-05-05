package eu.artist.postmigration.nfrvt.lang.gml.validation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

import eu.artist.postmigration.nfrvt.lang.common.ARTISTDateTimeValueConverter;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonFactory;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.uml.MARTEUtil;

public class ComparableValidator extends HardGoalValidator {

	protected static ValueSpecification createRandomValueFor(DataType type) {
		try {
			if(type instanceof Enumeration)
				return createRandomValue((Enumeration)type);
			if(type instanceof PrimitiveType)
				return createRandomValue((PrimitiveType)type);
		
			return createRandomValue(type);
		} catch(Exception e) {
			;
		}
		return null;
	}
		
	protected static ValueSpecification createRandomValue(PrimitiveType type) {
		if(UMLUtil.isBoolean(type) || MARTEUtil.isBoolean(type)) {
			BooleanLiteral value = ArtistCommonFactory.eINSTANCE.createBooleanLiteral();
			value.setValue(true);
			return value;
		} 
		if(UMLUtil.isInteger(type) || MARTEUtil.isInteger(type) ||
			UMLUtil.isReal(type) || MARTEUtil.isReal(type)) {
			NumberLiteral value = ArtistCommonFactory.eINSTANCE.createNumberLiteral();
			value.setValue(new BigDecimal(1));
			return value;
		} 
		if(UMLUtil.isString(type) || MARTEUtil.isString(type)) {
			StringLiteral value = ArtistCommonFactory.eINSTANCE.createStringLiteral();
			value.setValue("hello");
			return value;
		}
		if(UMLUtil.isUnlimitedNatural(type) || MARTEUtil.isUnlimitedNatural(type)) {
			UnlimitedLiteral l = ArtistCommonFactory.eINSTANCE.createUnlimitedLiteral();
			l.setValue("*");
			return l;
		}
		if(MARTEUtil.isDateTime(type)) {
			StringLiteral value = ArtistCommonFactory.eINSTANCE.createStringLiteral();
			value.setValue(ARTISTDateTimeValueConverter.MILLISECONDS.format(new Date()));
			return value;
		}
		return null;
	}
	
	protected static ValueSpecification createRandomValue(DataType type) {
		List<PropertyValuePair> pairs = new ArrayList<>();
		EList<Property> allAttributes = type.getAllAttributes();
		for(Property property : allAttributes) {
			Type propertyType = property.getType();
			DataType propertyDataType = (DataType) (propertyType instanceof DataType ? propertyType : null);
			if(propertyDataType != null && propertyDataType != type && property.getLower() > 0) {
				PropertyValuePair pair = ArtistCommonFactory.eINSTANCE.createPropertyValuePair();
				pair.setProperty(property);
				pair.setValue(createRandomValueFor(propertyDataType));
			}
		}
		ObjectSpecificationExpression e = ArtistCommonFactory.eINSTANCE.createObjectSpecificationExpression();
		e.setType(type);
		Tuple tuple = ArtistCommonFactory.eINSTANCE.createTuple();
		tuple.getTuples().addAll(pairs);
		e.setValue(tuple);
		return e;
	}
	
	protected static ValueSpecification createRandomValue(Enumeration type) {
		if(type.getOwnedLiterals().isEmpty())
			return null;
		InstanceSpecificationExpression e = ArtistCommonFactory.eINSTANCE.createInstanceSpecificationExpression();
		e.setValue(type.getOwnedLiterals().get(new Random().nextInt(type.getOwnedLiterals().size())));
		return e;
	}
	
	@Override
	public ValueSpecification evaluate(AppliedQuantitativePropertyExpression reference) {
		ValueSpecification value = createRandomValueFor(reference.getValue().getProperty().getType());
		return value;
	}
}
