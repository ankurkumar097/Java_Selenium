package OopsConcept.CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListInJava {
	public static void main(String[] args) {
		
		//Declaring an ArrayList
		ArrayList myList = new ArrayList();
		//List myList1 = new ArrayList();
		//ArrayList<String> myList2 = new ArrayList<String>();
		
		//Adding values to array list
		myList.add(100);
		myList.add(10.5);
		myList.add("welcome");
		myList.add('A');
		myList.add(true);
		myList.add(100);
		myList.add(null);
		myList.add(null);
		
		//printing values
		System.out.println(myList);
		
		//size of an array list
		System.out.println(myList.size());
		
		//removing an element from an array list
		myList.remove(5);
		System.out.println(myList);
		
		//inserting element in arrayList
		myList.add(2, "Java");
		System.out.println(myList);
		
		//modify or replace an element from an array list
		myList.set(2,"python");
		System.out.println(myList);
		
		System.out.println(myList.get(3));
		
		//reading all elements from an array list
		// using for loop
		/*for(int i =0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}*/
		
		//using enhanced for loop
		/*for(Object y:myList) {
			System.out.println(y);
		}*/
		
		//uisng Iterator
		Iterator it = myList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println(myList.size());
		
		System.out.println(myList.isEmpty());
		
		//remove random elements from an arrayList
		
		ArrayList myList2 = new ArrayList();
		myList2.add(100);
		myList2.add("welcome");
		
		myList.removeAll(myList2);
		System.out.println(myList);
		
		
		myList.clear();
		
	}

}
