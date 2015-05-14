package eu.artist.migration.ct.classifier;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public abstract class ProfileResultsReader {
	
	protected double[] convertLineToDoubleValues(String line, int vectorSize) throws ParseException {
		String[] strValues;
		double[] values;
		
		strValues = line.split("\t");
		if (strValues.length != vectorSize) {
			throw new ParseException("Expected " + vectorSize + " elements. " + strValues.length + " found.", 0);
		}
		
		values = new double[vectorSize];
		for (int j = 0; j < values.length; j++) {
			if (strValues[j].matches("-")) {
				values[j] = 0.0;
			}
			else {
				NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
			    Number number = null;
				number = format.parse(strValues[j]);
			    values[j] = number.doubleValue();
			}
		}
		
		return values;
	}
}
