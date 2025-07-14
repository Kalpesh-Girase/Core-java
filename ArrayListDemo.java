package com.List;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList (); // By Default Size 10; 
		
		al.add(10);
		al.add(10);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add(18);
		al.add(null);
		al.add("Hello");
		al.add(19);
		al.add(20);
		
		System.out.println(al);
		System.out.println(al.get(6));
		System.out.println(al.remove(4));
		System.out.println(al);
		System.out.println( al.isEmpty());
		
		
		for (int i = 0; i < args.length+1; i++) {
			
			System.out.print(al);
			
		}
		
		/* it is grow able.
		 * it stores homogeneous & heterogeneous element.
		 * insertion order is preserved.
		 * duplicate allowed
		 * null value allowed.
		 * random access elements.
		 * performance as compare to array = 
		 *   1.insertion = slow.
		 *   2.deletion = slow.
		 *   3.access = fast in both .
		 */
			
	}
}
