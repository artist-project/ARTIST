/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.resources.constants;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Package;

import eu.artist.postmigration.nfrvt.resources.MigrationLibraryResourcesUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

/**
 * The ARTIST Simple Types contains a set of datatypes that have been defined
 * for the use in the ARTIST project. This convenience class provides access 
 * to all data types and their enumeration values through constants. The types
 * themselves are located at {@link ARTIST_SimpleTypes#PACKAGE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class ARTIST_SimpleTypes extends AbstractUMLPackageConstant {
	public static final String PACKAGE_URI_STRING = MigrationLibraryResourcesUtil.BASE_PATHMAP + "ARTIST_Types.library.uml";
	public static final URI PACKAGE_URI = URI.createURI(PACKAGE_URI_STRING);
	
	public interface Element {
		final Package PACKAGE = ARTIST_SimpleTypes.getInstance().PACKAGE.getElement();
		
		final Enumeration PROVISIONING_TYPE = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE.getElement();
		public interface PROVISIONING_TYPE_LITERALS {
			final EnumerationLiteral PAAS = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_PAAS.getElement();
			final EnumerationLiteral IAAS = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_IAAS.getElement();
			final EnumerationLiteral SAAS = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_SAAS.getElement();
			final EnumerationLiteral HYBRID = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_HYBRID.getElement();
		}
		final Enumeration DB_TYPE = ARTIST_SimpleTypes.getInstance().DB_TYPE.getElement();
		public interface DB_TYPE_LITERALS {
			final EnumerationLiteral SQL = ARTIST_SimpleTypes.getInstance().DB_TYPE_SQL.getElement();
			final EnumerationLiteral NO_SQL = ARTIST_SimpleTypes.getInstance().DB_TYPE_NO_SQL.getElement();
		}
		final Enumeration CLOUD_PROVIDER = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER.getElement();
		public interface CLOUD_PROVIDER_LITERALS {
			final EnumerationLiteral GOOGLE_APP_ENGINE = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER_GOOGLE_APP_ENGINE.getElement();
			final EnumerationLiteral MICROSOFT_AZURE = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER_MICROSOFT_AZURE.getElement();
			final EnumerationLiteral AMAZON_EC2 = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER_AMAZON_EC2.getElement();
		}
		final Enumeration PROGRAMMING_LANGUAGE = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE.getElement();
		public interface PROGRAMMING_LANGUAGE_LITERALS {
			final EnumerationLiteral JAVA = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_JAVA.getElement();
			final EnumerationLiteral CSHARP = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_CSHARP.getElement();
			final EnumerationLiteral CPLUSPLUS = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_CPLUSPLUS.getElement();
			final EnumerationLiteral RUBY = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_RUBY.getElement();
		}
		final DataType COUNTRY = ARTIST_SimpleTypes.getInstance().COUNTRY.getElement();
	}

	public interface FQN {
		final String PACKAGE = ARTIST_SimpleTypes.getInstance().PACKAGE.getFullyQualifiedName();
		final String PROVISIONING_TYPE = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE.getFullyQualifiedName();
		public interface PROVISIONING_TYPE_LITERALS {
			final String PAAS = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_PAAS.getFullyQualifiedName();
			final String IAAS = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_IAAS.getFullyQualifiedName();
			final String SAAS = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_SAAS.getFullyQualifiedName();
			final String HYBRID = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_HYBRID.getFullyQualifiedName();
		}
		final String DB_TYPE = ARTIST_SimpleTypes.getInstance().DB_TYPE.getFullyQualifiedName();
		public interface DB_TYPE_LITERALS {
			final String SQL = ARTIST_SimpleTypes.getInstance().DB_TYPE_SQL.getFullyQualifiedName();
			final String NO_SQL = ARTIST_SimpleTypes.getInstance().DB_TYPE_NO_SQL.getFullyQualifiedName();
		}
		final String CLOUD_PROVIDER = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER.getFullyQualifiedName();
		public interface CLOUD_PROVIDER_LITERALS {
			final String GOOGLE_APP_ENGINE = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER_GOOGLE_APP_ENGINE.getFullyQualifiedName();
			final String MICROSOFT_AZURE = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER_MICROSOFT_AZURE.getFullyQualifiedName();
			final String AMAZON_EC2 = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER_AMAZON_EC2.getFullyQualifiedName();
		}
		final String PROGRAMMING_LANGUAGE = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE.getFullyQualifiedName();
		public interface PROGRAMMING_LANGUAGE_LITERALS {
			final String JAVA = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_JAVA.getFullyQualifiedName();
			final String CSHARP = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_CSHARP.getFullyQualifiedName();
			final String CPLUSPLUS = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_CPLUSPLUS.getFullyQualifiedName();
			final String RUBY = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_RUBY.getFullyQualifiedName();
		}
		final String COUNTRY = ARTIST_SimpleTypes.getInstance().COUNTRY.getFullyQualifiedName();
	}

	public interface Uri {
		final String PACKAGE = ARTIST_SimpleTypes.getInstance().PACKAGE.getUri();
		final String PROVISIONING_TYPE = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE.getUri();
		public interface PROVISIONING_TYPE_LITERALS {
			final String PAAS = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_PAAS.getUri();
			final String IAAS = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_IAAS.getUri();
			final String SAAS = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_SAAS.getUri();
			final String HYBRID = ARTIST_SimpleTypes.getInstance().PROVISIONING_TYPE_HYBRID.getUri();
		}
		final String DB_TYPE = ARTIST_SimpleTypes.getInstance().DB_TYPE.getUri();
		public interface DB_TYPE_LITERALS {
			final String SQL = ARTIST_SimpleTypes.getInstance().DB_TYPE_SQL.getUri();
			final String NO_SQL = ARTIST_SimpleTypes.getInstance().DB_TYPE_NO_SQL.getUri();
		}
		final String CLOUD_PROVIDER = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER.getUri();
		public interface CLOUD_PROVIDER_LITERALS {
			final String GOOGLE_APP_ENGINE = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER_GOOGLE_APP_ENGINE.getUri();
			final String MICROSOFT_AZURE = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER_MICROSOFT_AZURE.getUri();
			final String AMAZON_EC2 = ARTIST_SimpleTypes.getInstance().CLOUD_PROVIDER_AMAZON_EC2.getUri();
		}
		final String PROGRAMMING_LANGUAGE = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE.getUri();
		public interface PROGRAMMING_LANGUAGE_LITERALS {
			final String JAVA = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_JAVA.getUri();
			final String CSHARP = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_CSHARP.getUri();
			final String CPLUSPLUS = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_CPLUSPLUS.getUri();
			final String RUBY = ARTIST_SimpleTypes.getInstance().PROGRAMMING_LANGUAGE_RUBY.getUri();
		}
		final String COUNTRY = ARTIST_SimpleTypes.getInstance().COUNTRY.getUri();
	}

	public final MigrationModelElement<Enumeration> PROVISIONING_TYPE;
	public final MigrationModelElement<EnumerationLiteral> PROVISIONING_TYPE_PAAS;
	public final MigrationModelElement<EnumerationLiteral> PROVISIONING_TYPE_IAAS;
	public final MigrationModelElement<EnumerationLiteral> PROVISIONING_TYPE_SAAS;
	public final MigrationModelElement<EnumerationLiteral> PROVISIONING_TYPE_HYBRID;
	public final MigrationModelElement<Enumeration> DB_TYPE;
	public final MigrationModelElement<EnumerationLiteral> DB_TYPE_SQL;
	public final MigrationModelElement<EnumerationLiteral> DB_TYPE_NO_SQL;
	public final MigrationModelElement<Enumeration> CLOUD_PROVIDER;
	public final MigrationModelElement<EnumerationLiteral> CLOUD_PROVIDER_GOOGLE_APP_ENGINE;
	public final MigrationModelElement<EnumerationLiteral> CLOUD_PROVIDER_MICROSOFT_AZURE;
	public final MigrationModelElement<EnumerationLiteral> CLOUD_PROVIDER_AMAZON_EC2;
	public final MigrationModelElement<Enumeration> PROGRAMMING_LANGUAGE;
	public final MigrationModelElement<EnumerationLiteral> PROGRAMMING_LANGUAGE_JAVA;
	public final MigrationModelElement<EnumerationLiteral> PROGRAMMING_LANGUAGE_CSHARP;
	public final MigrationModelElement<EnumerationLiteral> PROGRAMMING_LANGUAGE_CPLUSPLUS;
	public final MigrationModelElement<EnumerationLiteral> PROGRAMMING_LANGUAGE_RUBY;
	public final MigrationModelElement<DataType> COUNTRY;
		
	private static ARTIST_SimpleTypes instance;
		public static ARTIST_SimpleTypes getInstance() {
		if(instance == null)
			instance = new ARTIST_SimpleTypes();
		return instance;
	}
	
	protected ARTIST_SimpleTypes() {
		super(PACKAGE_URI);
		
		PROVISIONING_TYPE = new MigrationModelElement<Enumeration>(getEnumerationByName("ProvisioningType"));
		PROVISIONING_TYPE_PAAS = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProvisioningType", "PaaS"));
		PROVISIONING_TYPE_IAAS = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProvisioningType", "IaaS"));
		PROVISIONING_TYPE_SAAS = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProvisioningType", "SaaS"));
		PROVISIONING_TYPE_HYBRID = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProvisioningType", "Hybrid"));
		DB_TYPE = new MigrationModelElement<Enumeration>(getEnumerationByName("DBType"));
		DB_TYPE_SQL = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DBType", "SQL"));
		DB_TYPE_NO_SQL = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DBType", "NoSQL"));
		CLOUD_PROVIDER = new MigrationModelElement<Enumeration>(getEnumerationByName("CloudProvider"));
		CLOUD_PROVIDER_GOOGLE_APP_ENGINE = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("CloudProvider", "GoogleAppEngine"));
		CLOUD_PROVIDER_MICROSOFT_AZURE = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("CloudProvider", "MicrosoftAzure"));
		CLOUD_PROVIDER_AMAZON_EC2 = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("CloudProvider", "AmazonEC2"));
		PROGRAMMING_LANGUAGE = new MigrationModelElement<Enumeration>(getEnumerationByName("ProgrammingLanguage"));
		PROGRAMMING_LANGUAGE_JAVA = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProgrammingLanguage", "Java"));
		PROGRAMMING_LANGUAGE_CSHARP = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProgrammingLanguage", "C#"));
		PROGRAMMING_LANGUAGE_CPLUSPLUS = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProgrammingLanguage", "C++"));
		PROGRAMMING_LANGUAGE_RUBY = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProgrammingLanguage", "Ruby"));
		COUNTRY = new MigrationModelElement<DataType>(getDataTypeByName("Country"));
	}
}
