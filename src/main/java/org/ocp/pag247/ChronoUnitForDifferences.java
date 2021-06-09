package org.ocp.pag247;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitForDifferences {
	public static void main(String[] args) {
		LocalTime one = LocalTime.of(5, 15);
		LocalTime two = LocalTime.of(6, 30);
		LocalDate date = LocalDate.of(2016,1,20);
		
		System.out.println(ChronoUnit.HOURS.between(one, two));
		System.out.println(ChronoUnit.MINUTES.between(one, two));
		
		try {
			System.out.println(ChronoUnit.MINUTES.between(one, date));
		}catch(DateTimeException e) {
			e.printStackTrace();
		}
	}

}
