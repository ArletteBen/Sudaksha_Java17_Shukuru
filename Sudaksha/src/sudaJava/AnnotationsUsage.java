package sudaJava;

import java.util.ArrayList;
import java.util.Date;

public class AnnotationsUsage {
@SuppressWarnings({"rawtypes","unchecked"})
	public static void main(String[] args) {
		ArrayList lst=new ArrayList();
lst.add("tomato");
lst.add("sauce");
lst.add("ketchup");

Date today=new Date();
Date tomorrow=new Date(2024,04,05);
	}

}
class Animal{
	void eatSomething() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	@Override
	void eatSomething() {
		System.out.println("eating meat");
	}
}