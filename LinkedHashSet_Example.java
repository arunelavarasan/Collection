package org.jsp.collection.hashset;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSet_Example {

	public static void main(String[] args) {
		// Hash set maintains insertion order
		// Hash set allows heterogeneous object
		// One null objects are allowed
		LinkedHashSet<Object> h = new LinkedHashSet<>();
		h.add("miller");
		h.add("john");
		h.add(32);
		h.add(false);
		h.add('c');
		h.add(null);
		//set are represent inside []
		System.out.println(h);
		// Two ways to access an object
		// 1.iterator
		Iterator i = h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("------------");
		// 2.for each
		for (Object object : h) {
			System.out.println(object);
		}
	}
}
