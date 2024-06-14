package oops;

class EncapTest {
	//Declare the variables of a class as private
	private String name;
	private String idNum;
	private int age;

	//Provide public setter and getter methods to modify and view the variables values
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newId) {
		idNum = newId;
	}
}

public class Encapsulation {

	public static void main(String args[]) {
		EncapTest encap = new EncapTest();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343ms");
		System.out.print("Name: " + encap.getName() + " Age: " + encap.getAge());
	}

}
