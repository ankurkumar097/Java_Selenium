package Questions3;

public class NumOfRepeatations {

	public static void main(String[] args) {
		// To find number of repetition of an element in an array
		
		int a[] = {10,20,10,10,20};
		int search_element = 20;
		int count = 0;
		
		for(int x : a) {
			if(x == search_element) {
				count++;
			}
		}
        System.out.println(count);
	}
}
