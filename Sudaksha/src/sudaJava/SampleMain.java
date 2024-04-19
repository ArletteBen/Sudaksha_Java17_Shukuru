package sudaJava;

public class SampleMain  {

	public static void main(String[] args) {
		//Parameterized
		/*Sample sam=(a,b)->{
			return a+b;
		};*/
	//int r=sam.display(5, 6);
		//System.out.println("this the abstract method "+r);
		//non-parameterized
	/*	Sample sam=()->{
			System.out.println("this the abstract method ");
		};	
	sam.display();*/
		Sample sam=()->{
			return 5;
		};
		int r=sam.display();
		System.out.println("this the abstract method "+r);
	Sample.hello();
	sam.output();
	sam.input();
	}

	

}
