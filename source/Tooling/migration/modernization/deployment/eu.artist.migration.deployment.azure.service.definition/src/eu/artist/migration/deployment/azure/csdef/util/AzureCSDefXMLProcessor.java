/**
 */
package eu.artist.migration.deployment.azure.csdef.util;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;

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
public class AzureCSDefXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSDefXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		AzureCSDefPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the AzureCSDefResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new AzureCSDefResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new AzureCSDefResourceFactoryImpl());
		}
		return registrations;
	}

} //AzureCSDefXMLProcessor
