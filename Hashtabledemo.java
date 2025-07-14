package com.SetDemo;

import java.util.Hashtable;

public class Hashtabledemo {

	public static void main(String[] args) {

		Hashtable s = new Hashtable();
		s.put(12, "w");
		s.put(13, "A");
		s.put(14, "B");
		s.put(15, "C");
		//s.put(null, "d"); not allowed
		System.out.println(s);
	}

}
/*
 * it is not a collection but it work like a collections.
 * grow after 75%
 * performance is constant for all
 * null key and null values are not allowed
 * it is thread safe..
 * */


