package collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		HashMap hm = new HashMap();
		ABC t = new ABC();
		hm.put(t, "Shri");
		System.out.println("HashMap before calling gc:" + hm);

		t = null; // Making elgible for Garbage Collection
		System.gc(); // To Trigger Garbage Collector thread manually by us to clean garbage need to
						// use System.gc() method

		Thread.sleep(5000); // For cleaning some time required so we can make our thread to sleep sometime

		System.out.println("HashMap after calling gc :" + hm);

		System.out.println("************************************");

		WeakHashMap whm = new WeakHashMap();
		ABC temp = new ABC();
		whm.put(temp, "Shri");
		System.out.println("WeakHashMap before calling gc:" + whm);

		temp = null; // Making elgible for Garbage Collection
		System.gc(); // To Trigger Garbage Collector thread manually by us to clean garbage need to
						// use System.gc() method

		Thread.sleep(5000); // For cleaning some time required so we can make our thread to sleep sometime

		System.out.println("WeakHashMap after calling gc :" + whm);
	}

}

class ABC {
	@Override
	public String toString() {
		return "Cherry";
	}

	@Override // This method need to override to just see whether GC triggered or not
	public void finalize() {
		System.out.println("Cleaning the temp Object");
	}
}
