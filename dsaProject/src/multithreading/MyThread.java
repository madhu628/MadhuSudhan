package multithreading;

//creating our  thread using Runnable  Interface
public class MyThread  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//task for thread
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
	public static void main(String[] args) {
		//create object of MyThread class
		
		MyThread t1 = new MyThread();
		
		Thread t = new Thread(t1);
		
		//object for another Thread
		
		MyAnotherThread t2 = new MyAnotherThread();
		
		t.start();
		t2.start();
	}

}
