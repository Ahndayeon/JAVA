import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("1");
		// list.add(new Integer(1)); // 제네릭스는 타입제한이 있기 때문에 앞에서 지정한 String만 가능하다
		list.add("2");
		list.add("2");

//		for (int i = 0; i < list.size(); i++) {
//			String s = list.get(i); // 타입이 이미 지정이 되어있기 때문에 캐스팅할 필요가 없다
//			System.out.println(s);
//		}

		for (String s : list) {
			System.out.println(s);
		}

	}

}
