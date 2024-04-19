package sudaJava;

public record Customer(int code, String name) {
public Customer{
	System.out.println("this is simple constructor");
}

public int code() {
	return code;
}

public String name() {
	return name;
}

}
