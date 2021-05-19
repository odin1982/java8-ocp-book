package org.ocp.pag153;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingMethodReferences {
	public static void main(String[] args) {
		String str = "abc";
		Predicate<String> methodRef2 = str :: startsWith;
		Predicate<String> lambda2 = s -> str.startsWith(s);
		System.out.println(methodRef2.test("abc"));
		System.out.println(lambda2.test("mmm"));
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(11);
		integerList.add(9);
		
		Consumer<List<Integer>> c1 = Collections::sort;
		Consumer<List<Integer>> c2 = l -> Collections.sort(l);
		c1.accept(integerList);
		System.out.println(integerList);
		
		//we call an instance method without knowing the instance in advance
		
		Predicate<String> modRef3 = String::isEmpty;
		Predicate<String> lambda3 = s -> s.isEmpty();
		
		Supplier<ArrayList> methodRef4 = ArrayList::new;
		Supplier<ArrayList> lambda4 = () -> new ArrayList();
	}

}
