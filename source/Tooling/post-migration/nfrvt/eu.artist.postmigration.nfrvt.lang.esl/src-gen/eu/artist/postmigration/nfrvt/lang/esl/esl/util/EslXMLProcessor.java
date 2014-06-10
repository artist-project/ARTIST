/**
 */
package eu.artist.postmigration.nfrvt.lang.esl.esl.util;

import eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage;

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
public class EslXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EslXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    EslPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the EslResourceFactoryImpl factory.
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
      registrations.put(XML_EXTENSION, new EslResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new EslResourceFactoryImpl());
    }
    return registrations;
  }

} //EslXMLProcessor
