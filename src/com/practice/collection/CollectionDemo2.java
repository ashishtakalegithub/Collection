package com.practice.collection;

import java.util.ArrayList;

public class CollectionDemo2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("AAA");
		al.add("ZZZ");
		al.add("CCC");
		al.add("XXX");
		al.add("BBB");
		// converting list to array
		Object[] arr = al.toArray();
		for (Object arr1 : arr) {
			System.out.println(arr1);
		}
	}
}
