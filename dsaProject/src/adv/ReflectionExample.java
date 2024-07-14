package adv;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	public static void main(String[] args) {
		try {
			// Obtain the Class object associated with the MyClass class
			Class<?> clazz = Class.forName("MyClass");

			// Create a new instance of MyClass
			Constructor<?> constructor = clazz.getConstructor();
			Object myObject = constructor.newInstance();

			// Access and modify a private field
			Field field = clazz.getDeclaredField("privateField");
			field.setAccessible(true);
			field.set(myObject, "New Value");
			System.out.println("Private Field Value: " + field.get(myObject));

			// Invoke a public method
			Method method = clazz.getMethod("publicMethod");
			method.invoke(myObject);

			// Invoke a private method
			Method privateMethod = clazz.getDeclaredMethod("privateMethod");
			privateMethod.setAccessible(true);
			privateMethod.invoke(myObject);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyClass {
	private String privateField = "Initial Value";

	public MyClass() {
	}

	public void publicMethod() {
		System.out.println("Public Method Invoked");
	}

	private void privateMethod() {
		System.out.println("Private Method Invoked");
	}
}
