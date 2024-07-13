package Questions3;

import java.util.Arrays;

public class FindMissingNumberInArray {
	// to find missing number in an array
	// condition - should be in range, should not have duplicates
	
	public static void main(String[] args) {
		
		int a[] = {1,4,2,3,6};
		Arrays.sort(a);
		
		int largestVal = a[a.length-1];		
		int expectedSum = (largestVal*(largestVal+1))/2;		
		int actualSum = 0;		
		int missingNum = 0;
		
		for(int i =0; i<=a.length -1; i++) {
			actualSum += a[i];
		}
		if(actualSum == expectedSum) {
			System.out.println("No missing number");
		}else {
			missingNum = expectedSum - actualSum ;
		}
		System.out.println("Missing number is: "+ missingNum);
	}
}
