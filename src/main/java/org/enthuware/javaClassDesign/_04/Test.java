package org.enthuware.javaClassDesign._04;


class Point{
		int x,y;
}

class ColoredPoint extends Point{
	int color;
}
public class Test {
	static void test(ColoredPoint p,Point q) {
		System.out.println("(ColoredPoint,Point)");
	}
	static void test(Point q,ColoredPoint p) {
		System.out.println("(ColoredPoint,Point)");
	}
	
	ColoredPoint cp = new ColoredPoint();
	test(cp,cp);
}
