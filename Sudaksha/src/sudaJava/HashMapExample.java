package sudaJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Double>map=new HashMap<String, Double>();
		map.put("james", 24000.0);
		map.put("gavin", 35000.0);
		map.put("james", 6000.0);
		map.put("arjun", 6000.0);
		System.out.println(map);
		Set<Entry<String, Double>> set=map.entrySet();
		Iterator<Entry<String,Double>> itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
