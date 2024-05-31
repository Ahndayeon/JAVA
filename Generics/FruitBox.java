
public class FruitBox<T extends Fruit & Eatable> extends Box<T> {
	// 제네릭한 class를 상속받는 class도 제네릭해야한다
	// 부모의 제네릭 타입은 자식에게 동일한 타입으로 적용된다

	// T의 타입의 범위를 제한하는 클래스
	// <T extends Fruit> : T는 Fruit class를 상속해야한다 (제한)

	// 제네릭 타입을 지정하는 부분에서의 상속은 extends로 통일한다

}
