package org.jsp.collection.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_LinkedList_Example {

	public static void main(String[] args) {
		// Queue allows homogeneous type of object
		Queue<Object> p = new LinkedList<>();
		p.add("kldj");
		p.add("lkjasd");
		p.add("jdslj");
		p.add("lksdj");
		Iterator i = p.iterator();
		System.out.println("===Forword direction===");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll());
		System.out.println(p);
	}
}