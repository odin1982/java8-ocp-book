package org.ocp.pag241;

import java.time.LocalDate;
import java.time.Month;

public class ManipulatingDatesAndTimes {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println("date: " + date);
		date = date.plusDays(2);
		System.out.println("date plus 2 days: " + date );
		date = date.plusWeeks(1);
		System.out.println("date plus 1 week: " + date);
		date = date.plusMonths(1);
		System.out.println("date plus 1 month: " + date);
		date = date.plusYears(1);
		System.out.println("date plus 1 year: " +  date);
	}

}
