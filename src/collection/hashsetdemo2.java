package collection;

import java.util.HashSet;

public class hashsetdemo2 {

	public static void main(String[] args) {
		HashSet Evennumber =new HashSet();
		Evennumber.add(2);
		Evennumber.add(4);
		Evennumber.add(6);
		Evennumber.add(8);
		
		System.out.println(Evennumber);
		
		HashSet <Integer> number= new HashSet<Integer> ();
		number.add(10);
		number.addAll(Evennumber);
		System.out.println(number);
		number.add(10);
		System.out.println(number);// hashset does not allowed duplicate elements.
		
		
		
		
		
		

	}

}