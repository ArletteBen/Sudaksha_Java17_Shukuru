package sudaJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String [] args) {
		List<Employee> lst=new ArrayList<Employee>();
		lst.add(new Employee(1,"shukuru",2000.0));
		lst.add(new Employee(2,"arlette",3000.0));
		lst.add(new Employee(3,"moi",4000.0));
		//defining Predicate functional interface
		Predicate<Employee> salPred=(emp)->emp.getSalary()>2000;
		Predicate<Employee> codePred=(emp)->emp.getEmpId()==5;
		System.out.println("Predicate example");
		for(Employee e:lst) {
			if(salPred.test(e)) {
				System.out.println(e);
			}
		}
	}
}
