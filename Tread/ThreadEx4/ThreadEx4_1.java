
public class ThreadEx4_1 extends Thread {

	@Override
	public void run() {
		int i = 10;

		while (i != 0 && !isInterrupted()) {
			// isInterrupted()가 호출되었다면 false가 호출된다 -> 카운트가 찍히지 않는다
			// 그래서 !isInterrupted로 호출하게 된다 -> 카운트가 잘 작동된다
			System.out.println(i--);
//			for (long x = 0; x < 250000000000000000L; x++) {
//
//			}  //중간에 멈춘다

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// interrupt(); //생략 가능 => interrupted 속성값을 false로 자동 초기화한다
				System.out.println("예외가 발생했습니다");
			} // 멈추지 않고 계속 진행한다
		}

		System.out.println("카운트가 종료 되었습니다.");
	}

}
