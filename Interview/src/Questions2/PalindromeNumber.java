package Questions2;

public class PalindromeNumber {
	// palindrome Number eg 12321 palindrome num =12321, yes its a palindrome number
	
	public static void main(String[] args) {
		
		int num = 123454321;
		int originalNum = num;
		int revNum = 0;
		
		while(num != 0) {
            revNum = revNum*10 + num %10;
			num /= 10;
		}
		
		if (originalNum == revNum) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a palindrome Number");
		}
	}
}
