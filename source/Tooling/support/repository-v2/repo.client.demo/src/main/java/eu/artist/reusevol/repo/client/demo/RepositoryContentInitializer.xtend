/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
 
package eu.artist.reusevol.repo.client.demo

import com.google.common.base.Joiner
import com.google.common.base.Optional
import eu.artist.reusevol.repo.client.ArtefactManager
import eu.artist.reusevol.repo.client.CategoryManager
import eu.artist.reusevol.repo.client.ProjectManager
import eu.artist.reusevol.repo.client.RepositoryClient
import eu.artist.reusevol.repo.client.conf.RepositoryClientConfig
import eu.artist.reusevol.repo.client.wso2.Wso2Client
import eu.artist.reusevol.repo.client.wso2.dto.ScimGroup
import eu.artist.reusevol.repo.client.wso2.dto.ScimUser
import eu.artist.reusevol.repo.client.wso2.exceptions.ScimException
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.model.RepoCategory
import eu.artist.reusevol.repo.common.util.ArtefactId
import java.io.File
import java.util.List
import javax.ws.rs.core.MediaType

class RepositoryContentInitializer {

	private static val CONTENT_HOME = "../../Artefacts/eu.artist.repository.artefacts"
	private static val IMAGE_HOME = "src/main/resources/figures"

	static def void main(String[] args) {
		val initializer = new RepositoryContentInitializer();
		initializer.run();
	}

	private def getConfig() {
		remoteConfig()
	}

	private def localConfig() {
		new RepositoryClientConfig() => [
			setUsername("demos")
			setPassword("demo123")
			setLogMessagesForDebugging(false)
			setBaseRepositoryUri("http://localhost:8080/api")

			getWso2Config() => [
				setWso2BaseUrl("https://localhost:9443")
				setLogMessagesForDebugging(false)
				setTenant("artist-repo.eu")
				setOAuthClientId("cNh44TFOIpGkEhWzx8YT8KBVtk0a")
				setOAuthClientSecret("OrqunXZw0MmYaBpYWWOV24UHalsa")
				setAdminUsername("strauss@artist-repo.eu")
				setAdminPassword("admin")
			]
		]
	}

	private def remoteConfig() {
		new RepositoryClientConfig() => [
			setUsername("demo")
			setPassword("demo123")
			setLogMessagesForDebugging(false)
			setBaseRepositoryUri("http://localhost:8080/api")

			wso2Config => [
				setWso2BaseUrl("https://artist-demo.iao.fraunhofer.de")
				setTenant("test.artist-demo.eu")
				setOAuthClientId("j0gffE9u_TqiHbf7s3ZG9YEBIi8a")
				setOAuthClientSecret("VbB_Jo_t3pIsyHPuXobSJGn5pNoa")
				setAdminUsername("useradmin@test.artist-demo.eu")
				setAdminPassword("useradmin")
				setLogMessagesForDebugging(false)
				
				ssl.trustAllCertificates = true
			]
		]
	}
	
