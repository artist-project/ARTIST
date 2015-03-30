/**
 */
package eu.artist.postmigration.nfrvt.lang.gml.gml.util;

import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage;

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
public class GmlXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GmlXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    GmlPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the GmlResourceFactoryImpl factory.
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
      registrations.put(XML_EXTENSION, new GmlResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new GmlResourceFactoryImpl());
    }
    return registrations;
  }

} //GmlXMLProcessor
