package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };

		Set set = new HashSet();

		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}

		System.out.println("출력된 총 데이터 : " + set); // toString 생략되어있음
		// 첫번째 1은 String이고 두번쨰 1은 integer, 다른 타입의 데이터이기 때문에 중복되는 부분이 아니다
	}

}