	def void run() {
		// Initialize the client
		val config = getConfig()
		val client = new RepositoryClient(config)

		// Get the manager components
		val categories = client.getCategoryManager();
		val projects = client.getProjectManager();
		val scim = client.getUserManager();

		// Ensure that our demo user exists and has the correct groups
		setupUserAndProjectGroup(scim, config)

		// --------------------------------------------------------------------------
		// Create Public project
		println("Creating projects:");
		val prjPublic = projects.createProject("public", "Public Artefact Collection")

		// --------------------------------------------------------------------------
		// Create categories
		println("Creating categories:");
		// Examples for type categories
		val catType = categories.createCategory("type", "Type");
		val catTypeModel = categories.createCategory("type.model", "MDA model");
		val catTypeModelUml = categories.createCategory("type.model.uml", "UML model");
		val catTypeModelUmlProfile = categories.createCategory("type.model.uml.profile", "UML Profile");
		val catTypeModelUmlLib = categories.createCategory("type.model.uml.library", "UML Library");
		val catTypeModelEmf = categories.createCategory("type.model.emf", "EMF model");
		val catTypeTrafo = categories.createCategory("type.trafo", "MDA transformation");
		val catTypeTrafoM2M = categories.createCategory("type.trafo.m2m", "Model-to-model transformation");
		val catTypeTrafoM2T = categories.createCategory("type.trafo.m2t", "Model-to-text transformation");
		val catTypeTrafoT2M = categories.createCategory("type.trafo.t2m", "Text-to-model transformation");
		val catTypeOther = categories.createCategory("type.other", "Non-MDA artefact");

		// Examples for methodology categories
		categories.createCategory("method", "Methodology categories");
		categories.createCategory("method.premig", "Pre migration phase");
		categories.createCategory("method.premig.techeva", "Technical evaluation");
		categories.createCategory("method.premig.buseva", "Business evaluation");
		categories.createCategory("method.premig.mgdef", "Migration goal definition");
		categories.createCategory("method.premig.techfeas", "Technical feasibilify analysis");
		categories.createCategory("method.premig.busfeas", "Business feasibilify analysis");
		categories.createCategory("method.premig.change", "Pro-condition evaluation");
		categories.createCategory("method.premig.migrat", "Migration decision");
		categories.createCategory("method.premig.methcust", "Methodology customization");
		categories.createCategory("method.mig", "Migration phase");
		categories.createCategory("method.mig.disun", "Discovery and understanding");
		categories.createCategory("method.mig.disun.modeldisco", "Model discovery");
		categories.createCategory("method.mig.disun.modelunder", "Model understanding");
		categories.createCategory("method.mig.envspec", "Target environment specification");
		categories.createCategory("method.mig.envspec.tebench", "Target environment benchmarking");
		categories.createCategory("method.mig.envspec.tempop", "Target environment model population");
		categories.createCategory("method.mig.envspec.apapup", "Performance and usage profiling");
		categories.createCategory("method.mig.envspec.apaclass", "Application components classification");
		categories.createCategory("method.mig.modern", "Modernization");
		categories.createCategory("method.mig.modern.emreq", "Migration requirements");
		categories.createCategory("method.mig.modern.sctarget", "Select Cloud target");
		categories.createCategory("method.mig.modern.optappfea", "Cloudify and optimize");
		categories.createCategory("method.mig.modern.nfvalml", "Non-fct. goals validation");
		categories.createCategory("method.mig.modern.gscode", "Generate source code");
		categories.createCategory("method.mig.modern.gdepl", "Generate deployment");
		categories.createCategory("method.postmig", "Post migration phase");
		categories.createCategory("method.support", "Post migration phase");
		
		// --------------------------------------------------------------------------
		// Artefact manager instances are tied to one project, here "public"
		val artefacts = client.getArtefactManager(prjPublic.id)

		// Create artefacts
		println("Creating artefacts:");
		artefacts.createArtefact(
			"profiles", // the package id (can be numbers, letters and _) 
			"jaas_profile", // the artefact id (can be numbers, letters and _)
			"JAAS Profile", // the artefact label (should be short and human readable)
			'''
This profile extends UML by defining stereotypes for the authentication security requirement of applications. 
In particular, the figure depicts the Java Authentication and Authorization Service (JAAS) UML profile whose 
stereotypes can be applied to the eGov use case to identify the components that handle the JAAS authentication.

The Subject, Principal, Credential, LoginContext, LoginModuleOption and CallbackHandler stereotypes extend UML::Class, 
while the LoginModule and the Callback stereotypes extend the UML::Interface.

The Subject stereotype represents the source of a request (e.g. a person or a service) that must be authenticated. 
The Principal stereotype represents an authenticated Subject (one or more Principals can be associated to the Subject 
if the authentication is successful). The Credential stereotype represents public or private security attributes of 
a Subject (e.g. username/password, certificates, etc.). The LoginContext stereotype provides the basic operations for 
authenticating subjects loading the LoginModule(s) specified in the Configuration. The Configuration stereotype extends the 
UML::Artefact and specifies the LoginModuleOption(s) that should be used for a particular application. In particular, 
the LoginModuleOption stereotype defines the LoginModule(s) intended to be used and the flag values (Required, Requisite, 
Sufficient, Optional) that control authentication behaviour. The CallbackHandler stereotype represents the way applications 
interact with users to obtain authentication information. A LoginModule uses the CallbackHandler to gather input from users 
(such as a password or smart card pin number) or to supply information to users (such as status information).			
			''', // the artefact description (separate paragraphs with an empty line, 
			// remove all references in the text so that it stands alone)
			catTypeModelUmlProfile, // the type of artefact (select on fitting category from above)
			#["profile", "security", "jaas"], // a list of tags describing the artefact
			#[catTypeModelUmlProfile], // a list of categories (select from above, chose at least the category from the type field)
			"profiles/jaas.profile.uml", // The path of the artefact relative to <ARTIST-Repository.git>/Artefacts
			"JAAS_profile.png" // the path to the image relative to the ./src/main/resources/figures folder in this project
		)

		artefacts.createArtefact(
			"profiles", // the package id (can be numbers, letters and _) 
			"rcp_profile", // the artefact id (can be numbers, letters and _)
			"Eclipse RCP Profile", // the artefact label (should be short and human readable)
			'''
This profile extends UML by defining stereotypes for Eclipse RCP elements and it is used in the high-level
abstraction of class and component models representing RCP-based desktop applications, in the context of
the Model Understanding Toolbox (MUT). This profile is generic enough as to represent most of the typical
standalone desktop RCP-based applications such as those implemented with SWT/JFace graphical framework.

The profile defines stereotypes for representing top RCP elements accepting third-party plugin contributions to its UI, such as: 

- Workbench, 
- Perspective, 
- View, 
- Menu and 
- ToolBar; 

as well as for RCP Action elements: 

- Toolbar Action, 
- Menu Action, 
- View Action and 
- Object Action.

The Eclipse Workbenches can be organized in sets of Perspectives, supporting the sharing of views between Perspectives. 
These stereotypes enable the characterization of the RCP visual organization. Additional visual elements attached to views 
are ViewPopupMenus and ObjectPopupMenus (which become available on the selection of a particular BusinessObject). 
The workbench can also define toolbar and menu actions.

Other visual control objects, apart from PopupMenu, included in the profile are Workbench Menu and Toolbar, which can be 
associated to any view or workbench (i.e. top menu and top tool bar).

Since the RCP elements can be characterized by classes, interfaces or components, this profile stereotypes are defined 
as extensions of UML::Classifier.

This profile has been designed focusing on some of the commonest RCP extension elements defined in the RCP plugin.xml 
descriptor file (the GUI extension mechanism is an advanced feature of the RCP framework).		
			''', // the artefact description (separate paragraphs with an empty line, 
			// remove all references in the text so that it stands alone)
			catTypeModelUmlProfile, // the type of artefact (select on fitting category from above)
			#["profile", "gui", "rcp", "frontend"], // a list of tags describing the artefact
			#[catTypeModelUmlProfile], // a list of categories (select from above, chose at least the category from the type field)
			"profiles/rcp.profile.uml", // The path of the artefact relative to <ARTIST-Repository.git>/Artefacts
			"RCP_profile.png" // the path to the image relative to the ./src/main/resources/figures folder in this project
		)
		
		artefacts.createArtefact(
			"models", // the package id (can be numbers, letters and _) 
			"gwt_pdm", // the artefact id (can be numbers, letters and _)
			"PDM for Goolge Web Toolkit", // the artefact label (should be short and human readable)
			'''
Platform Description Models (PDM) are model representations of a concrete platform, for instance, those 
intended for application development. The PDM is typically annotated with stereotypes defined in one or 
more PS or PI profiles, enabling the usage of PDM to qualify other PSM models or supporting PIM2PSM or 
PSM2PSM transformations. In this way, they can be reused to describe how the elements of a particular 
application PSM are using the platform.

GWT PDM is a particular example of PDM, annotated with GUI stereotypes, that plays a role in the mapping of 
GUI PIMs to GWT PSMs. In particular, it has been used in the “cloudification” of the DEWS CCUI. This PDM 
describes the main GWT graphical modeling elements and their mappings to the GUI profile 
(i.e. using GUI stereotypes).
			''', // the artefact description (separate paragraphs with an empty line, 
			// remove all references in the text so that it stands alone)
			catTypeModelUml, // the type of artefact (select on fitting category from above)
			#["pdm", "gui", "gwt", "frontend"], // a list of tags describing the artefact
			#[catTypeModelUml], // a list of categories (select from above, chose at least the category from the type field)
			"pdms/GWT-PDM_v2.0.uml", // The path of the artefact relative to <ARTIST-Repository.git>/Artefacts
			"GWT_PDM.png" // the path to the image relative to the ./src/main/resources/figures folder in this project
		)


		artefacts.createArtefact(
			"profiles",
			"gui_profile",
			"GUI Profile",
			'''
PI GUI UML profile is required to support model abstraction of GUI based applications (both desktop and webtop). 
This profile can complement the utility of IFML profile by enabling the modeling of graphical elements while IFML 
can be used to model the user interaction.

The GUI UML profile has been designed incorporating common GUI elements included in popular Java frameworks for 
building GUI applications, notably SWT/JFace and GWT (but common in AWT/Swing and other frameworks as well). 
This profile focuses on the characterization of the main graphical modeling elements, aiming at enabling their 
labeling in PIMs such as class and component models.

This profile describes UIApplications and their UILayouts. A UIApplication can have one main Menu and Toolbar.
Graphical elements are classified into Widgets, ActionableObjects, UIActions and Menus. Widgets elements are 
classified into those which are actionable and those which are not. An AccionableWidget triggers an action when 
selected. Examples of non-actionable widgets are Labels, Images, ProgressBars or TrayNotifiers. Examples of 
ActionableWidgets are editable or selectable elements, such as Buttons, ListBoxes, ComboBoxes, Trees, MenuItems 
or UIPanels. UIPanels are widgets that contain others that are organized according to a specific layout, such as 
Dialogs, TabPanels, PopupPanels, Canvas, FlowPanels, SplitPanels, etc.

ActionableObjects are data objects that trigger specific actions on the GUI, such as the adaptation of a contextual 
menu upon the selection of the graphical element representing the object.

UIActions are processes executed upon the selection or modification of the widget content by the user. We 
distinguish between actions associated to toolbars (ToolBarAction), menus (MenuAction), objects (ObjectAction) 
and panels (Panel Action).

Since the GUI elements can be characterized by both classes and interfaces, this profile stereotypes are defined 
as extensions of UML::Classifier, excepting for ActionableObjects that represent UML::Types.
			''', 
			catTypeModelUmlProfile,
			#["profile", "gui", "widgets", "frontend"], 
			#[catTypeModelUmlProfile],
			"profiles/gui.profile.uml",
			"GUI_UML_profile1.png" 
		)

		artefacts.createArtefact(
			"profiles",
			"datamanagement_profile",
			"Data Management Profile",
			'''
This profile extends UML by defining stereotypes for Observer Pattern and is used in the extraction of high-level 
PIMs for data management in the context of Model Understanding Toolbox (MUT). The profile defines stereotypes for 
Observer Pattern objects, subject, observer and message listener and also operations related with this pattern such 
as update, notify observers, register observers and remove observers allowing any application that incorporates the 
observer pattern to be modelled in UML.
			''', 
			catTypeModelUmlProfile,
			#["profile", "pim", "observer", "pattern", "dataManagement"], 
			#[catTypeModelUmlProfile],
			"profiles/DataManagement.profile.uml",
			"DataManagement_diagram.png" 
		)
		
		artefacts.createArtefact(
			"profiles",
			"dnet_profile",
			".NET Profile",
			'''
This profile extends UML by introducing eight stereotypes for .NET. The WebService stereotype is generalized by 
WCFService and ASPNETService to represent the different kinds of web services in the context of .NET. DataStore 
stereotype defines the components that manage the connection between the data store and the application and Entity 
stereotype defines the model classes. The View stereotype defines user ASP.NET pages which are actually user interfaces. 
Logging stereotypes defines the components which are responsible for logging and finally BLOB stereotype defines the 
components that constitute BLOBs in the application.
			''', 
			catTypeModelUmlProfile,
			#["profile", "webService", ".NET", "data", "entity", "gui", "logging", "blob"], 
			#[catTypeModelUmlProfile],
			"profiles/dotnet.profile.uml",
			"Dnet_diagram.png" 
		)

		artefacts.createArtefact(
			"profiles",
			"sharepoint_profile_profile",
			"SharePoint Profile",
			'''
This profile extends UML by introducing seven stereotypes to define Microsoft SharePoint applications. Application 
is generalized by Service Application and Web Application. A Service Application is a granular component running 
within SharePoint providing a particular service towards other SharePoint components. A Web Application is a basic 
web-based application that is a kind of plugin on top of Microsoft SharePoint. The List stereotype defines one of 
the two types of storage mechanisms in Microsoft SharePoint and ListStore stereotype defines the overall collection 
of Lists in a component model. Workflow stereotype defines the modules running a .NET workflow inside Microsoft Sharepoint.
 Finally, SharePointObjectModel defines the structured object model enabling easy access to the objects inside Microsoft 
 SharePoint.
			''', 
			catTypeModelUmlProfile,
			#["profile", "sharepoint", ".NET", "list", "workflow", "storage"], 
			#[catTypeModelUmlProfile],
			"profiles/MicrosoftSharePoint.profile.uml",
			"SharePoint_diagram.png" 
		)
		
		artefacts.createArtefact(
			"profiles",
			"visio_profile",
			"Microsoft Visio Profile",
			'''
This profile introduces four stereotypes targeted for Microsoft Visio. VisioObjectModel stereotype defines a 
structured object model enabling easy access to the objects inside Microsoft Visio. Extension stereotype is 
generalized into AddIn and COMAddIn. Both stereotypes are different techniques of creating an extension to Microsoft 
Visio. AddIn is the new way of creating a .NET assembly while COMAddIn is the older way of creating a windows 
COM component.
			''', 
			catTypeModelUmlProfile,
			#["profile", "visio", ".NET"], 
			#[catTypeModelUmlProfile],
			"profiles/MicrosoftVisio.profile.uml",
			"MicrosoftVisio_profile.png" 
		)		

		artefacts.createArtefact(
			"profiles",
			"packagemanagement_profile",
			"Package Management Profile",
			'''
This profile specifically targets application migrations in the .NET domain. Any migration requires the knowledge 
of which external packages/components the project depends on. In .NET there is a distinction between packages/components 
managed via NuGet and assemblies included into the project in the old-fashioned way. The profile extends UML by defining 
a stereotype together with a data type. It allows declaring a NuGetPackages profile to any UML Package or Component. This 
item contains one or more NuGetPackage elements referencing the external components. A NuGetPackage contains some basic 
information of which an “id” and the “version” are the most important ones.

Having this distinction allows to later on, when generating the target deployment units, easily determine whether 
the packages are available on the cloud platform, check whether there are updates to these packages, replace the 
current packages with similar cloud-compliant packages and so on.
			''', 
			catTypeModelUmlProfile,
			#["profile", "migration", ".NET", "package", "management"], 
			#[catTypeModelUmlProfile],
			"profiles/packagemanagement.profile.uml",
			null
		)
				
		artefacts.createArtefact(
			"profiles",
			"jms_profile",
			"JMS Profile",
			'''
This profile extends UML by defining stereotypes for applications using JMS (Java Message Service) APIs. We can group 
the stereotypes in this profile into four groups:

- JMS Message inheritance tree
- JMSClient and JMS Destination inheritance trees
- Stereotypes for JMS connectivity and transaction support
- Other stereotypes

JMS Messages
------------

JMS messages can be made of text data, objects, maps, small size data in bytes, or streams. This is reflected by 
specializing JMSMessage Stereotype into the following stereotypes:
- JMSTextMessage, JMSObjectMessage, JMSMapMessage, JMSByteMessage and JMSStreamMessage

JMS Clients and destinations
----------------------------

In a JMS application, messages are sent and received between MessageProducers or MessageConsumers (which are both
 specializations of JMSClient), and JMS destinations are used in the middle in order to add a level of indirection.
JMSDestinations can be queues or topics, so the inheritance tree for JMSDestination stereotype reflects this. If a 
JMS Queue is used, a JMSQueueSender produces the JMS message and sends this message to the queue, then a JMSQueueReceiver 
is used as aMessage consumer, so it receives the message from the queue.

A JMS Topic is used when publish and subscribe semantics is required between the JMS consumers and producers. In this 
case, a JMSTopicSubscriber subscribes to a JMSTopic, and when the JMSTopicPublisher publishes a message to the topic, 
the message gets delivered to the JMSTopicSubscriber.

The support for this two messaging mechanisms implies the following stereotype hierarchy relationships:

- JMSMessageDestination is a generalization of JMSQueue and JMSTopic.
- JMSMessageProducer is a generalization of JMSQueueSender and JSMTopicSender.
- JMSMessageConsumer is a generalization of JMSQueueReceiver and JMSTopicSubscriber.

There is also a stereotype called JMSMessageListener which can be used by any type of JMS consumer to listen 
to messages. If the JMSListener is used by a JavaEE application, a specialized form needs to be used, i.e. the MessageDriverBean.

JMS Connections
---------------

For messaging to happen, a JMSConnectionFactory needs to be created from JMSContext. JMSConnectionFactory creates 
JMSConnections, which in turn can create JMSSessions, and then finally JMS consumers and producers can be created in a JMSSession.

JMSConnectionFactories, JMSConnections, JMSSessions can all be queue based or topic based. Therefore,

- JMSConnectionFactory is a generalization of JMSQueueConnectionFactory and JMSTopicConnectionFactory.
- JMSConnection is a generalization of JMSQueueConnection and JMSTopicConnection.
- JMSSession is a generalization of JMSQueueSession and JMSTopicSession.

There is also support for transaction based messaging in JMS. Even though the applications are advised to use the JMS 
Provider’s capabilities for transaction support, some stereotypes are still provided in case this is not available in 
the JMS provider used. Therefore, the following stereotypes are provided as specializations:

- JMSXAConnection, JMSXAQueueConnection, JMSXATopicConnection,
- JMSXAConnectionFactory, JMSXAQueueConnectionFactory, JMSXATopicConnectionFactory
- JMSXASession, JMSXAQueueSession, JMSXATopicSession

Other stereotypes
-----------------

It is worth mentioning that another stereotype called JMSAdministeredObject is included to represent the 
generalization of JMS objects that can be configured administratively, i.e. JMSDestination, and 
JMSConnectionFactory.

Finally, JMSProvider and JNDINamespace stereotypes are also included in the JMS profile diagram, as there 
are logical connections to these from the JMS stereotypes.
			''', 
			catTypeModelUmlProfile,
			#["profile", "message", "JMS", "client", "connection"], 
			#[catTypeModelUmlProfile],
			"profiles/jms.profile.uml",
			"JMS_profile.png" 
		)

		artefacts.createArtefact(
			"profiles",
			"cloud_provider_profile",
			"Cloud Provider Profile",
			'''
CloudML@Artist is a meta-model composed of a set of UML profiles. The importance of these profiles, as well as 
their reusable nature, can be detected in the two aspects of the need for describing cloud environments in the 
context of ARTIST project.

- Model the cloud providers in terms of offerings, main features, and services.
- Model the deployment characteristics and the values of a deployed cloud application.

With this respect, a hierarchy of profiles has been constructed. These profiles are classified into three 
categories, which have been conceptually defined, by examining the role of each one of them, in the task of 
modelling concrete cloud environments.

1. 	Core profile is the base profile of CloudML@ARTIST. It models the main cloud characteristics from the point of 
	view of a cloud platform, containing stereotypes and datatypes which can be common among all cloud providers. In 
	addition, it contains 3 sub-profiles which model the specific characteristics of IaaS, PaaS and SaaS environments, 
	by defining the corresponding stereotypes and data types.

2. 	Supporting profiles are profiles which extend the core profile and define stereotypes for describing other 
	cloud aspects. For the time being, four supporting profiles have been defined and cover the aspects of availability, 
	benchmarking, pricing and security correspondingly. The contained stereotypes can be applied on stereotypes of the 
	providers’ profiles, thus contributing in the total process of modeling the cloud providers’ specific characteristics.

3. 	Providers’ profiles aim at modelling specific cloud providers. For the time being, three cloud providers 
	are supported and thus, three profiles have been created: Google App Engine, Windows Azure and Amazon EC2. 
	These profiles contribute in two ways:

		1. 	They use stereotypes defined in the core profile and the supporting profiles in order to concretize values 
			according to their provided services
		2. 	They allow their instantiation in order to describe a specific cloud deployment.
			''', 
			catTypeModelUmlProfile,
			#["profile", "cloudml@artist", "cloudProvider", "deployment", "offering", "feature", "service"], 
			#[catTypeModelUmlProfile],
			null,
			null
		)
// TODO: Find profile		


				
	}

