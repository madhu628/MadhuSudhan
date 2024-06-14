package oops;

//1.Extending Thread Class
//create a thread by extending the Thread class and overriding its run method.
//public class MyThread extends Thread {
//	public void run() {
//		System.out.println("Thread is running by extending Thread.");
//	}
//
//	public static void main(String[] args) {
//		MyThread thread = new MyThread();
//		thread.start(); // Start the thread
//	}
//}

//2. Implementing Runnable Interface
//implementing Runnable is preferred over extending Thread because it allows your class to extend other classes.

//public class MyThread implements Runnable {
//    public void run() {
//        System.out.println("Thread is running by implementing Runnable.");
//    }
//
//    public static void main(String[] args) {
//        Thread thread = new Thread(new MyThread());
//        thread.start();  // Start the thread
//    }
//}
//3.you can create a thread using an anonymous class for quick and concise implementation.
//public class MyThread {
//    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            public void run() {
//                System.out.println("Thread is running using an anonymous class.");
//            }
//        });
//        thread.start();  // Start the thread
//    }
//}
//4.With Java 8, you can use lambda expressions to create threads in a more readable and concise way.
//public class MyThread {
//    public static void main(String[] args) {
//        Thread thread = new Thread(() -> System.out.println("Thread is running using a lambda expression."));
//        thread.start();  // Start the thread
//    }
//}

//5.Using Callable and Future
//Callable allows threads to return a result and throw checked exceptions. It is used with the ExecutorService 
//to manage thread execution and retrieve results.
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//public class MyThread {
//    public static void main(String[] args) {
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        Callable<String> callable = () -> "Thread result from Callable.";
//        Future<String> future = executor.submit(callable);
//
//        try {
//            System.out.println(future.get());  // Retrieve the result
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        } finally {
//            executor.shutdown();
//        }
//    }
//}

//6. Using ExecutorService
//ExecutorService provides a way to manage a pool of threads, allowing better control over thread lifecycle.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2); // Thread pool of 2 threads

		Runnable task1 = () -> System.out.println("Task 1 is running in ExecutorService.");
		Runnable task2 = () -> System.out.println("Task 2 is running in ExecutorService.");

		executor.submit(task1);
		executor.submit(task2);

		executor.shutdown(); // Shutdown the executor
	}
}
