package OopsConcept;

class ABC{
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC{
	void m1(int a) {                  //method overriding
		System.out.println(a*a);
	}
	void m2(int b) {
		System.out.println(b*b);      //method overriding
	}
	void m2(int a, int b) {                  // method overloading
		System.out.println(a+b);
	}
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		XYZ xyz = new XYZ();
		xyz.m1(10);
		xyz.m2(20);
		xyz.m2(10, 20);

	}

}
