/*
 * Copyright 2015 ICCS/NTUA 
 * Licensed under the Eclipse Public License(EPL) version 1.0 License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * https://www.eclipse.org/legal/epl-v10.html
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors: Athanasia Evangelinou
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *
 */

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
