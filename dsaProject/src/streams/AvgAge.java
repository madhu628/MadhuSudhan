package streams;

//find the average age of male and female employees 

//Employee::getDept == e->e.getDept
//condition - filter 
//System.out::println == x->system.out.println(x)
//youngest/highest - optional --comparator/maxBy--get().getid()--get().getName();
//particular - collect--map--sop
//each -  collect--map--sop--entryset
//all - map - foreach

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgAge {
	public static void main(String[] args) {
		List<Employee2> employees = Arrays.asList(new Employee2("Alice", 30, "Female"),
				new Employee2("Bob", 24, "Male"), new Employee2("Carol", 26, "Female"),
				new Employee2("Dave", 32, "Male"), new Employee2("Eve", 29, "Female"));

		employees.stream().forEach(System.out::println);

		System.out.println();

		employees.stream().filter(e -> e.getAge() > 29).forEach(System.out::println);

		Map<String, Double> averageAges = employees.stream()
				.collect(Collectors.groupingBy(Employee2::getGender, Collectors.averagingDouble(Employee2::getAge)));

		System.out.println(averageAges);

	}

}
