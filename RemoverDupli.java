package com.ArrayDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoverDupli {
	
	public static void main(String args[]) {
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(50);
		
		System.out.println(a);
		System.out.println(a.remove(5));
		a.add(60);// add to the last
		System.out.println(a);
	}

}
