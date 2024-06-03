package collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample1 {
	public static void main(String[] args) {
		// Create an IdentityHashMap
		Map<Key1, String> identityHashMap = new IdentityHashMap<>();

		// Create keys
		Key1 key1 = new Key1("1");
		Key1 key2 = new Key1("1");

		// Add key-value pairs to the IdentityHashMap
		identityHashMap.put(key1, "Value 1");
		identityHashMap.put(key2, "Value 2");

		// Display the contents of the IdentityHashMap
		System.out.println("IdentityHashMap contains:");
		identityHashMap.forEach((k, v) -> System.out.println(k + " -> " + v));
	}
}

class Key1 {
	private String id;

	public Key1(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Key{" + "id='" + id + '\'' + '}';
	}
}
