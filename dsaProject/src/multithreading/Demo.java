package multithreading;

public class Demo {

	public static void main(String[] args) {
		Company company = new Company();
		Producer1 p = new Producer1(company);
		Consumer1 c = new Consumer1(company);

		p.start();
		c.start();
	}
}
