package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections {

	public static void main(String[] args) {

		List<Object> listOfNames = Arrays.asList("rama", "sita", "rahul", "sony", "joshi");
		List<Object> listOfEmpIds = Arrays.asList(269, 256, 963, 789, 112);
		List<Object> listOfPlans = Arrays.asList("plan5", "plan2", "plan3", "plan4", "plan1");

		Map<String, List<Object>> mapData = new HashMap<>();
		mapData.put("name", listOfNames);
		mapData.put("empIds", listOfEmpIds);
		mapData.put("plans", listOfPlans);

		listOfEmpIds = mapData.get("empIds").stream().sorted().collect(Collectors.toList());
		mapData.put("empIds", listOfEmpIds);

		listOfNames = mapData.get("name").stream().sorted().collect(Collectors.toList());
		mapData.put("name", listOfNames);

		listOfPlans = mapData.get("plans").stream().sorted().collect(Collectors.toList());
		mapData.put("plans", listOfPlans);
		
		System.out.println("********************");

		Set<String> set = mapData.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(mapData.get(key));
		}

		System.out.println("***************Way-2****************");
		Collection<List<Object>> values = mapData.values();
		Iterator<List<Object>> valuesIter = values.iterator();
		while (valuesIter.hasNext()) {
//			String key = itr.next();
			System.out.println(valuesIter.next());
		}

	}

}
