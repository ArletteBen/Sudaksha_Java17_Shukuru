package sudaJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateSimpleExample {
public static void main(String [] args) {
	Predicate<String> pred=t->t.length()>5;
	String str="Successfully";
	System.out.println(pred.test(str));
	
	List<String> list=new ArrayList<>();
	list.add("Successfully");
	list.add("easy");
	list.add("fortune");
	List<String> ls=list.stream().filter(pred).collect(Collectors.toList());
	System.out.println(ls);
}
}
