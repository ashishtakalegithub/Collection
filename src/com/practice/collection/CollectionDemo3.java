package com.practice.collection;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo3 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("XXX");
		hs.add("AAA");
		hs.add("HHH");
		hs.add("TTT");
		hs.add("OOO");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
	}
}
