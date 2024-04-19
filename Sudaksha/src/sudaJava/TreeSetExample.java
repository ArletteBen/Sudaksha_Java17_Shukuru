package sudaJava;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String>set=new TreeSet<String>();//it sorts the list and the priority is capital like Java and it accepts unique values
		set.add("Java");
		set.add("arjun");
		set.add("oracle");
		set.add("java");
		//set.add(null);
		set.add("spring");
		System.out.println(set);

	}

}
