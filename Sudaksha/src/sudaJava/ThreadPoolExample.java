package sudaJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {
	ExecutorService service=Executors.newFixedThreadPool(5);
	for(int i=1; i<=10; i++) {
		service.submit(new Task(i));
	}
	service.shutdown();
	}

}
final class Task implements Runnable{
	private int taskId;
	public Task(int id) {
		this.taskId=id;
	}
	@Override
	public void run() {
	System.out.println("Task ID: "+this.taskId+" is performed by "+ Thread.currentThread().getName());
		
	}
}