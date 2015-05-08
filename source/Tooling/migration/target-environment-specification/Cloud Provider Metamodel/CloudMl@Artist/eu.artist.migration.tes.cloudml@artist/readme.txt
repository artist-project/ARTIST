CloudML@Artist, Version 15.0

=================================

ABOUT
-----

CloudMl@Artist is a metamodel composed of an extensible set of uml profiles through which it is possible to model the main features of cloud providers (both paas and iaas), as well as modeling capabilities to describe services that can be offered under the saas model. 
These same profiles can be used also to specify values related to concrete deployments

=========================================================================================

INCLUDED FUNCTIONALITIES
------------------------

Cloudml@Artist is structured as a series of interconnected UML profiles, 
making it possible to create models with great flexibility:

Core profile
UML Profile containing generic stereotypes that can be applied to characterize entities belonging to different cloud providers.
It is split in 4 subprofiles:
- Core
- IaaS: contains specific IaaS stereotypes and data types.
- PaaS: contains specific PaaS stereotypes and data types.
- SaaS: contains specific SaaS stereotypes and data types.

Pricing profile
Included in "supporting profiles" category, this profile can be applied to any cloud provider to model pricing related aspects.

Availability profile
Profile that permits to model cloud provider availability related aspects, as these are expressed in the SLAs. The stereotypes of this profile can be applied on different service elements (e.g. ServiceOfferings), in order to independently describe different SLAs that may apply to different types of services (e.g. Compute SLA, Storage SLA etc.).

Security profile
This profile is used to specify security related characteristics at provider level. At the moment the amount of modelled characteristics can be significantly enriched.

Benchmark profile
This profile can be included when modelling a cloud provider to specify results of benchmark tests, when attached to specific service instance types.


=========================================================================================

KNOWN ISSUES
------------

=========================================================================================

EXPECTED FUNCTIONALITIES
------------------------
- Bug fixing and improvements

=========================================================================================

INSTALLATION AND USER MANUAL
----------------------------
In section 3 of the public deliverable 'Cloud services modeling and performance analysis framework' of the ARTIST project website (artist-project.eu) :
