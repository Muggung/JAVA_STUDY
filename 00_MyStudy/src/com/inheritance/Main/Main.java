package com.inheritance.Main;

import java.util.Scanner;

import com.inheritance.vo.model.*;

public class Main {
	public static void main(String[] args) {
		
		Person[] p = new Person[5];
		
		p[0] = new Student("이동제", 25, '남', "자바", 64);
		p[1] = new Teacher("유병승", 19, '남', "자바", "자바");
		p[2] = new Employee("홍길동", 20, '남', "신출귀몰부", "010-0000-0000");
		p[3] = new Driver("박운전", 25, '여', "경기도", 3);
		p[4] = new Student("이동제", 25, '남', "자바", 64);
		
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i].info());
		}
	}
}
