package interfaces;

interface A{
	int a=100; //variable are bydefault static and final.
	void m1(); //methods are bydefault public.
}

public class Test implements A{
	public void m1() {
		System.out.println(a);
		}

	public static void main(String[] args) {
		
Test t1= new Test();
t1.m1();
	}

}
