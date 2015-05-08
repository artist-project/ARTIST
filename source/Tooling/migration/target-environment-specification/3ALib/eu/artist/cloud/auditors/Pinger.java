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

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author geo
 *
 */
public class Pinger {

	/**
	 * 
	 */
	public Pinger() {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean pinger(String ipAddress){
		
		try {
			InetAddress inet;
			inet = InetAddress.getByName(ipAddress);
			boolean reachable;
			try {
				reachable = inet.isReachable(10000);
				System.out.println("Address:"+inet.getHostAddress());
				System.out.println("Destination is:"+reachable);
				return reachable;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}
}
