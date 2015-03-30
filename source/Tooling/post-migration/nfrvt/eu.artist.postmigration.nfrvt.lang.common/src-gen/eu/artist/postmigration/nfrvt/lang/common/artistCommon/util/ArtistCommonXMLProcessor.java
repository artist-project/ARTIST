/**
 */
package eu.artist.postmigration.nfrvt.lang.common.artistCommon.util;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;

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
public class ArtistCommonXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtistCommonXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    ArtistCommonPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the ArtistCommonResourceFactoryImpl factory.
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
      registrations.put(XML_EXTENSION, new ArtistCommonResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new ArtistCommonResourceFactoryImpl());
    }
    return registrations;
  }

} //ArtistCommonXMLProcessor
