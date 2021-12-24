package org.book.advancedClassDesign._03;

public interface IHello {
	public int hello(int x, int y);
	public long hello(long x, long y);
}

interface IHello2 extends IHello{}

abstract class Hello implements IHello{}

abstract class Hello2 implements IHello{
	public short hello(short a, short b) {
		return 0;
	}
}

abstract class Hello3 implements IHello {
	public short hello(int a, int b) {
		return 0;
	}
}
//Nota: No se esta implementando correctamnete overriding