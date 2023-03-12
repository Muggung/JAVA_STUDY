package com.loop.for_loop;
import java.util.Scanner;

public class Loop {
	public void myFriend() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 친구 5명의 이름을 입력받는다.
		 * 입력받은 친구 5명의 이름을 모두 출력한다.
		 */
		String total = "";
		for(int i=1; i<=5; i++) {
			System.out.print("친구를 입력해주세요 : ");
			String friend = sc.next();
			total += friend + " ";
			System.out.println(i + "번째 입력한 친구 : " + friend);
		}
		System.out.println(total);
	}
	
	public void sum() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 숫자 4개를 입력받는다.
		 * 숫자 4개를 더한 값을 출력한다.
		 */
		int result = 0;
		for(int i=1; i<=4; i++) {
			System.out.print(i + "번째 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			result += num;
		}
		System.out.println("총 합 : " + result);
	}
	
	public void loopMsg() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 메세지를 입력받고 출력한다.
		 * 2. 메세지는 사용자가 "끝"을 입력할 때 까지 계속 반복된다.
		 * 3. 사용자가 "끝"이라는 메세지를 입력할 때까지 입력받고 입력받은 내용을 모두 출력한다.
		 * 단, "끝" 메세지는 포함하지않기!!
		 */
		String userMsg = "";
		String resultMsg = "";
		
		for(;!userMsg.equals("끝");) {
			resultMsg += userMsg;
			System.out.print("메세지를 입력해주세요 : ");
			userMsg = sc.next();
		}
		System.out.println(resultMsg);
	}
}
