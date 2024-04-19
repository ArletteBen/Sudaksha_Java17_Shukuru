package sudaJava;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample3 {

	public static void main(String[] args) {
		//java.lang.ArithmeticException: /by zero
		CompletableFuture<Integer> resultFuture=CompletableFuture.supplyAsync(()->10/0).exceptionally(ex->0);
		//0-returned by exceptionally block
		try {
			System.out.println(resultFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
