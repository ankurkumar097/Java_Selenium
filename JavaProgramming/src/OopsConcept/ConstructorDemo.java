package OopsConcept;

public class ConstructorDemo {
	// 2 types of constructor Default and parameterized, we can create n number of constructors in a class just by changing number, Datatype and order of arguments
	
	int x,y;
	
	ConstructorDemo(){  // Default Constructor
		x=100;
		y=200;
	}
	
	ConstructorDemo(int a, int b){  // parameterized constructor
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println(x+y);
	}
}
