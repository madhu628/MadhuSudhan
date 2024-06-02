package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

//separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
public class SeparateEmployees {

	public static void main(String[] args) {
		List<Employee12> employees = Arrays.asList(new Employee12("John", 23, "Engineering", 50000),
				new Employee12("Jane", 29, "HR", 60000), new Employee12("Jack", 25, "Engineering", 70000),
				new Employee12("Jill", 22, "Marketing", 80000), new Employee12("Doe", 26, "Engineering", 90000),
				new Employee12("James", 24, "Marketing", 75000), new Employee12("Jen", 27, "HR", 65000));

		Map<Boolean, List<Employee12>> partitionedByAge = employees.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() <= 25));

		List<Employee12> youngerOrEqualTo25 = partitionedByAge.get(true);
		List<Employee12> olderThan25 = partitionedByAge.get(false);

		youngerOrEqualTo25.forEach(System.out::println);
		olderThan25.forEach(System.out::println);

		Map<Boolean, List<Employee12>> partitionedByAge1 = employees.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() <= 25));

		Set<Entry<Boolean, List<Employee12>>> entrySet = partitionedByAge1.entrySet();

		for (Entry<Boolean, List<Employee12>> entry : entrySet) {
			System.out.println();
			if (entry.getKey()) {
				System.out.println("older than 25");
			} else {
				System.out.println("younger equal to 25");
			}
			List<Employee12> list = entry.getValue();
			for (Employee12 e : list) {
				System.out.println(e.getName());
			}
		}

	}

}
