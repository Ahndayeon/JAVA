
public class ThreadTest3 {

	public static void main(String[] args) {
		// 생성
		ThreadEX3_1 th1 = new ThreadEX3_1();
		ThreadEx3_2 th2 = new ThreadEx3_2();

		th1.start();
		th2.start();
		// 시작은 th1이 먼저 했지만 th2가 먼저 실행되고 종료 될 수도 있고, th1이 먼저 실행 될 수 있다.
		// 순서를 알 수 없다

		try {
			Thread.sleep(2000); // sleep(시간 1000이 1초);
			// 2초동안 main이 멈춰있다.
			// 현재 sleep() 메소드를 호출한 Thread를 일시정지 시킨다

		} catch (InterruptedException e) { // sleep의 예외 처리
			e.printStackTrace();
		} // -> main 종료가 2초 있다가 발생하게 된다
			// -> sleep()으로 Thread로 제어할 수 있다

		System.out.println("<<main thread 종료>>");

	}

}
