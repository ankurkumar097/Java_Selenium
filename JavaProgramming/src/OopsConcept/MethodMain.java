package OopsConcept;

public class MethodMain {

	public static void main(String[] args) {
		
		MethodsType gr = new MethodsType();
		
		gr.m1();  //1
		
		String s = gr.m2();   //2
		System.out.println(s);
		
		gr.m3("Selenium");   //3
		
		System.out.println(gr.m4("Automation testing"));
		
	}
}
