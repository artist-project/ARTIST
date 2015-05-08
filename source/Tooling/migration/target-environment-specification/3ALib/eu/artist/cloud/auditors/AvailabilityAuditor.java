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

import java.net.UnknownHostException;
import java.util.ArrayList;

import com.mongodb.MongoException;

/**
 * @author geo
 *
 */
public class AvailabilityAuditor extends Thread {

	/**
	 * 
	 */

	//http://jclouds.apache.org/documentation/devguides/using-eclipse/

	String providerName;
	String serviceName;
	String user;
	String dbhost;
	String dbuser;
	



	public void setDbpass(String dbpass) {
		this.dbpass = dbpass;
	}

	String dbpass;

	String apikey;

	int libUserID;
	String Month;
	int quantumOfTimeInSeconds;

	//for AWS: http://stackoverflow.com/questions/8828964/getting-state-of-ec2-instance-java-api

	//for jclouds: http://jclouds.apache.org/documentation/userguide/compute/
	//info in metadata


	@Override
	public void run() {


		String overall=this.providerName+this.serviceName;

		System.out.println("Provider Service:"+overall);

		setLibUserID(1);//check if string in DB
		
		
		//one if for each combination
		if (overall.equals("aws-ec2")){
			try {
			AWSEC2SLAAuditor newaud=new AWSEC2SLAAuditor();
			ArrayList<String> nodeIDs=new ArrayList();
			newaud.checkApplicabilityConditions(overall,user,apikey, dbhost,dbuser, dbpass);

			
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			setQuantumOfTimeInSeconds(60);//check


		}
		if (overall.equals("microsoft-azure")){//check if naming has effect-has dependency on jclouds
			//for azure it seems there is only support for blobstore

			MicrosoftAzureComputeSLAAuditor newaud=new MicrosoftAzureComputeSLAAuditor();
			ArrayList<String> nodeIDs=new ArrayList();
			try {
				newaud.checkApplicabilityConditions(overall,user,apikey, dbhost,dbuser, dbpass);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			
			setQuantumOfTimeInSeconds(60);//check


		}
		if (overall.equals("google-compute-engine")){//check if naming has effect-has dependency on jclouds

			GoogleComputeSLAAuditor newaud=new GoogleComputeSLAAuditor();
			ArrayList<String> nodeIDs=new ArrayList();
			try {
				newaud.checkApplicabilityConditions(overall,user,apikey, dbhost,dbuser, dbpass);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			setQuantumOfTimeInSeconds(300);//check


		}

		//generic calculate availability
		//AbstractedAvailabilityCalculator availCalc=new AbstractedAvailabilityCalculator();


	}



	public void storeStatistics(){

	}

	public String getProviderName() {
		return providerName;
	}


	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}


	public AvailabilityAuditor() {
		// TODO Auto-generated constructor stub
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public int getLibUserID() {
		return libUserID;
	}

	public void setLibUserID(int libUserID) {
		this.libUserID = libUserID;
	}

	public String getMonth() {
		return Month;
	}

	public void setMonth(String month) {
		Month = month;
	}

	public int getQuantumOfTimeInSeconds() {
		return quantumOfTimeInSeconds;
	}

	public void setQuantumOfTimeInSeconds(int quantumOfTimeInSeconds) {
		this.quantumOfTimeInSeconds = quantumOfTimeInSeconds;
	}

	public String getDbhost() {
		return dbhost;
	}

	public void setDbhost(String dbhost) {
		this.dbhost = dbhost;
	}
	public String getDbuser() {
		return dbuser;
	}

	public void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}

	public String getDbpass() {
		return dbpass;
	}

}
