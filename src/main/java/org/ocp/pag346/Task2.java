package org.ocp.pag346;

import java.time.LocalDateTime;

public class Task2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=1000;i++) {
			System.out.println("i100[ "+LocalDateTime.now()+" ]: " + i*100);
		}
	}

}
