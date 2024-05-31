
public class ThreadTest5 {

	public static void main(String[] args) {

		// 생성
		Runimpl5_1 run_ = new Runimpl5_1();

		Thread th1 = new Thread(run_, "*"); // 이름 부여 ""을 안쓴다면 그냥 Thread0이 된다
		Thread th2 = new Thread(run_, "**");
		Thread th3 = new Thread(run_, "***");

		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000); // main thread가 2초동안 일시정지
			th1.suspend(); // th1를 2초후에 일시정지
			Thread.sleep(2000);
			th2.suspend(); // th2도 2초후에 일시정지
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop(); // 강제종료
			th2.stop(); // 강제종료
			Thread.sleep(2000);
			th3.stop(); // 강제종료
		} catch (InterruptedException e) { // sleep의 예외 처리
			e.printStackTrace();

		}

	}

}
