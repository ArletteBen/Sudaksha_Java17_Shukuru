package sudaJava;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample2 {

	public static void main(String[] args) {
		CompletableFuture<String> helloFuture=CompletableFuture.supplyAsync(()->"Hello");
		CompletableFuture<String> greetingFuture=CompletableFuture.supplyAsync(()->"world");
		CompletableFuture<String> combinedFuture=helloFuture.thenCombine(greetingFuture, (m1,m2)->m1+" "+m2);
		try {
			System.out.println(combinedFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
