package org.ocp.pag346;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedulingTask {
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Runnable task1 = () -> System.out.println("Hello Zoo");
		Callable<String> task2 = () -> "Monkey";
		
		ScheduledFuture<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);//Ejecuta la tarea a los 5 segundos una vez
		ScheduledFuture<?> result2 = service.schedule(task2, 1, TimeUnit.MINUTES);
//		service.scheduleAtFixedRate(task1, 5, 5, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(task1, 5, 5, TimeUnit.SECONDS);
	}

}
