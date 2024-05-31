package com.list;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		// 문자열 대소비교 (사전의 알파벳 순서)
		String[] strArr = { "cat", "Dog", "lion", "tiger" };
		System.out.println("정렬 전 : " + Arrays.toString(strArr)); // 정렬전

		// Arrays 클래스 사용
		// 오름차순 -> sort(값)
		Arrays.sort(strArr);
		System.out.println("정렬 후(오름차순) : " + Arrays.toString(strArr)); // 정렬 후

		// 내림차순-> sort(값, 정렬방식) 사용
		Arrays.sort(strArr, new Descending()); // 내림차순
		// descneding은 생성해야하는 객체이기 때문에 new를 붙인다
		System.out.println("정렬 후(내림차순) : " + Arrays.toString(strArr));

		// comparable
		// comparator

		System.out.println("===========================");

		Integer[] intg = { new Integer(1), 5, 2, 4, 3 };
		System.out.println(Arrays.toString(intg));

		Arrays.sort(intg);
		System.out.println("정렬 : " + Arrays.toString(intg));

		Arrays.sort(intg, new Desending2());
		System.out.println("정렬2 : " + Arrays.toString(intg));

	}

}

class Desending2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		if (o1 instanceof Integer && o2 instanceof Integer) {
			Integer i1 = (Integer) o1;
			Integer i2 = (Integer) o2;

			return i1.compareTo(i2) * -1;
		}
		return -1;
	}

}

class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// sort에서 받아온 o1, o2는 String이기 때문에 String 타입으로 변경해야한다
		if (o1 instanceof String && o2 instanceof String) {
			String s1 = (String) o1;
			String s2 = (String) o2; // 캐스팅

//			return s1.compareTo(s2); // 양수 or 0 or 음수 반환 => 오름차순(작은값을 앞으로)
//			return s2.compareTo(s1); // => 내림차순
			return s1.compareTo(s2) * -1; // 오름차순을 내림차순으로 변경식
		}
		// return 0;
		return -1; // 내림차순
	}

}