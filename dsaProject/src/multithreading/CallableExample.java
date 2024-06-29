package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		Callable<Integer> task = () -> {
			// Simulate some computation
			Thread.sleep(1000);
			return 42;
		};

		Future<Integer> future = executor.submit(task);

		try {
			// This will block until the result is available
			Integer result = future.get();
			System.out.println("Result: " + result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			executor.shutdown();
		}
	}
}
