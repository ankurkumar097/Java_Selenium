package OopsConcept;

class Parent{
	void m1(int x) {
		System.out.println(x);
	}
}

class Child1 extends Parent{
	void m2(int y) {
		System.out.println(y);
	}
}

class Child2 extends Parent{
	void m3(int z) {
		System.out.println(z);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.m1(10);
		
		Child1 ch1= new Child1();
		ch1.m1(100);
		ch1.m2(200);
		
		Child2 ch2 = new Child2();
		ch2.m1(1000);
		ch2.m3(2000);

	}

}
