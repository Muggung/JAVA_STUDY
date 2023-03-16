package com.object.member;

public class Board {
	/*
	 * 1. 게시판을 저장할 수 있는 클래스를 만든다.
	 * 2. 2개의 게시글을 저장하고 출력
	 * 3. 매개변수있는 생성자로 생성 후 get을 이용해 출력
	 */
	private String board1;
	private String board2;
	
	public Board() {}
	
	public Board(String content1, String content2) {
		this.board1 = content1;
		this.board2 = content2;
	}

	public String getBoard1() {
		return this.board1;
	}

	public String getBoard2() {
		return this.board2;
	}
}
