package org.ocp.pag332;

import org.ocp.pag331.PrintData;

public class UsingTwoThread {
	public static void main(String[] args) {
		
		
		System.out.println("begin");
		(new ReadInventoryThread()).start();
		(new Thread(new PrintData())).start();
		(new ReadInventoryThread()).start();
		System.out.println("end");
		
		
		//La diferencia es que estos se ejecutaran consecutivamente no en un orden aleatorio
		/*
		System.out.println("begin2");
		(new ReadInventoryThread()).run();
		(new Thread(new PrintData())).run();
		(new ReadInventoryThread()).run();
		System.out.println("end2");
		*/
	}
}
