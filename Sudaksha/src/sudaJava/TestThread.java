package sudaJava;
class Numbers implements Runnable {

	@Override//asynchronous by default
	public synchronized void run() {
	System.out.println(Thread.currentThread().getName());
	for(int i=1; i<=5; i++)
		System.out.print(i+" ");	
	try {
		Thread.sleep(3000);//thread blocking
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	
}
public class TestThread {
public static void main(String[] args) {
	Numbers num=new Numbers();
	Thread t1=new Thread(num);
	Thread t2=new Thread(num);
	Thread t3=new Thread(num);
	t1.setName("AA");
	t2.setName("BB");
	t3.setName("CC");
	t3.setPriority(Thread.MAX_PRIORITY);
	t1.start();
	t2.start();
	t3.start();
}
}
