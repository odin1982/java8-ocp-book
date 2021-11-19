package org.enthuware.javaClassDesign._07;

import java.util.HashMap;

/*
 * a) This is an invalid implementation of hashCode() method with respect to the given equals() method.
 * 	Una de las reglas es que si es igual debe de dar el mismo resultado en tu hashCode
 * b) Only one of the Info objects will be stored in the HashMap
 * 	Como no son objetos iguales se almacenan los dos
 * 
 * */
public class Info {
	String s1,s2,s3;
	
	public Info(String a, String b,String c) {
		s1=a;s2=b;s3=c;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Info)) return false;
		Info i = (Info)obj;
		return (s1+s2+s3).equals(i.s1+i.s2+i.s3);
	}
	
	public int hashCode() {
		return s1.hashCode();
	}
	
	
	
	@Override
	public String toString() {
		return "Info [s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "]";
	}

	public static void main(String[] args) {
		
//		b)
		HashMap map = new HashMap();
		Info i1 = new Info("aaa","aaa","aaa");
		Info i2 = new Info("aaa","bbb","ccc");
		map.put(i1,"hello");
		map.put(i2,"world");
		System.out.println(map);
		System.out.println("i1 equals to i2: " + i1.equals(i2));
		
//		a)
		HashMap map2 = new HashMap();
		Info info1 = new Info("aa","b","c");
		Info info2 = new Info("a","ab","c");
		
		System.out.println("info1 equals to info2: " + info1.equals(info2));
		System.out.println("entonces el hash code deberia de ser el mismo");
		System.out.println("hashCode info1: " + info1.hashCode());
		System.out.println("hashCode info2: " + info2.hashCode());
		
		HashMap map3 = new HashMap();
		Info inf1 = new Info("aa","b","c");
		Info inf2 = new Info("aa","b","c");
		map3.put(inf1, 1);
		map3.put(inf2, 1);
		System.out.println("map3:" + map3);
		
		System.out.println("info1 equals to info2: " + inf1.equals(inf2));
		System.out.println("entonces el hash code deberia de ser el mismo");
		System.out.println("hashCode inf1: " + inf1.hashCode());
		System.out.println("hashCode inf2: " + inf2.hashCode());
		
		
	}

}

/*
 * APUNTES
 * HASHCODE:
 * 	- Si sobreescribes un equals debes sobrescribir tu método hashCode
 * 	- En el hash code debes incluir solo las variables que se usan en el equals puede ser solo una o todas
 * RULES:
 * 	- The result of hashCode() must not change
 *  - Si equals retorna TRUE el hashCode debe ser el mismo
 *  - Si equals retorna FALSE no necesariamente debe de entregar el hashCode un resultado diferente
 *  
 *  HASHMAP:
 *  	En un hashMap no se almacenara si detecta a traves del metodo equals son iguales
 * */

