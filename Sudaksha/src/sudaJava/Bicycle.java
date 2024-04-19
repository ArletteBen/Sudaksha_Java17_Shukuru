package sudaJava;

public  class Bicycle extends Bus{

	public static void main(String[] args) {
		Bicycle bi=new Bicycle();
		bi.wheels();
		bi.engines();

	}
    @Override
	public void wheels() {
		System.out.println("A bicycle has 2 wheels");
		
	}
    @Override
    public void engines() {
    	System.out.println("A bicycle has no engine");
    }
}
