package com.ArrayDemo;

import java.util.Iterator;

public class GreatestNumber {
	public static void main(String[] args) {
		
		int a[] = {10,5,60,100,90,20};
		int max=0;
		int s2=0;
		int s3=0;
		
		for (int i = 0; i <=5; i++) {
			System.out.println(a[i]);
			
			if(a[i]>max) {
				
				max=a[i];
			}
	  }
		
		for (int i = 0; i <=5; i++) {
			
		if (a[i]>s2 &&a[i]!=max) {
			
			s2=a[i];
		}
	}
		
		for (int i = 0; i <=5; i++) {
			
			if (a[i]>s3&&a[i]<max&&a[i]<s2) {
				System.out.println(s3);
				s3=a[i];
			}
			
		}
		
		
		System.out.println("Greatest Element in Array  = "+max);
		System.out.println("Second Largest Element in Array = "+s2);
		System.out.println("Third Greatest Element in Array  = "+s3);
		
    }
}