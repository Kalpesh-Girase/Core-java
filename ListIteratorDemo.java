package CursorCollectionDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		 
		LinkedList l = new LinkedList ();
		
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		
		ListIterator e = l.listIterator();
		
		while (e.hasNext()) {
			System.out.println( e.next());
			
		}
		System.out.println(    );
		while (e.hasPrevious()) {
			System.out.println(e.previous());
			
		}
		
	}
}
