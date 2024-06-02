package streams;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AvgTotalSalary {

	public static void main(String[] args) {
		List<Employee11> employees = Arrays.asList(new Employee11("John", "Engineering", 50000),
				new Employee11("Jane", "HR", 60000), new Employee11("Jack", "Engineering", 70000),
				new Employee11("Jill", "Marketing", 80000), new Employee11("Doe", "Engineering", 90000),
				new Employee11("James", "Marketing", 75000), new Employee11("Jen", "HR", 65000));

		DoubleSummaryStatistics salary = employees.stream()
				.collect(Collectors.summarizingDouble(Employee11::getSalary));

		System.out.println(salary.getAverage());

		System.out.println(salary.getSum());

		double totalSalary = employees.stream().mapToDouble(Employee11::getSalary).sum();

		// Calculate the average salary of all employees
		OptionalDouble averageSalary = employees.stream().mapToDouble(Employee11::getSalary).average();

		System.out.println(averageSalary.getAsDouble());
		System.out.println(totalSalary);
	}

}
