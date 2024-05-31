
public class ThreadTest1 {

	public static void main(String[] args) {

		// Thread클래스
		// Runnable인터페이스
		// Thread 특징
		// 1. 순서대로 실행되지 않는다
		// 2. 끝나는 순서도 정해져있지 않는다

		// 1. Thread class를 상속받는 방법
		ThreadEx1_1 t1 = new ThreadEx1_1();

		// 2. Runnable 인터페이스를 구현하는 방법
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();

	}
}
