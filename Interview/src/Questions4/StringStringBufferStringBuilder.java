package Questions4;

public class StringStringBufferStringBuilder {

	public static void main(String[] args) {
		// working of all3 is same but difference is in memory allocation
		// 1 String - Immutable
		
		String s = new String("Welcome");
		String s1 = s.concat("to java");
		System.out.println(s);
		System.out.println(s1);
		
		//2 StringBuffer - Mutable
		
		StringBuffer sb = new StringBuffer("Welcome");
		sb.append("to java");
		System.out.println(sb);
		
		// StringBuilder - Mutable
		
		StringBuilder sd = new StringBuilder("welcome");
		sd.append("to java");
		System.out.println(sd);

	}

}
