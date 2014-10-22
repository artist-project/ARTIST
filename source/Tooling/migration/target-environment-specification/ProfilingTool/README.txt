
****************************
Profiling tool	
***************************

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
 

PART A (General information)

Profiling tool is used:
1. In order to acquire the footprints of an unknown application or one of its components, on a specific physical host. The footprints consist of average execution metrics concerning CPU, RAM, disk and network utilization.
2. In order to acquire the same type of footprints of a set of test-applications called benchmarks on the same physical host.
The results of both execution modes of the tool, will be served as an input to a classification tool, which will decide upon the type of the application. Application types are defined according to the categorization of the benchmarks. 


**************************************************************************
**************************************************************************

KNOWN ISSUES

Potential errors during usage are presented in section 4 of user manual

**************************************************************************
**************************************************************************

EXPECTED FUNCTIONALITY

Possible bug fixing

**************************************************************************
**************************************************************************


PART B (Installation instructions and User Manual)

Table of Contents

1.Installation
2.Configurations
	2.1 Configuring the physical machine
	2.2 Configuring the Application VM
	2.3 Configuring the Benchmark VM (**Pending: installation instructions for the benchmarks)
3 User Manual
	3.1 Profiling the Application VM
		3.1.1 Preparation
		3.1.2 Execution (with graphical user interface)
		3.1.3 Execution (without graphical user interface)
		3.1.4 Results
	3.2 Profiling of a benchmark (using the benchmark VM)
		3.2.1 Preparation
		3.2.2 Execution (with graphical user interface)
		3.2.3 Execution (without graphical user interface)
		3.2.4 Results
4. Monitor Execution and Cases of Misuse
	4.1 Possible error messages
	4.2 Points to pay attention to


*********************************************************************************
*********************************************************************************

1.Installation

For running the profiling tool three machines will be needed.

1) The physical machine
2) A virtual machine running on (1) configured to host one or more components of your application
3) A virtual machine running on (1) configured to host benchmark tests 


*********************************************************************************
*********************************************************************************

2.Configurations

2.1 Configuring the physical machine (1)
	-Linux OS
	-Install Java
	-Install SSH
	-Install sysstat, tshark, wireshark:
		apt-get install sysstat
		apt-get install wireshark
		apt-get install tshark
		(replace with yum install if needed)
	-Check in the /etc/sudoers file that the line: "Default requiretty" does not exist, or comment it if exists
	
2.2 Configuring the Application VM (2)
	No configurations apart from the ones indicated by the hosted application component/s.
	
2.3 Configuring the Benchmark VM (3)
	-CentOS 64-bit V6.5 Server
	-Install SSH
	-Check in the /etc/sudoers file that the line: "Default requiretty" does not exist, or comment it if exists
	-Follow the installation instructions of each benchmark. 
	
*********************************************************************************
*********************************************************************************

3. User Manual:

Before reading the manual: Whenever specification of directory is demanded, full paths should be given.

3.1 Profiling the Application VM
	
3.1.1 Preparation:
	
	a.Make sure that the application VM is up and running.
	b.Find the PID of the application VM (Open a terminal on the physical machine and type: ps aux|grep "name of the vm" )
	c.Find the IP of the application VM
	d.Create a directory which will be used to store the commands, from now on referred to as workspace.
	e.Inside workspace create a folder named "tmp"
	f.Download the ProfilingTool.jar file and store it in a directory from now on referred to as installation_dir.
	
	
3.1.2 Execution (with graphical user interface):
	
	On the physical host:
	
	a.Open a terminal and navigate to the installation_dir
	
	b.type: java -jar ProfilingTool.jar application

	After typing the command (step 3) a graphical interface appears which introduces a form with empty text fields.

	Specification of the fields:
		
		-Workspace path: The workspace directory (see step (d) of preparation) 
	
	Pidstat Info Group:
		-Process ID: Process ID of the application VM.
		-password: Password for executing commands under root privileges.

	TShark Info Group:
		-IP to monitor: IP of the VM to be monitored.
		-Ethernet card to monitor: The ethernet card on which tshark will capture traffic (the eth card of the physical host)
		-password: Password for executing commands under root privileges.

	c.Fill the fields of the form and press the OK button.
	
	Two buttons (Start/Stop) will appear on the screen.
	
	d.Make sure the application component/s is/are running (under the desired workload) inside the VM
	e.Press the Start button
	f.Wait until enough time  has passed (for the application to execute the defined workload)
	g.Press the Stop button
	h.See the results in the workspace directory
	
Note: Execution can be monitored via the terminal. When the whole process has finished make sure that every 
executed command has been terminated with exit value 0. For other errors see the errors section.
	
	3.1.3 Execution (without graphical user interface):
	

	On the physical host:
	
	a.Create a txt file containing the lines:
		workspace
		PID,password
		IP,ethernetCard,password
		
	Attention! Don not leave blank spaces between the values. For more details on the values inserted in the file see the "Specification of the fileds"
	section in 3.1.2
	
	b.Open a terminal and navigate to the installation_dir
	
	c.type: java -jar ProfilingTool.jar application /full/path/to/the/txtFile/described/in/step_a
	
	Steps d to h are the same as in 3.1.2
	
	
	3.1.4. Results

	Pidstat results: Pidstat results are stored in a tab separated values file named pidstat.txt which contains the average values calculated for the whole 
execution period. The 15 values displayed are for the corresponding pidstat output metrics which are (in the same order as provided in the results):
%user, %system, %guest, %CPU, CPU, kB_rd/s, kB_wr/s, kB_ccwr/s, minflt/s, majflt/s, VSZ Virtual Size, RSS, %MEM, cswch/s, nvcswch/s

	TShark results: TShark results are stored in a tab separated values file named TShark.txt which contains values for: number of packets, data byte rate 
