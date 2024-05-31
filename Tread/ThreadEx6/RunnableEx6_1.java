
public class RunnableEx6_1 implements Runnable {
	Account acc = new Account();

	// 통장 만들기
	// 맴버 변수는 공유 되어진다

	@Override
	public void run() {
		while (acc.getBalance() > 0) {
			// 100, 200,300 에서 랜덤으로 출력
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}

	}

}
