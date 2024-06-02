package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleComparatorExample {
	
public static void main(String[] args) {
		
		
		List<Integer> al = Arrays.asList(2,56,12,34,5);
		
//		Ascending order Sorting by using default Comparable Interface which is implemented by Integer class
		Collections.sort(al);
		System.out.println("Ascending order:"+al);
		
		Collections.sort(al, (al1,al2) -> al1 - al2);
		System.out.println("Ascending order Through Comparator:"+al);
		
		Collections.sort(al, (al1,al2) -> al2 - al1);
		System.out.println("Descending order Through Comparator:"+al);

	}


}
