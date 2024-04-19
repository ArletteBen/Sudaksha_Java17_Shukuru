package sudaJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExample {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println("max "+Collections.max(num));
        System.out.println("max "+Collections.min(num));
        System.out.println("isEmpty "+num.isEmpty());
        num.add(60);
        System.out.println(num);
        List<String>fruits=List.of("apple","mango","orange");
        System.out.println("fruits "+fruits);
        fruits.add("lemon");
        Set<Integer>even=Set.of(20,30,40);
        System.out.println("even "+even);
       // even.add(70);
       
		Map<String, Double>map=Map.of("james", 24000.0,"gavin", 35000.0,"anna", 6000.0);
		  System.out.println("map "+map);
		 // map.put("anna", 6000.0);
	}

}
