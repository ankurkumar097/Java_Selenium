package Questions3;

import java.util.Arrays;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// to find largest number in array
		
		int a[] = {2,4,6,1,7};
		int temp = 0;
		
		for (int i = 0; i<a.length-1; i++) {
			if(a[i] > a[i+1]) {
				temp = a[i];
				a[i]=a[i+1];
				a[i+1] = temp;
				i= -1;
			}
		}
		//System.out.println(Arrays.toString(a));
		//Arrays.sort(a);
		System.out.println(a[a.length-1]);
	}
}
