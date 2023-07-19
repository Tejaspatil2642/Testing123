package Array;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// declare an array
    int a[][]=new int [3][2];
    // insert values into an array
    a[0][0]=100;
    a[0][1]=200;
    
    a[1][0]=300;
    a[1][1]=400;
    
    a[2][0]=500;
    a[2][1]=600;
    
    System.out.println(a[0][0]);
    System.out.println(a[0][1]);
    System.out.println(a[1][0]);
    System.out.println(a[1][1]);
    System.out.println(a[2][0]);
    System.out.println(a[2][1]);
    
    
    //print size of an array
    //print number of rows
    System.out.println("number of rows in array:-"+a.length);
    System.out.println("number of coloum in array:-"+a[0].length);
    
    
    //print using nested for loop
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[i].length;j++) {
    		System.out.println(a[i][j]);
    	}
    }
    
    
    
    
    
    
	}

}
