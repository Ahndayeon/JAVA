
public class ThreadEx1_1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}

	// run() 메소드를 오버라이딩 해야한다.

}
