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

package eu.artist.migration.ct.controller;

import eu.artist.migration.ct.classifier.KnnClassifier;
import eu.artist.migration.ct.common.IniReader;

public class ClassificationController {
	private String pidstatFileName;
	private String tsharkFileName;
	private String trainingFileName;

	public ClassificationController(String pidstatFileName,
			String tsharkFileName, String trainingFileName) {
		this.pidstatFileName = pidstatFileName;
		this.tsharkFileName = tsharkFileName;
		this.trainingFileName = trainingFileName;
	}

	public String getPidstatFileName() {
		return pidstatFileName;
	}

	public void setPidstatFileName(String pidstatFileName) {
		this.pidstatFileName = pidstatFileName;
	}

	public String getTsharkFileName() {
		return tsharkFileName;
	}

	public void setTsharkFileName(String tsharkFileName) {
		this.tsharkFileName = tsharkFileName;
	}

	public String getTrainingFileName() {
		return trainingFileName;
	}

	public void setTrainingFileName(String trainingFileName) {
		this.trainingFileName = trainingFileName;
	}

	public String calculateClassification() throws Exception {
		IniReader reader = IniReader.getInstance();
		if (reader.getClassificationEngine().matches("knn")) {
			KnnClassifier classifier = new KnnClassifier(pidstatFileName, tsharkFileName, trainingFileName);
			return classifier.calculateClassification();
		}
		else {
			//Code for neuron networks engine
			return null;
		}
	}

	public String calculateBestProvider(String workloadName) throws Exception {
		//setProviderPrices(getDbConnection());
		ProviderEfficiency pe = new ProviderEfficiency(workloadName);
		return pe.calculateBestProvider();
	}
}
