package sudaJava;

import java.util.ArrayList;
import java.util.List;

public class RecordMain {

	public static void main(String[] args) {
	Student std=new Student(1,"shuk arl",4); //record is a readonly/immutable object 
	System.out.println(std.id()+" "+std.name()+""+std.marks());
	System.out.println(Student.group);
	
	List<Student>stdList=new ArrayList<Student>();
	stdList.add(new Student(2,"arl ben",3));
	stdList.add(new Student(3,"shul ben",4));
	stdList.add(new Student(4,"niw arl",5));
	stdList.add(new Student(6,"shu niw",3));
	stdList.forEach((s)->System.out.println(s.id()+""+s.name()+""+s.marks()));
	}

}
