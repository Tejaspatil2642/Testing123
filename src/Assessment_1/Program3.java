package Assessment_1;

public class Program3 {

	public static void main(String[] args) {
		// 3.To check whether the given year is leap year or not.
		
		int year= 2024;
		if (year%4==0 && year%100 != 0 || year%400==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
		

	}

}
