/*******************************************************************************
 *  Copyright (c) 2014 - 2015 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
 *  
 *  Licensed under the MIT license:
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *
 * Contributors: Kleopatra Konstanteli (ICCS/NTUA)
 * 				 Ilknur Chulani (Atos)
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.cheatsheet.util;

import java.util.EnumSet;

import eu.artist.premigration.tft.mpt.rules.RulesConstants;

public enum MPTConstants {    
    //task groups
    TECHNICAL_GROUP("technical_group", "Technical Group"),
    BUSINESS_GROUP("business_group", "Business Group"),
    
    //composite cheat sheets (these map to methodology phases)
    CHEATSHEET_PRE_MIGRATION("eu.artist.methodology.mpt.cheatsheet.premigration", "mpt_pre_migration.xml"),
	CHEATSHEET_MIGRATION("eu.artist.methodology.mpt.cheatsheet.migration", "mpt_migration.xml"),
	CHEATSHEET_POST_MIGRATION("eu.artist.methodology.mpt.cheatsheet.postmigration", "mpt_post_migration.xml"),
	
	//simple cheat sheets for migration (these map to methodology tasks)	
	CHEATSHEET_MIGRATION_MODISCO(RulesConstants.MODISCO, "migration/technical/model_discovery_simple.xml"),
	CHEATSHEET_MIGRATION_MODUNDER(RulesConstants.MODUNDER, "migration/technical/model_understanding_simple.xml"),
	CHEATSHEET_MIGRATION_MODERN(RulesConstants.MODERN, "migration/technical/modernization_simple_new.xml"),
	CHEATSHEET_MIGRATION_EMREQ(RulesConstants.EMREQ, "migration/technical/modernization_simple_new.xml"),
	CHEATSHEET_MIGRATION_SCTARGET(RulesConstants.SCTARGET, "migration/technical/view_benchmarks_simple.xml"),	
	CHEATSHEET_MIGRATION_OPTAPPFEA(RulesConstants.OPTAPPFEA, "migration/technical/modernization_simple_new.xml"),
	CHEATSHEET_MIGRATION_NFVALML(RulesConstants.NFVALML, "migration/technical/modernization_simple_new.xml"),
	CHEATSHEET_MIGRATION_GSCODE(RulesConstants.GSCODE, "migration/technical/modernization_simple_new.xml"),
	CHEATSHEET_MIGRATION_GDEPL(RulesConstants.GDEPL, "migration/technical/deployment_simple_new.xml"),
	
	CHEATSHEET_MIGRATION_NETSETUP(RulesConstants.NETSETUP, "migration/technical/network_setup_simple.xml"),
	CHEATSHEET_MIGRATION_TEBENCH(RulesConstants.TEBENCH, "N/A"), //N/A means that this task is not included in the MPT
	CHEATSHEET_MIGRATION_TEMPOP(RulesConstants.TEMPOP, "N/A"),	 //because it is not used by the developer
	CHEATSHEET_MIGRATION_APAPUP(RulesConstants.APAPUP, "migration/technical/profile_benchmarks_app_simple.xml"),
	CHEATSHEET_MIGRATION_APACLAS(RulesConstants.APACLAS, "migration/technical/classify_application_simple.xml"),
	
	//simple cheat sheets for process tasks
	CHEATSHEET_MIGRATION_SLAMP(RulesConstants.SLAMP, "migration/process/SLA Management.xml"),
	CHEATSHEET_MIGRATION_IMRP(RulesConstants.IMRP, "migration/process/Incidence Management and Resolution.xml"),
	CHEATSHEET_MIGRATION_MCRP(RulesConstants.MCRP, "migration/process/Monitor Customer Request.xml"),
	CHEATSHEET_MIGRATION_MP(RulesConstants.MP, "migration/process/Marketing.xml"),
	CHEATSHEET_MIGRATION_CPMP(RulesConstants.CPMP, "migration/process/Cloud Provider Management.xml"),
	CHEATSHEET_MIGRATION_RAP(RulesConstants.RAP, "migration/process/Roles Alignment.xml"),
	CHEATSHEET_MIGRATION_DP(RulesConstants.DP, "migration/process/Development.xml"),
	CHEATSHEET_MIGRATION_UMP(RulesConstants.UMP, "migration/process/Update and Maintenance.xml"),
	
	//simple cheat sheets for business tasks
	CHEATSHEET_MIGRATION_VALPRO(RulesConstants.VALPRO, "migration/business/value_proposition_simple.xml"),
	CHEATSHEET_MIGRATION_CUSTOMER(RulesConstants.CUSTOMER, "migration/business/customer_interface_simple.xml"),
	CHEATSHEET_MIGRATION_OPERATIONAL(RulesConstants.OPERATIONAL, "migration/business/operational_infrastructure_simple.xml"),
	CHEATSHEET_MIGRATION_FINANCIAL(RulesConstants.FINANCIAL, "migration/business/financial_management_simple.xml"),
	
	//simple cheat sheets for post-migration
	//FIXME
	CHEATSHEET_MIGRATION_VERBETC(RulesConstants.VERBETC, "postmigration/monitor_sla_adherence_simple.xml"),
	
	//simple cheat sheets steps (these map to methodology activities)
	CHEATSHEET_MIGRATION_EMREQ_A3(RulesConstants.EMREQ + RulesConstants.ACT_3, "Annotate PSM with monitoring and billing components"),
	CHEATSHEET_MIGRATION_EMREQ_A4(RulesConstants.EMREQ + RulesConstants.ACT_4, "Annotate back-end component with highly scalable database requirement"),
	
	CHEATSHEET_MIGRATION_OPTAPPFEA_A1(RulesConstants.OPTAPPFEA + RulesConstants.ACT_1, "Ensure that the monitoring component is created at PSM level before proceeding to the next step"),
	CHEATSHEET_MIGRATION_OPTAPPFEA_A2(RulesConstants.OPTAPPFEA + RulesConstants.ACT_2, "Ensure that: (1) Data schema re-factoring and optimization targets NoSQL persistence frameworks, (2) Data dump transformation fits the data into the target NoSQL persistence frameworks, and (3) Persistence layer adaptation is based on the selected target NoSQL persistence frameworks"),
    
    //Process rules activities
 	//MCRP task activities
 	CHEATSHEET_MIGRATION_MCRP_A1(RulesConstants.MCRP + RulesConstants.ACT_1, "Define a communication mechanism with the user"),
 	CHEATSHEET_MIGRATION_MCRP_A2(RulesConstants.MCRP + RulesConstants.ACT_2, "Define the appropriate physical and Logical structure for the communication mechanism"),
 	CHEATSHEET_MIGRATION_MCRP_A3(RulesConstants.MCRP + RulesConstants.ACT_3, "Registration Communication"),
 	CHEATSHEET_MIGRATION_MCRP_A4(RulesConstants.MCRP + RulesConstants.ACT_4, "Initial diagnosis"),
 	CHEATSHEET_MIGRATION_MCRP_A5(RulesConstants.MCRP + RulesConstants.ACT_5, "Inform the user"),
 	CHEATSHEET_MIGRATION_MCRP_A6(RulesConstants.MCRP + RulesConstants.ACT_6, "Incidence closure"),
 	CHEATSHEET_MIGRATION_MCRP_A7(RulesConstants.MCRP + RulesConstants.ACT_7, "Measure and analysis user feedback | Blah blah blah"),
 	
 	//IMRP task activities
 	CHEATSHEET_MIGRATION_IMRP_A1(RulesConstants.IMRP + RulesConstants.ACT_1, "Incidence identification"),
 	CHEATSHEET_MIGRATION_IMRP_A2(RulesConstants.IMRP + RulesConstants.ACT_2, "Incidence logging"),
 	CHEATSHEET_MIGRATION_IMRP_A3(RulesConstants.IMRP + RulesConstants.ACT_3, "Incidence categorization"),
 	CHEATSHEET_MIGRATION_IMRP_A4(RulesConstants.IMRP + RulesConstants.ACT_4, "Initial diagnosis"),
 	CHEATSHEET_MIGRATION_IMRP_A5(RulesConstants.IMRP + RulesConstants.ACT_5, "Incidence prioritization"),
 	CHEATSHEET_MIGRATION_IMRP_A6(RulesConstants.IMRP + RulesConstants.ACT_6, "Incidence escalation"),
 	CHEATSHEET_MIGRATION_IMRP_A7(RulesConstants.IMRP + RulesConstants.ACT_7, "Investigation and diagnosis"),
 	CHEATSHEET_MIGRATION_IMRP_A8(RulesConstants.IMRP + RulesConstants.ACT_8, "Resolution and Recovery"),
 	CHEATSHEET_MIGRATION_IMRP_A9(RulesConstants.IMRP + RulesConstants.ACT_9, "Following up the incidence"),
  
 	//SLAMP task activities
 	CHEATSHEET_MIGRATION_SLAMP_A1(RulesConstants.SLAMP + RulesConstants.ACT_1, "Determine SLA Frameworks"),
 	CHEATSHEET_MIGRATION_SLAMP_A2(RulesConstants.SLAMP + RulesConstants.ACT_2, "Determine, document and agree requirements for existing and new services"),
 	CHEATSHEET_MIGRATION_SLAMP_A3(RulesConstants.SLAMP + RulesConstants.ACT_3, "Review underpinning agreements "),
 	CHEATSHEET_MIGRATION_SLAMP_A4(RulesConstants.SLAMP + RulesConstants.ACT_4, "Monitor service performance against SLA "),
 	CHEATSHEET_MIGRATION_SLAMP_A5(RulesConstants.SLAMP + RulesConstants.ACT_5, "Produce service reports"),
 	CHEATSHEET_MIGRATION_SLAMP_A6(RulesConstants.SLAMP + RulesConstants.ACT_6, "Review SLAs and underpinning agreements"),
 	
 	//CPMP task activities
 	CHEATSHEET_MIGRATION_CPMP_A1(RulesConstants.CPMP + RulesConstants.ACT_1, "Define the main features to be fulfilled by the cloud provider"),
 	CHEATSHEET_MIGRATION_CPMP_A2(RulesConstants.CPMP + RulesConstants.ACT_2, "Select cloud provider"),
 	CHEATSHEET_MIGRATION_CPMP_A3(RulesConstants.CPMP + RulesConstants.ACT_3, "Establish the cloud provider agreement"),
 	CHEATSHEET_MIGRATION_CPMP_A4(RulesConstants.CPMP + RulesConstants.ACT_4, "Monitor the fulfilment of the conditions"),
 	CHEATSHEET_MIGRATION_CPMP_A5(RulesConstants.CPMP + RulesConstants.ACT_5, "Report and control the non-fulfilment"),

 	//RAP task activities
 	CHEATSHEET_MIGRATION_RAP_A1(RulesConstants.RAP + RulesConstants.ACT_1, "Study the organisation and identify roles"),
 	CHEATSHEET_MIGRATION_RAP_A2(RulesConstants.RAP + RulesConstants.ACT_2, "Define the new roles"),
 	CHEATSHEET_MIGRATION_RAP_A3(RulesConstants.RAP + RulesConstants.ACT_3, "Modify the existing roles"),
 	CHEATSHEET_MIGRATION_RAP_A4(RulesConstants.RAP + RulesConstants.ACT_4, "Train people"),
 	CHEATSHEET_MIGRATION_RAP_A5(RulesConstants.RAP + RulesConstants.ACT_5, "Communicate the affected people their new activities and responsibilities"),
 	CHEATSHEET_MIGRATION_RAP_A6(RulesConstants.RAP + RulesConstants.ACT_6, "Communicate the entire organization the new and modified roles"),

 	//DP task activities
 	CHEATSHEET_MIGRATION_DP_A1(RulesConstants.DP + RulesConstants.ACT_1, "Requirements elicitation"),
 	CHEATSHEET_MIGRATION_DP_A2(RulesConstants.DP + RulesConstants.ACT_2, "Select the requirements to be developed in the sprint"),
 	CHEATSHEET_MIGRATION_DP_A3(RulesConstants.DP + RulesConstants.ACT_3, "Analysis and modelling"),
 	CHEATSHEET_MIGRATION_DP_A4(RulesConstants.DP + RulesConstants.ACT_4, "Development"),
 	CHEATSHEET_MIGRATION_DP_A5(RulesConstants.DP + RulesConstants.ACT_5, "Testing of functional and non-functional requirements"),
 	CHEATSHEET_MIGRATION_DP_A6(RulesConstants.DP + RulesConstants.ACT_6, "Review and add the requirements"),
 	CHEATSHEET_MIGRATION_DP_A7(RulesConstants.DP + RulesConstants.ACT_7, "Test and deploy the final application"),

 	//UMP task activities
 	CHEATSHEET_MIGRATION_UMP_A1(RulesConstants.UMP + RulesConstants.ACT_1, "Planning the releases"),
 	CHEATSHEET_MIGRATION_UMP_A2(RulesConstants.UMP + RulesConstants.ACT_2, "Build and test the release"),
 	CHEATSHEET_MIGRATION_UMP_A3(RulesConstants.UMP + RulesConstants.ACT_3, "Release testing and pilot"),
 	CHEATSHEET_MIGRATION_UMP_A4(RulesConstants.UMP + RulesConstants.ACT_4, "Perform transfer, deployment and retirement"),
 	CHEATSHEET_MIGRATION_UMP_A5(RulesConstants.UMP + RulesConstants.ACT_5, "Verify, review and close deployment"),
 	
 	//MP task activities
 	CHEATSHEET_MIGRATION_MP_A1(RulesConstants.MP + RulesConstants.ACT_1, "Analysis the market for the migrated solution"),
 	CHEATSHEET_MIGRATION_MP_A2(RulesConstants.MP + RulesConstants.ACT_2, "Identify the Marketing objectives"),
 	CHEATSHEET_MIGRATION_MP_A3(RulesConstants.MP + RulesConstants.ACT_3, "Identify the marketing strategy"),
 	CHEATSHEET_MIGRATION_MP_A4(RulesConstants.MP + RulesConstants.ACT_4, "Start implementing the market strategy"),
 	CHEATSHEET_MIGRATION_MP_A5(RulesConstants.MP + RulesConstants.ACT_5, "Monitor the market plan"),
 	CHEATSHEET_MIGRATION_MP_A6(RulesConstants.MP + RulesConstants.ACT_6, "Monitor the market"),
    
    //Business rules activities
   	
    //VALPRO task activities
    CHEATSHEET_MIGRATION_VALPRO_A1(RulesConstants.VALPRO + RulesConstants.ACT_1, "Identify and analyse the customers’ needs and motivation"),
 	CHEATSHEET_MIGRATION_VALPRO_A2(RulesConstants.VALPRO + RulesConstants.ACT_2, "Define the functionalities that need to be delivered to each customer segment in order to solve their needs"),
 	CHEATSHEET_MIGRATION_VALPRO_A3(RulesConstants.VALPRO + RulesConstants.ACT_3, "Define the value delivered to each customer segment"),
 	CHEATSHEET_MIGRATION_VALPRO_A4(RulesConstants.VALPRO + RulesConstants.ACT_4, "Continuously monitor the value proposition"),
 	
    //CUSTOMER task activities
    CHEATSHEET_MIGRATION_CUSTOMER_A1(RulesConstants.CUSTOMER + RulesConstants.ACT_1, "Analyse expected relationships from each customer segment"),
 	CHEATSHEET_MIGRATION_CUSTOMER_A2(RulesConstants.CUSTOMER + RulesConstants.ACT_2, "Perform a gap analysis on what the customer expects vs what you can offer"),
 	CHEATSHEET_MIGRATION_CUSTOMER_A3(RulesConstants.CUSTOMER + RulesConstants.ACT_3, "Implement generic customer relationships mechanisms"),
 	CHEATSHEET_MIGRATION_CUSTOMER_A4(RulesConstants.CUSTOMER + RulesConstants.ACT_4, "Instantiate these generic mechanisms to the corresponding customer segment"),
 	CHEATSHEET_MIGRATION_CUSTOMER_A5(RulesConstants.CUSTOMER + RulesConstants.ACT_5, "Determine sales channels"),
 	CHEATSHEET_MIGRATION_CUSTOMER_A6(RulesConstants.CUSTOMER + RulesConstants.ACT_6, "Implement sales channels"),
 	CHEATSHEET_MIGRATION_CUSTOMER_A7(RulesConstants.CUSTOMER + RulesConstants.ACT_7, "Deliver the value proposition to the customers"),
 	
    //OPERATIONAL task activities
    CHEATSHEET_MIGRATION_OPERATIONAL_A1(RulesConstants.OPERATIONAL + RulesConstants.ACT_1, "Determine the personnel resources"),
 	CHEATSHEET_MIGRATION_OPERATIONAL_A2(RulesConstants.OPERATIONAL + RulesConstants.ACT_2, "Determine the key non-personnel resources"),
 	CHEATSHEET_MIGRATION_OPERATIONAL_A3(RulesConstants.OPERATIONAL + RulesConstants.ACT_3, "Establish key infrastructure associations"),
 	CHEATSHEET_MIGRATION_OPERATIONAL_A4(RulesConstants.OPERATIONAL + RulesConstants.ACT_4, "Establish sales channel associations"),
 	CHEATSHEET_MIGRATION_OPERATIONAL_A5(RulesConstants.OPERATIONAL + RulesConstants.ACT_5, "Establish other key associations"),
 	
    //FINANCIAL task activities
    CHEATSHEET_MIGRATION_FINANCIAL_A1(RulesConstants.FINANCIAL + RulesConstants.ACT_1, "Define the revenue streams"),
   	CHEATSHEET_MIGRATION_FINANCIAL_A2(RulesConstants.FINANCIAL + RulesConstants.ACT_2, "Define the structure of costs"),
   	CHEATSHEET_MIGRATION_FINANCIAL_A3(RulesConstants.FINANCIAL + RulesConstants.ACT_3, "Determine the pricing strategy"),
   	CHEATSHEET_MIGRATION_FINANCIAL_A4(RulesConstants.FINANCIAL + RulesConstants.ACT_4, "Define the billing mechanisms");
    
    private final String constant;
    private final String message;

    private MPTConstants(String c, String m) {
        constant = c;
        message = m;
    }

    public boolean equalsConstant(String c){
        return (c == null)? false:constant.equals(c);
    }
    
    public String getMessage(String c){
        return (constant.equals(c))? message:null;  	
    }

    public String getConstant(){
       return constant;
    }
    
    public String getMessage(){
        return message;
    }

	public static MPTConstants getByConstant(String c) {
		MPTConstants returnValue = null;

			for (final MPTConstants element : EnumSet.allOf(MPTConstants.class)) {

				if (element.getConstant().equals(c)) {
					returnValue = element;
				}
			}
			
			return returnValue;
		}
	}
