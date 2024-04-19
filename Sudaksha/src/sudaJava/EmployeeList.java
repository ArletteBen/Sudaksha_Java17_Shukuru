package sudaJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {
	public static void main(String[] args) {
		List<Employee> lst=new ArrayList<Employee>();
		lst.add(new Employee(1,"shukuru",2000.0));
		lst.add(new Employee(2,"arlette",3000.0));
		lst.add(new Employee(3,"moi",4000.0));
		Collections.sort(lst);
		Collections.sort(lst, (e1,e2)->{
			return e2.getEmpId()-e1.getEmpId();
		});
		lst.forEach((emp)->
			System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getSalary()));
	/*	Iterator<Employee> itr=lst.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		}*/
		
	}
	
}
