package sudaJava;

public class CheckEnum {
	public static void main(String[] args) {
		Gender gender=Gender.F;
		switch(gender) {
		case F:
			System.out.println("Female");break;
		case O:
			System.out.println("Male");break;
			default:
				System.out.println("Other");
			
		}
	}
}
