package OopsConcept.CollectionsInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// Declaring
		
		//HashMap hm = new HashMap();
		//Map hm1 = new HashMap();
		
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "john");
		hm.put(102, "harry");
		hm.put(103, "Marry");
		hm.put(102, "David");
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		// to get all key data
		System.out.println(hm.keySet());
		
		//to get all value
		System.out.println(hm.values());
		
		// to get bot key and value from hm
		System.out.println(hm.entrySet());
		
		//to get a vsalue based on key
		Object x = hm.get(103);
		System.out.println(x);
		
		//reading data from hashmap
		for(Entry<Integer, String> k : hm.entrySet()) {
			System.out.println(k + hm.get(k));
		}
		
		// using iterator
		
		Iterator<Entry<Integer, String>> it =hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			
			System.out.println(entry.getKey()+ entry.getValue());
		}
		
		hm.clear();
		
		
		
	}

}
