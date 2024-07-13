package OopsConcept;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		
		mo.sum(11, 22);
		
		mo.sum(10.5, 10);
		
		mo.sum(10, 50.02);
		
		mo.sum(10,20,30);

	}

}
