package com.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class WrapperClass {

     	public static void main(String args[]) {
     		
     		ArrayList <String> a1 = new ArrayList();
     		ArrayList <ArrayList> a3 = new ArrayList();
     		ArrayList a2 = new ArrayList();
     		System.out.println(a3);
     		System.out.println(a3.add(a1));
     		System.out.println(a3);
     		 
     	    a1.add("Kalpesh");
     		
     		a2.add(1);
     		a2.add(2);
     		a2.add(3);
     		a2.add(4);
     		
     		//a.add(al);
     		
     		System.out.println(a1);
     		System.out.println(a2);
     		System.out.println(a2.get(2));
     		System.out.println(a2.remove(2));
     	    System.out.println(a2);
     	}
}

	/*
	 * 1.wrapper class is used to convert primitive data type into non - primitive data 
	 * type without loosing their property.
	 * 2.< Integer > = Java Generic.
	 * 
	 * 3.using java generic we can create homogeneous collection.
	 * */

