package Questions3;

import java.util.Arrays;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		// to find lowest number in an array
		
		int a[]= {20,10,40,60};
		/*
		Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		
		System.out.println(a[0]);
		*/
		
		int min = a[0];
		
		for(int i =1; i<=a.length-1;i++) {
			if(a[i]< min ) {
				min = a[i];
			}
		}
		System.out.println(min);	
	}
}
