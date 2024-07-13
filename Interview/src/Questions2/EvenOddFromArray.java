package Questions2;

public class EvenOddFromArray {
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,4,5,3,5};
		int countEven=0;
		int countOdd=0;
		
		for (int i=0; i<a.length ; i++) {
			if (a[i] % 2 == 0) {
				countEven ++;
			}else {
				countOdd++;
			}
		}
		System.out.println("Even Number :" + countEven);
		System.out.println("Odd Number :" + countOdd);
	}

}
