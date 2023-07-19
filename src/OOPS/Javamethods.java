package OOPS;

public class Javamethods {
//	int x=10;
//	int y= 20;
//	void sum()//case 1 --> not taking parameter also not returned any value.
//	{
//		System.out.println(x+y);
//	}
//	int sum() //case 2 --> not taking parameter but return value.
//	{
//		return(x+y);
//	}
	
//	void sum(int a, int b)//case 3 -->  taking parameter but not returned any value.
//	{
//		System.out.println(a+b);
//	}
	
	
	int sum(int c,int d)     //case 4 --> taking parameter and return value.
	{
		return(c+d);
	}
//
	public static void main(String[] args) {
		Javamethods obj1 = new Javamethods();
		System.out.println(obj1.sum(400,200));
		
		
		
		
		
		}
		
	}


