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

/**
 *
 */
public class PingThread extends Thread {

    private String record = null;
    private String input_1 = null;
    private String input_2 = null;
    boolean finally_reachable=false;
   

	public synchronized boolean isFinally_reachable() {
		return finally_reachable;
	}

	public synchronized void setFinally_reachable(boolean finally_reachable) {
		this.finally_reachable = finally_reachable;
	}

	public PingThread() {
    }

    public PingThread(String input1, String input2) {
        try {
            setInput_1(input1);//IP address
            setInput_2(input2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        Process proc;

        try {
            String IPaddress = getInput_1();
            
            String osname=System.getProperty("os.name").toLowerCase();
            
            System.out.println("Calling system command for pinging IP:" + IPaddress);
            
            String command="dir";
            if (isWindows(osname)) {
            command = ("ping " + IPaddress+" -n 4"); 
            }
            if (isUnix(osname)) {
            command = ("ping -c 4 " + IPaddress); // 
                }
            
            proc = Runtime.getRuntime().exec(command);

            // any error message?
            StreamGobbler errorGobbler = new StreamGobbler(proc.getErrorStream(), "ERROR");

            // any output?
            StreamGobbler outputGobbler = new StreamGobbler(proc.getInputStream(), "OUTPUT");

            // kick them off
            errorGobbler.start();
            outputGobbler.start();

           
            // any error???
            int exitVal = proc.waitFor();
            System.out.println("ExitValue: " + exitVal);
            
            //if (outputGobbler.isDecision()){
            	
            if (exitVal==0){
            //System.out.println("Destination is reachable");
            	setFinally_reachable(true);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setRecord(String record_) {
        record = record_;
    }

    public String getRecord() {
        return record;
    }

    public void setInput_1(String input1) {
        input_1 = input1;
    }

    public String getInput_1() {
        return input_1;
    }

    public void setInput_2(String input2) {
        input_2 = input2;
    }

    public String getInput_2() {
        return input_2;
    }
    public boolean isWindows(String system) {
        return (system.indexOf("win") >= 0);
    }

    

    private static boolean isUnix(String system) {
        return (system.indexOf("nux") >= 0);
    }
}
