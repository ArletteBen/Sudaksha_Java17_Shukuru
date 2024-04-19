package sudaJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIEx {

	public static void main(String[] args) {
		List<Employee> lst=new ArrayList<Employee>();
		lst.add(new Employee(1,"shukuru",2000.0));
		lst.add(new Employee(2,"arlette",3000.0));
		lst.add(new Employee(3,"moi",4000.0));
		//Extracting obj whose salary is >2000
		List<Employee> salList=lst.stream().filter((e)->e.getSalary()>2000.0)
				.map((e)->e).collect(Collectors.toList());
		System.out.println(salList);
		salList.forEach((l)->System.out.println(l));
		//Extracting only salary 
		List<Double> onlSalList=lst.stream().map((e)->e.getSalary()).collect(Collectors.toList());
		onlSalList.forEach((l)->System.out.println(l));
		Optional<Employee> empl=lst.stream().filter((e)->e.getEmpId()==1)
				.map((e)->e).findAny();
		System.out.println(empl);
		empl.ifPresent((val)->System.out.println(val));
		empl.ifPresentOrElse((val)->System.out.println(val), ()->System.out.println("Employee not found"));
	}

}
