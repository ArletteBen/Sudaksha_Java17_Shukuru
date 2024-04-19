package sudaJava;
enum Months{
	JAN,FEB,MAR,APR,MAY,JUNE
}
public class SwitchExpressionExample3 {

	public static void main(String[] args) {
	Months mon=Months.MAR;
    int days=0;
    switch(mon) {
    case FEB->days=28;
    case JAN,MAR,MAY->days=31;
    case APR,JUNE->days=30;
    }
    System.out.println("days in month="+days);

//using yield
days=switch(mon) {
case JAN,MAR,MAY->{yield 31;}
case FEB->{yield 28;}
case APR,JUNE->{yield 30;}
default->throw new IllegalStateException();
};
System.out.println("days="+days);
	}

}
