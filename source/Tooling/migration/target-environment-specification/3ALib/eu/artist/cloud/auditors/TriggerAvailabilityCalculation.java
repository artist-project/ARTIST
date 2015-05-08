/*
 * Copyright (c) 2014 ICCS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License v2.0
 * which
accompanies this distribution, and is available at
 *
http://www.apache.org/licenses/LICENSE-2.0.html
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *
George Kousiouris

 * Initially developed in the context of ARTIST EU project
www.artist-project.eu
 *//**
 * 
 */
package eu.artist.cloud.auditors;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @author geo
 *
 */
public class TriggerAvailabilityCalculation {

	/**
	 * 
	 */
	public TriggerAvailabilityCalculation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//needs also to get provider and service name, given that a user (or in the central DB) may use services from multiple
		//providers
		//FIX! THIS SHOULD BE ALSO LOGGED DURING THE LOGGING PROCESS IN THE DB along with the userID


		//FIX NEEDS TO GET FROM PROP FILE PROVIDER NAME AND SERVICE AND HAVE SETTING LOGIC PER PROVIDER
		int quantumOfTime=60; //dependent on provider-check to see how to abstract better
		InputStream input = null;

		try {

			Properties prop2 = new Properties();
			input = new FileInputStream("3alibconfig.properties");
			// load a properties file
			prop2.load(input);

			String overall=prop2.getProperty("ProviderName")+prop2.getProperty("ServiceName");
			//calculate Availability
			AbstractedAvailabilityCalculator calc=new AbstractedAvailabilityCalculator();
			if (overall.equals("aws-ec2")){

				quantumOfTime=60;


			}
			if (overall.equals("microsoft-azure")){//check if naming has effect-has dependency on jclouds
				//for azure it seems there is only support for blobstore

				quantumOfTime=60;


			}


			if (overall.equals("google-compute-engine")){//check if naming has effect-has dependency on jclouds

				quantumOfTime=300;


			}

			calc.calculateAvailability(prop2.getProperty("databaseIP"), quantumOfTime);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
