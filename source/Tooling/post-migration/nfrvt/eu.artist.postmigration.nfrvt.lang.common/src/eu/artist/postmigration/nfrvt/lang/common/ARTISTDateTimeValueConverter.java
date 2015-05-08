package eu.artist.postmigration.nfrvt.lang.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class ARTISTDateTimeValueConverter implements IValueConverter<Date> {

	public static final SimpleDateFormat ISO_TIMEZONE_COLON = 
			new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSXXX", Locale.ENGLISH); // XXX   = +01:00
	public static final SimpleDateFormat ISO_TIMEZONE_SHORT = 
			new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSX", Locale.ENGLISH);   // XX  = +01
	public static final SimpleDateFormat RFC822_TIMEZONE = 
			new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSZ", Locale.ENGLISH);   // Z = +01
	public static final SimpleDateFormat MILLISECONDS = 
			new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSS", Locale.ENGLISH);
	public static final SimpleDateFormat SECONDS = 
			new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
	public static final SimpleDateFormat HOURS_MINUTES = 
			new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.ENGLISH);
	public static final SimpleDateFormat DATE = 
			new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
	public static final SimpleDateFormat MILLISECONS_ID = 
			new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS", Locale.ENGLISH);
	
	
	@Override
	public Date toValue(String string, INode node)
			throws ValueConverterException {
		try {
			return MILLISECONDS.parse(string);
		} catch (ParseException e3) {
			try {
				return SECONDS.parse(string);
			} catch (ParseException e4) {
				try {
					return HOURS_MINUTES.parse(string);
				} catch (ParseException e5) {
					try {
						return DATE.parse(string);
					} catch (ParseException e6) {
						;
					}
				}
			}
		}
		return new Date();
	}

	@Override
	public String toString(Date value) throws ValueConverterException {
		return MILLISECONDS.format(value);
	}
}
