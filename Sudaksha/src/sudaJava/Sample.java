package sudaJava;

public interface Sample {
//int display(int x, int y);
//void display();
int display();
default void output() {
	System.out.println("this is a default method");
}
static void hello() {
	System.out.println("this is a static method");
}
default void input() {
	System.out.println("this is another default method");
}
}
