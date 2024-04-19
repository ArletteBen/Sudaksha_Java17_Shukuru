package sudaJava;

public class Rectangle extends Shape {
	/*public static void main(String[] args) {
	Rectangle r=new Rectangle(2.5,3.5,4.5);	
	r.area();
	}*/
	public Rectangle(double length, double breadth, double radius) {
		super(length, breadth, radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area() {
	System.out.println("the area of a rectangle is "+length*breadth);
		
	}

}
