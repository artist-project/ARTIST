package eu.artist.migration.ct.ui;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		MainForm.showForm();
	}

}
