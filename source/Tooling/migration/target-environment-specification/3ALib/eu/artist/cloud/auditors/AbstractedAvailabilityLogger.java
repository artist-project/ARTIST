/*
* Copyright (c) 2014 ICCS
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Apache License v2.0
* which
accompanies this distribution, and is available at
*
http://www.apache.org/licenses/LICENSE-2.0.html
* Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*
* Contributors:
*
George Kousiouris

* Initially developed in the context of ARTIST EU project
www.artist-project.eu
*//**
 * 
 */
package eu.artist.cloud.auditors;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.util.JSON;

import  org.bson.types.ObjectId;


/**
 * @author geo
 *
 */
public class AbstractedAvailabilityLogger {

	/**
	 * @param args
	 */
	public void logAvailability(ArrayList<String> TemplateIDs,String DBuser,String DBpass, String databaseIP) throws UnknownHostException, MongoException {
		// TODO Auto-generated method stub

		//needs to be periodic - but periodicity may be on the previous level-> Availability Auditor
		//better on the Availability Auditor level, since it will have refreshed also the state
		//needs to raise one thread per node, concurrent requests for all nodes?
		//sla is per template id? logically yes, so thread must be per template id

		//mongodb connection
		//we need to pass an object that will be the DB record and will contain all necessary information
		//this object will be transformed to json
		//more efficient to pass an arraylist of these objects (for all template IDs in one sample) and make once
		//the connection to the DB (for needed in the basic operation)
		
		for (String record:TemplateIDs){
		Mongo mongoClient = new Mongo( databaseIP );
		DB db = mongoClient.getDB( "3alib" );
		System.out.println("Host address for Backend DB:"+databaseIP);
		Set<String> colls = db.getCollectionNames();

		for (String s : colls) {
		    System.out.println("These are the collections... "+s);
		}
		DBCollection coll = db.getCollection("log_samples");
		
		//log sample
		/*BasicDBObject doc = new BasicDBObject("name1", "MongoDB2").
                append("type", "database").
                append("count", 1).
                append("info", new BasicDBObject("x", 203).append("y", 102));
*/
		//DBObject obj=new DBObject();
		
		JSON jsonObj=new JSON();
		
		DBObject obj=(DBObject) jsonObj.parse(record);
		//BasicDBObject doc=new BasicDBObject(record);

		ObjectId obid= new ObjectId();
		//System.out.println("This is the id:"+obj.get("_id"));
		coll.insert(obj);
		
		DBObject myDoc = coll.findOne();
		//System.out.println(myDoc);
		//coll.
		mongoClient.close();
		//log file must be per template ID so that it can be appended each time, if we start stop the auditing action
		//ideally templateID_month_year

		//return 0;
	}
		System.out.println("Records included");
	}

}
