package org.enthuware.advancedClassDesign._13;

//import org.enthuware.advancedClassDesign._13.OutSider.Insider;

class OutSider{
	public class Insider{}
}

public class TestClass {
	public static void main(String[] args) {
		OutSider os = new OutSider();
		
		//Insider in = os.new Insider();//c1
		//os.Insider in =  os.new Insider();
		//OutSider.Insider in = os.new Insider();
		//Insider in = OutSider.new Insider();
	}
}

//c1:  Se podria si se importa la linea 3