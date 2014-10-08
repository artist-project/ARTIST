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
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *
 */

package eu.artist.migration.pt.executor;

import java.io.OutputStream;

import com.jcraft.jsch.*;


public class SecureSSHCommandExecutor extends Thread
{
  private String user; 
  private String host;
  private String password;
  private String passwordSudo;
  private String command;
  public Channel channel;
  
  
  public SecureSSHCommandExecutor(String user, String host, String password, String passwordSudo, String command){
	  this.command=command;
	  this.user= user;
	  this.host = host;
	  this.password = password;
	  this.passwordSudo=passwordSudo;
  }
  
  public void run(){
	  try{
		  JSch jsch = new JSch();
		  Session session = jsch.getSession(user, host, 22);
		  session.setPassword(password);
		  session.setConfig("StrictHostKeyChecking", "no");
		  session.connect(10*1000);

		  channel = session.openChannel("exec");
    
		  ((ChannelExec)channel).setCommand("sudo -S "+command);
		  System.out.println("sshConnecting..");
		  channel.connect();
		  
		  ((ChannelExec)channel).setErrStream(System.err);
		  //InputStream in=channel.getInputStream();
		  OutputStream out=channel.getOutputStream();
		  out.write(((passwordSudo + System.getProperty("line.separator")).getBytes()));
	      out.flush();
	 
	      while(true){
    		if(channel.isClosed()){
	          System.out.println("exit-status: "+channel.getExitStatus());
	          break;
	        }
	        try{Thread.sleep(100);}catch(Exception ee){}
	      }

	      channel.disconnect();
	      session.disconnect();
	      
	  }catch(Exception e){
		e.printStackTrace();
	  }
  	}
} 
