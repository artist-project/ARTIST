/**
 */
package eu.artist.postmigration.nfrvt.lang.nsl.nsl.util;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage;

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
public class NslXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NslXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    NslPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the NslResourceFactoryImpl factory.
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
      registrations.put(XML_EXTENSION, new NslResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new NslResourceFactoryImpl());
    }
    return registrations;
  }

} //NslXMLProcessor
