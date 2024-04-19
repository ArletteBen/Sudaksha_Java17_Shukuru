package sudaJava;

public record Student(int id, String name, int marks) {
static String group="CSE";

public int id() {
	return id;
}

public String name() {
	return name;
}

public int marks() {
	return marks;
}
 
}
