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

package eu.artist.migration.ct.common;

public class Constants {
	public static final int DEFAULT_PIDSTAT_VECTOR_SIZE = 15;
	public static final int DEFAULT_TSHARK_VECTOR_SIZE = 4;
	public static final int DEFAULT_TRAINING_VECTOR_SIZE = DEFAULT_PIDSTAT_VECTOR_SIZE + DEFAULT_TSHARK_VECTOR_SIZE * 2;
	public static final String DEFAULT_CONFIGURATION_FILE = "conf.ini";
}
