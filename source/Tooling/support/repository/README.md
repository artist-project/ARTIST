ARTIST Repository prototype
===========================

Disclaimer: 
    This software is a research prototype and is not suited for production use.

Prerequisites for building the software:
    - Java JDK 1.7
    - Apache Maven 3.0.5 or higher

All code belonging to the ARTIST Repository is organized under this project. 
You can find the prototype code in the folders

        repo.server : The server including database, service and web service layers
        repo.common : The domain model and service interfaces shared between client and server
        repo.client : The API client that hides the web service calls from users of the Java service API
  
To build to project, issue the following command from the "repository" folder:

		mvn install -DskipTests

To run the tests, issue the following command from the "repository" folder:

		mvn test
    
To start the repository server, issue the following command from the "repository" folder:

		mvn -pl repo.server tomee:run
		
All code of the ARTIST Repository is published under the EPL v1.0 license. 
