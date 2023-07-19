package OOPS;

public class ConstructorDemo {
	int x;
	int y;
//	ConstructorDemo() // default constructor or non parameterized constructor
//	{
//		x=100;
//		y=200;
//		System.out.println(x+y);
//	}
	
	ConstructorDemo(int a, int b) // parameterized constructor
	{
		System.out.println("multiplication of two number :->"+(a*b));
		
	}
	
	

	
	
	
	
public static void main(String[] args) {
ConstructorDemo c1 = new ConstructorDemo(20,30);
	
	
  



	
}
}
