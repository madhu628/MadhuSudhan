package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//public class SerializeAndDeSerialize {
//	public static void main(String[] args) {
//		Person person = new Person("John Doe", 30);
//
//		try (FileOutputStream fileOut = new FileOutputStream("person.ser");
//				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
//			out.writeObject(person);
//			System.out.println("Serialized data is saved in person.ser");
//		} catch (IOException i) {
//			i.printStackTrace();
//		}
//	}
//}

public class SerializeAndDeSerialize {
	public static void main(String[] args) {
		Person person = null;

		try (FileInputStream fileIn = new FileInputStream("person.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			person = (Person) in.readObject();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("Person class not found");
			c.printStackTrace();
		}

		System.out.println("Deserialized Person...");
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}
}

class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + '}';
	}
}