package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class AvgSalaryEachDept {

	public static void main(String[] args) {

		List<Employee6> employees = Arrays.asList(new Employee6("Alice", "HR", 75000, LocalDate.of(2014, 5, 15)),
				new Employee6("Bob", "IT", 85000, LocalDate.of(2016, 3, 10)),
				new Employee6("Carol", "Finance", 95000, LocalDate.of(2018, 7, 19)),
				new Employee6("Dave", "IT", 105000, LocalDate.of(2013, 12, 5)),
				new Employee6("Eve", "HR", 65000, LocalDate.of(2019, 1, 20)));

		employees.stream().forEach(System.out::println);

		System.out.println();

		//filter employess whose salary greater than 75000
		employees.stream().filter(e -> e.getSalary() > 75000).forEach(System.out::println);

		System.out.println();

		//filter department 
		employees.stream().filter(e -> e.getDepartment().equals("HR")).map(Employee6::getName)
				.forEach(System.out::println);

		System.out.println();

		//max salary employee
		String maxEmp = employees.stream().max(Comparator.comparing(Employee6::getSalary)).map(Employee6::getName)
				.get();

		System.out.println(maxEmp);

		System.out.println();

		//min salary employee
		String minEmp = employees.stream().min(Comparator.comparing(Employee6::getSalary)).map(Employee6::getName)
				.get();

		System.out.println(minEmp);

		System.out.println();

		//unique departments
		String uniqueDepartment = employees.stream().map(Employee6::getDepartment).distinct()
				.collect(Collectors.joining(","));

		System.out.println(uniqueDepartment);
		System.out.println();

		//sorted order basis on name
		employees.stream().map(Employee6::getName).sorted().forEach(System.out::println);
		System.out.println();

		//reverse order basis on name
		employees.stream().map(Employee6::getName).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println();
		
		//sorted order basis on departmant and name
		employees.stream().sorted(Comparator.comparing(Employee6::getDepartment).thenComparing(Employee6::getName)).forEach(System.out::println);
		System.out.println();
		
		//print duplicates
		Map<String, Long> employeeCountByDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee6::getDepartment, Collectors.counting()));
		 
		
		employeeCountByDepartment.entrySet().stream().filter(dept->dept.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
		System.out.println();

		Map<String, Double> averageSalaryByDepartment = employees.stream().collect(
				Collectors.groupingBy(Employee6::getDepartment, Collectors.averagingDouble(Employee6::getSalary)));
		Set<Entry<String, Double>> entrySet = averageSalaryByDepartment.entrySet();

		System.out.println(averageSalaryByDepartment);

		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		Map<String, Double> averageSalaryByDepartment1 = employees.stream().collect(
				Collectors.groupingBy(Employee6::getDepartment, Collectors.averagingDouble(Employee6::getSalary)));

		averageSalaryByDepartment1.forEach((department, averageSalary) -> System.out
				.println("Department: " + department + ", Average Salary: " + averageSalary));
	}

}
