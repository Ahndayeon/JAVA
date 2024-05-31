package com.list;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class Studentn implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	int getTotal() { // 합계
		return kor + eng + math;
	}

	float getAverage() { // 평균
		return getTotal() / 3;
	}

	@Override
	public int compareTo(Object o) { // object o -> student
		if (o instanceof Studentn) {
			Studentn other = (Studentn) o;

			// return this.no - other.no; // 번호로 오름차순
			// return (this.no - other.no) * -1; // 번호로 내림차순

			return this.name.compareTo(other.name); // 이름으로 오름차순
			// return this.name.compareTo(other.name) * -1; // 이름으로 내림차순

		}
		return -1;
	}
}
