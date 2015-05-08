package eu.artist.migration.mdt.reusability;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.json.JSONException;
import org.json.JSONObject;

import eu.artist.migration.mdt.reusability.beans.DataStorage;
import eu.artist.migration.mdt.reusability.beans.DataStorageFramework;
import eu.artist.migration.mdt.reusability.beans.DataStorageProduct;
import eu.artist.migration.mdt.reusability.beans.ProgrammingLanguage;

public class LoginWindow {

	protected Shell shlLoginToMat;	
	private Text textUser;
	private Text textPassword;
	
	private final static String HEXES = "0123456789abcdef";

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LoginWindow window = new LoginWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlLoginToMat.open();
		shlLoginToMat.layout();
		while (!shlLoginToMat.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {		

		shlLoginToMat = new Shell();
		shlLoginToMat.setLocation(400,100);
		shlLoginToMat.setSize(319, 225);
		shlLoginToMat.setText("Login to MAT");
		shlLoginToMat.addKeyListener(new KeyListener(){		
			

			@Override
			public void keyPressed(KeyEvent e) {
				Log.writeLog("el codigo de enter es"+e.keyCode);
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

		});


		CLabel lblLabel = new CLabel(shlLoginToMat, SWT.NONE);
		lblLabel.setBounds(47, 28, 61, 21);
		lblLabel.setText("User:");

		CLabel lblPassword = new CLabel(shlLoginToMat, SWT.NONE);
		lblPassword.setText("Password:");
		lblPassword.setBounds(47, 73, 61, 21);

		textUser = new Text(shlLoginToMat, SWT.BORDER);
		textUser.setBounds(161, 28, 76, 21);

		textPassword = new Text(shlLoginToMat, SWT.BORDER | SWT.PASSWORD);
		textPassword.setBounds(161, 73, 76, 21);

		Button btnOk = new Button(shlLoginToMat, SWT.NONE);
		btnOk.setBounds(47, 126, 75, 25);
		btnOk.setText("Ok");

		Button btnCancel = new Button(shlLoginToMat, SWT.NONE);
		btnCancel.setBounds(162, 126, 75, 25);
		btnCancel.setText("Cancel");

		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String user = textUser.getText();
				String pass = textPassword.getText();
				if (user == "") {
					MessageDialog.openWarning(shlLoginToMat, "Warning",
							"You have to insert an user id");
					textUser.setFocus();
					return;
				}
				if (pass == "") {
					MessageDialog.openWarning(shlLoginToMat, "Warning",
							"You have to insert a password");
					textPassword.setFocus();
					return;
				}
				callService(user, pass);
				shlLoginToMat.close();
				NewReusabilityWizardWindow window = new NewReusabilityWizardWindow();
				window.open();

			}

		});

		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shlLoginToMat.close();
				NewReusabilityWizardWindow window = new NewReusabilityWizardWindow();
				window.open();
			}
		});

	}

	private void callService(String user, String password) {
		String params = getParams();
		String uri = Configuration.uriMAT;
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
			Log.writeLog("received json is "+strJson);
			
			JSONObject json = new JSONObject(strJson);
			
			if ((strJson.equalsIgnoreCase("{}"))){
				MessageDialog.openWarning(shlLoginToMat, "Warning",
						"Configuration values cannot be obtained from MAT. Please introduce them through next screens.");
				return;
			}
			
			if (!json.isNull("sameProgramingLanguage")){
				Configuration.sameProgramingLanguageMAT = json.getString("sameProgramingLanguage");				
			}
			if (!json.isNull("programingLanguage")){
				ProgrammingLanguage.programingLanguajeMAT = json.getString("programingLanguage");				
			}
			if (!json.isNull("sameDataStoragetype")){
				Configuration.sameDataStorageTypeMAT = json.getString("sameDataStoragetype");
			}										
			if (!json.isNull("storageTypeOnSource")){
				DataStorage.dataStorageTypeMAT = json.getString("storageTypeOnSource");				
			}
			if (!json.isNull("sameDatastorageFramework")){
				Configuration.sameDataStorageFrameworkMAT = json.getString("sameDatastorageFramework");				
			}
			if (!json.isNull("storageFrameworkOnSource")){
				DataStorageFramework.dataStorageFrameworkMAT = json.getString("storageFrameworkOnSource");				
			}
			if (!json.isNull("sameStorageProduct")){
				Configuration.sameDataStorageProductMAT = json.getString("sameStorageProduct");				
			}
			if (!json.isNull("storageProductOnSource")){
				DataStorageProduct.dataStorageProductMAT = json.getString("storageProductOnSource");				
			}
			if (!json.isNull("procedures")){
				Configuration.dataStorageStoredProcedures = json.getString("procedures");
			}
			if (!json.isNull("specificFunctions")){
				Configuration.dataStorageSpecificfunctions = json.getString("specificFunctions");
			}
			
			connection.disconnect();

		} catch (MalformedURLException e) {
			MessageDialog.openWarning(shlLoginToMat, "Warning",
					"MAT cannot be invoked. You will have to insert the reusability conditions by hand. Sorry for this...");
			Log.writeLog(e.toString());
		} catch (IOException e) {
			MessageDialog.openWarning(shlLoginToMat, "Warning",
					"MAT cannot be invoked. You will have to insert the reusability conditions by hand. Sorry for this...");
			Log.writeLog(e.toString());
		} catch (JSONException e) {
			MessageDialog.openWarning(shlLoginToMat, "Warning",
					"MAT cannot be invoked. You will have to insert the reusability conditions by hand. Sorry for this...");
			Log.writeLog(e.toString());
		} catch (Exception e) {
			MessageDialog.openWarning(shlLoginToMat, "Warning",
					"MAT cannot be invoked. You will have to insert the reusability conditions by hand. Sorry for this...");
			Log.writeLog(e.toString());
		}
	}

	private static String getLogin(String user) {
		String login = "";
		login = "login=" + user;
		return login;
	}

	private static String getParams() {
		String params = "";
		params = "{\"nada\":\"\"}";
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
