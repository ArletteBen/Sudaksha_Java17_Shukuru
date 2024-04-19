package sudaJava;

public non-sealed class AeroPlane implements Vehicle{

	public static void main(String[] args) {
		AeroPlane a=new AeroPlane();
		a.wheels();
		a.engines();

	}

	@Override
	public void wheels() {
		System.out.println("An aeroplane has wheels");
		
	}

	@Override
	public void engines() {
		System.out.println("An aeroplane has engines");
		
	}

}
