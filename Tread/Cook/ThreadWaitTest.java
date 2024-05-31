
public class ThreadWaitTest {

	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();

		new Thread(new Cook(table), "COOK1").start(); // 0.001
		new Thread(new Customer(table, "donut"), "CUST1").start(); // 0.01
		new Thread(new Customer(table, "burger"), "CUST2").start(); // 0.01

		Thread.sleep(5000); // 0.1초-> 5초
		System.exit(0); // 마지막에 결과를 보기 위해 강제 종료
	}

}
