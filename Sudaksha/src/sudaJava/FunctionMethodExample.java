package sudaJava;

import java.util.function.Function;

public class FunctionMethodExample {
	public static void main(String[] args) {
		Function<Integer,Double> half=a->a/2.0;
		System.out.println("using apply():"+half.apply(10));
		//use andThen()to get the result
		half=half.andThen(a->3*a);
		System.out.println("using andThen():"+half.apply(10));
		try {
		half=half.andThen(null)	;
		System.out.println(half.apply(10));
		}catch(Exception e) {
			System.out.println("Exception thrown while passing null value");
		}
	}
}
