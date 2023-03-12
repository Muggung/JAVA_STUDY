package com.control.controller;
import java.util.Scanner;

public class Control {
	public void isFive() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 값을 입력받는다.
		 * 2. 입력받은 값이 5의 배수인지 확인한다.
		 * 3. 입력받은 값이 5의 배수면 "5의 배수입니다." 출력
		 * 3-1. 입력받은 값이 5의 배수가 아니면 "5의 배수가 아닙니다" 출력
		 */
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		if(num % 5 == 0) {
			System.out.println("5의 배수입니다.");
		} else {
			System.out.println("5의 배수가 아닙니다.");
		}
	}
	
	public void userName() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 이름을 입력받는다.
		 * 2. 입력받은 이름이랑 같으면 "코딩천재!!" 출력
		 * 3. 입력받은 이름이랑 다르면 "코딩바보.." 출력
		 */
		
		System.out.print("당신의 이름을 적어주세요 : ");
		String saveName = sc.next();
		
		if(saveName.equals("이동제")) {
			System.out.println("코딩천재!!");
		} else {
			System.out.println("코딩바보..");
		}
	}
	
	public void userLogin() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 아이디, 패스워드 입력 값을 각각 받는다.
		 * 2. 아이디가 "admin" 이고, 패스워드가 "8888"이면 "로그인 성공!" 출력
		 * 3. 아이디나 패스워드 중 하나라도 다르거나 둘 다 다를경우 "로그인 실패.." 출력
		 */
		System.out.print("아이디를 입력해주세요 : ");
		String userId = sc.next();
		System.out.print("패스워드를 압력해주세요 : ");
		String userPw = sc.next();
		
		if(userId.equals("admin") && userPw.equals("8888")) {
			System.out.println("로그인 성공!!");
		} else {
			System.out.println("로그인 실패..");
		}
	}
	
	public void signUp() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 나이를 입력받는다.
		 * 2. 19살 이하면 회원가입 불가능하고, 20살 이상이면 회원가입정보를 입력한다.
		 * 2-1. 성년 : 이름, 나이, 성별, 주소를 입력받고 출력
		 * 2-2. 미성년 : "미성년자는 회원가입이 불가능합니다." 출력
		 */
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		if(19 >= age) {
			System.out.println("미성년자는 회원가입이 불가능합니다.");
		} else {
			System.out.println("회원가입이 가능합니다!\n===== 회원가입 =====");
			System.out.print("이름을 입력해주세요 : ");
			String name = sc.next();
			
			System.out.print("성별을 입력해주세요(남/여) : ");
			char gender = sc.next().charAt(0);
			
			System.out.print("주소를 입력해주세요 : ");
			String address = sc.next();
			
			System.out.println("===== 회원가입이 완료되었습니다 =====");
			System.out.printf("%s에 거주하시는 %d살 %s님(%c자) 회원가입 축하드립니다.", address, age, name, gender);
		}
	}
	
	public void test_Rank() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 점수를 입력받는다.
		 * 2. 입력받은 점수가 90점 이상이면 'A', 80점이상 90점 미만 'B', 70점이상 80점 미만 'C', 60점이상 70점 미만 'D'
		 * 2-1. 그외의 값은 'F'를 출력한다.
		 * 3. 등급과 점수를 모두 출력한다. "00점은 0등급입니다."
		 */
		System.out.print("점수를 입력해주세요 : ");
		int testScore = sc.nextInt();
		char testRank;
		
		if(testScore >= 90) {
			testRank = 'A';
		} else if(testScore >= 80) {
			testRank = 'B';
		} else if(testScore >= 70) {
			testRank = 'C';
		} else if(testScore >= 60) {
			testRank = 'D';
		} else {
			testRank = 'F';
		}
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.printf("%s님, 당신의 점수는 %d점 \'%c\'등급입니다.", name, testScore, testRank);
	}
	
	public void menu_bar() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 분식집 메뉴 프로그램 구현
		 * 1. 떡볶이 : 3000원, 2. 순대 : 2500원, 3. 튀김 : 3000원, 4. 김밥 : 3500원, 5. 라면 : 3500원
		 * 메뉴를 선택하면 메뉴 이름과 주문한 수량과 금액을 출력하는 기능 ("당신은 떡볶이를 고르셨습니다. 결제금액은 3000원입니다.")
		 * 메뉴에 없는 것을 고르면 "잘못 고르셨습니다." 출력
		 */
		System.out.print("===== 동제 떡볶이 =====\n=메뉴=\n");
		System.out.print("1.떡볶이 : 3000원\t2.순대 : 2500원\t3.튀김 : 3000원\t4. 김밥:3500원\t5. 라면 : 3500원");
		System.out.println("\n메뉴 앞에 번호를 입력해주세요!");
		int choice = sc.nextInt();
		int num;
		
		switch(choice) {
			case 1 :
				System.out.print("떡볶이를 선택하셨습니다. 몇개 주문하시나요??");
				num = sc.nextInt();
				System.out.printf("떡볶이 %d개를 주문하셨습니다. 결제금액은 " + 3000 * num + "원 입니다.", num);
				break;
			case 2 :
				System.out.print("순대를 선택하셨습니다. 몇개 주문하시나요??");
				num = sc.nextInt();
				System.out.printf("순대 %d개를 주문하셨습니다. 결제금액은 " + 2500 * num + "원 입니다.", num);
				break;
			case 3 :
				System.out.print("튀김을 선택하셨습니다. 몇개 주문하시나요??");
				num = sc.nextInt();
				System.out.printf("튀김 %d개를 주문하셨습니다. 결제금액은 " + 3000 * num + "원 입니다.", num);
				break;
			case 4 :
				System.out.print("김밥을 선택하셨습니다. 몇개 주문하시나요??");
				num = sc.nextInt();
				System.out.printf("김밥 %d개를 주문하셨습니다. 결제금액은 " + 3500 * num + "원 입니다.", num);
				break;
			case 5 :
				System.out.print("라면을 선택하셨습니다. 몇개 주문하시나요??");
				num = sc.nextInt();
				System.out.printf("순대 %d개를 주문하셨습니다. 결제금액은 " + 3500 * num + "원 입니다.", num);
				break;
		}
		System.out.println("\n조리중...\n주문하신 메뉴나왔습니다. 감사합니다!");
	}
	
	public void login_Foreigner() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 나이를 입력받는다.
		 * 2. 나이가 성인이면 회원가입, 미성년이면 회원가입 불가한다.
		 * 3. 성인이면 내국인, 외국인 구분한다.
		 * 4. 내국인이면 회원가입으로 바로 이동 -> 이름, 주소를 입력받아 저장 후 출력
		 * 5. 외국인이면 외국인 등록번호 여부 묻기 (있다, 없다)
		 * 5-1. 외국인 등록번호가 있으면 회원가입 이동 -> 외국인등록번호, 이름, 주소를 입력받아 저장 후 출력
		 * 5-2. 외국인 등록번호가 없으면 회원가입 불가
		 * 6. 선택을 잘못한 경우 -> "잘못 누르셨습니다." 출력 후 종료
		 */
		System.out.print("==회원가입==");
		System.out.print("\n먼저 나이를 입력해주세요 : ");
		int userAge = sc.nextInt();
		
		if(userAge < 20) {
			System.out.println("미성년자는 회원가입할 수 없습니다.");
			
		} else {
			System.out.print("외국인인가요??(Y/N)");
			char isForeigner = sc.next().charAt(0);
			
			if(isForeigner == 'N') {
				System.out.println("한국인이시군요. 회원가입 정보를 입력해주세요.");
				
				System.out.print("이름을 입력해주세요 : ");
				String userName = sc.next();
				System.out.print("주소를 입력해주세요 : ");
				String useraddress = sc.next();
				
				System.out.println("\n===...처리 중....===\n");
				System.out.printf("%d살이며 주소가 %s인 %s님, 회원가입이 완료되었습니다.",userAge, useraddress, userName);
			
			} else if(isForeigner == 'Y') {
				System.out.print("외국인 등록번호를 가지셨습니까??(Y/N)");
				char isForeignerNum = sc.next().charAt(0);
				
				if(isForeignerNum == 'N') {
					System.out.println("외국인 등록번호가 없으시면 가입이 불가능합니다.");
				} else if(isForeignerNum == 'Y') {
					System.out.println("등록번호가 있으시군요. 회원가입 정보를 입력해주세요.");
					
					System.out.print("이름을 입력해주세요 : ");
					String foreignerName = sc.next();
					
					System.out.print("주소를 입력해주세요 : ");
					String foreignerAddress = sc.next();
					
					System.out.print("외국인 등록번호를 입력해주세요 : ");
					int foreignerNum = sc.nextInt();
					
					System.out.println("\n외국인 등록번호 확인되었습니다. 압력하신 번호 : " + foreignerNum);
					System.out.println("\n===...처리 중....===\n");
					System.out.printf("\n%d살이며 주소가 %s인 %s님, 회원가입이 완료되었습니다.", userAge, foreignerAddress, foreignerName);
				} else {
					System.out.println("잘못입력하셨습니다. 재시도해주세요.");
				}
			} else {
				System.out.println("잘못입력하셨습니다. 재시도해주세요.");
			}
		}
	}
}
