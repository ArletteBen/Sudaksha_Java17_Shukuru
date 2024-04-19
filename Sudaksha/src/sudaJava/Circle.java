package sudaJava;

public class Circle extends Shape{
/*public static void main(String[] args) {
	Circle c=new Circle(2.5,3.5,4.5);
	c.area();
}
*/	public Circle(double length, double breadth, double radius) {
		super(length, breadth, radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area() {
	System.out.println("The area of the circle is "+3.14*radius*radius);
		
	}

}
