package org.ocp.pag213;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LinkingStreamsUnderlayingData {
	public static void main(String[] args) {
		List<String> cats = new ArrayList<>();
		cats.add("Annie");
		cats.add("Ripley");//create a list wit two elements
		Stream<String> stream = cats.stream();//in this point stream is not created , is lazily evaluated 
		cats.add("KC");// add an object 
		System.out.println(stream.count());//create the stream and count 3
	}
}
