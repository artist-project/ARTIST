/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.eubt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Debug {

	public enum OUTPUT_MODE {
		SYSTEM_OUT_ONLY, SYSTEM_OUT_AND_FILE_OUT, FILE_OUT_ONLY, NONE
	}

	public enum OUTPUT_LEVEL {
		OUT_ONLY, DEBUG
	}

	public static File DEBUG_FILE = new File("debug.out");
	public static OUTPUT_MODE debugMode = OUTPUT_MODE.SYSTEM_OUT_AND_FILE_OUT;
	public static OUTPUT_LEVEL outputLevel = OUTPUT_LEVEL.DEBUG;
	public static Object previousObject = null;

	public static void debug(final String output) {
		if (outputLevel == OUTPUT_LEVEL.DEBUG) {
			out(output);
		} else {
			// do nothing (= skip this call entirely)
		}
	}// debug (String)

	public static void debug(final Object object, final String output) {
		if (outputLevel == OUTPUT_LEVEL.DEBUG) {
			out(object, output);
		} else {
			// do nothing (= skip this call entirely)
		}
	}// debug (Object, String)

	public static void out(final String output) {
		if (debugMode == OUTPUT_MODE.SYSTEM_OUT_ONLY) {
			System.out.println(output);
		} else if (debugMode == OUTPUT_MODE.SYSTEM_OUT_AND_FILE_OUT) {
			System.out.println(output);
			appendToFile(output, true);
		} else if (debugMode == OUTPUT_MODE.FILE_OUT_ONLY) {
			appendToFile(output, true);
		} else if (debugMode == OUTPUT_MODE.NONE) {
			System.out.println("DEBUG_MODE = NONE");
		}
	}// out (String)

	public static void out(final Object object, final String output) {
		if (debugMode == OUTPUT_MODE.SYSTEM_OUT_ONLY) {
			if (previousObject != null && !previousObject.getClass().equals(object.getClass())) {
				System.out.println(""); // print an empty line
			}
			System.out.println("[" + object.getClass().getSimpleName() + "] " + output);

		} else if (debugMode == OUTPUT_MODE.SYSTEM_OUT_AND_FILE_OUT) {
			if (previousObject != null && !previousObject.getClass().equals(object.getClass())) {
				System.out.println(""); // print an empty line
				appendToFile("", true); // append an empty line
			}
			System.out.println("[" + object.getClass().getSimpleName() + "] " + output);
			appendToFile("[" + object.getClass().getSimpleName() + "] " + output, true);

		} else if (debugMode == OUTPUT_MODE.FILE_OUT_ONLY) {
			if (previousObject != null && !previousObject.getClass().equals(object.getClass())) {
				appendToFile("", true); // append an empty line
			}
			appendToFile(output, true);
		}

		previousObject = object;
	}// out (Object, String)

	public static void clearDebugFile() {
		if (DEBUG_FILE == null) {
			try {
				DEBUG_FILE.createNewFile();
			} catch (final IOException e) {
				System.err.println("Could not create debug file " + DEBUG_FILE.getAbsolutePath() + " because of the following error: " + e);
			}
		}
		appendToFile("", false);
	}// clearDebugFile

	public static String readFile() {
		byte[] encoded;
		try {
			encoded = Files.readAllBytes(Paths.get(DEBUG_FILE.getAbsolutePath()));
			return Charset.defaultCharset().decode(ByteBuffer.wrap(encoded)).toString();
		} catch (final IOException e) {
			System.err.println("Could not read from debug file " + DEBUG_FILE.getAbsolutePath() + " because of the following error: " + e);
		}
		return "Could not read from debug file " + DEBUG_FILE.getAbsolutePath();
	}// readFile

	/**
	 * @param output
	 */
	private static void appendToFile(final String output, final boolean append) {
		try {
			final PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(DEBUG_FILE, append)));
			printWriter.println(output);
			printWriter.close();
		} catch (final IOException e) {
			System.err.println("Could not write to debug file " + DEBUG_FILE.getAbsolutePath() + " because of the following error: " + e);
		}
	}// appendToFile

}
