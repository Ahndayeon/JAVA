package com.list;

import java.util.ArrayList;

public class Arraylisttest {

	public static void main(String[] args) {

		// 객체 생성
		ArrayList list = new ArrayList(); // 배열 구조 //크기를 지정할 수는 있지만 크게 의미는 없다

		// auto boxing
		// 기본형을 참조형으로
		// integer(1) -> boxing
		// Integer i = 3;

		list.add(new Integer(1));
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		int sum = 0;

		for (Object obj : list) {
			int i = (Integer) obj;
			sum += i;
		}

		System.out.println(sum);

//		for (int i = 0; i < list.size(); i++) {
//		 int num = (Integer) list.get(i); // unboxing을 했기 때문에 int값으로 받아올 수 있다
//			sum += num;
//		}

//		System.out.println(sum);

//		// 쓰기
//		list.add(new String("5")); // 객체 정보 넣기 //캐스팅
//		list.add("1"); // 이렇게 넣어도 가능( 따로 지정하지 않아도 알아서 String타입으로 넣어진다
//		list.add("4");
//		list.add("3"); // index 3
//		list.add("2");
//		list.add("2"); // index 5

//		for (int i = 0; i < list.size(); i++) {
//			// 값이 있는 만큼 돌기
//			String s = (String) list.get(i);
//			System.out.println(s);
//		}
//
//		// 읽기
//		String s1 = (String) list.get(0); // 0번째 인덱스 값을 읽어옴 //다운캐스팅
//		String s2 = (String) list.get(4);
//		String s3 = (String) list.get(5);
//
//		System.out.println("s1 : " + s1.toString());
//		System.out.println("s2 : " + s2);
//		System.out.println("s3 : " + s3); // 중복 허용
//
//		// 수정
//		list.set(3, "AA");
//		String s4 = (String) list.get(3);
//		System.out.println("s4 : " + s4);
//
//		// 데이터 크기
//		System.out.println("arraylist가 데이터를 가지고 있는 크기 : " + list.size());
//
//		// 삭제
//		list.remove(5);
//		System.out.println("삭제 후 데이터 크기 : " + list.size());
//
//		list.remove(2);
//		System.out.println("삭제 후의 list의 인덱스 2의 값 : " + list.get(2));
//		System.out.println("삭제 후의 list의 인덱스 3의 값 : " + list.get(3));
	}

}