	def setupUserAndProjectGroup(Wso2Client scim, RepositoryClientConfig config) {
		val groupName = "prj_public";

		println("Creating repository project.");
		var projectGroup = scim.getGroupByName(groupName);
		if (!projectGroup.isPresent()) {
			try {
				projectGroup = scim.createGroup(new ScimGroup(groupName));
			} catch (ScimException ex) {
				ex.printStackTrace();
				projectGroup = Optional.absent();
			}
		}

		println("Creating demo user.");
		var demoUser = scim.getUserByUsername(config.getUsername());
		if (!demoUser.isPresent()) {
			try {
				val u = new ScimUser(config.getUsername(), config.getPassword(), "Demo", "Demo")
				demoUser = scim.createUser(u)
			} catch (ScimException ex) {
				ex.printStackTrace()
				demoUser = Optional.absent()
			}
		}

		println("Adding user to project.");
		if (demoUser.isPresent() && projectGroup.isPresent()) {
			scim.addUserToGroup(demoUser.get(), projectGroup.get());
		}
	}

	private def createCategory(CategoryManager service, String id, String name) {
		println(" - " + id)
		service.create(id, name, name);
	}

	private def createProject(ProjectManager service, String id, String name) {
		println(" - " + id)
		service.create(id, name, name);
	}

	private def createArtefact(
		ArtefactManager service,
		String pkg,
		String id,
		String name,
		String description,
		RepoCategory type,
		List<String> tags,
		List<RepoCategory> categories,
		String contentPath,
		String imagePath
	) {
		println(" - " + id)

		// Step 1: create the artefact record
		val artefact = new RepoArtefact(ArtefactId.of(pkg, id).id, name, description)
		artefact.setType(type);
		artefact.getTags().addAll(tags)
		artefact.getCategories().addAll(categories.map[it.id])
		val entity = service.create(artefact)

		// Step 2: upload the content and image
		if (contentPath != null) {
			val contentFile = new File(Joiner.on("/").join(CONTENT_HOME, contentPath))
			service.setContent(entity, contentFile, MediaType.APPLICATION_XML, null);
		}
		if (imagePath != null) {
			val imageFile = new File(Joiner.on("/").join(IMAGE_HOME, imagePath))
			service.setImage(entity, imageFile, "image/png")
		}

		// Step 3: Commit version
		service.createVersion(entity, "initial version.")
	}

}