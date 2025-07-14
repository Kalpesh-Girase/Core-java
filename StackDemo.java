package com.List;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.add(10);
		s.add(11);
		s.add(12);
		s.add(13);
		s.add(14);
		s.add(15);
		s.add(16);
		s.add(17);
		s.add(18);
		s.add(19);
		s.push(20);
		s.push(21); // add Element in a stack
		
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.peek()); // it returns last element of a stack
		System.out.println(s.search(18)); // returns index number it start from last of stack
		System.out.println(s.pop()); // it returns & removes last element of a stack
		System.out.println(s);
		s.get(6);
		s.remove(9);

	}
}

/*
 * 1.growable 
 * 2.homogeneous & heterogeneous are allowed 
 * 3. duplicates elements are allowed
 * 4.insertion order is preserved 
 * 5.null insertion is allowed 
 * 6.BE DS : stack
 * 7.performance :
 * 		1.insertion : if it we perform operation on top most element it works fast ( o(1) ) fastest in a world
 *      2.but we perform operation on any other elements in stack ignoring top most it is slow in both case 
 *  
 * 8.increase by 2x
 * 9.it comes in 1.0 - version 
 * 10.actual capacity is 10.
 */














