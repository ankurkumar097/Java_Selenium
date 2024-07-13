package Questions3;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		// To take input from console window in runtime through scanner class
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a int value :");
		int num = sc.nextInt();
		System.out.println("Entered Number is: "+ num);
		
		System.out.println("Enter a Double value: ");
		double d =sc.nextDouble();
		System.out.println("Enter Double is: "+ d);
		
		System.out.println("Enter a String value: ");
		String s = sc.next();
		System.out.println("Entered String is: "+s);
		
		System.out.println("Enter an Object value: ");
		Object o = sc.next();
		System.out.println("Entered value is: "+ o);
		
	}
}
