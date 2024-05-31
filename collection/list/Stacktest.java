package com.list;

import java.util.LinkedList;
import java.util.Queue;

public class Stacktest {

	public static void main(String[] args) {
		// Stack
//		Stack st = new Stack();
//
//		st.push("0");
//		st.push("1");
//		st.push("2");
//
//		System.out.println(st);
//
//		while (!st.empty()) { // 비어있지 않은 경우 while
//			System.out.println(st.pop());
//		}

		// Queue

		Queue q = new LinkedList();

		q.offer("0");
		q.offer("1");
		q.offer("2");

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
