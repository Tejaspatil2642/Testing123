package collection;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlistdemo2 {

	private static Object collections;

	public static void main(String[] args) {
		LinkedList l =new LinkedList();
		l.add('X');
		l.add('Y');
		l.add('Z');
		l.add('A');
		l.add('B');
		l.add('C');

	
		 
		LinkedList new_l = new LinkedList();
		// addall()
		new_l.addAll(l);
		System.out.println("after add all elements:->"+new_l);
		
		// Removell()
//		new_l.removeAll(l);
//		System.out.println("after remove all elements:->"+new_l);
		
		// sorting method
	Collections.sort(new_l);
		
System.out.println("after sorting elements:"+new_l);



	}

}
