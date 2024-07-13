package Questions3;

import java.util.Arrays;

public class SortingOfElementInArray {

	public static void main(String[] args) {
		// To sort elements of an array
		
		int a[]= {50,30,20,80,60};	
		System.out.println(Arrays.toString(a));	
		Arrays.sort(a);		
		System.out.println(Arrays.toString(a));
		
		// for string values
		
		String s[]= { "abc", "pqr","efg", "Lkd", "emp"};
		
		Arrays.sort(s);
		
		System.out.println(Arrays.toString(s));
	}

}
