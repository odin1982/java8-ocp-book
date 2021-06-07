package org.ocp.pag219;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMaps {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions","tigers","bears");
		Map<String,Integer> map = ohMy.collect(Collectors.toMap(s->s, String::length));
		System.out.println(map);
		
//		Stream<String> ohMy2 = Stream.of("lions","tigers","bears");
//		Map<Integer,String> map2 = ohMy.collect(Collectors.toMap(String::length,k->k));//BAD
//		System.out.println(map2);
		
	}
}
