package com.practice.collection;

import java.util.HashMap;

public class CollectionDemo7 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "AAA");
		hm.put("B", "BBB");
		hm.put("C", "CCC");
		hm.put("D", "DDD");
		hm.put("E", "EEE");
		// sorting according to keys(Desending order)
		hm.entrySet().stream().sorted((m1, m2) -> m2.getKey().compareTo(m1.getKey())).forEach(System.out::println);
	}
}
