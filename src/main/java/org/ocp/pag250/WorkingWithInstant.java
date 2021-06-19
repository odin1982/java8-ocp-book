package org.ocp.pag250;

import java.time.Duration;
import java.time.Instant;

public class WorkingWithInstant {
	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		//do something time consuming
		Instant later = Instant.now();
		System.out.println(later);
		Duration duration = Duration.between(now, later);
		System.out.println(duration.toMillis());
	}
}
