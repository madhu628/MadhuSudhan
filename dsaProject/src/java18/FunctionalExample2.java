package java18;

import java.util.Optional;

public class FunctionalExample2 {
	public static void main(String[] args) {
		String value = null;

		String result = Optional.ofNullable(value).orElse("Default Value");
		System.out.println(result); // Default Value
	}

}
