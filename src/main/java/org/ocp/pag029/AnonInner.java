package org.ocp.pag029;

public class AnonInner {
	abstract class SaleTodayOnly{
		abstract int dollarsOff();
	}
	
	public int admission(int basePrice) {
		//anonymous inner class
		SaleTodayOnly sale = new SaleTodayOnly() {
			@Override
			int dollarsOff() { return 3; }
		};//this semicolon is important
		return basePrice - sale.dollarsOff();
	}
}
