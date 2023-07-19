package Assessment_1;

public class program_2 {
//	Given an integer n, perform the following conditional actions,
//	if n is odd, print weird,
//	if n is even and in the inclusive range of 2 to 5, print Not Weird.
//	if n is even and in the inclusive range of 6 to 20, print Weird.
//	if n is even and greater than 20, print Not Weird.


	public static void main(String[] args) {
		int N =16;
		 if(N%2==0 && N>=2 && N<=5) {
			System.out.println("not weired");
		}
		else if(N%2==0 && N>=6 && N<=20) {
			System.out.println("Weired");
		}
		else {
			System.out.println("n is odd -> weired");
		}
	
		
	
	

}
}