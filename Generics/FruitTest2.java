
public class FruitTest2 {

	public static void main(String[] args) {

		FruitBox<Fruit> fruitbox = new FruitBox<Fruit>();
		FruitBox<Apple> applebox = new FruitBox<Apple>();
		FruitBox<Grape> grapebox = new FruitBox<Grape>();

		// FruitBox<Toy> toybox = new FruitBox<Toy>();
		// 상속 관계에서의 타입 불일치

		fruitbox.add(new Fruit());
		fruitbox.add(new Apple());
		fruitbox.add(new Grape());
		applebox.add(new Apple());
		grapebox.add(new Grape());

		// fruitbox.add(new Toy()); //타입 불일치
		// applebox.add(new Grape()); //타입 불일치

		System.out.println(fruitbox);
		System.out.println(applebox);
		System.out.println(grapebox);
	}

}
