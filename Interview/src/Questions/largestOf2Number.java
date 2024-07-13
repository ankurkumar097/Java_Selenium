package Questions;

public class largestOf2Number {

	public static void main(String[] args) {
		// largest of 2 number
		
		int a = 10;
		int b = 20;
		
		int x = (a>b) ? a : b;
		System.out.println(x);
		
		
		//2nd method
		if (a>b) {
			System.out.println("A is grater than B");
		}else {
			System.out.println("B is greater than A");
		}

	}

}
