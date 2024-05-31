package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// map

		Map map = new HashMap();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(50));
		map.put("안자바", new Integer(40));

		Set set;

		// key
		set = map.keySet();
		// System.out.println(set);

		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println("key: " + key + ", value : " + map.get(key));
		}

		System.out.println("===============================");

		// value
		int sum = 0;

		Iterator it2 = map.values().iterator();
		while (it2.hasNext()) {
			Integer i = (Integer) it2.next();
			sum += i;
			System.out.println("i : " + i);
		}

		System.out.println("sum : " + sum);
		System.out.println("===============================");

		// key, value 동시에

		Iterator it3 = map.entrySet().iterator(); // iterator한 방식으로 데이터 읽어오기

		while (it3.hasNext()) {
			Map.Entry e = (Map.Entry) it3.next(); // 반환 타입 : Map.Entry
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}

	}
}
