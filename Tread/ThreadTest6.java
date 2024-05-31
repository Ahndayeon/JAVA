
public class ThreadTest6 {

	public static void main(String[] args) {
		// 동기화 Test

		RunnableEx6_1 run6 = new RunnableEx6_1();

		new Thread(run6).start();
		new Thread(run6).start();
		// 하나의 Thread로 2개의 Thread를 구성하면 내부의 맴버 변수는 공유되어진다 -> Static변수
		// 1번 Thread가 종료 되지 않았는데 2번은 기다리지 않고 바로 시작되어 둘이 딜레이 없이 진행되고 -값이 나오게 된다
	}

}
