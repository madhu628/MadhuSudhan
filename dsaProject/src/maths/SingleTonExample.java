package maths;

public class SingleTonExample {

	public static void main(String[] args) {
		Singleton x = Singleton.getInstantiate();
		Singleton y = Singleton.getInstantiate();
		Singleton z = Singleton.getInstantiate();

		if ((x == y) && (x == z)) {
			System.out.println("All are same");
		}

	}

	class Singleton {
		private static Singleton instance = null;

		private Singleton() {
			System.out.println("Hello I am a string part of Singleton class");
		}

		public static Singleton getInstantiate() {
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
	}

}
