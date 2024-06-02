package streams;

//Employee::getDept == e->e.getDept
//condition - filter 
//System.out::println == x->system.out.println(x)
//youngest/highest - optional --comparator/maxBy--get().getid()--get().getName();
//particular - collect--map--sop
//each -  collect--map--sop--entryset
//all - map - foreach

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class YoungestEmployee {

	public static void main(String[] args) {
		List<Employee7> employees = Arrays.asList(new Employee7("Alice", "HR", 25, "Female"),
				new Employee7("Bob", "Product Development", 30, "Male"),
				new Employee7("Carol", "Product Development", 28, "Female"),
				new Employee7("Dave", "Product Development", 22, "Male"), new Employee7("Eve", "IT", 27, "Female"));

		Optional<Employee7> youngestMaleInProductDev = employees.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(Employee7::getAge));

		Employee7 youngEmployee7 = youngestMaleInProductDev.get();
		System.out.println(youngEmployee7.getClass());
		System.out.println(youngEmployee7.getName());

		Optional<Employee7> youngestMaleInProductDev1 = employees.stream()
				.filter(e -> e.getDepartment().equals("Product Development")).filter(e -> e.getGender().equals("Male"))
				.min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));

		if (youngestMaleInProductDev1.isPresent()) {
			System.out.println("Youngest male employee in Product Development: " + youngestMaleInProductDev.get());
		} else {
			System.out.println("No male employee found in Product Development department.");
		}

	}

}
