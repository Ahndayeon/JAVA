package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

//		list.get(0);
//		
//		for(Object obj : list) {
//			String s = (String)list.get(0)
//		}

		// iterator 한 방식으로 컬렉션의 값 읽어오기

		Iterator it = list.iterator();

		while (it.hasNext()) {
			// hasNext() : 리스트의 첫번째 위치부터 시작해서 마지막 데이터가 있는 위치까지 이동하면서 값의 유무를 체크(boolean)
			String s = (String) it.next(); // 리스트에서 값을 읽어오기
			System.out.println(s);
		}

	}

}
