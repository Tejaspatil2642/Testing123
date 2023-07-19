package interfaces;
// hybrid interface :-> it is the combination of hierarical and multiple inheritance.

class ABCD{
	int a=100;
	void m1() {
		System.out.println("this is m1 method of class A");
		}
	
	interface I1{
		
		void m2();
	}
	
	interface I2{
	
		void m3();
	}
}
public class hybridinterface extends ABCD implements interfaces.ABCD.I1,interfaces.ABCD.I2{
	public void m2() {
		System.out.println("this interface I1 m2 method");
	}
	public void m3() {
		System.out.println(" this is interface I2 m3 method");
	}
	public static void main(String[] args) {
		
		 hybridinterface a1=new  hybridinterface();
		 a1.m1();
		 a1.m2();
		 a1.m3();
	}

}
