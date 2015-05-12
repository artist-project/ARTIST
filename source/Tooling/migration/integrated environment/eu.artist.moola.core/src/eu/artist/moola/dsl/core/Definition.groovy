package eu.artist.moola.dsl.core

/**
 * Defines an interface element
 */
class Definition {
	String type; // ToDo: reflect on changing this to Java Type and use strong typing inside of Moola
	String name;
	
	@Override
	public String toString() {
		return type + ": " + name;
	}
}

