package com.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		// map
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("dsfs", "2356");
		map.put("dsfs", "1234");

//		System.out.println(map);
		System.out.println(map.get("myId")); // key를 이용해서 value를 반환

		// 로그인 프로그램

		Scanner sc = new Scanner(System.in);

		while (true) {
			// 입력
			System.out.println("ID와 PW를 입력하세요 : ");
			System.out.println("ID : ");
			String id = sc.nextLine();
			System.out.println("PW : ");
			String pw = sc.nextLine();

			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("입력한 아이디는 존재하지 않습니다");
				continue;
			} else {
				if (!(map.get(id)).equals(pw)) {
					System.out.println("비밀번호가 일치하지 않습니다");
					continue;
				} else {
					System.out.println("아이디와 비밀번호가 모두 일치합니다");
					break;
				}
			}

		}
	}

}
