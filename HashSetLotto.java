package com.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet();

		// 1~45 사이의 난수 중에서 6개의 숫자를 중복없이 set에 저장해서 출력하세요.

//		while (set.size() < 6) {
//			int random = (int) (Math.random() * 45 + 1);
//			set.add(random);
//		} // set이 중복값을 받지 않고 1~45사이에서 6개의 난수가 출력되도록
//
//		System.out.println(set);

		for (int i = 0; set.size() < 6; i++) {
			int lotto = (int) (Math.random() * 45 + 1);
			set.add(lotto);
		}
		System.out.println(set);

		List list = new ArrayList(set); // set을 list 타입으로 변경
		Collections.sort(list); // Collections.sort(정렬할 대상);
		System.out.println("정렬 : " + list);

	}

}
