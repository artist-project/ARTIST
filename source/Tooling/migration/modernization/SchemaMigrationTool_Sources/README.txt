SchemaMigrationTool, Version 1.0.0

=================================

ABOUT
-----
The SchemaMigrationTool is a command-line tool enabling the generation of an update script
to modify an existing database to a multi-tenant database. This tool is used in combination
with the MultitenancyMigrationTool in order to facilitate the migration of already existing
databases to the updated schema. The tool currently only generates MSSQL scripts. 


=========================================================================================

INCLUDED FUNCTIONALITIES
------------------------

=========================================================================================

KNOWN ISSUES
------------	

=========================================================================================

EXPECTED FUNCTIONALITIES
------------------------
- Perform migration of an existing database to a schema including the multi-tenancy related
aspects. 

=========================================================================================

INSTALLATION AND USER MANUAL
----------------------------
The tool is a commandline tool and therefore does not require any installation.

It can be executed as follows:

SchemaMigrationTool.exe --Server "SPIKESLT100" --Database "SPTG_Demo" --Script "sptg_update.sql" --Generic true

--Server (String): The database server on which the existing database is located
--Database (String): The actual database the requires the update to the multi-tenant schema
--Script (String): The location of the update script that is generated
--Generic (true/false): Whether or not the script needs to work standalone or in combination with the Spikes Update Tool