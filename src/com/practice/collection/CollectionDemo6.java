package com.practice.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionDemo6 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "AAA");
		hm.put("B", "BBB");
		hm.put("C", "CCC");
		hm.put("D", "DDD");
		hm.put("E", "EEE");
		Set<String> ks = hm.keySet();
		Iterator<String> itr = ks.iterator();
		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
			System.out.println(hm.get(next));
		}
	}
}
