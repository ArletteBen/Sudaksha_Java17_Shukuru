package sudaJava;
enum Days{
	MON, TUE,WED,THU,FRI,SAT,SUN
}
public class SwitchExpressionExample2 {

	public static void main(String[] args) {
    Days day=Days.SUN;
    switch(day) {
    case MON->System.out.println("week beginning day");
    case TUE,WED,THU->System.out.println("Working days");
    case FRI, SAT->System.out.println("WEEKENDS");
    default->System.out.println("it is sunday holiday");
    }

	}

}
