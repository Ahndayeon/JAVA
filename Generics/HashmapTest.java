import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapTest {

	public static void main(String[] args) {

		// map은 타입을 2개 지정할 수 있다.
		Map<String, String> cities = new HashMap<>();

		cities.put("Tokyo", "Japan");
		cities.put("Seoul", "korea");
		cities.put("Beijing", "China");
		cities.put("Paris", "France");
		cities.put("Washington", "USA");
		cities.put("Braxilia", "Brazil");

		Iterator<Map.Entry<String, String>> it = cities.entrySet().iterator(); // 제네릭 타입으로 지정

		// Map.Entry => getKey(), getValue()

//		while (it.hasNext()) {
//			Map.Entry<String, String> entry = it.next(); // 반환타입 Map.Entry<String, String>
//			System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
//		}
		for (Map.Entry<String, String> entry : cities.entrySet()) {
			System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
		}

	}

}
