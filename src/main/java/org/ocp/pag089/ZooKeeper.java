package org.ocp.pag089;

public class ZooKeeper {
	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("zebra");
		food.consumed();
	}
}
