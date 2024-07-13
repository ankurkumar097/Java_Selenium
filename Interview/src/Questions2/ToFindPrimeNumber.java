package Questions2;

public class ToFindPrimeNumber {
	
	// to find prime number eg. 19 is a prime number, 28 is not
	
	//Conditions: -Natural Number (>1)
	//Which has only 2 multiples ie, 1 and the number itself

	public static void main(String[] args) {
		
		int num = 17;	
		int count =0;		
		if (num>0) {		
			for(int i =1; i<num; i++) {			
				if(num%i == 0) {				
					count++;				
				}			
			}	
			if(count >2) {
				System.out.println("Number is not prime Number");
			}else {
				System.out.println("Number is a prime number");
			}		
		}else {
			System.out.println("Number is negetive and not a prime number");
		}
	}
}
