package sudaJava;


public class TrainBerths {
public static void main(String [] args) {
	TrainBerthReservation tb=new TrainBerthReservation();
	Thread t1=new Thread(tb);
	Thread t2=new Thread(tb);
	Thread t3=new Thread(tb);
	t1.setName("james");
	t2.setName("shukur");
	t3.setName("arl");
	t1.start();
	t2.start();
	t3.start();
	}
}
