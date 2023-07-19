package Exceptionhandling;

public class Exceptionexamples {

	public static void main(String[] args) {
		
		System.out.println("program is started.....");
		System.out.println("program is in progress.... ");
		int a= 100;
		
		try {
			System.out.println(a/0);  // throws arithmatic exception.
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception successfully handled");
      	}
		      
		
		String s = null;
		try {
			System.out.println(s.length());  //throws Nullpointer exception. e)
			
		}
		catch(Exception e) {
			System.out.println("null pointer exception successfully handled");
		}
	
			
		
		
		String s1 ="abc";
		try {
			int b1=Integer.parseInt(s1); 	//  throws NumberFormatException 
		}
		catch(Exception e) {
			System.out.println("number format exception handled");
		}
		
		
	finally {
		System.out.println("finally executed");
	}
		
		int[] abc=new int[5];
		try {
			abc[7] =50; // throws ArrayIndexOutOfBoundsException
		}
		catch(Exception e) {
			System.out.println("array index out of bounds excep[tion handled");
		}
		
		
		
System.out.println("program exit");

	}

	}

