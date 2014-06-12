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

import java.lang.reflect.Field;
import java.util.Arrays;


public abstract class UnixProcessUtils{
		
	public static int getUnixPID(Process process) throws Exception
	{
		Class<? extends Process> cl = process.getClass();
	    if (cl.getName().equals("java.lang.UNIXProcess"))
		{
	        Field field = cl.getDeclaredField("pid");
	        field.setAccessible(true);
	        Object pidObject = field.get(process);
	        return (Integer) pidObject;
	    } else{
	        throw new IllegalArgumentException("Needs to be a UNIXProcess");
	    }
	}
		
		
	public static void killUnixProcess(Process process, String pass) throws Exception
	{
	    int pid = getUnixPID(process);
	    SystemCommandExecutor commandExecutor = new SystemCommandExecutor(Arrays.asList("sudo", "-S", "kill", "-SIGINT", Integer.toString(pid)), pass);
		commandExecutor.start();
	}
		
}
