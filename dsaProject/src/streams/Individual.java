package streams;

public class Individual {

	private String name;
	private int age;
	private String disease;

	public Individual(String name, int age, String disease) {
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDisease() {
		return disease;
	}

	@Override
	public String toString() {
		return "Individual{name='" + name + "', age=" + age + ", disease='" + disease + "'}";
	}

}
