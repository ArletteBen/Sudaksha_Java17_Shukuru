package sudaJava;

public non-sealed class Bus implements Vehicle {

	public static void main(String[] args) {
	Bus b=new Bus();
	b.wheels();
	b.engines();

	}

	@Override
	public void wheels() {
	System.out.println("A bus has 6 wheels");
		
	}

	@Override
	public void engines() {
		System.out.println("A bus has 1 engine");
	}

}
