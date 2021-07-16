package org.ocp.pag346;

import java.time.LocalDateTime;

public class Task1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=1000;i++) {
			System.out.println("i[ "+LocalDateTime.now()+" ]: " + i);
		}
	}

}
