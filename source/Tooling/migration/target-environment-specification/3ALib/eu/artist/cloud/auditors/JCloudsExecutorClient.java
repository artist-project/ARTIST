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
*/
package eu.artist.cloud.auditors;

import java.util.Set;

import org.jclouds.ContextBuilder;

import org.jclouds.compute.ComputeService;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.domain.ComputeMetadata;
import org.jclouds.compute.domain.NodeMetadata;
import org.jclouds.domain.Location;
import org.jclouds.logging.log4j.config.Log4JLoggingModule;
import org.jclouds.sshj.config.SshjSshClientModule;


import com.google.common.collect.ImmutableSet;
//import com.google.inject.Module;

//import com.google.inject.Module;

/**
 * @author geo
 *
 */
public class JCloudsExecutorClient {

	//check whether the methods we need for status, availability zones etc. are abstracted
	//or if we need the provider specific implementations


	public String getStatus(String Provider){

		String status="0";

		//implement jclouds API
		//check return type since for amazon may be string, for others may be response time?
		//or something else
		//if we need number we can convert the string to double for example

		//google status messages
		//https://developers.google.com/compute/docs/instances#checkmachinestatus
		return status;

		
		
	}
	
	public String connectViaSSH(String Provider, String templateID){
	
		//necessary for cases (like Google) when status message is not conclusive 
		String message="";
		
		return message;
	
		
	}

	
	public ComputeServiceContext AbstractedGetServers(String user,String apiKey, String provider){

		
		//System.out.println("After keys..");
		ComputeServiceContext context = ContextBuilder.newBuilder(provider)//"aws-ec2")
                .credentials(user, apiKey)
                //.modules(ImmutableSet.<Module> of(new Log4JLoggingModule(),
                  //                              new SshjSshClientModule()))
                .buildView(ComputeServiceContext.class);
		
		ComputeService computeService = context.getComputeService();
		//System.out.println("After cs..");
		
		context.close(); 
		return context;
	}

}
