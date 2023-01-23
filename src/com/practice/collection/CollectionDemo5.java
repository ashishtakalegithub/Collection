package com.practice.collection;

import java.util.HashSet;

public class CollectionDemo5 {
	public static void main(String[] args) {
		HashSet<String> al = new HashSet<String>();
		al.add("XXX");
		al.add("AAA");
		al.add("TTT");
		al.add("JJJ");
		al.add("HHH");
		// check elements present or not
		System.out.println(al.contains("XXX"));
		System.out.println(al.contains("xxx"));
	}
}
