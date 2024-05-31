
public class Account {

	// 계좌 관리 Thread

	private int balance = 1000; // 잔고

	public int getBalance() {
		return balance;
	}

//	public synchronized void withdraw(int money) {
//		// synchronized : 동기화, lock을 걸어준다
//		// 출금 기능
//		if (balance >= money) {
//			try {
//				Thread.sleep(1000);// Account를 사용하는 thread에 영향을 줌
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//
//			balance -= money; // 1초마다 금액 차감
//		}
//	}

	public void withdraw(int money) {
		synchronized (this) {
			// 출금 기능
			if (balance >= money) {
				try {
					Thread.sleep(1000);// Account를 사용하는 thread에 영향을 줌
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				balance -= money; // 1초마다 금액 차감
			}
		}

	}

}
