package collection;

import java.util.HashSet;

public class Hashsetdemo {

	 
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		// Declaration
		HashSet hs =new HashSet(); // default capacity is 16 & load factor is 0.75
	//	HashSet hs1=new HashSet(100);
//		HashSet hs2= new HashSet ( 100,(float) 0.96);
		
		hs.add(100);
		hs.add(100.50);
		hs.add('A');
		hs.add("ABC");
		hs.add("tiger");
		
		
		System.out.println(hs); // order of insertion not allowed
		
		// add element into the hashset 
		hs.add("ABC");
		System.out.println(hs); // duplicate not allowed in hashset
		
		//remove()
		hs.remove("tiger");
		System.out.println("after removing value print hashset="+hs);
		
		//contains()
		System.out.println("print the value using contains()="+hs.contains("abc"));
		// print value using loop
		for(Object e:hs){
			System.out.println(e);
		}
		
		
		// isEmpty() -> to verify method is empty or not.
		System.out.println(hs.isEmpty());
	}

}
