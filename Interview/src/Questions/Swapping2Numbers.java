package Questions;

public class Swapping2Numbers {

	public static void main(String[] args) {
		//a =100 and b=200  after swapping a=200 and b=100
		
		
		//without temporary variable
		int a = 60;
		int b = 20;
		
		a=a+b;                      //a=a*b
		b=a-b;                      //b=a/b
		a=a-b;                      //a=a/b
		
		// 30 , 20
		// 30 , 10
		// 20 , 10
		System.out.println("value of a :" + a);
		System.out.println("value of b :" + b);
		
		
		
		// with temporary variable
		/*int a = 100;
		int b = 200;
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Value of a is: " + a);
		System.out.println("Value of b is: " + b);
		*/
		
	}

}
