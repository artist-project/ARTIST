package ll.mde.anymodel2uml.client;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import ll.mde.anymodel2uml.plugin.artistconsole.ArtistConsole;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.NamedElement;

public class Emf2UmlExporter
{
    public Emf2UmlExporter(NamedElement rootElement) {
    	GenericElementMessage message = getGenericElement(rootElement);
    	ArtistConsole.WriteToConsole(message.toString());
    }
	
	private GenericElementMessage getGenericElement(NamedElement element) {
		Class cls = element.getClass();
		
		ArrayList<GenericElementMessage.Property> properties = new ArrayList<GenericElementMessage.Property>();
		
		GenericElementMessage.Property propId = new GenericElementMessage.Property();
		propId.Name = "Guid";
		propId.Value = new Object[] { ((XMLResource)element.eResource()).getID(element) };
		properties.add(propId);
		
		for (Field f : getAllDeclaredFields(cls)) {
			ArtistConsole.WriteToConsole("name: " + f.getName());
			GenericElementMessage.Property property = getGenericProperty(element, f);
			properties.add(property);
		}
		
		Collections.sort(properties, new Comparator<GenericElementMessage.Property>() {
	        @Override
	        public int compare(GenericElementMessage.Property prop1, GenericElementMessage.Property prop2) {
	            return  prop1.Name.compareTo(prop2.Name);
			}
	    });
		
		GenericElementMessage elementMessage = new GenericElementMessage();
		elementMessage.Properties = properties.toArray(new GenericElementMessage.Property[properties.size()]);	
		
		return elementMessage;
	}
	
	private GenericElementMessage getGenericRootElement(ArrayList<NamedElement> rootElements) {
		ArrayList<GenericElementMessage.Property> properties = new ArrayList<GenericElementMessage.Property>();
		GenericElementMessage.Property property = new GenericElementMessage.Property();
		property.Name = "OwnedElements";
		
		String[] ids = new String[rootElements.size()];
		ConvertToIds(rootElements, ids);
		property.Value = ids;
		
		properties.add(property);

		GenericElementMessage elementMessage = new GenericElementMessage();
		elementMessage.Properties = properties.toArray(new GenericElementMessage.Property[properties.size()]);	
		
		return elementMessage;
	}
	
	private GenericElementMessage.Property getGenericProperty(Object obj, Field field) {
		field.setAccessible(true);
		
		GenericElementMessage.Property property = new GenericElementMessage.Property();
		property.Name = field.getName();
    	try {
			property.Value = new Object[] { field.get(obj) };
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		return property;
	}

	private static void ConvertToIds(ArrayList<NamedElement> elements, String[] array) {
		int i = 0;
		for (NamedElement element : elements)
		{
			array[i] = ((XMLResource)element.eResource()).getID(element);
			++i;
		}
	}
	
	private static ArrayList<Field> getAllDeclaredFields(Class clazz) {
	    return getAllDeclaredFieldsRec(clazz, new ArrayList<Field>());
	}

	private static ArrayList<Field> getAllDeclaredFieldsRec(Class clazz, ArrayList<Field> fields) {
	    Class superClazz = clazz.getSuperclass();
	    if(superClazz != null){
	    	getAllDeclaredFieldsRec(superClazz, fields);
	    }
	    for (Field f : clazz.getDeclaredFields()) { 
		    fields.add(f); 
	    } 
	    return fields;
	}
}
