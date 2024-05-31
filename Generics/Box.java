import java.util.ArrayList;

public class Box<T> {

	ArrayList<T> list = new ArrayList<>();

	void add(T item) {
		list.add(item); // arraylist에 item 입력
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}

}
