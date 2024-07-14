package adv;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class CustomClassLoader extends ClassLoader {
	@Override
	public Class<?> findClass(String name) throws ClassNotFoundException {
		try {
			String fileName = name.replace('.', File.separatorChar) + ".class";
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
			if (inputStream == null) {
				return super.findClass(name);
			}
			byte[] bytes = new byte[inputStream.available()];
			inputStream.read(bytes);
			return defineClass(name, bytes, 0, bytes.length);
		} catch (IOException e) {
			throw new ClassNotFoundException(name);
		}
	}

	public static void main(String[] args) {
		try {
			CustomClassLoader customClassLoader = new CustomClassLoader();
			Class<?> cls = customClassLoader.loadClass("MyClass");
			Object instance = cls.newInstance();
			System.out.println("Class loaded: " + instance.getClass().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
