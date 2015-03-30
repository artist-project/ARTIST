package eu.artist.premigration.tft.scc.metricexplorer;

import java.io.File;

import eu.artist.premigration.tft.scc.util.ClassExplorer;
import eu.artist.premigration.tft.scc.util.ForwardCopy;
import eu.artist.premigration.tft.scc.util.JavaExplorer;
import eu.artist.premigration.tft.scc.util.CSExplorer;
import eu.artist.premigration.tft.scc.util.Searcher;
import eu.artist.premigration.tft.scc.structures.Project;
import eu.artist.premigration.tft.scc.structures.SearchResult;
import eu.artist.premigration.tft.scc.structures.SourceFile;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.sql.Timestamp;
import java.util.Date;

import org.json.JSONException;
import org.json.JSONObject;


public class ReusabilityExplorer {
	private final static String HEXES = "0123456789abcdef";
	private float reusability=0;
	private float reusabilityLines=0;

	public float getReusability(){
		return this.reusability;
	}
	
	public float getReusabilityLines(){
		return this.reusabilityLines;
	}
	
	public void calculateReusability(String user, String password, String uriMAT, String path) {
		String params = getParams();
		String uri = uriMAT;
		try {
			uri += "?" + getLogin(user) + "&params=" + params + "&hash="
					+ getHash(user, password, params);
			System.out.println(uri);
			URL url = new URL(uri);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");

			String output;
			String strJson;
			StringBuilder builder = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(connection.getInputStream())));			
			while ((output = br.readLine()) != null) {				
				builder.append(output);
			}
			
			strJson=builder.toString();
			System.out.println("received json is "+strJson);
			
			JSONObject json = new JSONObject(strJson);
			
			if ((strJson.equalsIgnoreCase("{}"))){
				System.out.println("json empty");
				return;
			}
			
			if (!json.isNull("sameProgramingLanguage")){
				if(json.getString("sameProgramingLanguage").equals("Yes")){
					System.out.println("Proceding to execute");

					ClassExplorer ce=null;
					//Buscar objetos no reutilizables
					Searcher s= new Searcher(); 
					
					if (!json.isNull("programingLanguage")){
						if(json.getString("programingLanguage").equals("Java")){
							s.addType("java");
							ce= new JavaExplorer();

						}else{
							s.addType("cs");
							ce= new CSExplorer();
						}
					}
					if (!json.isNull("sameDataStoragetype")){
						if(json.getString("sameDataStoragetype").equals("No")){
							//Add storage keywords
							if (!json.isNull("storageTypeOnSource")){
								if(json.getString("storageTypeOnSource").equals("Relational Database")){
									//Add storage keywords for Relational Database
									s.addParam("SELECT");
									s.addParam("INSERT");
									s.addParam("UPDATE");
									s.addParam("DELETE");
								}
								if(json.getString("storageTypeOnSource").equals("NoSQL Database")){
									//Add storage keywords for NoSQL Database
									s.addParam("pet");
								}
							}

						}
					}	
					
					if (!json.isNull("sameDatastorageFramework")){
						if(json.getString("sameDatastorageFramework").equals("No")){
							//Add storage keywords
							if (!json.isNull("storageTypeOnSource")){
								if(json.getString("storageFrameworkOnSource").equals("JPA")){
									//Add keywords for JPA
									s.addParam("javax.persistence");
									s.addParam("javax.validation");
								}
								if(json.getString("storageFrameworkOnSource").equals("Objectify")){
									//Add keywords for Objectify
									s.addParam("@Embeddable");
									s.addParam("@Entity");
									s.addParam("@MappedSuperclass");
									s.addParam("@Cacheable");
									s.addParam("@EntityListeners");
									s.addParam("@ExcludeDefaultListeners");
									s.addParam("@ExcludeSuperclassListeners");
									s.addParam("@IdClass");
								}
							}

						}
					}		

					File folder = new File(path);
					s.searchInFolder(folder);
					//Creacion del objeto Project
					Project p= new Project();
					
					//Guardar en el proyecto las classes reutilizables totalmente
					for (SearchResult sr : s.getNoResult()) {
						File sampleFile = new File(sr.getFileName());
						p.addSourceFile(ce.findMethodsParser(sampleFile));
						
					}
					
					//Guardar en el proyecto las classes reutilizables parcialmente
					for (SearchResult sr : s.getResult()) {
						File sampleFile = new File(sr.getFileName());
						p.addSourceFile(ce.findMethodsParser(sampleFile, sr.getLines()));
					}
					
					this.reusability=p.getReusability();
					this.reusabilityLines=p.getReusabilityLines();
				}

			
			}

			connection.disconnect();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getLogin(String user) {
		String login = "";
		login = "login=" + user;
		return login;
	}

	private static String getParams() {
		 String params = "";
		 params = "{\"ts\":\""+System.currentTimeMillis()+"\"}";
		 return params;
	}

	public static String getHash(String login, String password, String params)
			throws Exception {

		String hash = login + "$" + password;
		final MessageDigest md = MessageDigest.getInstance("SHA-512");
		ByteArrayOutputStream pwsalt = new ByteArrayOutputStream();
		pwsalt.write(hash.getBytes("UTF-8"));
		byte[] unhashedBytes = pwsalt.toByteArray();
		byte[] digestVonPassword = md.digest(unhashedBytes);

		String ihash = getHex(digestVonPassword);
		hash = login + "$" + params + "$" + ihash;
		pwsalt.reset();
		pwsalt.write(hash.getBytes("UTF-8"));
		unhashedBytes = pwsalt.toByteArray();
		digestVonPassword = md.digest(unhashedBytes);
		ihash = getHex(digestVonPassword);

		return ihash;

	}

	private static String getHex(byte[] raw) {
		if (raw == null) {
			return null;
		}
		final StringBuilder hex = new StringBuilder(2 * raw.length);
		for (final byte b : raw) {
			hex.append(HEXES.charAt((b & 0xF0) >> 4)).append(
					HEXES.charAt((b & 0x0F)));
		}
		return hex.toString();
	}

	
}
