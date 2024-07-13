package OopsConcept;

interface interfaceDemo{
	
	int length = 10;   // final and static
	int width = 20;    // final and static
	
	void circle();
	
	default void square() {
		System.out.println("this is square method from interface -default method");
	}
	
	static void rectangle() {
		System.out.println("this is rectangle method from interface - static method");
	}
	default void square1() {
	}
}

public class IntrfaceDemoMain implements interfaceDemo{
	
	public void circle() {
		System.out.println("this si implementation of abstract class from interface");
	}
	
	void triangle(){
		System.out.println("this is a default method from class");
		IntrfaceDemoMain ih = new IntrfaceDemoMain();
		ih.circle();
	}
	
	public static void main(String[] args) {
		
		IntrfaceDemoMain id = new IntrfaceDemoMain();
		id.square();
		interfaceDemo.rectangle();
		id.circle();
		id.triangle();
		
		interfaceDemo i = new IntrfaceDemoMain();
		i.circle();
		

	}
}


