package streams;

import java.util.ArrayList;
import java.util.List;

public class SortedOnIDs {

	public static void main(String[] args) {

		Employee20 e1 = new Employee20(1109261, "john", 2);
		Employee20 e2 = new Employee20(1109242, "adam", 1);
		Employee20 e3 = new Employee20(1109212, "warner", 1);
		Employee20 e4 = new Employee20(1109265, "smith", 2);

		List<Employee20> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);

		employeeList.stream().filter(e -> e.getExp() > 1).sorted((emp1, emp2) -> emp1.getEmpId() - emp2.getEmpId())
				.forEach(emp -> System.out.println(emp.getEmpId()));

		// Observe how System.out.println() used below
		employeeList.stream().forEach(System.out::println);

	}

}
