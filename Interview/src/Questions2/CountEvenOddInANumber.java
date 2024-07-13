package Questions2;

public class CountEvenOddInANumber {
	// to count even and odd digits in a number  eg. num = 35465764 output: 4 even and 4 odd
	
	public static void main(String[] args) {
		
		int num = 875764579;
		int countEven = 0;
		int countOdd =0;
		int rem =0;
		
		while (num != 0) {	
			rem = num % 10;	
			num /= 10;
			
			if(rem%2 == 0) {	
				countEven ++;
			}else {
				countOdd ++;
			}
		}
		System.out.println("Even Number :"+ countEven);
		System.out.println("Odd Number :"+ countOdd);
	}
}
