package org.ocp.pag029;

public class AnonInnerInterface {
	interface SaleTodayOnly{
		int dollarsOff();
	}
	
	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly(){
			@Override
			public int dollarsOff() {
				return 3;
			}
		};
		
		return basePrice - sale.dollarsOff();
	}

	
}
