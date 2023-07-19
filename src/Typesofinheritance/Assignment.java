package Typesofinheritance;
class Teacher{
	String designation ="Teacher";
	String collageName ="Beginnersbook";
	void does(){
	System.out.println("Teaching");	
	}
	
	}
class MycomputerTeacher extends Teacher{
	
}

public class Assignment {

	public static void main(String[] args) {
		
		MycomputerTeacher obj1=new MycomputerTeacher();
		obj1.does();
		System.out.println(obj1.designation);
		System.out.println(obj1.collageName);
	}

}
