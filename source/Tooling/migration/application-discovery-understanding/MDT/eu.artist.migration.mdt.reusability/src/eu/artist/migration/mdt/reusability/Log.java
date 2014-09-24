package eu.artist.migration.mdt.reusability;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
	private static final boolean LOGS = false;
	private static File outFile;
	/** write the logs to a file workbench-wizards.log in eclipse installation directory
	 * @param message
	 */
	public static void writeLog(String message) {
		if (LOGS == true) {
			try {				
				if (outFile==null)
					outFile = new File("reusability.log");
				BufferedWriter writer = new BufferedWriter(new FileWriter(
						outFile, true));
				Date date = new Date();
				DateFormat dateFormat = new SimpleDateFormat(
						"yyyy/MM/dd HH:mm:ss");
				writer.write(dateFormat.format(date) + "  " + message);
				writer.newLine();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}

}
