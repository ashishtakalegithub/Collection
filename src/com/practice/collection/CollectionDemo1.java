package com.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}
	}
}
