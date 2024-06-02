package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Properties p = new Properties();

		// Creating a FileInputStream to read the data from a file called
		// "abc.properties"
		// C:\Users\pendy\eclipse-workspace\CollectionAPI\src\com\kt\collection\abc.properties
		String filePath = "C:\\Users\\pendy\\eclipse-workspace\\CollectionAPI\\src\\com\\kt\\collection\\abc.properties";
		FileInputStream fis = new FileInputStream(filePath);

		// Data loaded into properties object through fis
		p.load(fis);

		System.out.println(p);

		System.out.println("***********************");
		System.out.println("name is :" + p.getProperty("name"));
		System.out.println("age is :" + p.getProperty("age"));
		System.out.println("address is :" + p.getProperty("address"));
		System.out.println("company is :" + p.getProperty("company"));

		// To Write data into the file
		p.setProperty("company", "ABCD");
		p.setProperty("Experience", "2");
		FileOutputStream fos = new FileOutputStream(filePath);

		// to store properties from java Properties Object into the properties flle.
		p.store(fos, "Added Company Name");

		System.out.println("***********************");
		System.out.println(p);

	}

}
