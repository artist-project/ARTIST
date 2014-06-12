/*
 * Copyright 2014 ICCS/NTUA
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.artist.migration.pt.results;

public class TSharkCapFiles {
	
	/* src: name (without extension) of file to store src Tshark results
	 * dst: name (without extension) of file to store dst Tshark results
	 * count: workload counter (identifies the workload for a specific benchmark)
	 * pathToRes: path were results are to be stored
	 * pass: password for sudo commands (physical host)
	 */
	public TSharkCapFiles(String src, String dst, int count, String pathToRes, String pass){

		for (int i=0; i<count; i++){
			new GetCapInfos(pathToRes, src+Integer.toString(i)+".cap", pass);
		}
		for (int i=0; i<count; i++){
			new GetCapInfos(pathToRes,dst+Integer.toString(i)+".cap", pass);
		}
	}
	
	public TSharkCapFiles(String src, String dst, String pathToRes, String pass){

		    new GetCapInfos(pathToRes, src+".cap", pass);
			new GetCapInfos(pathToRes,dst+".cap", pass);
	}
}
