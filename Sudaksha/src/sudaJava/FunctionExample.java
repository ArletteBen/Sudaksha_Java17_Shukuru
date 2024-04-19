package sudaJava;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		//Function functional interface
		//String to Integer
	Function<String,Integer>strToInt=x->Integer.valueOf(x);
    System.out.println("StringToInt="+strToInt.apply("567"));
    int x1=strToInt.apply("100");
    System.out.println(x1+50);
    //sq. root value
    Function<Integer,Double>sqrt=sq->Math.sqrt(sq);
    System.out.println("sq. root="+sqrt.apply(9));
	}

}
