package java18;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> printConsumer = (s) -> System.out.println(s);

		printConsumer.accept("Hello"); // Output: Hello
		printConsumer.accept("Java 8"); // Output: Java 8
	}
}
