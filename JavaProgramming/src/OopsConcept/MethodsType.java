package OopsConcept;

public class MethodsType {
	
	//1st Method - No parameter & no return Value
	void m1(){
		System.out.println("Hello");
	}
	
	// 2nd Method - No parameter & return a value
	String m2() {
		return ("welcome to java");
	}
	
	//3rd Method - Takes parameter and No return value
	void m3(String name) {
		System.out.println(name);
	}
	
	//4th Method - takes parameter an Returns value
	String m4(String name) {
		return name;
	}
}