(bytes/s), average packet size (bytes), average packet rate (packets/s). Should be noted that TShark.txt contains two rows of results for each workload. 
The first one provides the TShark results captured for the monitored IP acting as source and the second one as destination.

Note: The names of the output files are specified by the tool, so it would be recommended for the user to remove output files from previous 
executions before the current execution, or change the path of the workspace. Otherwise, the tool will append the new results to the existing ones.
	
*********************************************************************************

3.2 Profiling of a benchmark (using the benchmark VM)
	
	3.2.1 Preparation:
	
	a.Make sure that the benchmark VM is up and running.
	b.Find the PID of the benchmark VM (Open a terminal on the physical machine and type: ps aux|grep "name of the vm" )
	c.Find the IP of the benchmark VM
	d.Create a directory which will be used to store the commands, from now on referred to as workspace.
	e.Inside workspace create a folder named "tmp"
	f.Download the ProfilingTool.jar file and store it in a directory from now on referred to as installation_dir.
	
	3.2.2 Execution (with graphical user interface):
	
	On the physical host:
	
	a.Open a terminal and navigate to the installation_dir
	
	b.type: java -jar ProfilingTool.jar benchmarks

	After typing the command a graphical interface appears which introduces a form with empty text fields.

	Specification of the fields:
		
		-Workspace path: The workspace directory (see step (d) of preparation) 
	
	Pidstat Info Group:
		-Process ID: Process ID of the application VM.
		-password: Password for executing commands under root privileges.

	TShark Info Group:
		-IP to monitor: IP of the VM to be monitored.
		-Ethernet card to monitor: The ethernet card on which tshark will capture traffic (the eth card of the physical host)
		-password: Password for executing commands under root privileges.

	Benchmark Info Group:
		-VM IP: The IP of the Benchmark VM (used for the ssh command)
		-VM user: The user for the SSH command
		-Input File: The input file containing the commands for the workload execution.
		-password: Password for the user used for the SSH command
		-root password: Password for running commands under root  privileges (in the Benchmark VM)
		
	c.Fill the fields of the form and press the OK button.
	
	d.Wait until the whole process is finished. Depending on the chosen benchmark and its workloads, 
	the execution may take hours. 
	
	e.See the results in the workspace directory
	
Note: Execution can be monitored via the terminal. When the whole process has finished make sure that every 
executed command has been terminated with exit value 0.

		
	3.2.3 Execution (without graphical user interface):
	

	On the physical host:
	
	a.Create a txt file containing the lines:
		workspace
		PID,password
		IP,ethernetCard,password
		VM_IP,VM_user,InputFile,password,root_password
		
	Attention! Don not leave blank spaces between the values. For more details on the values 
	inserted in the file see the "Specification of the fileds" section in 3.2.2
	
	b.Open a terminal and navigate to the installation_dir
	
	c.type: java -jar ProfilingTool.jar benchmarks /full/path/to/the/txtFile/described/in/step_a
	
	Steps d and e are the same as in 3.2.2
	
	
	3.2.4 Results
	
Pidstat results: Pidstat results are stored in a tab separated values file named pidstat.txt which 
contains the average values calculated for the whole execution period. The 15 values displayed are 
for the corresponding pidstat output metrics which are (in the same order as provided in the results):
%user, %system, %guest, %CPU, CPU, kB_rd/s, kB_wr/s, kB_ccwr/s, minflt/s, majflt/s, VSZ Virtual Size, RSS, %MEM, cswch/s, nvcswch/s

TShark results: TShark results are stored in a tab separated values file named TShark.txt which 
contains values for: 
number of packets, data byte rate (bytes/s), average packet size (bytes), average packet rate (packets/s).
Should be noted that TShark.txt contains two rows of results for each workload. 
The first one provides the TShark results captured for the monitored IP acting as source and the second one as destination.

For both of the output files several lines of results will appear, one for every workload

Note: The names of the output files are specified by the tool, so it would be recommended for the user to remove output files from previous 
executions before the current execution, or change the path of the workspace. Otherwise, the tool will append the new results to the existing ones.
	 
*********************************************************************************
*********************************************************************************
	
4. Monitor Execution and Cases of Misuse
This section describes possible reasons for failure of the profiling process, together with some monitoring advice for solving them.
Note: Every execution detail is printed on the terminal (System commands, actions). Monitor the exit values of the system commands.
Execution was successful only if every command terminated with exit value: 0. 


4.1 Possible error messages:

	-Invalid workspace! Exiting... : Error meaning that the workspace path provided by the user does not exist. 

	-Wrong password (Pidstat or Tshark)! Exiting... : Error meaning that the password the user provided for running the corresponding
	commands under root privileges was wrong. 

	-Wrong Process ID! Exiting... : Error meaning that the PID the user provided does not correspond to a valid process of the OS.

	-Wrong network device! Exiting... : Error meaning that the name of the ethernet card was not valid.

	-Error in command. Exiting ... : Error meaning that one or more of the system commands executed was not 
	terminated with 0 exit value (Unexpected error, the profiling process must be repeated)

	-Please enter argument: application/benchmarks : Error meaning that the command for executing the jar file was incorrect. User
	must retype the command correctly.
	
	-Wrong number of arguments! : Error meaning that the number of arguments provided with the java -jar commands was
	more than 2. User must retype the command correctly.


4.2 Points to pay attention to:

	-Existing output files: If output files from previous execution are still in the workspace directory, 
	the new results will append to the older. If user keeps track of the execution order, results will be valid.

	-/path/to/workspace/tmp not created: If the tmp subdirectory is not created before the tool’s execution, 
	the intermediate output files from TShark will not be created and the output file tshark.txt will be 
	empty (Exit value of the capinfos commands will be not equal to zero).

	
