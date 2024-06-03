package collections;
import java.util.WeakHashMap;

public class WeakHashMapExample1 {
    public static void main(String[] args) {
        // Create a WeakHashMap
        WeakHashMap<Key, String> weakHashMap = new WeakHashMap<>();

        // Create a key-value pair
        Key key1 = new Key("1");
        String value1 = "Value 1";

        // Add the key-value pair to the WeakHashMap
        weakHashMap.put(key1, value1);

        // Create another key-value pair
        Key key2 = new Key("2");
        String value2 = "Value 2";

        // Add the second key-value pair to the WeakHashMap
        weakHashMap.put(key2, value2);

        // Display the contents of the WeakHashMap
        System.out.println("WeakHashMap contains:");
        System.out.println(weakHashMap);

        // Remove the reference to key1
        key1 = null;

        // Trigger garbage collection
        System.gc();

        // Display the contents of the WeakHashMap after garbage collection
        System.out.println("WeakHashMap after garbage collection:");
        System.out.println(weakHashMap);
    }
}

class Key {
    private String id;

    public Key(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Key{" + "id='" + id + '\'' + '}';
    }
}
