package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> ve = new Vector<>();
		ve.add(100);
		ve.add(50);
		ve.add(100);
		ve.add(25);
		ve.add(null);
		ve.add(75);
		ve.add(125);
		ve.add(175);
		ve.add(175);
		ve.add(null);
		System.out.println("With Homogeneous data: " + ve);
		System.out.println("*************************************");

		Vector v1 = new Vector();
		v1.addElement("Madhu");
		v1.addElement('M');
		v1.addElement(24);
		v1.addElement(null);
		v1.addElement(24);
		v1.addElement(5.7);
		v1.addElement(true);
		v1.addElement(null);

		System.out.println(v1);
		
		System.out.println("*************************************");
		

		Enumeration enumerator = v1.elements();
		while (enumerator.hasMoreElements()) {
			System.out.print(enumerator.nextElement() + "\t");
		}

//		Iterator enumerator = v1.iterartor();
//		while(enumerator.hasMoreElements()) {
//			System.out.print(enumerator.nextElement()+"\t");
//		}

	}

}
