package org.ocp.pag346;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * This method creates a single-threaded executor that can schedule commands to run after a given 
 * delay or to execute periodically. (Note however that if this single thread terminates due to a 
 * failure during execution prior to the shutdown, a new one will take its place if needed to 
 * execute subsequent tasks.) Tasks are guaranteed to execute sequentially, and no more than one 
 * task will be active at any given time.
 */
public class NewSingleThreadScheduledExecutor {
	public static void main(String[] args) {
		ScheduledExecutorService service = null;
			service = Executors.newSingleThreadScheduledExecutor();
			service.scheduleAtFixedRate(new Task1(),0,2,TimeUnit.SECONDS);
	}

}
