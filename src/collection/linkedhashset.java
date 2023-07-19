package collection;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
	LinkedHashSet lset = new LinkedHashSet();
	lset.add(100);
	lset.add(200);
	lset.add(300);
	lset.add(400);
	lset.add(500);
	
	System.out.println(lset);// insetion of order is allowed
	lset.add(100);
	System.out.println(lset); // duplicates are not allowed.

	}

}
