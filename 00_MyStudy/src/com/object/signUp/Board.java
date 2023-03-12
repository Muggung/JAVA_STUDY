package com.object.signUp;

public class Board {
	/*
	 * 1. 커뮤니티 사이트에서 게시판을 운영할 예정이다.
	 * 2. 게시판 정보를 받을 객체를 만들어보자.
	 * 3. 제목, 글쓴이, 내용, 날짜가 들어가야한다.
	 * 3-1. 첫번째 글, 나야나, 첫번째 글쓰다, 23/03/10
	 * 3-2. 두번째 글, 너야나, 두번째 글쓰다, 23/03/20
	 * 4. 생성 후 출력하기
	 */
	public Board(){
		System.out.println("예제) ");
		System.out.println("제목 : 두번째 글\n글쓴이 : 너야나\n내용 : 두번째 글쓰다\n날짜 : 23/03/20");
	};
	
	public Board(String paramTitle, String paramUser, String paramContent, String paramDate){
		System.out.printf("제목 : %s\n글쓴이 : %s\n내용 : %s\n날짜 : %s",
				paramTitle, paramUser, paramContent, paramDate);
		
	}
}
