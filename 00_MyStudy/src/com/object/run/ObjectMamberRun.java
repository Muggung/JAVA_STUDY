package com.object.run;

import com.object.member.Board;
import com.object.member.Mamber;

public class ObjectMamberRun {
	public static void main(String[] args) {
		// 1. 맴버
		Mamber mb = new Mamber();
		
		String mb1 = mb.setMamber("admin", "1234", "동제동이", 22, "비밀@naver.com");
		String mb2 = mb.setMamber("admin1", "4321", "동제동이1", 23, "비밀1@naver.com");
		String mb3 = mb.setMamber("admin2", "1234", "동제동이2", 24, "비밀2@naver.com");
		
		System.out.println(mb1);
		System.out.println(mb2);
		System.out.println(mb3);
		
		// 2. 게시판
		Board bd = new Board("안녕하세요", "반갑습니다.");
		
		
		System.out.println(bd.getBoard1());
		System.out.println(bd.getBoard2());
	}
}
