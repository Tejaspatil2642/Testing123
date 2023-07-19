package Assessment_1;

public class program4 {

	public static void main(String[] args) {
  // Implement a program to return number of vowels present in the given string
		String s = " tejas";
		int count =0;
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)== 'a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u')
		{
			count++	;
			}
		}
		System.out.println("number of vowels present in the string:-"+count);

	}

}
