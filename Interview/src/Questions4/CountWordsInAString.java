package Questions4;

import java.util.Scanner;

public class CountWordsInAString {

	public static void main(String[] args) {
		// eg "welcome to java selenium" words - 4
		
		String s ="welcome to java selenium";
		String arr[] = s.split(" ");
		
		int length = arr.length;
		System.out.println("Number of words in String is "+ length);
		
		
		//without split method
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Statement :");
		String s2 = sc.nextLine();                    // welcome to java
		int count =1;
		
		for(int i =0; i<=s2.length()-1;i++) {
			if((s2.charAt(i)== ' ') && (s2.charAt(i+1)!= ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in Statement is: "+count);
	}

}
