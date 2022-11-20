package org.jsp.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_Example {

	public static void main(String[] args) {
		//ArrayList is implementing class of List
		//ArrayList allows heterogeneous type of object
		//ArrayList maintains insertion order FIFO/LILO
		//ArrayList may contains n no. of null values.
		//ArrayList maintains index.
		ArrayList<Object> h = new ArrayList<>();
		h.add("miller");
		h.add("john");
		h.add(32);
		h.add(false);
		h.add('c');
		h.add(null);
		System.out.println(h);
		// 4 ways to access an object
		// 1.iterator
//		Iterator i = h.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		System.out.println("------------");
		// 2.for each
		for (Object object : h) {
			System.out.println(object);
		}
		// 3.listIterator
		ListIterator<Object> li = h.listIterator();
		System.out.println("forword direction");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("reverse direction");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
