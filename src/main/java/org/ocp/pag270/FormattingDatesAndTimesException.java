package org.ocp.pag270;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesAndTimesException {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12,34);
		LocalDateTime dateTime  = LocalDateTime.of(date, time);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
		f.format(dateTime);
		//f.format(date);// EXCEPTION
		f.format(time);
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date2 = LocalDate.parse("01 02 2015",f2);
		LocalTime time2 = LocalTime.parse("11:22");
		System.out.println(date2);
		System.out.println(time2);
		
		
	}
}
