package org.ocp.pag235;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;

public class CreatingDatesAndTimes {
	public static void main(String[] args) {
		System.out.println("localdate: " + LocalDate.now());
		System.out.println("localtime: " + LocalTime.now());
		System.out.println("localdatetime: " + LocalDateTime.now());
		System.out.println("zoneddatetime: " + ZonedDateTime.now());
		
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		LocalTime time1 = LocalTime.of(6, 15);
		LocalTime time2 = LocalTime.of(6, 15,30);
		LocalTime time3 = LocalTime.of(6, 15,30,200);
		
		System.out.println();
		System.out.println("localtime1: " + time1);
		System.out.println("localtime2: " + time2);
		System.out.println("localtime3: " + time3);
		
		
		
		
	}
}
