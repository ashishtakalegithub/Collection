package com.practice.collection;

import java.util.HashMap;

public class CollectionDemo6 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "AAA");
		hm.put("B", "BBB");
		hm.put("C", "CCC");
		hm.put("D", "DDD");
		hm.put("E", "EEE");
		// by using entry set
		hm.entrySet().stream().forEach(System.out::println);

	}
}
