package com.practice.collection;

import java.util.ArrayList;

public class CollectionDemo4 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
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
