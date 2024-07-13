package Questions4;

public class StringMethods {

	public static void main(String[] args) {
		// Different String methods available to variable of string class
		
		//Initialization of String:
		
		String s = "welcome";
		//String s1 = new String("welcome");
		
		// 1- length(); - to find length of a String
		System.out.println(s.length());
		System.out.println("welcome".length());
		
		// 2- concat(); - to join 2 string
		String s1 = "welcome";
		String s2 = "to java";
		String s3 = "automation";
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		
		System.out.println("welcome" + "to java".concat("automation"));
		
		// 3- trim() - to remove spaces from right and left side
		s= "   welcome   ankur kumar";
		System.out.println(s);
		System.out.println(s.trim());
		
		// 4- charAt() - returns character from string based on indexc
		s= "Ankur Kumar";
		System.out.println(s.charAt(6));
		
		// 5- contains() - if one string is present inside another main string, it will return boolean value
		s= "Ankur Kumar";
		System.out.println(s.contains("r K"));
		
		// 6- equals(); equalsignoreCase();  - to compare Strings, it will return boolean value, equalsIgnoreCase() -it will ignore case sensitivity
		String name1 = "Ankur Kumar";
		String name2 = "Ankur";
		
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals("ankur"));
		System.out.println(name1.equalsIgnoreCase("ankur"));
		
		// 7- replace(); - will replace a character or a string from a string
		s = "Welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('s', 'a'));
		System.out.println(name1.replace('r', 's'));
		
		String name = "Ankur Kumar";
		//name.replace('r', 's');
		System.out.println(name.replaceAll("mar","mas"));
		
		// 8- substring - it will extract substring from main string with the hwlp of index
		s = "welcome";
		System.out.println(s.substring(0, 3));
		
		// 9- toUpperCase(); toLowerCase(); - convert entire string to upper case and lower case
		s= "welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		// 10- split(); to split the string into multiple parts based on delimeter
		s ="abc@gmail.com";
		String arr[] = s.split("@");
		System.out.println(arr[0] + arr[1]);

	}

}
