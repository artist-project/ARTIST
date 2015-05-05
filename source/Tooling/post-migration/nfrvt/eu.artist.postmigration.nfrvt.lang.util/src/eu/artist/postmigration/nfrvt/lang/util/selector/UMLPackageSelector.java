package eu.artist.postmigration.nfrvt.lang.util.selector;

import org.eclipse.uml2.uml.Package;

public class UMLPackageSelector extends MigrationModelSelector<Package> {

	/**
	 * Creates a new UML package selector providing queries to handle
	 * a UML package.
	 * 
	 * @param umlPackage uml package on which queries can be placed
	 * @see Package
	 */
	public UMLPackageSelector(Package umlPackage) {
		super(umlPackage);
	}

}
