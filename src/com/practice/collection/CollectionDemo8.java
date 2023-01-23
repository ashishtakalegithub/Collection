package com.practice.collection;

import java.util.ArrayList;

public class CollectionDemo8 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(145);
		al.add(759);
		al.add(157);
		al.add(675);
		al.add(198);
		// sorting ArrayList-default natural sorting order
		al.stream().sorted().forEach(System.out::println);
		// sorting ArrayList-customised sorting order-descending
		al.stream().sorted((a1, a2) -> a2.compareTo(a1)).forEach(System.out::println);
	}
}
