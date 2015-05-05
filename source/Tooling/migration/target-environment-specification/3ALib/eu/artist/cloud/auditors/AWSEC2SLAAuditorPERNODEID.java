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
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.jclouds.compute.ComputeService;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.domain.ComputeMetadata;
import org.jclouds.compute.domain.NodeMetadata;



import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import com.mongodb.Mongo;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class AWSEC2SLAAuditorPERNODEID implements AuditingInterface {

	/* (non-Javadoc)
	 * @see eu.artist.cloud.auditors.AuditingInterface#checkApplicabilityConditions(java.lang.String)
	 */
	@Override
	public  void checkApplicabilityConditions(String provider,String user,String apiKey, String databaseIP, String DBuser, String DBkey) throws Exception {
		// TODO Auto-generated method stub
		while (2>1){
		//get list of servers-GENERIC
		System.out.println("Getting server list and details...");
		JCloudsExecutorClient cli=new JCloudsExecutorClient();

		ComputeServiceContext computeServiceContext=cli.AbstractedGetServers(user,apiKey,provider);
		ComputeService computeService=computeServiceContext.getComputeService();

		ArrayList <NodeMetadata> validNodeIDs= new ArrayList();
		ArrayList <String> loggedData= new ArrayList();
		ArrayList <String> validTemplateIDs= new ArrayList();

		//System.out.println("After abstracted server call...");
		//get info from context-PROVIDER SPECIFIC, not in API but in type of information needed
		//some parts can be abstracted, like check for conditions for VM number from same template,AZ
		//check to remove direct api calls and just store locally in a variable the listNodes for example
		Set<? extends ComputeMetadata> localCS=computeService.listNodes();
		List<? extends ComputeMetadata> NodeList = new ArrayList(localCS);
		
		System.out.println("***************************************************************");
		System.out.println("*******************ANALYSIS SECTION****************************");
		System.out.println("***************************************************************");
		
		//int counter=0;
		for (ComputeMetadata node : localCS) {
			//Feedback flags
			boolean isRunning=false;
			boolean hasAtLeastTwoRunningNodes=false;
			boolean hasTwoInstances=false;
			boolean hasDifferentAZs=false;


			node.getName(); 
			NodeMetadata metadata = computeService.getNodeMetadata(node.getId());

			// which info to be stored, e.g. based on template IDs? YES
			System.out.println("Checking if instance:"+node.getId()+" is RUNNING..");

			if ((metadata.getStatus().toString()).equals("RUNNING")){
				isRunning=true;
				System.out.println("YES");
				NodeList.remove(0);			
				for (ComputeMetadata node2 : NodeList){
					
					node2.getName(); // if the node is named, what is it?
					System.out.println("Comparing against instance:"+node2.getId()+" ...");
					NodeMetadata metadata2 = computeService.getNodeMetadata(node2.getId());
					//node will be inserted in the valid list if the two node IDs do not match 
					//(different nodes) and if the templates match and if the AZs are different 
					//potential bug if during unavailable, the VM does not appear as running
					String id=node2.getId();
					
					if ((metadata.getImageId()).equals(metadata2.getImageId())){
						hasTwoInstances=true;
						System.out.println("Passed check for 2 instances with the same template ID...");
						if (((metadata.getStatus().toString()).equals("RUNNING"))&& ((metadata2.getStatus().toString()).equals("RUNNING"))){
							System.out.println("Passed running status check...");
							hasAtLeastTwoRunningNodes=true;

							if (!(node.getId()).equals(node2.getId())){
								System.out.println("Passed check for not being the same node...");
								//if (!((node.getLocation().getId()).equals(node2.getLocation().getId()))){
								System.out.println("Passed check for AZs...");
								hasDifferentAZs=true;
								System.out.println("*******************************************");
								System.out.println("***RESULT SECTION FOR NODE:"+node.getId());
								System.out.println("*******************************************");
								if (!(validNodeIDs.contains(metadata))){
									validNodeIDs.add(metadata);
								}
								if (!(validTemplateIDs.contains(metadata.getImageId()))){
									validTemplateIDs.add(metadata.getImageId());
								}else{
									System.out.println("This Template ID has already been included in previous SLA check:");
								}
								
								System.out.println("Valid Template ID for inclusion in SLA check:"+metadata.getImageId());
								//}else {System.out.println("Failed check on different AZ...");} //AZ check
							}else {System.out.println("Same node...");}
						}
					}
				}//internal for
				//final check
				if ((validTemplateIDs.contains(metadata.getImageId()))&&(!(validNodeIDs.contains(metadata)))){
					validNodeIDs.add(metadata);
										
				} 

			}else {System.out.println("NO, only running nodes are eligible");} 

			/*if (validNodeIDs.isEmpty()){
				System.out.println("Node do not meet minimum requirements for SLA check");
			}*/

			System.out.println("Current Valid Template IDs number:"+validTemplateIDs.size());
			System.out.println("Current Valid Node IDs number:"+validNodeIDs.size());
			System.out.println("*******************************************");
			System.out.println("***RESULT SECTION FOR NODE:"+node.getId());
			System.out.println("*******************************************");
			
			if (!(isRunning)){
				System.out.println("Node:"+node.getId()+" is not running . Not applicable for SLA");
			}
			if (!(hasAtLeastTwoRunningNodes)){
				System.out.println("Node:"+node.getId()+" does not have at least two running Nodes with the same template ID. Not applicable for SLA");
			}
			if (!(hasTwoInstances)){
				System.out.println("Node:"+node.getId()+" does not have two instances. Not applicable for SLA");
			}
			if (!(hasDifferentAZs)){
				System.out.println("Node:"+node.getId()+" does not have 2 different AZs.  Not applicable for SLA");
			}
		}// end of external for

		//Conclusions
		System.out.println("***************************************************************");
		System.out.println("*******************CONCLUSIONS SECTION*************************");
		System.out.println("***********************************************************s****");
		System.out.println("Final Valid Template IDs number:"+validTemplateIDs.size());
		System.out.println("Final Valid Node IDs number:"+validNodeIDs.size());
		
		//Availability/Reachability check

		//check based on node ids or template ids?we need all the node ids for the same template 
		//to be unavailable for a template id sample to be considered unavailable--how are they
		//logged in the DB? every node needs to be inserted in the DB for auditing purposes
		//Calculation in the db is done per template id, so it includes info from all the according nodes

		//for all valid node ids check reachability and add to the records that will be documented 

		System.out.println("***************************************************************");
		System.out.println("*******************CHECK REACHABILITY SECTION******************");
		System.out.println("***************************************************************");
	
		for (NodeMetadata nodeinfo : validNodeIDs) {
		
			System.out.println("This is a valid node id:"+nodeinfo.getId());
			loggedData.add(checkReachability(nodeinfo));
		
		}
		
		System.out.println("************************************************************");
		System.out.println("*******************LOGGING SAMPLES SECTION******************");
		System.out.println("************************************************************");
		
		//Logging process

		//FIX!! NEED TO CHECK AND ENTER ONLY VALID TEMPLATES? YES  ---logically done

		//WE CAN NOT LOG ONLY UNAVAILABLE SAMPLES SINCE WE NEED TO KNOW WHEN IT STOPS UNAVAILABILITY
		//OR JUST CONSIDER UNAVAILABLE TO UNAVAILABLE? GIVEN THAT IF WE FILTER IT FROM HERE (BEFORE THE DB)
		//WE MAY NOT HAVE ANY SAMPLES AT ALL if the SLA applicability conditions are not met
		
		
		AbstractedAvailabilityLogger Logger=new AbstractedAvailabilityLogger();
		try {
			Logger.logAvailability(loggedData,DBuser,DBkey, databaseIP);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		//return validTemplateIDs;

	}
	
	public String checkReachability(NodeMetadata thismetadata){
		
		//for needed
		
		
		//check reachability here? directly transform field and add to loggeddata
		//String IPAddress=metadata.getHostname();//here or publicaddresses array
		Set<String> PublicAddresses=thismetadata.getPublicAddresses();
		Iterator it = PublicAddresses.iterator();
		String IPAddress = null;
		boolean isReachable=false;
		if(it.hasNext()) {
			IPAddress = (String) it.next();
			
			//This can be abstracted more in a generic DecideReachability class
			PingReachabilityRuler thisPinger=new PingReachabilityRuler();
			//Necessary check for generic connectivity against 8.8.8.8 (Google DNS)
			//however we must cater for the case the VM is reachable but Google DNS is not
			PingReachabilityRuler generalConnectivityPinger=new PingReachabilityRuler();
			isReachable=(((thisPinger.decideReachability(IPAddress))&&(generalConnectivityPinger.decideReachability("8.8.8.8")))||(thisPinger.decideReachability(IPAddress)));

		}
/*
		try {
			System.in.read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		String loggedRecord;
		if (isReachable){
			//add field REACHABLE
			//we can either change one existing field or add another for
			//reachability
			//needs coordination with other operations like availability calculation
			System.out.println("REACHABLE");
			Gson mapper=new Gson();
			String jsonRecord = mapper.toJson(thismetadata);
			JsonElement je = mapper.fromJson(jsonRecord, JsonElement.class);
			JsonObject jo = je.getAsJsonObject();
			jo.addProperty("reachability", "REACHABLE");
			loggedRecord=jo.toString();
			

		}else{
			//add field UNREACHABLE
			System.out.println("UNREACHABLE");
			Gson mapper=new Gson();
			String jsonRecord = mapper.toJson(thismetadata);
			JsonElement je = mapper.fromJson(jsonRecord, JsonElement.class);
			JsonObject jo = je.getAsJsonObject();
			jo.addProperty("reachability", "UNREACHABLE");
			loggedRecord=jo.toString();
			
		}
		
		return loggedRecord;
		
	}

}
