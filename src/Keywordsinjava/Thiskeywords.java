package Keywordsinjava;

public class Thiskeywords{
	
	// this :-> thiskeyword points to the class variable.
	int a,b; // instance variable or class variable
	
	void getvalues(int a, int b) // method variables
	{
		this.a=a;
		this.b=b;
		}
	
	void printvalues() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Thiskeywords th = new Thiskeywords();
				th.getvalues(100,200);
				th.printvalues();
		
		
		

	}

}
