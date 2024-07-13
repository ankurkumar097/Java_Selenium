package Questions4;

public class StrinIsPalindromeOrNot {

	public static void main(String[] args) {
		// to check if a string is palindrom number or not
		
		String s = "madam";
		String originalString = s;
		String revString = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			revString = revString + s.charAt(i);
		}
		
		//System.out.println(revString);
		
		if(originalString.equals(revString)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not a palindrom");
		}
		
	}

}
