package sudaJava;

import java.lang.reflect.Method;

public class CustomAnnotationsExample {
@SingleValuedAnnotation(value=300)// @SingleValuedAnnotation if you want to get the default value
public void display() {
	System.out.println("sample method with custom annotation");
}
	public static void main(String[] args) throws NoSuchMethodException,SecurityException{
		CustomAnnotationsExample h=new CustomAnnotationsExample();
Method m=h.getClass().getMethod("display");
SingleValuedAnnotation an2=m.getAnnotation(SingleValuedAnnotation.class);
System.out.println("value= "+an2.value());
	}

}
