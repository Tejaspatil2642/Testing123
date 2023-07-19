package interfaces;
interface ABC{
	int a=100;
	void m1();
}

interface XYZ{
	int b=200;
	void m2();
}

public class Multipleinheritance implements ABC,XYZ{
	public void m1() {
		System.out.println(a);
	}
	public void m2() {
		System.out.println(b);
	}

 public static void main(String[] args) {
	 Multipleinheritance mul1 = new Multipleinheritance();
	 mul1.m1();
	 mul1.m2();

	}

}
