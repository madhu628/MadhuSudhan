package multithreading;

import java.util.concurrent.CountDownLatch;

class Worker implements Runnable {
	private final CountDownLatch latch;

	Worker(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			// Simulate work
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " finished work.");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		} finally {
			latch.countDown();
		}
	}
}

public class CountdownLatchExample {
	public static void main(String[] args) throws InterruptedException {
		int numThreads = 3;
		CountDownLatch latch = new CountDownLatch(numThreads);

		for (int i = 0; i < numThreads; i++) {
			new Thread(new Worker(latch)).start();
		}

		latch.await(); // Main thread waits until the latch count reaches zero
		System.out.println("All workers have finished.");
	}
}
