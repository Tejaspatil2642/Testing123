package collection;

import java.util.HashSet;

public class hashsetdemo3 {

	public static void main(String[] args) {
	// union,intersection,difference.
		
		HashSet set1=new HashSet();
set1.add(1);
set1.add(2);
set1.add(3);
set1.add(4);
set1.add(5);
System.out.println(set1);

HashSet set2 =new HashSet();
set2.add(3);
set2.add(4);
set2.add(5);
System.out.println(set2);

//1] perform union operation 
set1.addAll(set2);
System.out.println("Union elements are:->"+set1);

////2] intersection elements are common between two sets.
//set1.retainAll(set2);
//System.out.println("intersection elements are:->"+set1);

//3] difference 
//set1.removeAll(set2);
//System.out.println("difference elements are:->"+set1);

// 4] subset
System.out.println(set1.containsAll(set2));

	}

}
