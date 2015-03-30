/**
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
 */
package eu.artist.premigration.tft.nfrvt.resources;

import java.util.Locale;

import eu.artist.premigration.tft.nfrvt.resources.types.ARTISTTypesFactory;
import eu.artist.premigration.tft.nfrvt.resources.types.Country;

public class ISOCountryList {
	
	public static final Country ANDORRA = createCountry("AD", "Andorra");
	public static final Country UNITED_ARAB_EMIRATES = createCountry("AE", "United Arab Emirates");
	public static final Country AFGHANISTAN = createCountry("AF", "Afghanistan");
	public static final Country ANTIGUA_AND_BARBUDA = createCountry("AG", "Antigua and Barbuda");
	public static final Country ANGUILLA = createCountry("AI", "Anguilla");
	public static final Country ALBANIA = createCountry("AL", "Albania");
	public static final Country ARMENIA = createCountry("AM", "Armenia");
	public static final Country NETHERLANDS_ANTILLES = createCountry("AN", "Netherlands Antilles");
	public static final Country ANGOLA = createCountry("AO", "Angola");
	public static final Country ANTARCTICA = createCountry("AQ", "Antarctica");
	public static final Country ARGENTINA = createCountry("AR", "Argentina");
	public static final Country AMERICAN_SAMOA = createCountry("AS", "American Samoa");
	public static final Country AUSTRIA = createCountry("AT", "Austria");
	public static final Country AUSTRALIA = createCountry("AU", "Australia");
	public static final Country ARUBA = createCountry("AW", "Aruba");
	public static final Country ALAND_ISLANDS = createCountry("AX", "Aland Islands");
	public static final Country AZERBAIJAN = createCountry("AZ", "Azerbaijan");
	public static final Country BOSNIA_AND_HERZEGOVINA = createCountry("BA", "Bosnia and Herzegovina");
	public static final Country BARBADOS = createCountry("BB", "Barbados");
	public static final Country BANGLADESH = createCountry("BD", "Bangladesh");
	public static final Country BELGIUM = createCountry("BE", "Belgium");
	public static final Country BURKINA_FASO = createCountry("BF", "Burkina Faso");
	public static final Country BULGARIA = createCountry("BG", "Bulgaria");
	public static final Country BAHRAIN = createCountry("BH", "Bahrain");
	public static final Country BURUNDI = createCountry("BI", "Burundi");
	public static final Country BENIN = createCountry("BJ", "Benin");
	public static final Country SAINT_BARTHOLEMY = createCountry("BL", "Saint Bartholemy");
	public static final Country BERMUDA = createCountry("BM", "Bermuda");
	public static final Country BRUNEI = createCountry("BN", "Brunei");
	public static final Country BOLIVIA = createCountry("BO", "Bolivia");
	public static final Country BONAIRE_SINT_EUSTATIUS_AND_SABA = createCountry("BQ", "Bonaire, Sint Eustatius and Saba");
	public static final Country BRAZIL = createCountry("BR", "Brazil");
	public static final Country BAHAMAS = createCountry("BS", "Bahamas");
	public static final Country BHUTAN = createCountry("BT", "Bhutan");
	public static final Country BOUVET_ISLAND = createCountry("BV", "Bouvet Island");
	public static final Country BOTSWANA = createCountry("BW", "Botswana");
	public static final Country BELARUS = createCountry("BY", "Belarus");
	public static final Country BELIZE = createCountry("BZ", "Belize");
	public static final Country CANADA = createCountry("CA", "Canada");
	public static final Country COCOS_ISLANDS = createCountry("CC", "Cocos Islands");
	public static final Country THE_DEMOCRATIC_REPUBLIC_OF_CONGO = createCountry("CD", "The Democratic Republic Of Congo");
	public static final Country CENTRAL_AFRICAN_REPUBLIC = createCountry("CF", "Central African Republic");
	public static final Country CONGO = createCountry("CG", "Congo");
	public static final Country SWITZERLAND = createCountry("CH", "Switzerland");
	public static final Country COTE_DIVOIRE = createCountry("CI", "Cote d'Ivoire");
	public static final Country COOK_ISLANDS = createCountry("CK", "Cook Islands");
	public static final Country CHILE = createCountry("CL", "Chile");
	public static final Country CAMEROON = createCountry("CM", "Cameroon");
	public static final Country CHINA = createCountry("CN", "China");
	public static final Country COLOMBIA = createCountry("CO", "Colombia");
	public static final Country COSTA_RICA = createCountry("CR", "Costa Rica");
	public static final Country CUBA = createCountry("CU", "Cuba");
	public static final Country CAPE_VERDE = createCountry("CV", "Cape Verde");
	public static final Country CURACAO = createCountry("CW", "Curacao");
	public static final Country CHRISTMAS_ISLAND = createCountry("CX", "Christmas Island");
	public static final Country CYPRUS = createCountry("CY", "Cyprus");
	public static final Country CZECH_REPUBLIC = createCountry("CZ", "Czech Republic");
	public static final Country GERMANY = createCountry("DE", "Germany");
	public static final Country DJIBOUTI = createCountry("DJ", "Djibouti");
	public static final Country DENMARK = createCountry("DK", "Denmark");
	public static final Country DOMINICA = createCountry("DM", "Dominica");
	public static final Country DOMINICAN_REPUBLIC = createCountry("DO", "Dominican Republic");
	public static final Country ALGERIA = createCountry("DZ", "Algeria");
	public static final Country ECUADOR = createCountry("EC", "Ecuador");
	public static final Country ESTONIA = createCountry("EE", "Estonia");
	public static final Country EGYPT = createCountry("EG", "Egypt");
	public static final Country WESTERN_SAHARA = createCountry("EH", "Western Sahara");
	public static final Country ERITREA = createCountry("ER", "Eritrea");
	public static final Country SPAIN = createCountry("ES", "Spain");
	public static final Country ETHIOPIA = createCountry("ET", "Ethiopia");
	public static final Country FINLAND = createCountry("FI", "Finland");
	public static final Country FIJI = createCountry("FJ", "Fiji");
	public static final Country FALKLAND_ISLANDS = createCountry("FK", "Falkland Islands");
	public static final Country MICRONESIA = createCountry("FM", "Micronesia");
	public static final Country FAROE_ISLANDS = createCountry("FO", "Faroe Islands");
	public static final Country FRANCE = createCountry("FR", "France");
	public static final Country GABON = createCountry("GA", "Gabon");
	public static final Country UNITED_KINGDOM = createCountry("GB", "United Kingdom");
	public static final Country GRENADA = createCountry("GD", "Grenada");
	public static final Country GEORGIA = createCountry("GE", "Georgia");
	public static final Country FRENCH_GUIANA = createCountry("GF", "French Guiana");
	public static final Country GUERNSEY = createCountry("GG", "Guernsey");
	public static final Country GHANA = createCountry("GH", "Ghana");
	public static final Country GIBRALTAR = createCountry("GI", "Gibraltar");
	public static final Country GREENLAND = createCountry("GL", "Greenland");
	public static final Country GAMBIA = createCountry("GM", "Gambia");
	public static final Country GUINEA = createCountry("GN", "Guinea");
	public static final Country GUADELOUPE = createCountry("GP", "Guadeloupe");
	public static final Country EQUATORIAL_GUINEA = createCountry("GQ", "Equatorial Guinea");
	public static final Country GREECE = createCountry("GR", "Greece");
	public static final Country SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS = createCountry("GS", "South Georgia And The South Sandwich Islands");
	public static final Country GUATEMALA = createCountry("GT", "Guatemala");
	public static final Country GUAM = createCountry("GU", "Guam");
	public static final Country GUINEA_BISSAU = createCountry("GW", "Guinea-Bissau");
	public static final Country GUYANA = createCountry("GY", "Guyana");
	public static final Country HONG_KONG = createCountry("HK", "Hong Kong");
	public static final Country HEARD_ISLAND_AND_MCDONALD_ISLANDS = createCountry("HM", "Heard Island And McDonald Islands");
	public static final Country HONDURAS = createCountry("HN", "Honduras");
	public static final Country CROATIA = createCountry("HR", "Croatia");
	public static final Country HAITI = createCountry("HT", "Haiti");
	public static final Country HUNGARY = createCountry("HU", "Hungary");
	public static final Country INDONESIA = createCountry("ID", "Indonesia");
	public static final Country IRELAND = createCountry("IE", "Ireland");
	public static final Country ISRAEL = createCountry("IL", "Israel");
	public static final Country ISLE_OF_MAN = createCountry("IM", "Isle Of Man");
	public static final Country INDIA = createCountry("IN", "India");
	public static final Country BRITISH_INDIAN_OCEAN_TERRITORY = createCountry("IO", "British Indian Ocean Territory");
	public static final Country IRAQ = createCountry("IQ", "Iraq");
	public static final Country IRAN = createCountry("IR", "Iran");
	public static final Country ICELAND = createCountry("IS", "Iceland");
	public static final Country ITALY = createCountry("IT", "Italy");
	public static final Country JERSEY = createCountry("JE", "Jersey");
	public static final Country JAMAICA = createCountry("JM", "Jamaica");
	public static final Country JORDAN = createCountry("JO", "Jordan");
	public static final Country JAPAN = createCountry("JP", "Japan");
	public static final Country KENYA = createCountry("KE", "Kenya");
	public static final Country KYRGYZSTAN = createCountry("KG", "Kyrgyzstan");
	public static final Country CAMBODIA = createCountry("KH", "Cambodia");
	public static final Country KIRIBATI = createCountry("KI", "Kiribati");
	public static final Country COMOROS = createCountry("KM", "Comoros");
	public static final Country SAINT_KITTS_AND_NEVIS = createCountry("KN", "Saint Kitts And Nevis");
	public static final Country NORTH_KOREA = createCountry("KP", "North Korea");
	public static final Country SOUTH_KOREA = createCountry("KR", "South Korea");
	public static final Country KUWAIT = createCountry("KW", "Kuwait");
	public static final Country CAYMAN_ISLANDS = createCountry("KY", "Cayman Islands");
	public static final Country KAZAKHSTAN = createCountry("KZ", "Kazakhstan");
	public static final Country LAOS = createCountry("LA", "Laos");
	public static final Country LEBANON = createCountry("LB", "Lebanon");
	public static final Country SAINT_LUCIA = createCountry("LC", "Saint Lucia");
	public static final Country LIECHTENSTEIN = createCountry("LI", "Liechtenstein");
	public static final Country SRI_LANKA = createCountry("LK", "Sri Lanka");
	public static final Country LIBERIA = createCountry("LR", "Liberia");
	public static final Country LESOTHO = createCountry("LS", "Lesotho");
	public static final Country LITHUANIA = createCountry("LT", "Lithuania");
	public static final Country LUXEMBOURG = createCountry("LU", "Luxembourg");
	public static final Country LATVIA = createCountry("LV", "Latvia");
	public static final Country LIBYA = createCountry("LY", "Libya");
	public static final Country MOROCCO = createCountry("MA", "Morocco");
	public static final Country MONACO = createCountry("MC", "Monaco");
	public static final Country MOLDOVA = createCountry("MD", "Moldova");
	public static final Country MONTENEGRO = createCountry("ME", "Montenegro");
	public static final Country SAINT_MARTIN = createCountry("MF", "Saint Martin");
	public static final Country MADAGASCAR = createCountry("MG", "Madagascar");
	public static final Country MARSHALL_ISLANDS = createCountry("MH", "Marshall Islands");
	public static final Country MACEDONIA = createCountry("MK", "Macedonia");
	public static final Country MALI = createCountry("ML", "Mali");
	public static final Country MYANMAR = createCountry("MM", "Myanmar");
	public static final Country MONGOLIA = createCountry("MN", "Mongolia");
	public static final Country MACAO = createCountry("MO", "Macao");
	public static final Country NORTHERN_MARIANA_ISLANDS = createCountry("MP", "Northern Mariana Islands");
	public static final Country MARTINIQUE = createCountry("MQ", "Martinique");
	public static final Country MAURITANIA = createCountry("MR", "Mauritania");
	public static final Country MONTSERRAT = createCountry("MS", "Montserrat");
	public static final Country MALTA = createCountry("MT", "Malta");
	public static final Country MAURITIUS = createCountry("MU", "Mauritius");
	public static final Country MALDIVES = createCountry("MV", "Maldives");
	public static final Country MALAWI = createCountry("MW", "Malawi");
	public static final Country MEXICO = createCountry("MX", "Mexico");
	public static final Country MALAYSIA = createCountry("MY", "Malaysia");
	public static final Country MOZAMBIQUE = createCountry("MZ", "Mozambique");
	public static final Country NAMIBIA = createCountry("NA", "Namibia");
	public static final Country NEW_CALEDONIA = createCountry("NC", "New Caledonia");
	public static final Country NIGER = createCountry("NE", "Niger");
	public static final Country NORFOLK_ISLAND = createCountry("NF", "Norfolk Island");
	public static final Country NIGERIA = createCountry("NG", "Nigeria");
	public static final Country NICARAGUA = createCountry("NI", "Nicaragua");
	public static final Country NETHERLANDS = createCountry("NL", "Netherlands");
	public static final Country NORWAY = createCountry("NO", "Norway");
	public static final Country NEPAL = createCountry("NP", "Nepal");
	public static final Country NAURU = createCountry("NR", "Nauru");
	public static final Country NIUE = createCountry("NU", "Niue");
	public static final Country NEW_ZEALAND = createCountry("NZ", "New Zealand");
	public static final Country OMAN = createCountry("OM", "Oman");
	public static final Country PANAMA = createCountry("PA", "Panama");
	public static final Country PERU = createCountry("PE", "Peru");
	public static final Country FRENCH_POLYNESIA = createCountry("PF", "French Polynesia");
	public static final Country PAPUA_NEW_GUINEA = createCountry("PG", "Papua New Guinea");
	public static final Country PHILIPPINES = createCountry("PH", "Philippines");
	public static final Country PAKISTAN = createCountry("PK", "Pakistan");
	public static final Country POLAND = createCountry("PL", "Poland");
	public static final Country SAINT_PIERRE_AND_MIQUELON = createCountry("PM", "Saint Pierre And Miquelon");
	public static final Country PITCAIRN = createCountry("PN", "Pitcairn");
	public static final Country PUERTO_RICO = createCountry("PR", "Puerto Rico");
	public static final Country PALESTINE = createCountry("PS", "Palestine");
	public static final Country PORTUGAL = createCountry("PT", "Portugal");
	public static final Country PALAU = createCountry("PW", "Palau");
	public static final Country PARAGUAY = createCountry("PY", "Paraguay");
	public static final Country QATAR = createCountry("QA", "Qatar");
	public static final Country REUNION = createCountry("RE", "Reunion");
	public static final Country ROMANIA = createCountry("RO", "Romania");
	public static final Country SERBIA = createCountry("RS", "Serbia");
	public static final Country RUSSIA = createCountry("RU", "Russia");
	public static final Country RWANDA = createCountry("RW", "Rwanda");
	public static final Country SAUDI_ARABIA = createCountry("SA", "Saudi Arabia");
	public static final Country SOLOMON_ISLANDS = createCountry("SB", "Solomon Islands");
	public static final Country SEYCHELLES = createCountry("SC", "Seychelles");
	public static final Country SUDAN = createCountry("SD", "Sudan");
	public static final Country SWEDEN = createCountry("SE", "Sweden");
	public static final Country SINGAPORE = createCountry("SG", "Singapore");
	public static final Country SAINT_HELENA = createCountry("SH", "Saint Helena");
	public static final Country SLOVENIA = createCountry("SI", "Slovenia");
	public static final Country SVALBARD_AND_JAN_MAYEN = createCountry("SJ", "Svalbard And Jan Mayen");
	public static final Country SLOVAKIA = createCountry("SK", "Slovakia");
	public static final Country SIERRA_LEONE = createCountry("SL", "Sierra Leone");
	public static final Country SAN_MARINO = createCountry("SM", "San Marino");
	public static final Country SENEGAL = createCountry("SN", "Senegal");
	public static final Country SOMALIA = createCountry("SO", "Somalia");
	public static final Country SURINAME = createCountry("SR", "Suriname");
	public static final Country SAO_TOME_AND_PRINCIPE = createCountry("ST", "Sao Tome And Principe");
	public static final Country EL_SALVADOR = createCountry("SV", "El Salvador");
	public static final Country SINT_MAARTEN_DUTCH_PART = createCountry("SX", "Sint Maarten (Dutch part)");
	public static final Country SYRIA = createCountry("SY", "Syria");
	public static final Country SWAZILAND = createCountry("SZ", "Swaziland");
	public static final Country TURKS_AND_CAICOS_ISLANDS = createCountry("TC", "Turks And Caicos Islands");
	public static final Country CHAD = createCountry("TD", "Chad");
	public static final Country FRENCH_SOUTHERN_TERRITORIES = createCountry("TF", "French Southern Territories");
	public static final Country TOGO = createCountry("TG", "Togo");
	public static final Country THAILAND = createCountry("TH", "Thailand");
	public static final Country TAJIKISTAN = createCountry("TJ", "Tajikistan");
	public static final Country TOKELAU = createCountry("TK", "Tokelau");
	public static final Country TIMOR_LESTE = createCountry("TL", "Timor-Leste");
	public static final Country TURKMENISTAN = createCountry("TM", "Turkmenistan");
	public static final Country TUNISIA = createCountry("TN", "Tunisia");
	public static final Country TONGA = createCountry("TO", "Tonga");
	public static final Country TURKEY = createCountry("TR", "Turkey");
	public static final Country TRINIDAD_AND_TOBAGO = createCountry("TT", "Trinidad and Tobago");
	public static final Country TUVALU = createCountry("TV", "Tuvalu");
	public static final Country TAIWAN = createCountry("TW", "Taiwan");
	public static final Country TANZANIA = createCountry("TZ", "Tanzania");
	public static final Country UKRAINE = createCountry("UA", "Ukraine");
	public static final Country UGANDA = createCountry("UG", "Uganda");
	public static final Country UNITED_STATES_MINOR_OUTLYING_ISLANDS = createCountry("UM", "United States Minor Outlying Islands");
	public static final Country UNITED_STATES = createCountry("US", "United States");
	public static final Country URUGUAY = createCountry("UY", "Uruguay");
	public static final Country UZBEKISTAN = createCountry("UZ", "Uzbekistan");
	public static final Country VATICAN = createCountry("VA", "Vatican");
	public static final Country SAINT_VINCENT_AND_THE_GRENADINES = createCountry("VC", "Saint Vincent And The Grenadines");
	public static final Country VENEZUELA = createCountry("VE", "Venezuela");
	public static final Country BRITISH_VIRGIN_ISLANDS = createCountry("VG", "British Virgin Islands");
	public static final Country US_VIRGIN_ISLANDS = createCountry("VI", "U.S. Virgin Islands");
	public static final Country VIETNAM = createCountry("VN", "Vietnam");
	public static final Country VANUATU = createCountry("VU", "Vanuatu");
	public static final Country WALLIS_AND_FUTUNA = createCountry("WF", "Wallis And Futuna");
	public static final Country SAMOA = createCountry("WS", "Samoa");
	public static final Country YEMEN = createCountry("YE", "Yemen");
	public static final Country MAYOTTE = createCountry("YT", "Mayotte");
	public static final Country SOUTH_AFRICA = createCountry("ZA", "South Africa");
	public static final Country ZAMBIA = createCountry("ZM", "Zambia");
	public static final Country ZIMBABWE = createCountry("ZW", "Zimbabwe");
	
	/**
	 * Creates an instance of a Country data type
	 * @param code
	 * @param name
	 * @return
	 */
	public static Country createCountry(String code, String name) {
		Country country = ARTISTTypesFactory.eINSTANCE.createCountry();
		country.setCode(code);
		country.setName(name);
		return country;
	}
	
	private static void createConstantsCode() {
		String[] locales = Locale.getISOCountries();
		 
		for (String countryCode : locales) {
			Locale.setDefault(Locale.ENGLISH);
			Locale obj = new Locale("", countryCode);
			System.out.println("public static final Country " 
				+ obj.getDisplayCountry().toUpperCase()
					.replace(" ", "_")
					.replace("-", "_")
					.replace("'", "")
					.replace(",", "")
					.replace(".", "")
					.replace("(", "")
					.replace(")", "") 
				+ " = createCountry(\"" 
				+ obj.getCountry() + "\", \"" + obj.getDisplayCountry() + "\");");
		}
	}
	
	public static void main(String[] args) {
		createConstantsCode();
	}
}
