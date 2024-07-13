package Questions;

public class SkipSomeNumberFrom1to10 {

	public static void main(String[] args) {
		// skip 3,5&9 from 1 to 10
		
		for (int i =1;i<=10 ; i++) {
			if (i==3 || i ==5 || i == 9) {
				continue;
			}
			System.out.println(i);
		}
	}
}
