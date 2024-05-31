
public class Runimpl5_1 implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName());
			// Thread 이름 출력

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}

	}

}
