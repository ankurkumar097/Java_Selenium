package OopsConcept;

public class DataConversionUsingWrapperClass {
	public static void main(String[] args) {
		
		//String s = "welcome";
		
		String s = "123872";
		int sint = Integer.parseInt(s);	
		System.out.println(sint);
		
		String s1 = "10.5";
		String s2 = "20.5";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		
		String b = "true";
		System.out.println(Boolean.parseBoolean(b));
		
		
		// primitive to string
		
		int a = 10;
		double d = 44.5;
		char c= 'C';
		boolean b1 = false;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(b1));
		
	}


}
