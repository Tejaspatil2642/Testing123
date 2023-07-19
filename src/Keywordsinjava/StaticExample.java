package Keywordsinjava;

public class StaticExample {
	static int a=10;// static variable
	int b=20; // non static variable
	
	static void m1() {
		System.out.println("m1-> this is a static method");
	}
	
	void m2() {
		System.out.println("m2 --> this is a non static method");
	}
	
	void m3() {
		System.out.println("m3--> this is a non static method");
	// 3] static and non static variable directly access into another non static stuff
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}

	public static void main(String[] args) {
// 1] static variable and method can directly access into another static stuff(no need to create object)
		System.out.println(a);
		m1();
// 2] non static variables & methods do not access directly  into another static stuff 	(there is need to create an object)
		StaticExample sta1 =new StaticExample();
	System.out.println(sta1.b);	
	sta1.m2();
	sta1.m3();
	
		
		
		
		
		

	}

}
