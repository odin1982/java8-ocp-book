package org.ocp.pag346;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutorExample {
	public static void main(String[] args) {
		ExecutorService service = null;
		service = Executors.newSingleThreadExecutor();
		service.execute(new Task1());
		service.shutdown();
	}

}
