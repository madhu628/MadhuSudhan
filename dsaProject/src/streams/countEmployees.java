package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class countEmployees {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("John", "Male"), new Employee("Jane", "Female"),
				new Employee("Mike", "Male"), new Employee("Emily", "Female"), new Employee("Tom", "Male"));

		Map<String, Long> genderCount = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(genderCount);
		
		Set<Entry<String, Long>> entry = genderCount.entrySet();
		for (Entry<String, Long> entry1 : entry) {
			System.out.println(entry1.getKey() + "  " + entry1.getValue());
			
		}
		

		System.out.println("Number of male employees: " + genderCount.getOrDefault("Male", 0L));
		System.out.println("Number of female employees: " + genderCount.getOrDefault("Female", 0L));

	}

}
