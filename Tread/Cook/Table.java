import java.util.ArrayList;

public class Table {

	// 음식을 담을 접시

	// 재료
	String[] dishNames = { "donut", "donut", "burger" };

	// 음식을 6개까지만 만들도록 고정
	final int Max_food = 6; // 음식 제작 최대값

	// 접시
	private ArrayList<String> dishes = new ArrayList<>();

	// 음식 제작

	public synchronized void add(String dish) {
		// synchronized -> 동기화 처리
		// 메소드 앞에 붙임 : 해당 메소드를 동기화 처리함 -> lock을 건다
//		if (dishes.size() >= Max_food) {
//			return;
//		}
//
//		dishes.add(dish); // 음식 추가
//		System.out.println("Dishes :" + dishes.toString());

		// 수정
		// 요리사가 요리를 다 만들고 나면 할 일이 없기 때문에
		// 그 상황에서 쓰레드의 일시정지(wait)를 적용 -> 필요시 다시 재생(notify)
		while (dishes.size() >= Max_food) {
			String Tname = Thread.currentThread().getName();
			System.out.println(Tname + " is wating.");

			try {
				wait(); // 일시정지 상태
				Thread.sleep(500); // 0.5초
			} catch (InterruptedException e) {
			}
		}

		dishes.add(dish); // 음식 6개가 될때까지는 조리 진행
		notify(); // 음식이 나왔다고 공지 => 실행상태
		// 기다리고 있는 CUST를 깨우기 위함
		System.out.println("Dishes :" + dishes.toString());

	}

	// 음식 먹음(고객)
	public void remove(String dishName) { // boolean -> void
		String Tname = Thread.currentThread().getName();
		synchronized (this) { // 동기화 처리 -> 객체 자체를 동기화 처리
			// -> 아예 못들어오도록 현관문을 잠가버림

			while (dishes.size() == 0) {
				// 먹는 속도가 더 빠르기 때문에 음식 조리 시간을 기다려야한다
				// String Tname = Thread.currentThread().getName();
				System.out.println(Tname + " is waiting."); // 기다리는 손님 출력
				try {
					wait();
					Thread.sleep(500); // 0.5초 기다리기
				} catch (InterruptedException e) {

				}
			}

//			for (int i = 0; i < dishes.size(); i++) {
//				// 고객에 따라 먹을 수 있는 음식 구분하기
//				if (dishName.equals(dishes.get(i))) {
//					dishes.remove(i); // 먹은 음식의 정보는 삭제
//					return true; // 잘 먹음
//				}
//			}
//			 return false;

			// 추가
			while (true) {
				for (int i = 0; i < dishes.size(); i++) {
					// 고객에 따라 먹을 수 있는 음식 구분하기
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i); // 먹은 음식의 정보는 삭제
						notify(); // 요리사 다시 진행
						return; // 종료
					}
				}

				// 고객이 먹을 음식이 없을 때 고객 대기-> 요리를 만들 시간을 줘야한다
				try {
					System.out.println(Tname + " is waiting.");
					wait();
					Thread.sleep(500); // 0.5초 기다리기
				} catch (InterruptedException e) {

				}
			}

		}

	}

	// 재료 갯수(배열의 크기)
	// 메소드로 만든 이유 : 여러곳에서 반복적으로 재사용하기 위해서
	public int dishNum() {
		return dishNames.length;
	}
}
