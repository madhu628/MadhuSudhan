package multithreading;

public class Consumer1 extends Thread {

	Company c;

	Consumer1(Company c) {
		this.c = c;
	}

	public void run() {
		while (true) {

			try {
				this.c.consume_item();
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}

	}

}
