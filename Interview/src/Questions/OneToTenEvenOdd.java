package Questions;

public class OneToTenEvenOdd {

	public static void main(String[] args) {
		// i have to print one to 10 and provide even odd against each value
		
		int i = 1;
		
		while (i <= 10) {
			if (i%2 == 1) {
				System.out.println(i +": Odd Value");
			}else if( i%2 == 0 ) {
				System.out.println(i +": Even Value");
			}
			i++;
		}
	}
}
