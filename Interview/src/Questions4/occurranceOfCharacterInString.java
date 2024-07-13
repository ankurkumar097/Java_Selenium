package Questions4;

public class occurranceOfCharacterInString {

	public static void main(String[] args) {
		// to count how many times a character is occuring in a string
		
		String s = "abcabcaaabbccc";
		String toRepleace ="b";
		int originalLength = s.length();
		String newS= s.replaceAll(toRepleace, "");
		int newLength = newS.length();
		System.out.println("Number of time a Repeted is :"+ (originalLength - newLength));
		

	}

}
