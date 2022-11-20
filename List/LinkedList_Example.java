package org.jsp.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Example {

	public static void main(String[] args) {
		//LinkedList is implementing class of List
		//LinkedList allows heterogeneous type of object
		//LinkedList maintains insertion order FIFO/LILO
		//LinkedList may contains n no. of null values.
		//LinkedList maintains index.
		LinkedList<Object> list = new LinkedList<>();
		list.add("miller");
		list.add("john");
		list.add(32);
		list.add(false);
		list.add('c');
		list.add(null);
		System.out.println(list);
		// 4 ways to access an object
		// 1.iterator
//		Iterator i = list.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		System.out.println("------------");
		// 2.for each
		for (Object object : list) {
			System.out.println(object);
		}
		// 3.listIterator
		ListIterator<Object> li = list.listIterator();
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
