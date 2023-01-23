package com.practice.collection;

import java.util.HashSet;

public class CollectionDemo3 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("XXX");
		hs.add("AAA");
		hs.add("HHH");
		hs.add("TTT");
		hs.add("OOO");
		hs.stream().forEach(System.out::println);
	}
}
