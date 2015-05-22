Classication Tool 
Release date: 30/03/2015
version: 1.0.0

=========================================================================================

Copyright
---------
The source code in this distribution is © Copyright Institute of Communication and Computer Systems (ICCS) - 
National Technical University of Athens 2015.

=========================================================================================

Licenses
--------
This software is open source under the Eclipse Public License(EPL) version 1.0 License.

=========================================================================================

ABOUT
-----
The Classification Tool classifies an arbitrary application component to a predefined and known benchmark application category and then matches the application component(which is based on the aforementioned classification) with a cloud serivce offering (VM instance type) based on specific user interests (such as performance and cost).
 
=========================================================================================

INCLUDED FUNCTIONALITY
------------------------

- A new section was added in the configuration file(conf.ini) called [service_efficiency] where the user provides the wieghts for price and performance according to his/her interests both needed for the calculation of the Service Efficiency metric. 


=========================================================================================

KNOWN ISSUES
------------

- It should be noted that in this version only KNN Classifier is included. This component implements the KNN(k-nearest neighbors), a non-parametric method used for classification, in order to classify the application.

=========================================================================================

EXPECTED FUNCTIONALITIES
------------------------
- Future work up to the end of the ARTIST project will focus on the implementation and incorporation of SVM(Support Vector Machine) classifier algorithm within the Classification tool in terms of following another classification approach and comparing the outcomes to these of the KNN algorithm.

=========================================================================================

USER MANUEL
-----------

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

=========================================================================================




