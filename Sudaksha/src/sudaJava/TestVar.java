package sudaJava;

import java.util.Arrays;

public class TestVar {
int code;
void display() {
	var a=55;
	System.out.println(a);
}
	public static void main(String[] args) {
		var code=1234;
		System.out.println(++code);
        var name="sudaksha";
        System.out.println(name);
        var list=Arrays.asList(10,20,30,40,50);
        list.forEach((l)->System.out.println(l+" "));
	}

}
