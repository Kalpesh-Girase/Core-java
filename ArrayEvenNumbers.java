package com.ArrayDemo;

import java.util.Iterator;

public class ArrayEvenNumbers {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
		
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			} 
			else {
				//System.out.println(a[i]);
			}
		}

	}
}
 