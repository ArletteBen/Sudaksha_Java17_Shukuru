package sudaJava;

import java.util.HashSet;

public class SetExample {
	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		set.add("java");
		set.add("arjun");
		set.add("oracle");
		set.add("java");
		set.add(null);
		set.add("spring");
		System.out.println(set);
		
	}
}
