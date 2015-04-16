****************************
Classification tool	
***************************

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
 
*********************************************************************************
*********************************************************************************

 User Manual:

 Follow very carefully the instructions concerning the formatting of the information inserted as input and the creation of the configuration file
 
 1.Prerequisite steps for using Classification Tool: 
 
 a.Make sure that a file with the benchmark profiles (training file) is created by merging Tshark and Pidstat files derived from benchmark profiling process using Profiling tool and a predefined workload name for each of them is provided.	
 b.Ensure that the input files derived from the application profiling process using Profiling tool (Tshark and Pidstat results for the arbitrary application component) are locally stored.
 c.	Create a configuration file called conf.ini using the standard INI file format which includes three sections: the first section is the [classification] section where the user fills in the classifier engine to be used for the classification process and the second one is the [database] section where the user fills in the information needed for establishing the DB connection such as hostname, TCP port, DB name and user credentials. The last one is the [service_efficiency] section where the user provides the weights for price and performance according to his/her interests both needed for the calculation of the Service Efficiency metric. The conf.ini file must be located in the same folder as the ClassificationTool.jar
	
 2. Execution of Classification Tool:
 
 a.Navigate to the directory where the executable ClassificationTool.jar is located. By double clicking on the jar file, a graphical interface appears introducing a form with empty fields. The user clicks on the “Browse…” buttons in order to locate the files needed for the classification process. The training file includes the benchmark profiles while the Tshark and Pidstat files include the application profile.
 
 b.In turn, click on Calculate classification so that the arbitrary application component can be classified.
 
 c.After the completion of the classification process, the result is displayed in the class field.
 
 d.In the last step, click on the Calculate best instance type! button in order for the Classification tool to calculate the best cloud offering which is displayed on the instance field.

	
*********************************************************************************
*********************************************************************************

