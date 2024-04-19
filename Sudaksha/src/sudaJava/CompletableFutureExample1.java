package sudaJava;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample1 {

	public static void main(String[] args) {
	CompletableFuture<String> greetingFuture=CompletableFuture.supplyAsync(()->{
		//some async computation
		return "Hello from completable future";});
try {
	System.out.println(greetingFuture.get());
}catch(InterruptedException | ExecutionException e) {
e.printStackTrace();
}
	}

}
