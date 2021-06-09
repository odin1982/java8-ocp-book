package org.ocp.pag247;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class WorkingWithDurations {
	public static void main(String[] args) {
		Duration daily = Duration.ofDays(1);
		Duration hourly = Duration.ofHours(1);
		Duration everyMinute = Duration.ofMinutes(1);
		Duration everyTenSeconds = Duration.ofSeconds(10);
		Duration everyMilli = Duration.ofMillis(1);
		Duration everyNano = Duration.ofNanos(1);
		
		System.out.println("daily: " + daily);
		System.out.println("hourly: " + hourly);
		System.out.println("everyMinute: " + everyMinute);
		System.out.println("everyTenSeconds: " + everyTenSeconds);
		System.out.println("everyMilli: " + everyMilli);
		System.out.println("everyNano: " + everyNano);
		System.out.println("\n\n");
		
		//Una forma diferente de usar Duration con Chronounit
		
		Duration daily2 = Duration.of(1, ChronoUnit.DAYS);
		Duration hourly2 = Duration.of(1, ChronoUnit.HOURS);
		Duration everyMinute2 = Duration.of(1, ChronoUnit.MINUTES);
		Duration everyTenSeconds2 = Duration.of(1, ChronoUnit.SECONDS);
		Duration everyMilli2 = Duration.of(1, ChronoUnit.MILLIS);
		Duration everyNano2 = Duration.of(1, ChronoUnit.NANOS);
		System.out.println("daily2: " + daily2);
		System.out.println("hourly2: " + hourly2);
		System.out.println("everyMinute2: " + everyMinute2);
		System.out.println("everyTenSeconds2: " + everyTenSeconds2);
		System.out.println("everyMilli2: " + everyMilli2);
		System.out.println("everyNano2: " + everyNano2);
		System.out.println("\n\n");
		
		
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Duration duration = Duration.ofHours(6);
		System.out.println(dateTime.plus(duration));
		System.out.println(time.plus(duration));
		System.out.println(date.plus(duration));//UnsopprotedTemporalException
		System.out.println("\n\n");
		
		
		
	}

}
