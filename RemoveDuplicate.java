package com.ArrayDemo;

import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 6, 7, 6, 4, 2, 4, 5, 5 };
		int a = 0;
		int i = 0;
		int k = 0;
       int b[]= {};
       int n=0;
   
		System.out.println("************************");
		//a = arr[i];
		for (i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] ) {

					arr[a] = arr[i];
					System.out.println(arr[a]);
					 //b[n]= arr[a];

				}

			}

		}
		System.out.println(arr[a]);

		System.out.println("****** AFTER REMOVING DUPLICATE ELEMENTS ******");
		for (k = 0; k < arr.length; k++) {

			if (arr[a] == arr[k]) {
				
			} else {
				System.out.println(arr[k]);
			
			}
		}
		
	}

}
