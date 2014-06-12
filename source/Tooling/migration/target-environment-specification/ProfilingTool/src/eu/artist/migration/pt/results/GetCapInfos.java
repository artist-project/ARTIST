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

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import eu.artist.migration.pt.executor.SystemCommandExecutor;
import eu.artist.migration.pt.results.AsyncCallback.BoolCallback;

public class GetCapInfos {
	
	private boolean proceed;
	/*
	public static void main(String[] args){
		new GetCapInfos("./tmp/tsharkDst0.cap", "password");
	}*/
	
	private BoolCallback callback = new BoolCallback(){

        public void processResult(boolean callBackBool) {
            proceed=callBackBool;
        }
    };
    
    /*
     * pathToRes:path to store TShark results
     * file: file name were cap files are stored
     * pass: password for sudo commands (physical host)
     */
	
	public GetCapInfos(String pathToRes, String file, String pass){
		try {
			this.proceed=false;
			SystemCommandExecutor commandExecutor=new SystemCommandExecutor(Arrays.asList("sudo", "-S", "capinfos", pathToRes+"tmp/"+file), pass, this.callback);
			
			commandExecutor.start();
		
			
			while (true){
				if (proceed) break;
				TimeUnit.MILLISECONDS.sleep(100);
			}
			
			StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
			//StringBuilder stderr = commandExecutor.getStandardErrorFromCommand();
			//commandExecutor.interrupt();
			commandExecutor.join();
			
			//new Write(stdout, "/home/aliki/profTool/a_file", false);
			new ReadTSharkOutput(file, stdout, pathToRes+"TShark.txt");
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}