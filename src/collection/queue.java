package collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class queue {

	public static void main(String[] args) {
		LinkedList q =new LinkedList();
		// for adding elements use 1] add() 2] offer()
		q.add('A');
//		q.add('B');
//		q.add('c');
//		q.offer(100);
//		q.offer(200);
//		System.out.println(q);
//		
		
		//get head element
		//System.out.println(q.element()); // return head element ,if q is empty return "no such element exception"
		//System.out.println(q.peek()); // return head element ,if q is empty return "null"
		
		// remove() &poll ()
		//System.out.println(q.remove()); // return head,if q is empty return "no such element exception"
		//System.out.println(q);
		
		
		System.out.println(q.poll()); // return head element ,if q is empty return empty .
		System.out.println(q);
	}

}
