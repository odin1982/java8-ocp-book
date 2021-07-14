package org.ocp.pag339;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorServiceMethodSubmit {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService service = null;
		
		service = Executors.newSingleThreadExecutor();
		
		Future<?> submit = service.submit(()->{
			for(long i=0;i<=1000L;i++) {
				System.out.println(i);
			}
		});
		
		//Manda exception si aun no se ha terminado la tarea en ese tiempo asignado
		submit.get(10, TimeUnit.SECONDS);
		
	}
}
