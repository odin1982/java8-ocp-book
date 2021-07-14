package org.ocp.pag339;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tarea1 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("i" + i);
		}
	}
}

class Tarea2 implements Runnable{
	@Override
	public void run() {
		for(int j=0;j<=100;j++) {
			System.out.println("j" + j);
		}
	}
}
public class ExecutorServiceMethodExecute {
	public static void main(String[] args) {
		ExecutorService service = null;
		
		/*
		service = Executors.newSingleThreadExecutor();
		service.execute(()->{
			for(int i=0;i<=100;i++) {
				System.out.println("i" + i);
			}
		});
		
		service.execute(()->{
			for(int j=0;j<=100;j++) {
				System.out.println("j" + j);
			}
		});
		
		service.shutdown();
		*/
		
		Thread task1 = new Thread(new Tarea1());
		Thread task2 = new Thread(new Tarea2());
		task1.setPriority(2);
		task2.setPriority(1);
		task1.start();
		task2.start();
	}
}
