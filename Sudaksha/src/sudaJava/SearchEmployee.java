package sudaJava;

import java.util.ArrayList;
import java.util.List;

public class SearchEmployee {
public static void main(String[] args) {
	List<Employee> lst=new ArrayList<Employee>();
	lst.add(new Employee(1,"shukuru",2000.0));
	lst.add(new Employee(2,"arlette",3000.0));
	lst.add(new Employee(3,"moi",4000.0));
try {
	Employee emp=lst.stream().filter((e)->e.getEmpId()==5).map((e)->e).findAny().orElseThrow(()->new EmployeeNotFoundException());
	emp.setSalary(emp.getSalary()+5000);
	System.out.println(emp);
}catch(EmployeeNotFoundException e) {
	System.out.println(e.getMessage());
}
System.out.println("success");
}
}
