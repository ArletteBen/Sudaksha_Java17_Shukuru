package sudaJava;

import java.util.TreeSet;

public class EmployeeSort {

	public static void main(String[] args) {
		TreeSet<Employee> lst=new TreeSet<Employee>();
		lst.add(new Employee(1,"Shukuru",2000.0));
		lst.add(new Employee(2,"arlette",3000.0));
		lst.add(new Employee(3,"moi",4000.0));
		System.out.println(lst);
/*for(Employee e:lst)
	System.out.println(e);*/
	}

}
