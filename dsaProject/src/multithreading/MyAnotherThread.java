package multithreading;

public class MyAnotherThread extends Thread{
     
		public void run() {
			//task for thread
			for(int i=10;i>=1;i--) {
				System.out.println(i);
				try {
					Thread.sleep(2000);
				}catch(Exception e){
					
				}
			}
		}
	
}