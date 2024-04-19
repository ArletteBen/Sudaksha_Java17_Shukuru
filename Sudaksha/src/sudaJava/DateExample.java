package sudaJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

 public class DateExample {

 public static void main(String[] args) {
 System.out.println("default date using util.Date: "+new Date());
 LocalDate date1=LocalDate.now();
 System.out.println("default date using LocalDate: "+date1);
 System.out.println("default dateTime: "+LocalDateTime.now());
 System.out.println("default date plus 2 days: "+LocalDateTime.now().plusDays(2));
 System.out.println("default date plus 2 months: "+LocalDateTime.now().plusMonths(2));
 System.out.println("default date plus 3 years: "+LocalDateTime.now().plusYears(3));
 
 LocalDate dateBirth=LocalDate.of(2024, 04, 13);
 System.out.println(dateBirth);
 System.out.println(dateBirth.getDayOfMonth());
 System.out.println(dateBirth.getDayOfWeek());
 System.out.println(dateBirth.getYear());
	}
}
