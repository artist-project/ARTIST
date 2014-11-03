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

public class MicrosoftAzureComputeSLAAuditor implements AuditingInterface {

	/* (non-Javadoc)
	 * @see eu.artist.cloud.auditors.AuditingInterface#checkApplicabilityConditions(java.lang.String)
	 */

	/*FIX!!
	 * We need to check provider's API if is available (together with 8.8.8.8), 
	 * since if no answer is taken then exceptions will be 
	 * thrown (similar to having no connectivity). In this case, given that we can not get info, this sample should
	 * be logged as unavailable since we can not decide due to provider's fault
	From Amazon EC2 SLA page (logging requirements):
	 To receive a Service Credit, you must submit a claim by opening a case in the AWS Support Center. To be eligible, the credit request must be received by us by the end of the second billing cycle after which the incident occurred and must include:

    the words “SLA Credit Request” in the subject line;
    the dates and times of each Unavailability incident that you are claiming;
    the affected EC2 instance IDs or the affected EBS volume IDs; and
    your request logs that document the errors and corroborate your claimed outage (any confidential or sensitive information in these logs should be removed or replaced with asterisks).
	 *
	 */
	@Override
	public  void checkApplicabilityConditions(String provider,String user,String apiKey, String databaseIP, String DBuser, String DBkey) throws Exception {
		// TODO Auto-generated method stub
		while (2>1){
		//get list of servers-GENERIC
		System.out.println("Getting server list and details...");
		
		try {
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
			System.out.println("*******************NODE LEVEL ANALYSIS SECTION*****************");
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
				System.out.println("GETTING NEXT NODE...");
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

						if ((metadata.getLocation().getParent().getId()).equals(metadata2.getLocation().getParent().getId())){
							//hasTwoInstances=true;
							System.out.println("Found instance within the same Region...Running?");
							if (((metadata.getStatus().toString()).equals("RUNNING"))&& ((metadata2.getStatus().toString()).equals("RUNNING"))){
								System.out.println("Passed running status check...");
								hasAtLeastTwoRunningNodes=true;

								if (!(node.getId()).equals(node2.getId())){
									System.out.println("Passed check for not being the same node...");
									if (!((node.getLocation().getId()).equals(node2.getLocation().getId()))){
										System.out.println("Passed check for AZs...");
										hasDifferentAZs=true;
										System.out.println("*******************************************");
										System.out.println("***RESULT SECTION FOR NODE:"+node.getId());
										System.out.println("*******************************************");
										if (!(validNodeIDs.contains(metadata))){
											validNodeIDs.add(metadata);
											System.out.println("Node "+node.getId()+" added in valid list...");
										}else {System.out.println("Node already included");}
										if (!(validTemplateIDs.contains(metadata.getLocation().getParent().getId()))){
											validTemplateIDs.add(metadata.getLocation().getParent().getId());
										}else{
											System.out.println("This Region ID has already been included in previous SLA check:");
										}

										System.out.println("Valid Region ID for inclusion in SLA check:"+metadata.getLocation().getParent().getId());
									}else {System.out.println("Failed check on different AZ...");} //AZ check
								}else {System.out.println("Same node...");}
							}
						}
					}//internal for
					//final check
					if ((validTemplateIDs.contains(metadata.getLocation().getParent().getId()))&&(!(validNodeIDs.contains(metadata)))){
						validNodeIDs.add(metadata);

					} 

				}else {System.out.println("NO, only running nodes are eligible");} 

				/*if (validNodeIDs.isEmpty()){
					System.out.println("Node do not meet minimum requirements for SLA check");
				}*/

				System.out.println("Current Valid Region IDs number:"+validTemplateIDs.size());
				System.out.println("Current Valid Node IDs number:"+validNodeIDs.size());
				/*System.out.println("*******************************************");
				System.out.println("***RESULT SECTION FOR NODE:"+node.getId());
				System.out.println("*******************************************");*/
/*
				if (!(isRunning)){
					System.out.println("Node:"+node.getId()+" is not running . Not applicable for SLA");
				}
				if (!(hasAtLeastTwoRunningNodes)){
					//System.out.println("Node:"+node.getId()+" does not have at least two running Nodes with the same template ID. Not applicable for SLA");
				}
				if (!(hasTwoInstances)){
					//System.out.println("Node:"+node.getId()+" does not have two instances. Not applicable for SLA");
				}
				if (!(hasDifferentAZs)){
					System.out.println("Node:"+node.getId()+" does not have 2 different AZs.  Not applicable for SLA");
					//System.out.println("Region:"+node.getLocation()+"does not have yet 2 different AZz used. Not applicable for SLA");
				}*/
			}// end of external for

