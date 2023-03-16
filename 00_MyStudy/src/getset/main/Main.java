package getset.main;

import getset.employee.Employee;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee();
		
		Employee p1 = new Employee();
		Employee p2 = new Employee();
		Employee p3 = new Employee();
		
		e.make(p1, "이동제", "트레이너", "학생부", 0, 0);
		e.make(p2, "꼬부기", "물타입", "포켓몬부", 10, 0.5);
		e.make(p3, "파이리", "불타입", "포켓몬부", 10, 0.5);
		
		System.out.println(p1.getEmployeeNo() + " " + p1.getEmployeeName() + " " + p1.getDepartment() + " " +
		p1.getPosition() + " " + p1.getSalary() + " " + p1.getBonus());
		
		System.out.println(p2.getEmployeeNo() + " " + p2.getEmployeeName() + " " + p2.getDepartment() + " " +
				p2.getPosition() + " " + p2.getSalary() + " " + p2.getBonus());
		
		System.out.println(p3.getEmployeeNo() + " " + p3.getEmployeeName() + " " + p3.getDepartment() + " " +
				p3.getPosition() + " " + p3.getSalary() + " " + p3.getBonus());
	}
}
