package org.ocp.pag220;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingUsingGroupingPartioningMapping {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions","tigers","bears");
		Map<Integer,List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
		System.out.println(map);
		
		Stream<String> ohMy2 = Stream.of("lions","tigers","bears");
		TreeMap<Integer,Set<String>> map2 = ohMy2.collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toSet()));
		System.out.println(map2);
		
		Stream<String> ohMy3 = Stream.of("lions","tigers","bears");
		TreeMap<Integer,Set<String>> map3 = ohMy3.collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toSet()));
		System.out.println(map3);
	}
}
