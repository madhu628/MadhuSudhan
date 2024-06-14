package designPatterns;

//Separates the construction of a complex object from its representation.
//Pizza class
class Pizza {
	private String dough = "";
	private String sauce = "";
	private String topping = "";

	// Private constructor to restrict instantiation from outside
	private Pizza() {
	}

	// Getters for Pizza fields (optional, for demonstration)
	public String getDough() {
		return dough;
	}

	public String getSauce() {
		return sauce;
	}

	public String getTopping() {
		return topping;
	}

	// Static nested Builder class
	public static class Builder {
		private Pizza pizza = new Pizza();

		public Builder setDough(String dough) {
			pizza.dough = dough;
			return this;
		}

		public Builder setSauce(String sauce) {
			pizza.sauce = sauce;
			return this;
		}

		public Builder setTopping(String topping) {
			pizza.topping = topping;
			return this;
		}

		public Pizza build() {
			return pizza;
		}
	}
}

//Main class to test the Pizza Builder
public class BuilderPattern {
	public static void main(String[] args) {
		// Create a Pizza using the Builder
		Pizza pizza = new Pizza.Builder().setDough("Thin Crust").setSauce("Tomato Basil").setTopping("Mozzarella")
				.build();

		// Print the Pizza details
		System.out.println("Pizza Details:");
		System.out.println("Dough: " + pizza.getDough());
		System.out.println("Sauce: " + pizza.getSauce());
		System.out.println("Topping: " + pizza.getTopping());
	}
}
