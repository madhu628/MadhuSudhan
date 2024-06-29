package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 10; i++) {
			executor.submit(() -> {
				System.out.println(Thread.currentThread().getName() + " is executing a task");
			});
		}

		executor.shutdown();
	}
}
