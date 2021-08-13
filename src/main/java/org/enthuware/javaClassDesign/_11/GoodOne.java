package org.enthuware.javaClassDesign._11;

public class GoodOne {
	int theval;
	
	public int hashCode() {
		return theval % 3;
	}
	
	public boolean equals(Object obj) {
		try {
			// opcion 1:
			//return true;
			return theval%2 == 0 ? true: false;
		}catch(Exception e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		GoodOne g1 = new GoodOne();
		GoodOne g2 = new GoodOne();
		
		g1.theval = 6;
		g2.theval = 2;
		
		System.out.println( "g1 hashCode: " + g1.hashCode() );
		System.out.println( "g2 hashCode: " + g2.hashCode() );
		System.out.println(g1.equals(g2));
	}

}


//reglas con equals y hashcode
// 1. Hashcode debe usar las mismas variables que estan en equals
// 2. cuando se comparan 2 objetos con equals y el resultado es true deben traer el mismo hashcode
// 3. cuando se comparan 2 objetos con equals y el resultado es false no es forzoso que deban de ser diferentes los hashcode

//opcion 1 no cumple con la regla 2 