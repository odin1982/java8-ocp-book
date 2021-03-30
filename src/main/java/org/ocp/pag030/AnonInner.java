package org.ocp.pag030;

public class AnonInner {
	interface SaleTodayOnly{
		int dollarOff();
	}
	
	public int pay() {
		return admission(5, new SaleTodayOnly() {
			@Override
			public int dollarOff() {
				return 3;
			}
		});
	}
	
	public int admission(int basePrice,SaleTodayOnly sale) {
		return basePrice - sale.dollarOff();
	}
}
