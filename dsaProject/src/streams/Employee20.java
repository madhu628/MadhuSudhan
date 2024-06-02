package streams;

public class Employee20 {

	private Integer empId;
	private String empName;
	private Integer exp;

	public Employee20(Integer empId, String empName, Integer exp) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.exp = exp;
	}

	public Employee20() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", exp=" + exp + "]";
	}

}
