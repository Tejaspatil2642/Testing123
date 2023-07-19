package collection;

import java.util.LinkedList;

public class linkedlistdemo3 {

	public static void main(String[] args) {
      LinkedList l = new LinkedList();
      
      // duplicate allowed in linkedlist()
      
      l.add("dog");
      l.add("dog");
      l.add("dog");
      l.add("horse");
      l.add("lion");
       System.out.println("added linkedlist is:->"+l);
       
       l.addFirst("tiger");
       System.out.println("after adding first element:->"+l);
       
       l.addLast("monkey");
       System.out.println("after adding last elements:->"+l);
       
      l.removeFirst() ;  
      l.removeLast();
      System.out.println(l);
      
	}

}
