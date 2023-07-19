package Keywordsinjava;

public class Calculation {
	
	int sum(int x,int y) {
		System.out.println(x+y);
		return 5;
		}
	
	int sum(int x, int y, int z) {
		System.out.println(x+y+z);
		return 5;
	}
	
	
	double sum (double x,double y) {
		System.out.println(x+y);
		return 5.5;
	}
	
	double sum(double x,double y,double z) {
		System.out.println(x+y+z);
		return 67.8;
	}

	public static void main(String[] args) {
		Calculation cal=new Calculation();
		cal.sum(100,200);
		cal.sum(100,200,300);
		cal.sum(100.50,200.50 );
		cal.sum(100.50,200.50,300.78);
		
	

	}

}
