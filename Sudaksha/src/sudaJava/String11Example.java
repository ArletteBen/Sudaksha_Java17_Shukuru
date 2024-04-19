package sudaJava;

import java.util.stream.Stream;

public class String11Example {

	public static void main(String[] args) {
	String str1="java is a very simple language";
	String str2=" ";
	System.out.println("blank="+str1.isBlank());
	System.out.println("blank="+str2.isBlank());
	System.out.println("blank="+str2.isEmpty());
	
	String city="    hyderabad    ";
	System.out.println(city+" "+city.length());
	System.out.println(city.stripLeading());
	System.out.println(city+" "+city.length());
	System.out.println(city.stripTrailing());
	
	String state="  Karnataka  ";
	System.out.println(state);
	System.out.println(state.strip());
	
	String java="java\nis\nsimple\nprogramming\nlanguage";
		Stream<String>str=java.lines();
		str.forEach((s)->System.out.println(s));
	}

}
