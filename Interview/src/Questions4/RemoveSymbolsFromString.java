package Questions4;

public class RemoveSymbolsFromString {

	public static void main(String[] args) {
		// to remove symbols from a String
		String price = "$15,20,55";
		System.out.println(price.replace("$", "").replace(",", ""));

	}

}
