package Questions2;

public class SumOfElementInArray {

	public static void main(String[] args) {
		// to find sum of elements in an array
		
		int a[] = new int[6];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		
		// int a[] = {1,2,3,4,5}
		//System.out.println(a.length);
		
		int sum = 0;
		
		for(int i =0; i<a.length; i++) {
			
			sum += a[i];
			
		}
		
		System.out.println(sum);

	}

}
