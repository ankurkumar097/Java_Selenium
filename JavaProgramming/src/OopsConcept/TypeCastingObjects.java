package OopsConcept;

class Parent1{
	String name = "Parent";
	void m1() {
		System.out.println("This is m1 method from Parent class");
	}
}

class Child extends Parent1{
	int id =101;
	void m2() {
		System.out.println("This is m2 method from Child class");
	}
}

public class TypeCastingObjects {

	public static void main(String[] args) {
		//Child c = new Parent1(); not possible
		
		Parent1 p = new Child();
		Child c = (Child) p;
		c.m2();

	}

}
