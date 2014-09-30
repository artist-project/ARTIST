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
package eu.artist.methodology.mpt.cheatsheet.actions;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;


public class DownloadMATReportAction extends Action implements ICheatSheetAction{
	
	//http:// 54.196.142.179:8080/ArtistEva/webresources/question/getmpt?login=yosu&params={%22ts%22:1412763746529}&hash=e4ecd6a297c01e9cca5a0da0e018a5de9f9ddfa6bd3e13b727df85ba542d11af74c32326320c65ca2de3441b488a09c9f6634ca1f83575be015504dd4168eac0
	
	@Override
	public void run(String[] params, ICheatSheetManager arg1) {
		
		    //String url = "http://54.196.142.179:8080/ArtistEva/webresources/question/getmpt";
	        InputStream in = null;

	        try {

	        	    URL url = new URL("http://54.196.142.179:8080/ArtistEva/webresources/question/getmpt?login=yosu&params={%22ts%22:1412763746529}&hash=e4ecd6a297c01e9cca5a0da0e018a5de9f9ddfa6bd3e13b727df85ba542d11af74c32326320c65ca2de3441b488a09c9f6634ca1f83575be015504dd4168eac0");

                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                    connection.setRequestMethod("GET");

                    connection.setRequestProperty("Accept", "application/xml");
   
                    String output;

                    String strXml;

                    StringBuilder builder = new StringBuilder();

                    BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));              

                    while ((output = br.readLine()) != null) {                        

                           builder.append(output);

                    }

                    strXml=builder.toString();
                    
                    System.out.println("MAT report:" + strXml);
                    
                    PrintWriter out = new PrintWriter("MAT_report.txt");
                    
                    out.println(strXml);
                    
                    out.close();
	                         

	        } catch (Exception e) {
	            e.printStackTrace();
	        }	
	}
}