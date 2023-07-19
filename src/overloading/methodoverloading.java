package overloading;

public class methodoverloading {
	
//  overloading :-> having same method name but with different parameter.
//	it is divided into 3 types
//	1] number of parameter.
//  2] datatype of parameter.
//  3] position of parameter.
	 void Demo() {
			System.out.println("it is zero parameterized method");
		              }
	 void Demo(int a) {
			System.out.println("it is  single parameterized method");
		              }
	 void Demo(int a,int b) {
			System.out.println("it is  two parameterized method");
		              }
	 void Demo(int a,double b) {
			System.out.println("it is depend on data type of  method");
		              }
	 
	 void Demo(double b,int a) {
			System.out.println("it is depend on position of data type  method ");
		              }
	 
public static void main(String[] args) {
	// create the object 
	methodoverloading m1 = new methodoverloading ();
			m1.Demo(); //calling non parameterized method
		    m1.Demo(1); // calling single parameterized method
		    m1.Demo(2,45); // it is two parameterized method
		    m1.Demo(3.5,8); //it is depend on position of data type  method
            m1.Demo(8,3.5);  //it is depend on data type of  method


	}

}
