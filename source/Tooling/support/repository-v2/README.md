Repository Root Project
=======================

All code belonging to the ARTIST Repository is organized in this project/folder. You can find the prototype code in the folders

Shared components:

    repo.common : The domain model and service interfaces shared between client and server
    repo.client.config : Configuration classes for the server, SSL- and WSO2-clients
    repo.client : The API client that hides the web service calls from users of the Java service API
    repo.client.ssl : Helper module that provides a generic REST client that communicates via HTTPS
    repo.client.wso2 : Client for the WSO2 Identity Server providing OAuth2 and user management via SCIM
		OAuthAuthenticationService_v1.0 : The OAuth2 authentication service used by the repository service.

ARTIST Repository server:
 
		AuthorizationService_v1.0 : The authorization service used by the repository service on the service level.
    repo.server : The server including database, service and web service layers
        
Repository Eclipse client:

    repo.eclipse.client : Prototype of the Eclipse Repository Client
        
ARTIST Marketplace:
  
    repo.marketplace : Prototype of the ARTIST Marketplace  
  

Building and execution
----------------------  

To build, issue

		mvn clean install -DskipTests

To start the server, change to the "repo.server" directory and issue

		java -jar target/repo.server-2.0.0.jar server repository.yml
		
		
Licensing Information
---------------------

All code of the ARTIST repository with the exception of the AuthorizationService and OAuthAuthenticationService the code is 
published under the EPL v1.0 license. 
The AuthorizationService and OAuthAuthenticationService code is published under LGPL v3.
