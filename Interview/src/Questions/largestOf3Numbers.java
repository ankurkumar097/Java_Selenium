package Questions;

public class largestOf3Numbers {

	public static void main(String[] args) {
		//to find largest of 3 numbers
		
		int a=10, b=40, c=30;
		
		if(a>b && a>c) {
			System.out.println("A is largest");
		}else if(b>a && b>c){
			System.out.println("B is largest");
		}else {
			System.out.println("C is largest");
		}
	}

}
