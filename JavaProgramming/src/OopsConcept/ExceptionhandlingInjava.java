package OopsConcept;

import java.util.Scanner;

public class ExceptionhandlingInjava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// arithmetic exception
		
		/*System.out.println("Enter a number: ");
		try {
		int num = sc.nextInt();
		System.out.println(100/num);
		}
		catch(Exception e){
			System.out.println("Enter correct value");
		}*/
		
		// null pointer exception
		
		String s = null;
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("Catch block handled enter correct value");
			System.out.println(e);
		}
		finally {
			System.out.println("You enter into finally block");
		}
		
		
		
		System.out.println("Programe Stopped");

	}

}
