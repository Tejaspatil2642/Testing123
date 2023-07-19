package OOPS;

public class Demo {
int age=45;
double salary=10000;
void call(){
	System.out.println("this is a call method");
}
	
}
 
class Demo123 {
	 public static void main(String[] args) {
			Demo obj1 = new Demo();
			System.out.println("age is:->"+obj1.age);
			System.out.println("salary is->"+obj1.salary);
		obj1.call();

		}

		
}
