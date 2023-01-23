package com.practice.collection;

import java.util.HashMap;

public class CollectionDemo9 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(111, "HHH");
		hm.put(999, "KKK");
		hm.put(555, "RRR");
		hm.put(666, "CCC");
		hm.put(333, "PPP");
		// sorting by values
		hm.entrySet().stream().sorted((h1, h2) -> h1.getValue().compareTo(h2.getValue())).forEach(System.out::println);
	}
}
