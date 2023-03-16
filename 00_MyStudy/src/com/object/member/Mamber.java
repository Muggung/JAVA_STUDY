package com.object.member;

public class Mamber {
	/*
	 * 1. 회원정보를 저장하는 클래스를 만든다.
	 * 2. 3명의 회원을 등록하고 정보 출력
	 * 3. 기본생성자만 이용, get/set으로 값 넣고 출력
	 * 4. 필드 : 아이디, 패스워드, 이름, 나이, 이메일
	 */
	private String id;
	private String pw;
	private String name;
	private int age;
	private String e_mail;
	
	public Mamber() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	};
	
	public String setMamber(String id, String pw, String name, int age, String email) {
		setId(id);
		setPw(pw);
		setName(name);
		setAge(age);
		setE_mail(email);
		String result = getId() + " " + getPw() + " " + getName() + " " + getAge() + " " + getE_mail();
		return result;
	}
}
