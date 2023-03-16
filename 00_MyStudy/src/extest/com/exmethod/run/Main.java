package extest.com.exmethod.run;

import extest.com.exmethod.controller.ExMethodController;

public class Main {
	public static void main(String[] args) {
		ExMethodController emc = new ExMethodController();
		// 1번 문제
		emc.printMsg("1번 문제");
		// 2번 문제
		emc.returnNum();
		// 3번 문제
		System.out.println(emc.evenOddNum(2));
		// 4번 문제
		System.out.println(emc.isEngStr("Hi 방가"));
		// 5번 문제
		emc.strChar("application", 'p');
		// 6번 문제
		emc.multiplicationNum(4);
	}
}
