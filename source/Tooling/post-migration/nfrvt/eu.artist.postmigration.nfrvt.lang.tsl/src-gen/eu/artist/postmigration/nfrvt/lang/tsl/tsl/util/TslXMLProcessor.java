/**
 */
package eu.artist.postmigration.nfrvt.lang.tsl.tsl.util;

import eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage;

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
public class TslXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TslXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    TslPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the TslResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations()
  {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new TslResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new TslResourceFactoryImpl());
    }
    return registrations;
  }

} //TslXMLProcessor
