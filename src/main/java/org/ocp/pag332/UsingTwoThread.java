package org.ocp.pag332;

import org.ocp.pag331.PrintData;

public class UsingTwoThread {
	public static void main(String[] args) {
		System.out.println("begin");
		(new ReadInventoryThread()).start();
		(new Thread(new PrintData())).start();
		(new ReadInventoryThread()).start();
		System.out.println("end");
	}
}
