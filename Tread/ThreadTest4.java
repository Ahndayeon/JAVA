import javax.swing.JOptionPane;

public class ThreadTest4 {

	public static void main(String[] args) {
		// interrupt()

		// interrupted 속성(boolean 타입) : interrupt() 호출되어지면 변수의 값이 변경된다
		// true와 false가 바뀐다

		// isInterrupted()
		// interttupted 속성값을 반환한다

		ThreadEx4_1 th1 = new ThreadEx4_1(); // 생성
		th1.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은" + input + "입니다.");

		System.out.println("isInterrupted() :" + th1.isInterrupted());

		th1.interrupt(); // interrupted 속성 true로 변경
		System.out.println("isInterrupted() :" + th1.isInterrupted());
		System.out.println("isInterrupted() :" + th1.isInterrupted());
		System.out.println("isInterrupted() :" + th1.isInterrupted());

	}

}
