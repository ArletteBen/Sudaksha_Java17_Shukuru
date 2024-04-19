package sudaJava;

import java.util.function.Supplier;

public class SupplierExample {
public static void main(String[] args) {
	int m=10;
	Supplier<Integer> sup=()->{
		return m+5;
	};
	System.out.println("supplier: "+sup.get());
	Supplier<Persons> per=()->{
		return new Persons(101,"arjun");
	};
	System.out.println("supplier: "+per.get());
}
}
