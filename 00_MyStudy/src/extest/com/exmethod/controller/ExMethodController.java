package extest.com.exmethod.controller;

import java.util.Arrays;

public class ExMethodController {
	
		// 1. 전달된 메세지를 출력하는 메소드 구현
		public void printMsg(String msg) {
			System.out.println(msg);
		}
		
		// 2. 1 ~ 10까지 합을 반환하는 메소드 구현
		public int returnNum() {
			int num = 0;
			for(int i=1; i<=10; i++) {
				num += i;
			}
			return num;
		}
		
		// 3. 전달받은 정수가 홀수인지 짝수인지 확인한 결과를 반환하는 메소드 구현
		public char evenOddNum(int num) {
			char evenOdd = ' ';
			if(num % 2 == 0) {
				evenOdd = '짝';
			} else {
				evenOdd = '홀';
			}
			return evenOdd;
		}
		
		// 4. 전달된 문자열에 영문자가 있는지 확인한 결과를 반환하는 메소드 구현
		public boolean isEngStr(String engStr) {
			boolean isEng = false;
			for(int i=0; i<engStr.length(); i++) {
				if(engStr.charAt(i) >= 'a' && engStr.charAt(i) <= 'z' || engStr.charAt(i) >= 'A' && engStr.charAt(i) <= 'Z') {
					isEng = true;
				}
			}
			return isEng;
		}
		
		// 5. 문자열과 문자를 전달받아  문자열에 문자가 몇개있는지 출력하는 메소드구현
		public void strChar(String msg, char ch) {
			int count = 0;
			for(int i=0; i<msg.length(); i++) {
				if(msg.charAt(i) == ch) {
					count++;
				}
			}
			System.out.println("문자열 : " + msg + "\n문자 : " + ch + "\n개수 : " + count);
		}
		
		// 6. 전달된 정수의 구구단을 출력하는 메소드 구현
		public void multiplicationNum(int num) {
			for(int i=1; i<10; i++) {
				System.out.println(num + " * " + i + " = " + num * 1);
			}
		}
		
		// 7. 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력
		// 7-1. 길이가 6인 배열을 만든다.
		// 7-2. 각 배열 인덱스번호에 랜덤숫자를 넣는다.
		// 7-3. 각 배열 인덱스번호에 랜덤숫자에 중복이 있는지 확인한다.
		// 7-4. 중복값이 있으면 다시 랜덤숫자를 넣고 확인한다.
		// 7-5. 중복값이 없다면 오름차순으로 정렬하여 출력
		
		// 2, 1, 1, 5, 6
		public void lottoRandomNum() {
			int[] lottoArr = new int[6];
			
			for(int i=0; i<lottoArr.length; i++) {
				lottoArr[i] = (int) (Math.random() * 45) + 1;
				for(int j=0; j<i; j++) {
					if(lottoArr[i] == lottoArr[j]) {
						i--;
						return;
					}
				}
			}
			
			for(int i=0; i<lottoArr.length; i++) {
				for(int j=0; j<i; j++) {
					if(lottoArr[i] < lottoArr[j]) {
						int t = lottoArr[i];
						lottoArr[i] = lottoArr[j];
						lottoArr[j] = t;
					}
				}
			}
			System.out.println(Arrays.toString(lottoArr));
		}
}
