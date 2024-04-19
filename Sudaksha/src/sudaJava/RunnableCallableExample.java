package sudaJava;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Even implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<=10; i+=2) {
			System.out.println("even: "+i);
		}
	}
 }
class SumNatural implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
	int sum=0;
	for(int i=0; i<=10; i++)
		sum+=i;
	return sum;
	}
	
}
public class RunnableCallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		Even even=new Even();
		Thread t1=new Thread(even);
		t1.start();
		ExecutorService service=Executors.newSingleThreadExecutor();
		Future<Integer> future=service.submit(new SumNatural());
		System.out.println("Future: "+future.get());
		service.shutdown();
	}
}
