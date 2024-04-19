package sudaJava;

public non-sealed class ClassOne implements One {

	public static void main(String[] args) {
		ClassOne one=new ClassOne();
		one.methodOne();
	}

	@Override
	public void methodOne() {
		System.out.println("from methodOne()");
	}

}
