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

import java.io.*;

public class ThreadedStreamHandler extends Thread
{
	private InputStream inputStream; //Reading what the program gives you
	private OutputStream outputStream; //Writing what you want to the program
	private String adminPassword;
	private PrintWriter printWriter; //to write to the outputStream
	private StringBuilder outputBuffer = new StringBuilder();
	private boolean sudoIsRequested;
	 
	//constructor without pass
	ThreadedStreamHandler(InputStream inputStream)
	{
		this.inputStream = inputStream;
		this.sudoIsRequested = false;
	}

	//constructor with pass
	ThreadedStreamHandler(InputStream inputStream, OutputStream outputStream, String adminPassword)
	{
		this.inputStream = inputStream;
		this.outputStream = outputStream;
		this.printWriter = new PrintWriter(this.outputStream);
		this.adminPassword = adminPassword;
		this.sudoIsRequested = true;
	}
 
	//runs the command
	public void run(){
		if (sudoIsRequested)
		{
			printWriter.println(adminPassword);
			printWriter.flush();
		}
		BufferedReader bufferedReader = null;
		try{
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;   
			
			while ((line = bufferedReader.readLine()) != null)
			{
				if (line.contains("Sorry")){
					System.out.println("Wrong password (Pidstat or TShark)! Exiting...");
					System.exit(0);
				}
				if (line.contains("No such device")){
					System.out.println("Wrong network device! Exiting...");
					System.exit(0);
				}
				//Remove comments to print stderr and stdout
				//System.out.println(line);
				
				outputBuffer.append(line + "\n");
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch (Throwable t)
		{
			t.printStackTrace();
		}
		finally
		{
			try
			{
				bufferedReader.close();
			}
			catch (IOException e)
			{
				
			}
		}
	}
	

	//getter
	public StringBuilder getOutputBuffer(){
		return outputBuffer;
	}

}









