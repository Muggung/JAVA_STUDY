package com.method.run;

import java.util.Scanner;

import com.method.practice.Controller;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller c = new Controller();
		/* 1. 문자열 두개를 전달받는다.(매개변수)
		 * 2. 두 문자열을 결합하고 리턴해주는 메소드 생성 (return)
		 */
		String result = c.resultStr("안녕", "하세요");
		System.out.println(result);
		
		/* 1. 정수 두개를 전달받는다.(매개변수)
		 * 2. 첫번째 수부터 두번째 수까지 합을 리턴해주는 메소드 생성(return)
		 * 3. 단, 첫번째 수가 무조건 두번째 수보다 커야한다.
		 */
		System.out.println(c.untilNumber(3, 1));
		
		/* 1. 문자 한개를 전달받는다.(매개변수)
		 * 2. 문자가 영문자인지 확인 후 true, false로 결과 값 리턴해주는 메소드 생성(return)
		 */
		System.out.println(c.isEnglish('a'));
		
		/* 1. 문자열 두개를 입력받는다.
		 * 2. 입력받은 문자열 두 개의 값이 같은지 확인해주는 메소드 생성
		 * 3. 두 값이 같다면 true, 다르면 false 반환(return)
		 */
		System.out.println(c.isSameStr());
	}
}
