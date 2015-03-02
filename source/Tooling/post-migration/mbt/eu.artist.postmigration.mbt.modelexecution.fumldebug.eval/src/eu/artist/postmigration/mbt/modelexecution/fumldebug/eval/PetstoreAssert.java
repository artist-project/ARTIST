package eu.artist.postmigration.mbt.modelexecution.fumldebug.eval;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import fUML.Semantics.Classes.Kernel.CompoundValue;
import fUML.Semantics.Classes.Kernel.ExtensionalValue;
import fUML.Semantics.Classes.Kernel.FeatureValue;
import fUML.Semantics.Classes.Kernel.Link;
import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.Classes.Kernel.Reference;
import fUML.Semantics.Classes.Kernel.StringValue;
import fUML.Semantics.Classes.Kernel.Value;
import fUML.Semantics.Classes.Kernel.ValueList;
import fUML.Semantics.Loci.LociL1.Locus;
import fUML.Syntax.Classes.Kernel.Association;
import fUML.Syntax.Classes.Kernel.Classifier;
import fUML.Syntax.Classes.Kernel.Property;

public abstract class PetstoreAssert {

	private Locus locus;
	protected String scenario;
	protected String app;

	public PetstoreAssert(Locus locus, String scenario, String app) {
		this.locus = locus;
		this.scenario = scenario;
		this.app = app;
	}
	
	public abstract void doAssert(); 

	protected Object_ getItemByName(String name) {
		Set<Object_> items = getObjects("Item");
		Iterator<Object_> itemsIterator = items.iterator();
		while (itemsIterator.hasNext()) {
			Object_ item = itemsIterator.next();
			if (((StringValue) getFeatureValue(item, "name").get(0)).value
					.equals(name)) {
				return item;
			}
		}
		return null;
	}

	protected Object_ getCustomerByLogin(String customerlogin) {
		Set<Object_> customers = getObjects("Customer");
		Iterator<Object_> customersIterator = customers.iterator();
		while (customersIterator.hasNext()) {
			Object_ customer = customersIterator.next();
			if (((StringValue) getFeatureValue(customer, "login").get(0)).value
					.equals(customerlogin)) {
				return customer;
			}
		}
		return null;
	}

	protected ValueList getFeatureValue(CompoundValue value, String featurename) {
		for (FeatureValue fv : value.featureValues) {
			if (fv.feature.name.equals(featurename)) {
				return fv.values;
			}
		}
		return null;
	}

	protected Set<Object_> getObjects(String classifiername) {
		Set<Object_> objects = new HashSet<Object_>();
		for (ExtensionalValue extensionalValue : locus.extensionalValues) {
			if (extensionalValue.getClass() == Object_.class) {
				Object_ object_ = (Object_) extensionalValue;
				for (Classifier c : object_.getTypes()) {
					if (c.name.equals(classifiername)) {
						objects.add(object_);
					}
				}
			}
		}
		return objects;
	}

	protected Set<Link> getLinks(String associationname) {
		Set<Link> links = new HashSet<Link>();
		for (ExtensionalValue extensionalValue : locus.extensionalValues) {
			if (extensionalValue instanceof Link) {
				Link link = (Link) extensionalValue;
				for (Classifier c : link.getTypes()) {
					if (c.name.equals(associationname)) {
						links.add(link);
					}
				}
			}
		}
		return links;
	}

	protected Set<Object_> getLinkedObjects(String associationname, Object_ knownObject, String knownEndName) {
		Set<Object_> linkedObjects = new HashSet<Object_>();
		Association association = getAssociation(associationname);
		Property knownEnd = getAssociationEnd(association, knownEndName);
		Property otherEnd = getOtherAssociationEnd(association, knownEnd);
		Set<Link> links = getLinks(associationname);
		if (links.size() > 0 && otherEnd != null && knownEnd != null) {
			Iterator<Link> linkIterator = links.iterator();
			while (linkIterator.hasNext()) {
				Link link = linkIterator.next();
				if (getLinkedObject(link, knownEnd).equals(knownObject)) {
					linkedObjects.add(getLinkedObject(link, otherEnd));
				}
			}
		}
		return linkedObjects;
	}

	private Property getAssociationEnd(Association association, String endName) {
		for (Property memberEnd : association.memberEnd) {
			if (memberEnd.name.equals(endName)) {
				return memberEnd;
			}
		}
		return null;
	}

	private Property getOtherAssociationEnd(Association association, Property end) {
		for (Property memberEnd : association.memberEnd) {
			if (!end.equals(memberEnd)) {
				return memberEnd;
			}
		}
		return null;
	}

	private Association getAssociation(String associationname) {
		Iterator<Link> linksIterator = getLinks(associationname)
				.iterator();
		while (linksIterator.hasNext()) {
			Link link = linksIterator.next();
			if (link.type != null) {
				return link.type;
			}
		}
		return null;
	}

	private Object_ getLinkedObject(Link link, Property end) {
		FeatureValue featureValue = link.getFeatureValue(end);
		for (Value value : featureValue.values) {
			if (value instanceof Object_) {
				return (Object_) value;
			} else if (value instanceof Reference) {
				return ((Reference) value).referent;
			}
		}
		return null;
	}

}