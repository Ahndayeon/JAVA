
public class Customer implements Runnable {

	private Table table;
	private String food; // 먹기로 한 음식의 종류

	// 초기화
	public Customer(Table table, String food) {
		super();
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		// 음식
		while (true) {
			// 요리사가 만드는 속도보다 느리게 먹어야한다
			// 일시정시 속성을 사용하여 쓰레드 속도 조절
			try {
				Thread.sleep(100); // 1/100초-> 0.1초 => 먹는속도 올리기
				// 음식이 만들어진 이후에 음식을 먹도록
			} catch (InterruptedException e) {

			}

			String Tname = Thread.currentThread().getName();// Thread이름

			table.remove(food); // 추가
			System.out.println(Tname + " ate a " + food); // 추가

//			if (eatFood()) { // true
//				System.out.println(Tname + " ate a " + food);
//			} else { // false
//				System.out.println(Tname + " failed to " + food);
//			}

		}

	}

//	// 음식 먹기
//	boolean eatFood() {
//		return table.remove(food); // true: 잘먹음 / false : 음식이 없었다
//	}

}
