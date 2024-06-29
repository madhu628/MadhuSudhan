package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockFree {
	private final Lock lock1 = new ReentrantLock();
	private final Lock lock2 = new ReentrantLock();

	public void method1() {
		try {
			if (lock1.tryLock() && lock2.tryLock()) {
				System.out.println("Acquired locks for method1");
				// perform operations
			}
		} finally {
			lock1.unlock();
			lock2.unlock();
		}
	}

	public void method2() {
		try {
			if (lock2.tryLock() && lock1.tryLock()) {
				System.out.println("Acquired locks for method2");
				// perform operations
			}
		} finally {
			lock2.unlock();
			lock1.unlock();
		}
	}
}

public class DeadlockFreeExample {
	public static void main(String[] args) {
		DeadlockFree deadlockFree = new DeadlockFree();
		Thread t1 = new Thread(deadlockFree::method1);
		Thread t2 = new Thread(deadlockFree::method2);

		t1.start();
		t2.start();
	}
}
