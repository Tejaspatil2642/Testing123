package Typesofinheritance;
class A{
	int a=10;
	void m1(){
		System.out.println("this is class A method");
	}
}

class AB extends A{
	int b=20;
	void m2() {
		System.out.println("this m2 method of class B");
	}
}

public class Multilevelinheritance extends B {

	public static void main(String[] args) {
		
		Multilevelinheritance c1= new Multilevelinheritance();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.m1();
		c1.m2();
		
		AB a1 =new AB();
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.m1();
		a1.m2();
		
		A a2=new A();
		System.out.println(a2.a);
		a2.m1();
		
		
		

	}

}
