package Keywordsinjava;

class Animal{
	String colour="black";
	
	void eating() {
		System.out.println("eating.........");
	}
	
	Animal(){
		System.out.println("ainmal constructor is created");
	}
}




class Dog extends Animal{
	
	Dog(){
		//super() is used to invoke the immediate parent class constructor.
		super();
		System.out.println("dog constructor is created");
	}
	String colour="white";
	void display(){
		System.out.println(colour);
		//super keyword can be used to refer immediate parent class instance variable.
		System.out.println(super.colour);
		
		}
	
	void eating() {
		System.out.println("eating braed...");
		//super keyword can be used to invoke immediate parent class method.
		super.eating();
	}
}
public class Superkeywords {

	public static void main(String[] args) {
	Dog d1=new Dog();
	//d1.display();
	d1.eating();
	
	

	}

}
