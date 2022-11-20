package org.jsp.collection.list;

import java.util.Vector;
import java.util.ListIterator;

public class Vector_Example {

	public static void main(String[] args) {
		// Vector is present since jdk 1.0. Hence vector is an legacy class
		// Vector has initial capacity and incremental capacity.
		// Vector is implementing class of List
		// Vector allows heterogeneous type of object
		// Vector maintains insertion order FIFO/LILO
		// Vector may contains n no. of null values.
		// Vector maintains index.
		Vector<Object> v = new Vector<>();
		v.add("miller");
		v.add("john");
		v.add(32);
		v.add(false);
		v.add('c');
		v.add(null);
		System.out.println(v);
		// 4 ways to access an object
		// 1.iterator
//		Iterator i = v.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		System.out.println("------------");
		// 2.for each
		for (Object object : v) {
			System.out.println(object);
		}
		// 3.listIterator
		ListIterator<Object> li = v.listIterator();
		System.out.println("forword direction");
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("reverse direction");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
