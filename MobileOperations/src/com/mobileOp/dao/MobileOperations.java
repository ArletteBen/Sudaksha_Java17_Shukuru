package com.mobileOp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class MobileOperations {
	List<String>models=new ArrayList<String>();
	HashMap<String, List<String>> mobmap =new HashMap<String, List<String>>();
	
public void addMobile(String brand, String model) {
	if(mobmap.containsKey(brand)) {
		mobmap.get(brand).add(model);
	}else {
		models=new ArrayList<String>();
		models.add(model);
		mobmap.put(brand, models);
	}
	
	Set<Entry<String, List<String>>> set=mobmap.entrySet();
	Iterator<Entry<String, List<String>>> itr=set.iterator();
	while(itr.hasNext()) {
		System.out.println("Mobiles in store with their models "+itr.next());
	}
	System.out.println("Mobile added successfully");
}
public void getMobile(String brand) {
	if(mobmap.containsKey(brand)) {
		System.out.println("Phone models "+mobmap.get(brand));
	}else {
		System.out.println("brand does not exist");
	}
	
}
public void buyMobile(String brand, String model) {
	if(mobmap.containsKey(brand)) {
		if(!mobmap.get(brand).isEmpty()) {
			if(mobmap.get(brand).contains(model)) {
				mobmap.get(brand).remove(model);
				System.out.println("brand purchased successfully, the remaining models for this brand are "+mobmap.get(brand));
			}else {
				System.out.println("Model does not exist");
			}
		}else {
			mobmap.remove(brand);
		}	
	}else {
		System.out.println("the given brand does not exist");
	}
}
}
