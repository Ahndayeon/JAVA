
public class ThreadEx3_2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}

		System.out.println("<< th2 종료 >>");
	}

}
