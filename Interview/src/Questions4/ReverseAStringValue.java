package Questions4;

import java.util.Arrays;

public class ReverseAStringValue {

	public static void main(String[] args) {
		// to reverse a given String value , eg, s -"welcome" output - "emoclew"
		// 1st approach
		
		String s = "Ankur Kumar";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		
		// 2nd approach
		
		String s1 = "interview";
		char s2[] = s1.toCharArray();
		String rev1 = "";
		
		for(int i = s2.length-1; i>=0; i--) {
			rev1 = rev1 + s2[i];		
		}
		System.out.println(rev1);
		
		// 3rd approach
		
		StringBuffer b = new StringBuffer("welcome");
		System.out.println(b.reverse());
		
		// 4th approach
		StringBuilder d = new StringBuilder("welcome1");
		System.out.println(d.reverse());
		
	}
}
