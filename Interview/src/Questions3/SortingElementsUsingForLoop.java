package Questions3;

import java.util.Arrays;

public class SortingElementsUsingForLoop {

	public static void main(String[] args) {
		// to sort values of an array at descending order in an array
		
		int a[]= {60,40,10,80,30,90,20};		
		int temp =0;
		
		for(int i =0; i<a.length-1; i++) {
			if(a[i] > a[i+1]) {
				temp= a[i];	
				a[i]= a[i+1];
				a[i+1] = temp;
				i=-1;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
