package com.object.signUp;

public class Employee {
	/*
	 * 1. 사원정보를 입력받는다.
	 * 2. 이름, 부서, 급여, 전화번호, 인센티브(0.00)를 입력받는다.
	 * 3. 외부에서 수정할 수 있게 선언
	 * 4. 5명의 사원을 사용자가 입력한 값으로 생성한 후 출력
	 * 5. 생성한 후 입력한 순서로 데이터 출력
	 */
	public Employee(){};
	
	public Employee(String paramName, String paramPart, String paramSalary, String paramPhone,
			double paramIncen){
		
		String result = "";
		
		result += "\n===== " + paramName + "정보 =====\n" + "이름 : " + paramName + "\n부서 : " + paramPart + "\n급여 : "
					+ paramSalary + "\n휴대폰 번호 : " + paramPhone + "\n인센티브 : " + paramIncen + "\n\n";
		
		System.out.println(result);
	};
}
