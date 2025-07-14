package com.SetDemo;

import java.util.LinkedHashSet;

public class Linkeddhashsetdemo {

	public static void main(String[] args) {

		LinkedHashSet s = new LinkedHashSet();
		
		s.add(12);
		s.add(13);
		s.add(null);
		s.add("Kalpesh");
		s.remove(12);
		
		System.out.println(s);
	}

}

/*
 * cap = 16.
 * hm&ht allowed.
 * insertion oreder is preserved.
 * null possible
 * BE DS = Hashtable + DoublyLinkedlist.
 * 
 * */
