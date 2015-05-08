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
public class Globals {
		
	
		public static int OVERALL_MONTH_INTERVAL_SECONDS=0;

		public static synchronized int getOVERALL_MONTH_INTERVAL_SECONDS() {
			return OVERALL_MONTH_INTERVAL_SECONDS;
		}

		public static synchronized void setOVERALL_MONTH_INTERVAL_SECONDS(
				int oVERALL_MONTH_INTERVAL_SECONDS) {
			OVERALL_MONTH_INTERVAL_SECONDS = oVERALL_MONTH_INTERVAL_SECONDS;
		}

		
		
	 

}
