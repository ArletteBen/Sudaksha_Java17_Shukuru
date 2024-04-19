package sudaJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
	List<Persons>lst=new ArrayList<Persons>();
	lst.add(new Persons(1,"a"));
	lst.add(new Persons(2,"b"));
	lst.forEach((e)->{System.out.println(e);
		});
	
		Consumer<Persons> cons=(person)->{
			System.out.println(person.getName());
			System.out.println(person.getCode());
		};
		cons.accept(new Persons(3,"c"));
	}

}
