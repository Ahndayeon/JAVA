package com.list;

import java.util.Stack;

public class StackExplore {

	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		// 브라우저 내에 앞으로 가기, 뒤로가기 기능의 데이터 주고받기
		goURL("1. 네이트");
		goURL("2. 카카오");
		goURL("3. 네이버");
		goURL("4. 구글"); // 4개의 사이트 순서대로 방문ㄴ

		printStatus(); // 방문 기록 출력

		goBack();
		System.out.println("이전 가기 클릭");
		printStatus();

		goBack();
		System.out.println("이전 가기 클릭");
		printStatus();

		goforward();
		System.out.println("다음 가기 클릭");
		printStatus();

		goURL("www.youtube.com");
		System.out.println("새로운 사이트 이동");
		printStatus();

	}

	public static void goURL(String url) { // url을 받아 back에 저장
		// url : 주소값 매개변수
		back.push(url); // back에 url 저장

		// back에 새로운 데이터인 url이 입력되는 순간 forward의 데이터 값을 삭제 진행
		if (!forward.empty()) {
			forward.clear(); // clear : 한번에 모든데이터 삭제
		}
	}

	public static void printStatus() { // 출력 함수
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);

		// 현재 실행 되는 사이트 정보
		System.out.println("현재 실행되고 있는 사이트 : " + back.peek()); // 정보를 삭제하지 않고 상단의 정보를 읽기만 실행
		System.out.println("=====================");
	}

	public static void goBack() {// back의 가장 위의 값을 forward로 옮기는 작업
		if (!back.empty()) {
			forward.push(back.pop()); // back의 데이터를 읽어옴과 동시에 그 값을 forward에서 넣고 back의 읽어온 데이터는 삭제
		}
	}

	public static void goforward() {// forward의 가장 위의 값을 back으로 옮기는 작업
		if (!forward.empty()) {
			back.push(forward.pop());
		}
	}

}
