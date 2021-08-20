package org.enthuware.javaClassDesign._14;

abstract class Widget{
	String data = "data";
	
	public void doWidgetStuff() {}
}

class GoodWidget extends Widget{
	String data = "bigdata";
	public void doWidgetStuff() {
		System.out.println(data);
	}
}

public class WidgetUser {
	public static void main(String[] args) {
		Widget w = new GoodWidget();
		w.doWidgetStuff();
	}
}
