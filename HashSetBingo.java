package com.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetBingo {

	public static void main(String[] args) {
		// bingo 만들기
		// 1~50 사이의 난수 사이에서 25개의 숫자를 중복없이 2차원 배열에 저장

		Set set = new HashSet();

		int[][] board = new int[5][5]; // 2차원 배열 만들기

		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 50 + 1));
		}

		// System.out.println(set);

		// 값 섞기
		List list = new ArrayList(set);
		Collections.shuffle(list);

		// 값을 하나씩 가져온다
		Iterator it = list.iterator();

//		while (it.hasNext()) {
//			int num = (Integer) it.next();
//			System.out.print(num + ","); // 25개의 숫자가 낱개로 출력
//		}

		// 값을 낱개로 가져와서 2차원 배열에 하나씩 넣어주기
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = (Integer) it.next();
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}

	}

}
