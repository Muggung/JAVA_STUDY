package com.object.run;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.object.signUp.Board;
import com.object.signUp.Employee;
import com.object.signUp.SignUp;

public class ObjectTestRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		SimpleDateFormat todayDate = new SimpleDateFormat("YY/MM/dd"); 
		
		
		
		// 회원가입
		System.out.println("===== 회원가입 예제 =====");
		SignUp user = new SignUp("user01", "1111", "user01@user01.com", 33, "코딩");
		
		System.out.println("\n==== 정보를 입력해주세요 ====");
		System.out.print("아이디 : ");
		String userID = sc.next();
		System.out.print("비밀번호 : ");
		String userPW = sc.next();
		System.out.print("이메일 : ");
		String userE_mail = sc.next();
		System.out.print("나 이 : ");
		int userAge = sc.nextInt();
		System.out.print("취 미 : ");
		String userHobby = sc.next();
		
		System.out.println("===== 회원가입 완료 =====");
		SignUp userME = new SignUp(userID, userPW, userE_mail, userAge, userHobby);
		
		
		
		// 게시판 생성
		System.out.println("\n\n===== 게시판 예제 =====");
		Board userBoard = new Board("첫번째 글", "나야나", "첫번째 글쓰다.", "23/03/10");
		
		sc.nextLine();
		System.out.println("\n\n==== 게시판을 생성해보세요 ====");
		System.out.print("제목 : ");
		String userTitle = sc.nextLine();
		System.out.print("글쓴이 : ");
		String userName = sc.next();
		sc.nextLine();
		System.out.print("내용 : ");
		String userContent = sc.nextLine();
		String userToday = todayDate.format(today);
		
		System.out.println("\n===== 게시판 생성 완료 =====");
		Board myBoard = new Board(userTitle, userName, userContent, userToday);
		
		
		// 사원 정보 받기
		System.out.println("\n===== 사원정보 입력 =====");
		
		int count = 0;
		
		while(count < 5) {
			System.out.print("이름을 입력해주세요 : ");
			String employeeName = sc.next();
			
			sc.nextLine();
			
			System.out.print("부서를 입력해주세요 : ");
			String employeePart = sc.nextLine();
			
			System.out.print("급여를 입력해주세요(만원단위로 입력) : ");
			String employeeSalary = sc.next();
			
			System.out.print("전화번호를 입력해주세요(-포함) : ");
			String employeePhone = sc.next();
			
			System.out.print("인센티브를 입력해주세요 : ");
			double employeeIncen = sc.nextDouble();
			
			Employee employee = new Employee(employeeName, employeePart, employeeSalary, employeePhone, employeeIncen);
			count++;
		}
	}
}
