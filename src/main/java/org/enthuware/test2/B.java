package org.enthuware.test2;

import org.enthuware.test.A;

class B extends A{
	public void process(A a) {
		a.i = a.i *2;
	}
}
