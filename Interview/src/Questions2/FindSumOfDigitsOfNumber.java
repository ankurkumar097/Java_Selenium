package Questions2;

public class FindSumOfDigitsOfNumber {
	// to find sum of digits of a number
	
	public static void main(String[] args) {
		
		int num =12345;
		
		int rem = 0;
		
		while(num != 0) {
			
			rem = rem + num%10;
			
			num /= 10;
			
		}
		
		System.out.println(rem);
	}

}
