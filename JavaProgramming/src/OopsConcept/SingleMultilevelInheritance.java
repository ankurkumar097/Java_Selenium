package OopsConcept;

class A{
	int a;
	void print(){
		System.out.println(a);
	}
}

class B extends A{
	int b;
	void display() {
		System.out.println(b);
	}
}

class C extends B{
	int c;
	void show(){
		System.out.println(c);
	}
}


public class SingleMultilevelInheritance {

	public static void main(String[] args) {
		A aobj = new A();
		aobj.a=10;
		aobj.print();
		
		B bobj = new B();
		bobj.a=100;
		bobj.b=200;
		bobj.print();
		bobj.display();
		
		C cobj = new C();
		cobj.a=1000;
		cobj.b=2000;
		cobj.c=3000;
		cobj.print();
		cobj.display();
		cobj.show();

	}

}
