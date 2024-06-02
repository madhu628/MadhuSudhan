package java8;

import java.util.HashMap;
import java.util.Map;

public class CollectionsExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();

		map.put("name", "madhu");
		map.put("company", null);

//		StringUtils.isNotEmpty(null);
		System.out.println(map.get("name"));
//		System.out.println(map.get("company") !=null);
//		map.get("xxxxx").toString();

//		boolean val1 = String.valueOf(map.get("company")).contains("Infosys");
//		System.out.println("val1:"+val1);
		boolean val1 = String.valueOf(map.get("company")).contains("Infosys");
		System.out.println("val1:" + val1);

		boolean value = "Infosys".equals(String.valueOf(map.get("company")));
		System.out.println(value);

//		System.out.println(String.valueOf(map.get("company")).getClass().getSimpleName());
//		System.out.println(map.get("company").getClass().getSimpleName());

//		boolean val = map.get("company").equals("Infosys");
//		System.out.println(val);

	}

}
