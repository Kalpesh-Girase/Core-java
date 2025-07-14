package com.List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();

		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		l.add(17);
		l.add(18);
		l.add("hello");
		l.add(19);
		l.add(20);

		/*
		 * System.out.println(l); System.out.println(l.get(2));
		 * System.out.println(l.remove(2)); l.add(null); System.out.println(l);
		 */
		
		// ** METHODS OF LIST (I) ** //

		System.out.println(l.size());
		System.out.println(l.isEmpty());// return true if collection empty.
		System.out.println(l.contains(120));/// return true if the element is present in collection.
		System.out.println(l.iterator());// return output in object hexaelement.
		System.out.println(l.toArray());
		System.out.println(l.toString());// return collection.
		System.out.println(l.add(133));// add element in collection .
		System.out.println(l);
		System.out.println(l.subList(4, 5));

	}
}
