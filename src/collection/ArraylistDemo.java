package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistDemo {

	public static void main(String[] args) {
		//Declare arraylist
	//	ArrayList <String>al=new <String> ArrayList();
	//	ArrayList <Integer> al  = new   ArrayList<Integer>();
		
		ArrayList al = new ArrayList();
		
		//2] add value into the arraylist by using add method
		
		al.add("Tejas");
		al.add(100);
		al.add(12.5);
		al.add('A');
		al.add(true);
		al.add(false);
		System.out.println(al);
		System.out.println("print size of the arraylist="+al.size());
		al.remove(3);
		System.out.println(al);
		//al.removeAll(al);
		//System.out.println(al);
		
		//3] insert a new element.
		al.add(2, "patil");
		System.out.println(al);
		
		//4] retreive specific element
		System.out.println(al.get(2));
		
		// 5] change element/replace
		System.out.println(al.set(2, "c#"));
		System.out.println(al);
	  

		// 6] search contains()- returns -->true/false
	        System.out.println(al.contains("patil"));
	        System.out.println(al.contains("c#"));
	        
	     // 7] Reading element using for loop
	        for(int i=0;i<al.size();i++) {
	        	System.out.println(al.get(i));
	        }
	        
	     // 8] Reading elements using for each loop
	        for(Object e:al) {
	        	System.out.println(e);
	        }
	        
	        
	        }

}
