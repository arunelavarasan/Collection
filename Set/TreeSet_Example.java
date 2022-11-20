package org.jsp.collection.hashset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {
		// Hash set maintains insertion order
		// Hash set allows only homogeneous object
		// null objects are not allowed
		TreeSet<Object> h = new TreeSet<>();
		h.add("miller");
		h.add("john");
		h.add("scott");
		h.add("Kings");
		h.add("James");
		// set are represent inside []
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
