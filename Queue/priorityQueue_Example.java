package org.jsp.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueue_Example {
	
	public static void main(String[] args) {
		//Queue allows homogeneous type of object
		PriorityQueue<Object> p = new PriorityQueue<>();
		p.add("kldj");
		p.add("lkjasd");
		p.add("jdslj");
		p.add("lksdj");
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll());
		System.out.println(p);
	}
}
