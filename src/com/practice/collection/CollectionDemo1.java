package com.practice.collection;

import java.util.ArrayList;

public class CollectionDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}
		al.stream().forEach(System.out::println);

	}
}
