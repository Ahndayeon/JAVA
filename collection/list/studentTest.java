package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class studentTest {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(new Studentn("홍길동", 1, 3, 100, 100, 100));
		list.add(new Studentn("나나나", 1, 2, 80, 100, 90));
		list.add(new Studentn("마마마", 1, 1, 56, 34, 56));
		list.add(new Studentn("바바바", 1, 5, 99, 78, 45));
		list.add(new Studentn("하하하", 1, 4, 78, 98, 100));

//		System.out.println(list);  //입력 순서대로 정렬

		Collections.sort(list);
		// 이름 기준으로 오름차순 정렬
		// System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Studentn s = (Studentn) it.next();
			System.out.println(s.toString()); // 꼭 toString 안붙여도됨
		}

		System.out.println("================");

		// no_sort 사용하여 정렬
		Collections.sort(list, new no_sort());

		Iterator it2 = list.iterator();

		while (it2.hasNext()) {
			Studentn s2 = (Studentn) it2.next();
			System.out.println(s2.toString());
		}

	}

}

class no_sort implements Comparator { // no를 기준으로 오름차순으로 정렬

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Studentn && o2 instanceof Studentn) {
			Studentn s1 = (Studentn) o1;
			Studentn s2 = (Studentn) o2;

			// return s1.no - s2.no; // 오름차순
			return s2.no - s1.no; // 내림차순
		}
		return -1;
	}

}
