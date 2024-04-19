package sudaJava;

public non-sealed class ClassTwo implements Two{

	public static void main(String[] args) {
		ClassTwo two=new ClassTwo();
        two.methodOne();
        two.methodTwo();
	}

	@Override
	public void methodOne() {
	System.out.println("from methodOne from class ClassTwo");
		
	}

	@Override
	public void methodTwo() {
		System.out.println("from methodTwo  from class ClassTwo");
		
	}

}
