package Typesofinheritance;
class ABC{
	int c=20;
	void b1() {
		System.out.println("this is b1 method of class A");
	}
}

class BCD extends ABC{
	int d=30;
	void b2() {
		System.out.println("this is b2 method of class b");
	}
}


class CDE extends ABC{
	int e=40;
	void c3() {
		System.out.println("this is a c3 method of class C");
	}
	
}
public class Heiraricalinheritance extends ABC{

	public static void main(String[] args) {
		
		BCD a1=new BCD();
		a1.b2();
		a1.b1();
	
	
		
		
	
	}

}
