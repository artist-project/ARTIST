/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel.util;

import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;

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
public class GelXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GelXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    GelPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the GelResourceFactoryImpl factory.
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
      registrations.put(XML_EXTENSION, new GelResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new GelResourceFactoryImpl());
    }
    return registrations;
  }

} //GelXMLProcessor
