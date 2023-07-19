package collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class linkedlistdemo {

	public static void main(String[] args) {
	// declaration
		LinkedList l =new LinkedList();
		//LinkedList <Integer> ln =new LinkedList<Integer>();
		//LinkedList <String> ls =new LinkedList<String>();
		
		
		// 2] add object at the end of index
		l.add(100);
		l.add(10.5);
		l.add(true);
		l.add(false);
		l.add(null);
		l.add("String");
		l.add('A');
		System.out.println(l);
		
		// 3] add object based on index at the middle of linkedlist.
		l.add(2, "Tejas");
		System.out.println(l);
		
		// 4] retriving value of an object.
		System.out.println(l.get(2));
		
		
		// 5] set/change the value
		l.set(3, "patil");
		System.out.println("after changing the value:"+l);
		
		
		//6]  contains()
	System.out.println(l.contains("kuwar"));
	System.out.println(l.contains("Tejas"));
	
	
     // 7] isempty() :-> verified linkedlist empty or not.
	    System.out.println(l.isEmpty());
	
	

}
}
