package Questions2;

public class ReverseAnumber {
	public static void main(String[] args) {
		// to reverse a number eg. 12345 output 54321
		
		int num = 84395;
		
		int revNum = 0;
		
		while(num != 0) {
            revNum = revNum*10 + num %10;
			num /= 10;
		}
		System.out.println(revNum);
	}
}
