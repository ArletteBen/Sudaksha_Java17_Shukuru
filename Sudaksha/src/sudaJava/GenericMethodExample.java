package sudaJava;

public class GenericMethodExample {
public static <E> void printArray(E[] inputArr) {
	for (E element :inputArr)
		System.out.println(element+" ");
}
public static void main(String[] args) {
	Integer[] intArr= {10,20,30,40,50};
	Double[] doubArr={10.1,20.0,30.2,40.3,50.9};
	String[] strArr={"aa","bb","cc","dd"};
	Character[] charArr={'a','b','c','d'};
	System.out.println("integer array elements ");
	printArray(intArr);
	System.out.println("double array elements ");
	printArray(doubArr);
	System.out.println("string array elements ");
	printArray(strArr);
	System.out.println("character array elements ");
	printArray(charArr);
}
}
