package sudaJava;

public class Box<T>{
T t;
public void setT(T t) {
	this.t=t;
}
public T getT() {
	return t;
}
public class GenericClassSingleType{
	public static void main(String[] args) {
		Box<Integer>box=new Box<>();
	box.setT(50);
	System.out.println(box.getT());
	Box<String>sBox=new Box<>();
	sBox.setT("Shukuru");
	System.out.println(sBox.getT());
	}
}
}
