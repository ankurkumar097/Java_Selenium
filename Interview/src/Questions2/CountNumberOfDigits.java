package Questions2;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// To count number of digits in a Number
		
		int num =75766654;
		
		int count = 0;
		
		while(num!=0) {
			
			num /= 10;
			
			count ++;
		}
		
		System.out.println("Number of Digits: " +count);

	}

}
