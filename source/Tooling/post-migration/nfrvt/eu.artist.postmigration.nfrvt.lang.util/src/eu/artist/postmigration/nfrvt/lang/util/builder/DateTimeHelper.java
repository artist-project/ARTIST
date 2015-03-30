package eu.artist.postmigration.nfrvt.lang.util.builder;

import java.util.Calendar;
import java.util.Date;

/**
 * Helper class for manipulating date and time.
 * @author Martin Fleck
 *
 */
public class DateTimeHelper {
	private Calendar initialCalendar;
	private Calendar calendar;
	
	/**
	 * Creates a new instance of this class with the given time set.
	 * 
	 * @param date initial date
	 */
	public DateTimeHelper(Date date) {
		this.calendar = Calendar.getInstance();
		this.calendar.setTime(date);
		
		this.initialCalendar = Calendar.getInstance();
		this.initialCalendar.setTime(date);
	}
	
	/**
	 * Creates a new instance of this class with the current time as 
	 * initial time set.
	 */
	public DateTimeHelper() {
		this(new Date());
	}
	
	/**
	 * Adds the given years to the current date/time.
	 * 
	 * @param years years to add
	 * @return this helper instance
	 */
	public DateTimeHelper addYears(int years) {
		calendar.add(Calendar.YEAR, years);
		return this;
	}
	
	/**
	 * Adds the given months to the current date/time.
	 * 
	 * @param months months to add
	 * @return this helper instance
	 */
	public DateTimeHelper addMonths(int months) {
		calendar.add(Calendar.MONTH, months);
		return this;
	}
	
	/**
	 * Adds the given weeks to the current date/time.
	 * 
	 * @param weeks weeks to add
	 * @return this helper instance
	 */
	public DateTimeHelper addWeeks(int weeks) {
		calendar.add(Calendar.WEEK_OF_YEAR, weeks);
		return this;
	}
	
	/**
	 * Adds the given days to the current date/time.
	 * 
	 * @param days days to add
	 * @return this helper instance
	 */
	public DateTimeHelper addDays(int days) {
		calendar.add(Calendar.DAY_OF_YEAR, days);
		return this;
	}
	
	/**
	 * Adds the given hours to the current date/time.
	 * 
	 * @param hours hours to add
	 * @return this helper instance
	 */
	public DateTimeHelper addHours(int hours) {
		calendar.add(Calendar.HOUR_OF_DAY, hours);
		return this;
	}
	
	/**
	 * Adds the given minutes to the current date/time.
	 * 
	 * @param minutes minutes to add
	 * @return this helper instance
	 */
	public DateTimeHelper addMinutes(int minutes) {
		calendar.add(Calendar.MINUTE, minutes);
		return this;
	}
	
	/**
	 * Adds the given seconds to the current date/time.
	 * 
	 * @param seconds seconds to add
	 * @return this helper instance
	 */
	public DateTimeHelper addSeconds(int seconds) {
		calendar.add(Calendar.SECOND, seconds);
		return this;
	}
	
	/**
	 * Adds the given milliseconds to the current date/time.
	 * 
	 * @param milliseconds milliseconds to add
	 * @return this helper instance
	 */
	public DateTimeHelper addMilliseconds(int milliseconds) {
		calendar.add(Calendar.MILLISECOND, milliseconds);
		return this;
	}
	
	/**
	 * Returns the current date object.
	 * @return date object
	 */
	public Date toDate() {
		return calendar.getTime();
	}
	
	/**
	 * Resets the current date to the initial date set when creating this
	 * helper class.
	 * @return this reset instance
	 */
	public DateTimeHelper reset() {
		this.calendar.setTime(initialCalendar.getTime());
		return this;
	}
}