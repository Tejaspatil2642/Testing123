package collection;

import java.util.HashMap;

public class hashmapdemo {

	public static void main(String[] args) {
	//declaration
		HashMap m = new HashMap();
  //HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		
		// adding element into hashmap
		m.put(101, "steves");
		m.put(102, "john");
		m.put(103, "smith");
		m.put(104, "scott");
		m.put(105, "eli");
		m.put(106, "bates");
		// m.put(103, "abc"); //duplicate keys not allowed.
		// m.put(107, "eli");   // duplicate values are allowed.
		System.out.println(m);
		
        m.remove(101);
        System.out.println(m); // remove entry from the hashmap
        
       System.out.println(m.containsKey(103)); // return type is boolean
       System.out.println(m.containsKey(101));  // return type is boolean
       
       System.out.println( m.containsValue("eli")); // return type is boolean
       System.out.println( m.containsValue("musk")); // return type is boolean
       
       
       System.out.println(m.isEmpty()); // return type is boolean
       
       System.out.println(m.keySet());  // return all the values of key set.
       
       System.out.println(m.values());   // return all the values of set.
       
       System.out.println(m.entrySet());  // return all the entries as a set.[102=john, 103=smith, 104=scott, 105=eli, 106=bates]
       
       
	}

}
