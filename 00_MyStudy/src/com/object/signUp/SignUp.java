package com.object.signUp;

public class SignUp {
	/*
	 * 1. 커뮤니티 사이트를 만들기 위해 회원가입을 받으려한다.
	 * 2. 회원 정보를 저장할 객체를 만들어보자
	 * 3. 아이디, 비밀번호, 이메일, 나이, 취미의 정보가 필요하다.
	 * 3-1. admin, 1234, admin@admin.com, 55, 운동,코딩
	 * 3-2. user01, 1111, user01@user01.com, 33, 코딩
	 */
	public SignUp() {
		System.out.println("예제) ");
		System.out.print("아이디 : admin\n비밀번호 : 1234\n이메일 : admin@admin.com\n나이 : 55\n취미 : 운동, 코딩");
	}
	
	public SignUp(String paramID, String paramPW,
			String paramE_mail, int paramAge, String paramHobby) {
		System.out.printf("아이디 : %s\n비밀번호 : %s\n이메일 : %s\n나이 : %d\n취미 : %s"
				,paramID, paramPW, paramE_mail, paramAge, paramHobby);
	}
	
}
