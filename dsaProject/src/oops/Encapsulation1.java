package oops;


class Student1 {
    // Private variables to restrict direct access
    private String name;
    private int age;

    // Public getter method for 'name'
    public String getName() {
        return name;
    }

    // Public setter method for 'name'
    public void setName(String name) {
        // You can add validation logic here if needed
        this.name = name;
    }

    // Public getter method for 'age'
    public int getAge() {
        return age;
    }

    // Public setter method for 'age'
    public void setAge(int age) {
        // You can add validation logic here if needed
        if (age > 0) { // Example validation
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}

public class Encapsulation1 {
	public static void main(String[] args) {
        Student1 student = new Student1();

        // Setting values using setter methods
        student.setName("John Doe");
        student.setAge(20);

        // Getting values using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
