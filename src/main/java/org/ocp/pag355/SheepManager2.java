package org.ocp.pag355;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager2 {
	private AtomicInteger sheepCount = new AtomicInteger(0);
	
	private void incrementAndReport() {
		synchronized (this) {
			System.out.println((sheepCount.incrementAndGet()) + " ");
		}
	}
	
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			SheepManager2 manager = new SheepManager2();
				for(int i=0;i<10;i++) {
					service.submit(()-> manager.incrementAndReport());
				}
		}finally {
			if(service != null) service.shutdown(); 
		}
	}
}
