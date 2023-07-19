package OOPS;

public class Employee {
	int id;
	String Empname;
	double salary;
	String department ;
	String job;
	
	void display() {
		System.out.println(id);
		System.out.println(Empname);
		System.out.println(salary);
		System.out.println(department);
		System.out.println(job);
	}
	void display1() {
		System.out.println(id);
		System.out.println(Empname);
		System.out.println(salary);
		System.out.println(department);
		System.out.println(job);
	}
	

	public static void main(String[] args) {
		//creating 1st object
		Employee obj1=new Employee();
		obj1.id=101;
		obj1.Empname="Tejas";
		obj1.salary= 50000;
		obj1.department="Quality & assurance";
		obj1.job ="QA Engineer";
		
		obj1.display();
		
		System.out.println("*******************************************");
		
		//creating 2nd object
		Employee obj2 = new Employee();
		obj2.id = 102;
		obj2.Empname="pawan";
		obj2.salary= 55000;
		obj2.department="Quality & assurance1";
		obj2.job ="sr.QA Engineer";
		obj2.display1();
			
			
						
		
		
		
		
		

	}

}
