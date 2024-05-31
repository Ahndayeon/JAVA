
public class Cook implements Runnable {

	// 생성자를 이용한 table 초기화
	private Table table;

	public Cook(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() {
		// 요리
		// 최대 6개까지 요리 제작

		while (true) {
			int randnum = (int) (Math.random() * table.dishNum());
			// 난수 0~2 사이의 수
			table.add(table.dishNames[randnum]);

			// 일시정시 속성을 사용하여 쓰레드 속도 조절
			try {
				Thread.sleep(10); // 1/1000 -> 0.1 -> 0.001초 단위로 수정시간 변경
			} catch (InterruptedException e) {

			}
		}
	}

}
