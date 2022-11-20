package org.jsp.collection.hashset;
import java.util.HashSet;
import java.util.Iterator;
public class Hash_Set_Example {
	
	public static void main(String[] args) {
		//Hash set does not maintains insertion order
		//Hash set allows heterogeneous object
		//One null objects are allowed
		HashSet<Object> h = new HashSet<>();
		h.add("miller");
		h.add("john");
		h.add(32);
		h.add(false);
		h.add('c');
		h.add(null);
		System.out.println(h);
		//Two ways to access an object
		//1.iterator
		Iterator i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("------------");
		//2.for each
		for (Object object : h) {
			System.out.println(object);
		}
	}
}
