package sudaJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
	BiPredicate<String,String>bi=(s1,s2)->s1.equals(s2);
    System.out.println(bi.test("aaa", "bbb"));
    
    BiFunction<Persons,Persons,String>bif=(p1,p2)->{
    	return p1.getName()+p2.getName();
    };
    System.out.println(bif.apply(new Persons(4,"an"), new Persons(5,"ita")));
    
    BiFunction<Integer,Integer,Integer>add=(p1,p2)->{
    	return p1+p2;
    };
    System.out.println("add="+add.apply(3, 2));
    
    //create the first list
    List<Integer> lista=new ArrayList<Integer>();
    lista.add(2);
    lista.add(1);
    lista.add(3);
    
    //Create the second list
    List<Integer> listb=new ArrayList<Integer>();
    listb.add(4);
    listb.add(1);
    listb.add(5);
    
    //Biconsumer to compare both lists
    BiConsumer<List<Integer>,List<Integer>> equals=(list1,list2)->{
    	if(list1.size()!=list2.size()) {
    		System.out.println("False:size not equal");
    	}else {
    		for(int i=0;i<list1.size();i++) {
    			if(list1.get(i)!=list2.get(i)) {
    				System.out.println("False:values not equal");
    				return;
    			}
    		}
    		System.out.println("True");
    	}
    };
    equals.accept(lista, listb);
	}

}
