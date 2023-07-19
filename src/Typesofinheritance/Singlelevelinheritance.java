package Typesofinheritance;

public class Singlelevelinheritance {
int a =10;
int b =20;
void m1() {
	System.out.println("this is m1 method");
}
}

class B extends Singlelevelinheritance{
	int c=30;
	void m2() {
		System.out.println("this is m2 method");
	}
	

	public static void main(String[] args) {
		// create an object of child class.
		B b1=new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		b1.m1();
		System.out.println(b1.c);
		b1.m2();
		
		// create an object of parent class
		Singlelevelinheritance m1 = new Singlelevelinheritance();
		System.out.println(m1.a);
		System.out.println(m1.b);
		m1.m1();
//m1.m2();  --> with the parent class object can not call the child class methods and variable.
		
		
		
		

	
}
}
