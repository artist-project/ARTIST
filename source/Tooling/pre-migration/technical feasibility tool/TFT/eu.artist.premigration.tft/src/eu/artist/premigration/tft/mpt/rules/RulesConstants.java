/*******************************************************************************
 *  Copyright (c) 2014 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
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
 * Contributors: Kleopatra Konstanteli
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.mpt.rules;

public final class RulesConstants {
	
	private RulesConstants() {
	}
	
	//actions
	public static final int REMOVE_TASK = 0;
	public static final int ADD_TASK = 1;
	public static final int EDIT_TASK = 2;	
	public static final int REMOVE_ACTIVITY = 3;
	public static final int ADD_ACTIVITY = 4;
	public static final int EDIT_ACTIVITY = 5;
	
	//phases
	public static final int PRE_MIGRATION = 0;
	public static final int MIGRATION = 1;
	public static final int POST_MIGRATION = 2;
	
	//edit choices
	public static final String OPTIONAL = "true";
	public static final String MANDATORY = "false";
	
	//Cloud constants
	public static final String AZURE = "Windows Azure";	
	public static final String EC2 = "Amazon EC2";
	
	//migration tasks	
	public static final String TEBENCH = "Target environment benchmarking";	
	public static final String TEMPOP = "Target environment model population";
    public static final String EMREQ = "Express migration requirements";
	public static final String OPTAPPFEA = "Cloudify and optimize application features";	
	public static final String NETSETUP = "Network setup";	
	public static final String MODISCO = "Reverse Engineering from existing system - Perform model discovery";	
	public static final String MODUNDER = "Perform model understanding";	
	public static final String MODERN = "Perform modernization";
	public static final String APAPUP = "Benchmark and profile application";
	public static final String APACLAS = "Classify your application's profile";
	public static final String SCTARGET = "View Cloud providers benchmarks";
	public static final String NFVALML = "Non-functional goals validation - model level";
	public static final String GSCODE = "Generate source code";
	public static final String GDEPL = "Generate deployment";
	
	//post-migration tasks
	//public static final String VERBETC = "Verification of the behavioural equivalence with test cases";
	public static final String VERBETC = "Monitor SLA adherence";
	
	//activities
	public static final String ACT_1 = " Activity 1";
	public static final String ACT_2 = " Activity 2";
	public static final String ACT_3 = " Activity 3";
	public static final String ACT_4 = " Activity 4";
	public static final String ACT_5 = " Activity 5";
}
