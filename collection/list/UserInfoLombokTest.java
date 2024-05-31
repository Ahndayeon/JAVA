package com.builder;

public class UserInfoLombokTest {

	public static void main(String[] args) {
		UserInfoLombok userInfoLombok = UserInfoLombok.builder().firstName("lombok 적용").secondName("객체 생성").build();
		// -> 생성자와 매개 변수의 수가 동일해야하지만 builder로 지정한 것은 지정한 수만큼만 적용해도 가능하다
		System.out.println(userInfoLombok.getUserInfo());

		// age의 값이 0이 나오는 이유 : builder 패턴을 사용하게 되면 초기화 값이 들어가지않고 builder에서 초기화한 값만 적용이
		// 된다
		// @Builder.Default를 사용하게 되면 명시적 초기화 값을 사용할 수 있다
	}

}
