package org.book.advancedClassDesign._18;

interface Otter{
	default void play() {}
}

public class RiverOtter implements Otter{
	//@Override public boolean equals(Object o) { return false; }
	//@Override public boolean equals(Otter o) { return false; }
	//@Override public int hashCode() { return 42; }
	//@Override public long hashCode() { return 42; }
	//@Override public void play() {}
	//@Override void play() {}
}
