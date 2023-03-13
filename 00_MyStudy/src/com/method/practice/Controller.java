package com.method.practice;

import java.util.Scanner;

public class Controller {
	
	public int sum;
	public String firstStr;
	public String secondStr;
	
	// 기본 생성자 선언
	public Controller() {}
	
	public String resultStr(String msgOne, String msgTwo) {
		/* 1. 문자열 두개를 전달받는다.(매개변수)
		 * 2. 두 문자열을 결합하고 리턴해주는 메소드 생성(return)
		 */
		String result = msgOne + msgTwo;
		return result;
	}
	
	public int untilNumber(int firstNum, int secondNum) {
		/* 1. 정수 두개를 전달받는다.(매개변수)
		 * 2. 첫번째 수부터 두번째 수까지 합을 리턴해주는 메소드 생성(return)
		 * 3. 단, 첫번째 수가 무조건 두번째 수보다 커야한다.
		 * 4. 만약 첫번째 수가 두번째 수보다 작을 경우 "계산할 수 없습니다."와 함께 0 출력
		 */
		if(firstNum < secondNum) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}
		
		for(int i=firstNum; i>=secondNum; i--) {
			sum += i;
		}
		
		return sum;
	}
	
	public boolean isEnglish(char engChar) {
		/* 1. 문자 한개를 전달받는다.(매개변수)
		 * 2. 문자가 영문자인지 확인 후 true, false로 결과 값 리턴해주는 메소드 생성(return)
		 */
		if(engChar >= 'A' && engChar <= 'Z' || engChar >= 'a' && engChar <= 'z') {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSameStr() {
		Scanner sc = new Scanner(System.in);
		/* 1. 문자열 두개를 입력받는다.
		 * 2. 입력받은 문자열 두 개의 값이 같은지 확인해주는 메소드 생성
		 * 3. 두 값이 같다면 true, 다르면 false 반환(return)
		 */
		System.out.print("첫번째 문자열을 적어주세요 : ");
		this.firstStr = sc.next();
		System.out.print("두번째 문자열을 적어주세요 : ");
		this.secondStr = sc.next();
		
		if(firstStr.equals(secondStr)) {
			return true;
		} else {
			return false;
		}
	}
}
