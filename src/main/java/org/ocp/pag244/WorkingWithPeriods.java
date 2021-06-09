package org.ocp.pag244;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class WorkingWithPeriods {
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2015,Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015,Month.JANUARY, 1);
		performAnimalEnrichment(start, end);
		Period period = Period.ofMonths(1);
		performAnimalEnrichmentWithPeriod(start, end, period);
		
		
		System.out.println(Period.ofMonths(1));
	}
	
	private static void performAnimalEnrichment(LocalDate start,LocalDate end) {
		LocalDate upTo = start;
		while(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo );
			upTo = upTo.plusMonths(1);
		}
	}
	
	private static void performAnimalEnrichmentWithPeriod(LocalDate start,LocalDate end,Period period) {
		LocalDate upTo = start;
		while(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo );
			upTo = upTo.plus(period);
		}
	}

}
