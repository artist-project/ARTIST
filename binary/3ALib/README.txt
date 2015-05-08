
********************************************
3ALib (Abstracted Availability Auditor) tool	
********************************************

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
 

PART A General information

3Alib is a library and standalone java program whose scope is to measure the availability 
of services using an abstracted approach, regardless of the supported provider on 
which they are deployed. Such a library will be able to calculate the actual levels of 
availability as defined in the respective providers SLA. The goals of the library are:
•	consult users on why their services do not adhere to the SLA (if applicable)
•	keep detailed logs of the availability of services
•	calculate availability levels based on the providers definition and be used for compensation claims (together with the aforementioned logs)


PART B Included functionality in this version

In this version the functionality includes:

1) Checking of SLA constraints for Compute Level SLAs
2) Logging of availability statistics and calculation of intervals
3) Main testing has been performed for Amazon EC2 provider

Current full supported providers include Amazon EC2 Compute.




PART C Expected functionality in next versions

In the next versions we anticipate to extend the tool to include:

1) Storage or PaaS level SLAs monitoring
2) Fix of the execution bug for the RunAuditor jar
3) Inclusion of multi-user backend
4) Maven based handling of dependencies 


PART D Installation and configuration instructions

3alib has been divided into two jar files, which are identical except for the main class definition that is
used. 3alibRunCalculation may be used for the statistics, if the backend DB with the stats is running:
java -jar 3alibRunCalculator_v1_2.jar

3alibRunAuditor is used to launch the daemon for monitoring
java -jar 3alibRunAuditorRegion_v1_2.jar

To run the tool from command line, you need also a /lib folder containing the necessary jars. We do not distribute them due to potential licensing issues. The list of necessary jars is:

appengine-api-1.0-sdk-1.6.5.jar
appengine-api-stubs-1.6.5.jar
appengine-testing-1.6.5.jar
aws_ec2_plus_jclouds_core.jar
bcprov-ext-jdk15on-1.49.jar
bcprov-jdk15on-1.48.jar
bsh-2.0b4.jar
cglib-nodep-2.2.2.jar
clojure-1.3.0.jar
commons-codec-1.6.jar
commons-logging-1.1.1.jar
core.incubator-0.1.0.jar
easymock-3.1.jar
easymockclassextension-3.1.jar
gson-2.2.4-javadoc.jar
gson-2.2.4-sources.jar
gson-2.2.4.jar
gson-2.2.4_2.jar
guava-16.0.jar
guava-16.0_2.jar
guice-3.0.jar
guice-assistedinject-3.0.jar
httpclient-4.2.2.jar
httpcore-4.2.2.jar
java-xmlbuilder-0.4.jar
javax.inject-1.jar
javax.servlet-3.0.0.v201112011016.j
jcommander-1.27.jar
jetty-continuation-8.1.8.v20121106.
jetty-http-8.1.8.v20121106.jar
jetty-io-8.1.8.v20121106.jar
jetty-security-8.1.8.v20121106.jar
jetty-server-8.1.8.v20121106.jar
jetty-util-8.1.8.v20121106.jar
joda-time-2.1.jar
jsch-0.1.49.jar
jsr250-api-1.0.jar
jsr311-api-1.1.1.jar
log4j-1.2.17.jar
logback-classic-1.0.9.jar
logback-core-1.0.9.jar
mockwebserver-1.3.0.jar
mockwebserver-20121111.jar
mongo-2.4.jar
netty-3.5.9.Final.jar
objenesis-1.2.jar
okhttp-1.3.0.jar
okhttp-protocols-1.3.0.jar
org.osgi.compendium-4.2.0.jar
org.osgi.core-4.2.0.jar
rocoto-6.2.jar
slf4j-api-1.7.2.jar
snakeyaml-1.11.jar
snakeyaml-1.6.jar
sshj-0.8.1.jar
testng-6.8.jar
tools.logging-0.2.3.jar
xmlunit-1.3.jar

where aws_ec2_plus_jclouds_core.jar is the jar from the Apache Jclouds including aws-ec2 project and jcloud core.


Complete installation instructions can be found at:
http://www.artist-project.eu/documents 
and especially in the document:
D7.2.2 "Cloud Services Modelling and Performance Analysis Framework" Chapters 6 and 7




PART E Assumptions and Known Issues  

Due to the ambiguous nature of legal contracts or the inability to define every technical detail 
in the latter, during development we have made the following assump-tions/considerations:

During each loop, we check every time template IDs that are valid according to the pro-vider preconditions
and are admissible for the SLA. This happens because the valid IDs may vary over time due to user actions 
(e.g. starting/stopping a service instance affects the number of running VMs per template, which is a basic
precondition for an SLA to apply).Only for these valid template IDs we log the availability sample of that specific 
period, in order to keep only sensible and usable information and reduce the amount of data to be stored
and later processed. 

We assume an arbitrary interval of 5 minutes, for which consecutive timestamps of the logs are
considered in the same interval. This practically means that if we find that 2 consecutive database entries
have difference in timestamps larger than 5 minutes we assume that during this time the monitoring 
was stopped or other actions have deemed the SLA inapplicable for the specific template ID. 
Thus the second sample is not count-ed in any previously identified violation interval.
It is not determined in the SLAs of the providers whether the discount in case of violation applies 
to the entire account amount or to the part (valid template IDs ) that is applicable to an SLA. 
However given that this is a dynamic list that may vary over time and that providers report the overall 
amount for a type of resource, calculating the po-tential discount (in case of partial discount) can be a
very challenging, if not impossible (due to lack of necessary information), task. 
The main key processing feature of the logs is the template ID, given that for this granularity the SLAs 
apply, and the according timestamps. Currently as timestamps we accept the ones that are generated once 
the response of the provider has been received and the relevant information is included in the DB. 
This should be improved in the future to cater for any backend DB bottlenecks that may influence delays.

The main aspect mentioned by all the providers is that the resources need to be reachable. This is not 
completely determined as to what it means (could be based on pinging for example, ssh connection etc.).


Reachability status is currently achieved through pinging. However, pinging is not always enabled by
Cloud resources (by default it is disabled). To enable pinging, one must implement the following actions:
AWS: change in the security group of the VM instances the rules to include allowing of ICMP traffic
in case we need to enable it also in the VMs we may issue the following command:
sudo iptables -A INPUT -p icmp --icmp-type echo-request -j ACCEPT
Decision of reachability is  based on Average reported value. By default, ping function has average
if even 1 sample gets through. We consider the same condition. 
Different OS versions that are currently taken under consideration are Windows and Linux. The OS dependency
is mainly in the system command to launch ping.
Pinging is decided in common with the pinging of 8.8.8.8, to ensure general connectivity of the client
Changing the way we implement reachability decision needs a new class that implements the DecideReachability
interface (and replacement in the class that the reachability decision is called-- specifically implemented
classes for providers e.g. AWSEC2SLAAuditor)

In this jar version, the RunAuditor functionality seems to have a dependency issue and can not be run
externally from eclipse.
