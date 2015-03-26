/**
 */
package gaeweb.util;

import gaeweb.AppengineWebAppType;
import gaeweb.DocumentRoot;
import gaeweb.GaewebPackage;
import gaeweb.impl.GaewebFactoryImpl;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see gaeweb.util.GaewebResourceFactoryImpl
 * @generated
 */
public class GaewebResourceImpl extends XMLResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public GaewebResourceImpl(URI uri) {
		super(uri);
	}
	
	@Override
	public void save(Map<?, ?> options) throws IOException {
		// split the GAE web app scripts if necessary - the idea is to
		// copy the eObjects to avoid 'destroying' the original resource
		DocumentRoot documentRoot = (DocumentRoot) this.getContents().get(0);
		if(documentRoot.getAppengineWebApp().size() > 1) {
			for(AppengineWebAppType appscript : documentRoot.getAppengineWebApp()) {
				// the appscript is set later ...
				DocumentRoot newDocumentRoot = GaewebFactoryImpl.eINSTANCE.createDocumentRoot();
				newDocumentRoot.getXMLNSPrefixMap().addAll(documentRoot.getXMLNSPrefixMap());
				newDocumentRoot.getXSISchemaLocation().addAll(documentRoot.getXSISchemaLocation());
				newDocumentRoot.getAppengineWebApp().add(EcoreUtil.copy(appscript));
						
				// add the model content to an XML resource
				String target = this.getURI().toFileString().replaceFirst(this.getURI().lastSegment(), "");
				URI location = URI.createFileURI(target + appscript.getModule() + File.separator + this.getURI().lastSegment());
				GaewebResourceImpl gaeResource = new GaewebResourceImpl(location);
				gaeResource.getContents().add(newDocumentRoot);
				
				// write the resource
				gaeResource.save(options);
			}
		}
		
		// write the GAE resource
		else {
			this.setEncoding("utf-8");
			this.setURI(this.getURI().trimFileExtension().appendFileExtension("xml"));
			
			// work around to remove the prefix in the serialized XML
			// GAE fails parsing the serialized XML if a prefix is used
			((DocumentRoot) this.getContents().get(0)).getXMLNSPrefixMap().clear();
			((DocumentRoot) this.getContents().get(0)).getXMLNSPrefixMap().put("", "http://appengine.google.com/ns/1.0");
			
			// work around to produce the correct namespace URI: http://appengine.google.com/ns/1.0
			// the problem is that GAE requires for both application.xml and appengine-web.xml the
			// same namespace URI. However, in the metamodels of the corresponding schemas we must
			// have different URI's. We simply added '/appengine-application' and '/appengine-web-app'
			// to ensure different URI's
			String namespaceURI = GaewebPackage.eINSTANCE.getNsURI();
			GaewebPackage.eINSTANCE.setNsURI(namespaceURI.substring(0, namespaceURI.lastIndexOf('/')));
			
			super.save(options);
			
			// reset the namespaceURI after the serialization
			GaewebPackage.eINSTANCE.setNsURI(namespaceURI);
		}
	}

} //GaewebResourceImpl
