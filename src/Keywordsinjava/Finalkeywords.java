package Keywordsinjava;
//1] variable --> if declare variable as Final then you can not change the value of variable.

//2] method --> if you declare method as a final then you can not override the same method into another class.

//3] class --> if you declare class as a final then you can not extends(inherite) the class.


//final class BIKE{
//	final void method1() {
//		System.out.println("this is bike class method");
//	}
//}
//
//class Honda extends BIKE{
//	void method1() {
//		System.out.println("this is honda class method");
//	}
//	
//}

public class Finalkeywords {
	final int speed =50;
	

	public static void main(String[] args) {
		Finalkeywords sp1=new Finalkeywords();
		
		System.out.println("speed is :->"+sp1.speed);
		//sp1.speed=60;
		System.out.println("speed is :->"+sp1.speed);
	
	}

}
