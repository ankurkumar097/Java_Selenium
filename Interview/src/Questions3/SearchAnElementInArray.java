package Questions3;

public class SearchAnElementInArray {

	public static void main(String[] args) {
		// to search an Element in an array
		
		int a[] = {10,20,30,40,50};
		int search_element = 56;
		boolean status = false;
		
		for(int x : a) {
			if(x== search_element) {
				System.out.println("Elelemt Found");
				status = true;
				break;
			}
		}
		if(status == false) {
			System.out.println("Element not found");
		}
	}
}
