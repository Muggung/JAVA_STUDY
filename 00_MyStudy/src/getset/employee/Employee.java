package getset.employee;

public class Employee {
	/*
	 * 1. 사원 클래스를 만든다.
	 * 2. 사원번호, 사원명, 부서, 직책, 월급, 보너스를 필드에 선언한다.
	 * 3. 맴버변수는 모두 직접접근 불가능하게 만들기 
	 * 4. 사원번호는 자동으로 부여되고 출력은 되나 수정은 금지 
	 * 5. 그 외 다른 맴버변수는 출력,수정 가능
	 */
	private static int count;
	private int employeeNo;
	private String employeeName;
	private String department;
	private String position;
	private int salary;
	private double bonus;
	
	{
		employeeNo = count++;
	}
	
	public Employee() {}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void make(Employee e,String name, String depart, String position, int salary, double bonus) {
		e.setEmployeeName(name);
		e.setDepartment(depart);
		e.setPosition(position);
		e.setSalary(salary);
		e.setBonus(bonus);
	}
}
