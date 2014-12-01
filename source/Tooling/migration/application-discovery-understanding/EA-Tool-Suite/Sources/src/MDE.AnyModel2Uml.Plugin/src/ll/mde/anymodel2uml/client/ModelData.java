package ll.mde.anymodel2uml.client;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Package;

public class ModelData {
	public static HashMap<String, IntermediateObject> elements = new HashMap<String, IntermediateObject>();
	public static HashMap<String, Element> uml2Elements = new HashMap<String, Element>();
	public static HashMap<String, Element> partials = new HashMap<String, Element>();
	public static HashSet<String> primitiveTypes = new HashSet<String>();
	public static Model uml2Root;
	public static Package umlMetamodel;
	
	public static Profile eaExportHelper;
	public static HashMap<String, Stereotype> stereotype_Extenders = new HashMap<String, Stereotype>();

	public static void reset()
	{
        elements.clear();
        uml2Elements.clear();
        partials.clear();
        primitiveTypes.clear();
        uml2Root = null;
        eaExportHelper = null;
        stereotype_Extenders.clear();
	}
	
	public static void setMetaModel(Package metaModel)
	{
		if(umlMetamodel == null)
		{
			umlMetamodel = metaModel;
		}
	}
	
	public static Type getType(IntermediateObject intermediateObjectIn) {
		String guid = intermediateObjectIn.getProperty("Type");

		Type result = (Type) uml2Elements.get(guid);

		if (result != null) {
			return result;
		}

		return getPrimitiveType(intermediateObjectIn.getProperty("TypeString"));
	}

	public static Type getPrimitiveType(String name) {
		Type type = null;

		if (primitiveTypes.contains(name) == false) {
			type = uml2Root.createOwnedPrimitiveType(name);
			primitiveTypes.add(name);
		} else {
			type = uml2Root.getOwnedType(name);

		}

		return type;
	}

	public static void extendMetaclass(final String nameIn, final Stereotype stereotype) {
        org.eclipse.uml2.uml.Class metaClass = (org.eclipse.uml2.uml.Class) umlMetamodel.getOwnedType(nameIn);        
        if(metaClass != null && metaClass.isMetaclass() && !stereotype.getExtendedMetaclasses().contains(metaClass))
        {
        	stereotype.createExtension(metaClass, false);
        }
	}
}
