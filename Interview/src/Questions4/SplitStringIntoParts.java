package Questions4;

import java.util.Arrays;

public class SplitStringIntoParts {

	public static void main(String[] args) {
		// Split "abc,123@xyz" into 3 parts ie, abc 123 xyz
		
		String s = "abc,123@xyz";
		
		String arr[] = s.split(",");
		System.out.println(Arrays.toString(arr));
		
		String arr2[] = arr[1].split("@");
		System.out.println(arr[0]+ " "+arr2[0]+" "+ arr2[1]);
		
		
		//2nd example
		
		String s1 = "abc123";
		
		String a1[] = s1.split("");
		//System.out.println(Arrays.toString(a1));
		
		a1[5] = "4";
		System.out.println(Arrays.toString(a1));
	}

}
