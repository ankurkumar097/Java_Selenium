package OopsConcept.CollectionsInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//Declaration
		
		HashSet mySet = new HashSet();
		//Set mySet = new HashSet();
		//HshSet<String> mySet = new HashSet <String>();
		
		mySet.add(100);
		mySet.add(10.5);
		mySet.add("welcome");
		mySet.add(true);
		mySet.add('a');
		mySet.add(100);
		mySet.add(null);
		mySet.add(null);
		
		System.out.println(mySet);
		System.out.println(mySet.size());
		
		mySet.remove(10.5);
		System.out.println(mySet);
		
		// converting hash map to arrayList to get the values from hashset
		
		ArrayList ar = new ArrayList(mySet);
		System.out.println(ar.get(2));
		
		//using enhanced for loop
		for(Object y:mySet) {
			System.out.println(y);
		}
				
		//uisng Iterator
		Iterator it = mySet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		mySet.clear();
		
		
		
	}

}
