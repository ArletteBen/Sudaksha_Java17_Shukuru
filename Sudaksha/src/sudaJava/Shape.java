package sudaJava;

abstract class Shape {
protected double length;
protected double breadth;
protected double radius;
public Shape(double length, double breadth, double radius) {
	this.length = length;
	this.breadth = breadth;
	this.radius = radius;
}
abstract void area();
}
