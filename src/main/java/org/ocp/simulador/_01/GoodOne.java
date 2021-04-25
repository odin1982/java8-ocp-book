package org.ocp.simulador._01;

public class GoodOne {
	int theval;
	public int hashcode() {
		return theval % 3;
	}
	
	public boolean equals(Object obj) {
		try {
			//option a)
			//return true;
			
			//option b)
			return this == obj ? true : (theval%3 == 0 && ((GoodOne)obj).theval%3==0) ? true :false;
		}catch(Exception e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		//which of the following options may be inserted at //1 so that the equals
		//and hashCode contract is not violated?
		
		GoodOne g1 = new GoodOne();
		g1.theval = 3;
		System.out.println("hashCode G1: "+g1.hashcode());
		
		GoodOne g2 = g1;
		g2.theval = 5;
		System.out.println("hashCode G2: "+g2.hashcode());
		
		// option a)
		// si el resultado de equals es true el hashCode debe ser el mismo
		// aqui no se cumple cuando g1.theval = 1 y g2.theval = 2
		System.out.println(g1.equals(g2));
	}

}
