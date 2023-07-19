package OOPS;

public class Student {
int stuid;
String sname;
char grade;

 Student(int id,String name,char g ){
	 stuid=id;
		sname=name;
		grade=g;
		
 }
void getvalues(int id,String name,char g) {
	stuid=id;
	sname=name;
	grade=g;
	
}

void call() {
	System.out.println(stuid+"  "+sname+"  "+grade);
}


}
