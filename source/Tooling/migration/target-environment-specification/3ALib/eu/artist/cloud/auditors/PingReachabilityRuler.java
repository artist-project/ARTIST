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

/**
 * @author geo
 *
 */
public class PingReachabilityRuler implements DecideReachabilityInterface{

	/**
	 * 
	 */
	public PingReachabilityRuler() {
		// TODO Auto-generated constructor stub
	}

	public boolean decideReachability(String IPAddress){
		PingThread ping = new PingThread();

		
		ping.setInput_1(IPAddress);
		
		ping.start();
		//System.out.println("Thread was launched. Wait...");
		while (ping.isAlive()) {
			try {
				Thread.sleep(100);
				if (ping.isFinally_reachable()){
					//System.out.println("EXTERNALLY REACHABLE");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Thread for pinging has finished...");
		return ping.finally_reachable;
	}

}
