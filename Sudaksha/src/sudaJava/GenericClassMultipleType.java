package sudaJava;

public class GenericClassMultipleType {

	public static void main(String[] args) {
		Book<Integer,String> book =new Book<>();
		book.setT(1);
		book.setS("shukuru");
        System.out.println("the book number is "+book.getT() +" and the author is "+book.getS());
        
        Book<Integer,Double> book2 =new Book<>();
        book2.setT(1);
        book2.setS(2.5);
        System.out.println("integer is "+book2.getT() +" and double "+book2.getS());
	}

}
