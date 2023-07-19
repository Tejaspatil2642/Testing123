package Assessment_1;

public class program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static int findOddDigitSum(int number) {
	     int sum, lastDigit;
	     int number = 1234567;
		for(sum=0; number!=0; number/=10) {
	         lastDigit = number%10;
	         if(lastDigit % 2 != 0)
	             sum += lastDigit;
	     }
	     return;
	 }

	}


