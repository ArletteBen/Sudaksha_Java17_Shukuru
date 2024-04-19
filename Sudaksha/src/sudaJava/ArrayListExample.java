package sudaJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
    list.add("java");
    list.add("james");
    list.add("java");
    list.add(null);
    System.out.println(list+" "+list.size());
    list.add("spring");
    list.add(1,"oracle");
    System.out.println(list+" "+list.size());
    list.remove("java");
    System.out.println(list+" "+list.size());
    Iterator<String> itr=list.listIterator();
    while(itr.hasNext())
    	System.out.println(itr.next());
    for(String str:list)
    	System.out.println(str);
    list.forEach((s)->System.out.println(s));
	}

}