			//Conclusions
			System.out.println("***************************************************************");
			System.out.println("*******************CONCLUSIONS SECTION*************************");
			System.out.println("***********************************************************s****");
			System.out.println("Final Valid Region IDs number:"+validTemplateIDs.size());
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


			for (String validTemplate: validTemplateIDs){
				boolean reachabilityPerTemplateID=false;
				//NodeMetadata nodeinfo=new NodeMetadata();
				NodeMetadata thisinfo=validNodeIDs.get(0);//necessary initialization
				for (NodeMetadata nodeinfo : validNodeIDs) {
					if ((nodeinfo.getLocation().getParent().getId()).equals(validTemplate)){
						//System.out.println("This is a valid node id:"+nodeinfo.getId());
						thisinfo=nodeinfo;
						if (checkReachability(nodeinfo)){
							reachabilityPerTemplateID=true;
							//loggedData.add(checkReachability(nodeinfo));
							System.out.println("Node:"+nodeinfo.getId()+" of Region:"+validTemplate+" is reachable");
						}else {System.out.println("Node:"+nodeinfo.getId()+" of Region:"+validTemplate+" is not reachable");}
					}
					//System.out.println("Region:"+nodeinfo.getLocation().getParent().getId());
				}
				loggedData.add(addReachabilityInfo(reachabilityPerTemplateID,thisinfo));
			}

			System.out.println("************************************************************");
			System.out.println("*******************LOGGING SAMPLES SECTION******************");
			System.out.println("************************************************************");

			//Logging process

			//FIX!! NEED TO CHECK AND ENTER ONLY VALID TEMPLATES? YES  ---logically done

			//WE CAN NOT LOG ONLY UNAVAILABLE SAMPLES SINCE WE NEED TO KNOW WHEN IT STOPS UNAVAILABILITY
			//OR JUST CONSIDER UNAVAILABLE TO UNAVAILABLE? GIVEN THAT IF WE FILTER IT FROM HERE (BEFORE THE DB)
			//WE MAY NOT HAVE ANY SAMPLES AT ALL if the SLA applicability conditions are not met

			//FIX! FOR FUTURE VERSIONS WE NEED ALSO A USER ID TO DISTINGUISH FROM MULTIPLE USERS FEEDING IN
			//THE SAME DB

			System.out.println("Loggeddatasize:"+loggedData.size());
			AbstractedAvailabilityLogger Logger=new AbstractedAvailabilityLogger();
			try {
				Logger.logAvailability(loggedData,DBuser,DBkey, databaseIP);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("DB unavailable....");
			}
		} catch (org.jclouds.http.HttpResponseException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Check your connectivity....");
		}
		
		
	}//daemon while end
		//return validTemplateIDs;

	}

	public boolean checkReachability(NodeMetadata thismetadata){

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
			//needs to be in separate expressions since otherwise the logical calculation
			//skips the 8.8.8.8 comparison if thisReachable is unreachable (no need to calculate it based on the
			//expression since one of the two AND operators is already 0) and repings the IPAddress
			boolean thisReachable=thisPinger.decideReachability(IPAddress);
			boolean generalReachable=generalConnectivityPinger.decideReachability("8.8.8.8");
			isReachable=(((thisReachable)&&(generalReachable))||(thisReachable));

		}
		/*
		try {
			System.in.read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return isReachable;

	}
	public String addReachabilityInfo(boolean isReachable,NodeMetadata thismetadata ){
		String loggedRecord;
		//current implementation adds the reachability field and probably keeps the info of the last reachble node
		//this does not mean that only this node is reachable, we are interested only in the template ID actually
		//Suggest to remove all irrelevant info in the next versions (will also reduce required disk space for the DB
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
		System.out.println("LOG RECORD:"+loggedRecord);
		return loggedRecord;
	}

}
