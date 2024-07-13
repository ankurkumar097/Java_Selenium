package Questions;

public class SmallestOf3Number {

	public static void main(String[] args) {
		// to find smallest of 3 numbers
		
		int a =10;
		int b = 20;
		int c =30;
		
		if(a<b && a<c) {
			System.out.println("A is smallest Number :" + a);
		}else if(b<a && b<c) {
			System.out.println("B is smallest number :"+ b);
		}else {
			System.out.println("C is smallest :"+ c );
		}

	}

}
