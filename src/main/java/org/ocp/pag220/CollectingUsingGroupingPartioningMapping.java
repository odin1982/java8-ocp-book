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
		TreeMap<Integer,List<String>> map3 = ohMy3.collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toList()));
		System.out.println(map3);
		
		Stream<String> ohMy4 = Stream.of("lions","tigers","bears","elephant","bird");
		Map<Boolean,List<String>> map4 = ohMy4.collect(Collectors.partitioningBy(s->s.length()<=5));
		System.out.println(map4);
		
		Stream<String> ohMy5 = Stream.of("lions","tigers","bears","elephant","bird");
		Map<Boolean,List<String>> map5 = ohMy5.collect(Collectors.partitioningBy(s->s.length()<=9));
		System.out.println(map5);
	}
}
