/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.provider.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.model.Action;
import org.osgi.framework.Bundle;

/**
 * Color modes for Henshin models and diagrams. It has no dependencies to UI
 * plug-ins, but to the platform. Maybe this dependency can be removed in the
 * future.
 * 
 * @author Christian Krause
 *
 */
public class HenshinColorMode {

	public static class Color {

		public final int red, green, blue;

		public Color(int red, int green, int blue) {
			this.red = red;
			this.green = green;
			this.blue = blue;
		}

		@Override
		public int hashCode() {
			return red + green + blue; // improve this..
		}

		@Override
		public boolean equals(Object o) {
			if (o instanceof Color) {
				Color c = (Color) o;
				return c.red == red && c.green == green && c.blue == blue;
			}
			return false;
		}

		public URI toURI() {
			return URI.createURI("color://rgb/" + red + "/" + green + "/"
					+ blue);
		}

	}

	public static final Map<String, HenshinColorMode> REGISTRY;

	private static HenshinColorMode DEFAULT;

	static {
		REGISTRY = new LinkedHashMap<String, HenshinColorMode>() {
			private static final long serialVersionUID = 1L;

			@Override
			public HenshinColorMode get(Object v) {
				return super.get(String.valueOf(v).toLowerCase());
			}

			@Override
			public HenshinColorMode put(String v, HenshinColorMode mode) {
				return super.put(String.valueOf(v).toLowerCase(), mode);
			}
		};
		Bundle bundle = Platform.getBundle("org.eclipse.emf.henshin.edit");
		
		String[] modes = new String[] {"default", "bw", "classic", "dark"};
		for (String mode : modes) {
			try {
				InputStream in = FileLocator.openStream(bundle, new Path("colorModes/" + mode + ".properties"), false);
				Properties properties = new Properties();
				properties.load(in);
				HenshinColorMode theMode = new HenshinColorMode(properties);
				REGISTRY.put(theMode.getName(), theMode);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}

	public static final String BG_RULE = "BG_RULE";
	public static final String BG_UNIT = "BG_UNIT";
	public static final String BG_INVOCATION = "BG_INVOCATION";

	public static final String FG_RULE = "FG_RULE";
	public static final String FG_UNIT = "FG_UNIT";
	public static final String FG_INVOCATION = "FG_INVOCATION";

	public static final String BG_ACTION_PRESERVE = "BG_ACTION_PRESERVE";
	public static final String BG_ACTION_CREATE = "BG_ACTION_CREATE";
	public static final String BG_ACTION_DELETE = "BG_ACTION_DELETE";
	public static final String BG_ACTION_FORBID = "BG_ACTION_FORBID";
	public static final String BG_ACTION_REQUIRE = "BG_ACTION_REQUIRE";

	public static final String FG_ACTION_PRESERVE = "FG_ACTION_PRESERVE";
	public static final String FG_ACTION_CREATE = "FG_ACTION_CREATE";
	public static final String FG_ACTION_DELETE = "FG_ACTION_DELETE";
	public static final String FG_ACTION_FORBID = "FG_ACTION_FORBID";
	public static final String FG_ACTION_REQUIRE = "FG_ACTION_REQUIRE";

	/**
	 * Get the default color mode. Can return <code>null</code>, but it
	 * shouldn't.
	 * 
	 * @return The default color mode.
	 */
	public static HenshinColorMode getDefaultColorMode() {
		if (DEFAULT == null) {
			DEFAULT = REGISTRY.get("default");
			if (DEFAULT == null && !HenshinColorMode.REGISTRY.isEmpty()) {
				DEFAULT = HenshinColorMode.REGISTRY.get(0);
			}
		}
		return DEFAULT;
	}

	private final Properties properties;

	private final String name;
	
	private final boolean useGradients;
	
	private final Map<String, Color> colors;

	public HenshinColorMode(Properties properties) {
		this.properties = properties;
		this.colors = new HashMap<String, Color>();
		this.name = properties.getProperty("colorModeName");
		this.useGradients = Boolean.parseBoolean(properties.getProperty("useGradients"));
	}

	public Color getColor(String type) {
		Color color = colors.get(type);
		if (color != null) {
			return color;
		}
		String value = properties.getProperty(type);
		if (value == null) {
			return null;
		}
		String[] vals = value.split(",");
		if (vals.length != 3) {
			return null;
		}
		try {
			int red = Integer.parseInt(vals[0]);
			int green = Integer.parseInt(vals[1]);
			int blue = Integer.parseInt(vals[2]);
			color = new Color(red, green, blue);
			colors.put(type, color);
			return color;
		} catch (Throwable t) {
			return null;
		}
	}

	public Color getActionColor(Action action, boolean foreground) {
		if (action == null) {
			return null;
		}
		return getColor(getActionColorKey(action, foreground));
	}

	public static String getActionColorKey(Action action, boolean foreground) {
		if (action == null) {
			return null;
		}
		return (foreground ? "FG_" : "BG_") + "ACTION_"
				+ action.getType().toString().toUpperCase();
	}

	public String getName() {
		return name;
	}
	
	public boolean useGradients() {
		return useGradients;
	}

}
