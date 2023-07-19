package overloading;

public class Constructoroverloading {
	Constructoroverloading(){
		System.out.println("it is a default constructor");
	}
Constructoroverloading(int a){
		System.out.println("it is single parameterized constructor");
	}

Constructoroverloading(int a,int b){
	System.out.println("it is two parameterized constructor");
}

Constructoroverloading(int a,int b,int c){
	System.out.println(" it is depend on number of parameter");
}

Constructoroverloading(int a,double  b){
	System.out.println("it is depend on datatype of parameter");
}

Constructoroverloading(double d,int a){
	System.out.println("it is also depend on datatype of parameter");
}
	
	
public static void main(String[] args) {
	Constructoroverloading c1 = new Constructoroverloading(); // at the time of object creation calling default constructor
  
Constructoroverloading c2 = new Constructoroverloading(10);
	Constructoroverloading c3 = new Constructoroverloading(10,20);
	Constructoroverloading c4 = new Constructoroverloading(10,20,30);
	Constructoroverloading c5 = new Constructoroverloading(10,20.30);
	Constructoroverloading c6 = new Constructoroverloading(20.30,12);
  

	}

}
