package Array;

public class String_methods {

	public static void main(String[] args) {
// 1] length() method--> used to count number of character in string.
		String s = "Welcome";
		System.out.println("number of character in the string:->"+s.length());
		
//2] concat() method --> it is used to joined two string or one string is append 
//   on another String.

		String s1 ="Welcome";
		String s2 = "To java";
		System.out.println(s1.concat(s2));
		
		
//3] Trim() method --> it is used to remove the left and right space between string.
		String s3 = "  Welcome   ";
		System.out.println(s3.trim());
		
		
//4] charAt() --> it will return character value at given index number.
		String s4 ="Welcome";
		System.out.println(s4.charAt(3)); //c
		
		
// 5] contains() --> 1] it will return True value if the given sequence of character present in the string.
//                   2] it will return False value if the given sequence of character not present in the string
		
		
	String s5 = "Welcome";
	System.out.println(s5.contains("Wel"));
	
	
	
//6] equals() =it is compare the two string based on the content of the string if any character not matched
//	then it will return false value.
	
	String s6 = "Welcome";
	String s7 = "to";
	System.out.println(s6.equals(s7));
	
//7] equalignorecase() = it is compare the two string based on the content of the string but not work
//	like equals() if the character matched it will return true else false.
	
	String s8 ="Welcome";
	System.out.println(s8.equalsIgnoreCase("Welcome"));
	System.out.println(s8.equalsIgnoreCase("welcome"));
	System.out.println(s8.equalsIgnoreCase("welome"));

//8] replace()  return a string replacing all the old character or charsequence to new character 
	String s9 ="Welcome";
	System.out.println(s9.replace('e','a'));
	
	String s10 ="Welcome to java ";
	System.out.println(s10.replace("java", "selenium"));
	
	
//9] substring() :-> return a substring of a string based on starting index and ending index.
	
	String s11 ="Welcome";
	
System.out.println(s11.substring(1,3));//el
System.out.println(s11.substring(0,5));//welco
System.out.println(s11.substring(2,5));//lco



	}

}
