package com.List;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector v = new Vector();
		Vector d = new Vector();

		d.add(20);
		d.add(21);
		d.add(14);

		v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		v.add(16);
		v.add(17);
		v.add(18);
		v.add(10);

		/*
		 * System.out.println(v.capacity()); System.out.println(v);
		 * System.out.println(v.get(9)); System.out.println(v.remove(8));
		 * System.out.println(v);
		 */

		// ** METHODS OF COLLECTION (I); **//

		System.out.println(v.size()); // it return the size of Array start from 1.
		System.out.println(d.size());
		System.out.println(v.isEmpty());// return false
		System.out.println(d.isEmpty());// return true if List is Empty
		System.out.println(v.contains(12));// returns true if the element is present.
		System.out.println(v.toArray()); // it converts collection into object Array.
		System.out.println(v.toString()); // return output.
		System.out.println(v.remove(3)); // removes element in Collection.
		System.out.println(v.add(45));
		System.out.println(v);
		System.out.println(v.containsAll(d));
		System.out.println(v);
		System.out.println(v.addAll(d)); // add all elements "union set",
		System.out.println(v);
		System.out.println(v.removeAll(d)); // remove all common elements in collection v.
		System.out.println(v);
		System.out.println(v.retainAll(d));
		System.out.println(v);
		System.out.println(d);

		// System.out.println(.clear());

	}
}

/*
 * 1.growable 2.homogeneous & heterogeneous Elements are stored 3.Duplicate
 * Elements are Allowed 4.insertion order is preserved 5.null is insertion is
 * possible BE data structure : Growablw array 6.performance : 1.insertion :slow
 * 2.deletion : slow 3.access : fast
 * 
 * 7.it comes in 1.0 version of java 8.it is a legacy class 9.it is thread safe
 * 10.it increase by 2x 11.actual capacity is 10
 */
