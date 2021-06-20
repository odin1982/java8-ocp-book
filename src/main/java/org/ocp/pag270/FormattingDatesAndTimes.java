package org.ocp.pag270;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesAndTimes {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020,Month.JANUARY,20);
		System.out.println( date.getDayOfWeek() );
		System.out.println( date.getMonth() );
		System.out.println( date.getYear() );
		System.out.println( date.getDayOfYear() );
		
		
		System.out.println("\n\n");
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date2, time);
		
		System.out.println(date2.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		System.out.println("\n\n");
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime));
		System.out.println(shortDateTime.format(date));
		//System.out.println(shortDateTime.format(time));
		
		
		System.out.println("\n\n");
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time3 = LocalTime.of(11, 12,34);
		LocalDateTime dateTime3 = LocalDateTime.of(date3, time3);
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		
		System.out.println(shortF.format(dateTime3));
		System.out.println(mediumF.format(dateTime3));
		
		System.out.println("\n\n");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd,yyyy, hh:mm");
		System.out.println(dateTime3.format(f));
		
		
	}
}
