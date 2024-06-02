package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDisease {

	public static void main(String[] args) {
		List<Individual> individuals = Arrays.asList(new Individual("John", 23, "Corona"),
				new Individual("Jane", 29, "Flu"), new Individual("Jack", 25, "Corona"),
				new Individual("Jill", 22, "Corona"), new Individual("Doe", 26, "Flu"),
				new Individual("James", 24, "Corona"), new Individual("Jen", 27, "Cold"));

		individuals.stream().filter(p -> p.getDisease().equals("Corona") && p.getAge() < 25)
				.forEach(System.out::println);

		System.out.println("***********************************");

//		List<Individual> filteredIndividuals = individuals.stream()
//				.filter(ind -> "Corona".equals(ind.getDisease()) && ind.getAge() < 25).collect(Collectors.toList());
//
//		// Print the filtered individuals
//		filteredIndividuals.forEach(System.out::println);

		System.out.println("***********************************");

//		Double bill = individuals.stream().filter(p -> p.getDisease().equals("Corona"))
//				.collect(Collectors.averagingDouble(Patient::getAmount));
//		System.out.println(bill);
	}

	public class Patient {
		private Double Amount;

		public Patient(Double amount) {
			super();
			Amount = amount;
		}

		@Override
		public String toString() {
			return "Patient [Amount=" + Amount + "]";
		}

		public Double getAmount() {
			return Amount;
		}

		public void setAmount(Double amount) {
			Amount = amount;
		}
	}

}
