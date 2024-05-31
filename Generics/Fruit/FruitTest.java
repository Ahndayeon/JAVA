
public class FruitTest {

	public static void main(String[] args) {

		Box<Fruit> fruitbox = new Box<Fruit>();
		Box<Apple> applebox = new Box<Apple>();
		Box<Toy> toyBox = new Box<>();

		fruitbox.add(new Fruit());
		fruitbox.add(new Apple());
		// Apple은 Fruit의 상속 관계이기 때문에 담을 수 있다(상속 관계에 의한 다형성)

		applebox.add(new Apple());
		// applebox.add(new Toy()); //타입 불일치

		toyBox.add(new Toy());
		// toyBox.add(new Apple()); //타입 불일치

		System.out.println(fruitbox);
		System.out.println(applebox);
		System.out.println(toyBox); // 담긴 물건 확인

	}

}
