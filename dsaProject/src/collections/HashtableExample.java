package collections;

import java.util.Hashtable;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Temp, String> ht = new Hashtable<>(); // Default capacity is 11
		ht.put(new Temp(5), "A");
		ht.put(new Temp(2), "B");
		ht.put(new Temp(6), "C");
		ht.put(new Temp(15), "D");
		ht.put(new Temp(23), "E");
		ht.put(new Temp(16), "F");

		System.out.println(ht);
	}

}

class Temp {
	int i;

	public Temp(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i;
	}

	@Override
	public String toString() {
		return i + " ";
	}
	// Normal toString() method is like getClass().getName() + "@" +
	// Integer.toHexString(hashCode());
}
