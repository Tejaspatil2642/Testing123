package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add('X');
		al.add('Y');
		al.add('Z');
		al.add('A');
		al.add('B');
		al.add('C');
		
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		
	
		// sort --> collections.sort()
		
		System.out.println("Elements before sorting:"+al);
		
		Collections.sort(al);
		
		System.out.println("Elements after sorting:"+al);
		
		//shuffle --> collections.shuffle()
		System.out.println("Elements before shuffle:"+al);
		Collections.shuffle(al);
		System.out.println("Elements after shuffle"+al);

	}

}
