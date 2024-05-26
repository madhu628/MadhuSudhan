package arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 5);
		System.out.println(listDuplicateUsingSet(list));
	
	}

	static List<Integer> listDuplicateUsingSet(List<Integer> list) {
	    List<Integer> duplicates = new ArrayList<>();
	    Set<Integer> set = new HashSet<>();
	    for (Integer i : list) {
	        if (set.contains(i)) {
	            duplicates.add(i);
	        } else {
	            set.add(i);
	        }
	    }
	    return duplicates;
	}

}
