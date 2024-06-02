package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(i1, "Sachin");
		hm.put(i2, "Messi"); // hm is an HashMap Object so, JVM will call .equals(i2) method to identify whether keys are duplicate or not
		// like i1.equals(i2) => true		
		System.out.println("i1.equals(i2) :"+i1.equals(i2));
		System.out.println("HashMap :"+hm);
		
		System.out.println("*************************************");
		
		IdentityHashMap<Integer,String> ihm = new IdentityHashMap<>();
		ihm.put(i1, "Sachin");
		ihm.put(i2, "Messi"); // ihm is an IdentityHashMap Object so, JVM will call (i1 == i2) operator (==) to identify whether keys are duplicate or not
		// like (i1 == i2) => false
		System.out.println("i1 == i2 :"+ (i1 == i2));
		System.out.println("IdentityHashMap :"+ihm);
		
//		System.out.println("****************************************");
//		IdentityHashMap<Integer,String> ihm1 = new IdentityHashMap<>();
//		ihm1.put(10,"Sachin");
//		ihm1.put(10,"Messi");
//		System.out.println("i1 == i2 :"+ (10 == 10));
//		System.out.println("IdentityHashMap :"+ihm1);

}

}
