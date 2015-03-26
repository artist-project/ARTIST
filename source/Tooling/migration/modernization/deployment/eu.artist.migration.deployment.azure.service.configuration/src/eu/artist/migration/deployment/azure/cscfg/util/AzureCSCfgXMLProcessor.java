/**
 */
package eu.artist.migration.deployment.azure.cscfg.util;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AzureCSCfgXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSCfgXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		AzureCSCfgPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the AzureCSCfgResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new AzureCSCfgResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new AzureCSCfgResourceFactoryImpl());
		}
		return registrations;
	}

} //AzureCSCfgXMLProcessor
