package sudaJava;

public class GenericRecordMain {

	public static void main(String[] args) {
	Pair<String,Integer>pair=new Pair<>("arjun",450);
    System.out.println(pair);
    System.out.println(pair.key()+" "+pair.value());
    pair.display();
	}

}
