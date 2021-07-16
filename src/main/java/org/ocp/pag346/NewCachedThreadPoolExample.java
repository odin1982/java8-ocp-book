package org.ocp.pag346;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadPoolExample {
	public static void main(String[] args) {
		ExecutorService service = null;
		service = Executors.newCachedThreadPool();
		service.submit(new Task1());
		service.submit(new Task2());
		service.shutdown();
	}

}
