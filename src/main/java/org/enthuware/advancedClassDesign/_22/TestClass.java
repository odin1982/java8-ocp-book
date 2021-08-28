package org.enthuware.advancedClassDesign._22;
//import org.enthuware.advancedClassDesign._22.Outsider.Insider;
class Outsider{
	public class Insider{}
}


public class TestClass {
	public static void main(String[] args) {
		Outsider os = new Outsider();
		//Insider in = os.new Insider(); //c1
		//os.Insider = os.new Insider();//c2
		//Outsider.Insider in = os.new Insider();
		//Insider in = new Outsider().new Insider();//ok con uso de import
		//Insider in = Outsider.new Insider();
	}
}


//nota c1: si usamos import org.enthuware.advancedClassDesign._22.Outsider.Insider; --> ok
//nota c2: no es un campo de la clase por eso no se puede usar de esa forma.
