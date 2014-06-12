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

package eu.artist.migration.pt.executor;

import java.io.*;
import java.util.List;

import eu.artist.migration.pt.results.AsyncCallback.BoolCallback;

//Class for executing Unix commands (with or without password)

public class SystemCommandExecutor extends Thread
{
	public List<String> commandInformation;
	private String adminPassword;
	private int exitValue;
	
	public ThreadedStreamHandler inputStreamHandler;
	private ThreadedStreamHandler errorStreamHandler;
	
	private OutputStream commandStandardOutput;
	private InputStream commandStandardInputStream;
	private InputStream commandStandardErrorStream;
	
	public ProcessBuilder processBuilder;
	public Process process;
	public static Object obj= new Object();
	private BoolCallback boolCallBack;
	
	private boolean callBackUsed;
	
	//Constructor without password
	public SystemCommandExecutor(final List<String> commandInformation)
	{
		callBackUsed=false;
		if (commandInformation==null) throw new NullPointerException("The commandInformation is required.");
		this.commandInformation = commandInformation;
		this.adminPassword = null;
	}

	//Constructor with password
	public SystemCommandExecutor(final List<String> commandInformation, final String adminPassword, BoolCallback callBack)
	{
		callBackUsed=true;
		this.boolCallBack=callBack;
		if (commandInformation==null || adminPassword==null) throw new IllegalStateException("The commandInformation and password are both required.");
		this.commandInformation = commandInformation;
		this.adminPassword = adminPassword;	
	}
	
	public SystemCommandExecutor(final List<String> commandInformation, final String adminPassword)
	{
		callBackUsed=false;
		if (commandInformation==null || adminPassword==null) throw new IllegalStateException("The commandInformation and password are both required.");
		this.commandInformation = commandInformation;
		this.adminPassword = adminPassword;	
	}
  
	//method executing command
	public void run()
	{
		exitValue = -99;

		try
		{
			
			processBuilder = new ProcessBuilder(commandInformation);
			process = processBuilder.start();
			
			
			commandStandardOutput = process.getOutputStream();
			commandStandardInputStream = process.getInputStream();
			commandStandardErrorStream = process.getErrorStream();
			
			inputStreamHandler = new ThreadedStreamHandler(commandStandardInputStream, commandStandardOutput, adminPassword);
			errorStreamHandler = new ThreadedStreamHandler(commandStandardErrorStream);
			
			inputStreamHandler.start();
			errorStreamHandler.start();
			
			if (callBackUsed){
				this.boolCallBack.processResult(true);
			}
			
			System.out.println(commandInformation+"waiting");
			exitValue=process.waitFor();
			System.out.println(commandInformation+"Exit value: "+Integer.toString(exitValue));
			
			inputStreamHandler.interrupt();
			errorStreamHandler.interrupt();
			
			inputStreamHandler.join();
			errorStreamHandler.join();
			if (exitValue!=0) {
				System.out.println("Error in command. Exiting...");
				System.exit(1);
			}

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (InterruptedException e)
		{
			//
		}
		
	}

	
	public StringBuilder getStandardOutputFromCommand()
	{
		return inputStreamHandler.getOutputBuffer();
	}
	
	public StringBuilder getStandardErrorFromCommand()
	{
		return errorStreamHandler.getOutputBuffer();
	}


	public InputStream getCommandStandardInputStream()
	{
		return commandStandardInputStream;
	}

	public OutputStream getCommandStandardOutput()
	{
		return commandStandardOutput;
	}

	public InputStream getCommandStandardErrorStream()
	{
		return commandStandardErrorStream;
	}

	public ProcessBuilder getProcessBuilder()
	{
		return processBuilder;
	}

	public Process getProcess()
	{
		return process;
	}
	
	public int getExitValue(){
		return exitValue;
	}

}







