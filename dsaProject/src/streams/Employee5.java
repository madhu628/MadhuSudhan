package streams;

import java.time.LocalDate;

public class Employee5 {
	private String name;
    private String department;
    private double salary;
    private LocalDate joinDate;

    public Employee5(String name, String department, double salary, LocalDate joinDate) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joinDate = joinDate;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + ", joinDate=" + joinDate + "}";
    }

}
