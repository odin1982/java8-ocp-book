package org.ocp.pag340;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Future {
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			java.util.concurrent.Future<?> future = service.submit(()->System.out.println("Hello Zoo"));
			System.out.println("future is done: " + future.isDone());
			System.out.println("future is cancelled: " + future.isCancelled());
		}finally {
			if(service != null)service.shutdown();
		}
	}
}
