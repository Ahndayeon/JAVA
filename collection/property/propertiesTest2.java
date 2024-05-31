package com.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class propertiesTest2 {

	public static void main(String[] args) {
		// input.txt 자료 활용
		// txt 내에 있는 자료는 문자형태 이다. 사용시 변환해서 사용해야한다

		Properties prop = new Properties();

		String inputFile = "src/input.txt"; // 경로 지정

		try {
			prop.load(new FileInputStream(inputFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// System.out.println(prop);

		String name = prop.getProperty("name");
//		String data = prop.getProperty("data");
		String[] data = prop.getProperty("data").split(","); // 배열 형태로
		// split의 반환타입은 1차원의 String

//		System.out.println(name);
//		System.out.println(data);
		System.out.println(Arrays.toString(data));

		int max = 0;
		int min = 0;
		int sum = 0;
		double avg = 0.0;

		String name_ = prop.getProperty("name"); // 이름

		// 값 비교
		// 최대
		for (int i = 0; i < data.length; i++) {
			int num = Integer.parseInt(data[i]);
			if (i == 0) {
				max = num;
				min = num;
			} else if (max < num) { // 최대
				max = num;
			} else if (min > num) { // 최소
				min = num;
			}
			sum += num; // 합계
		}
		avg = ((double) sum / data.length);

		System.out.println("이름 : " + name_);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f", avg);

	}

}
