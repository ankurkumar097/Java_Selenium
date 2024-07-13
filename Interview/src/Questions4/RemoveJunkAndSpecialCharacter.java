package Questions4;

public class RemoveJunkAndSpecialCharacter {

	public static void main(String[] args) {
		// to remove junk and special characters from a string
		
		String s = "wel#$#fvf%^%VF5766@65&+";
		String s1 =s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}
}
