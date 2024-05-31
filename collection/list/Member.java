package com.builder;

import lombok.Builder;
import lombok.Data;

//@Getter
//@Setter
////@NoArgsConstructor   //기본 생성자
//
//@RequiredArgsConstructor // final인 변수로만 생성자 구성
//@EqualsAndHashCode
//@ToString

@Data // 한번에 처리 -> @ToString, @EqualsAndHashCode, @RequiredArgsConstructor,
		// @NoArgsConstructor, @Setter, @Getter를 다 포함
@Builder // 따로 생성자 없이 객체 생성 -> @Data와 함께 사용한다
public class Member {
	private String id;
	private String name;
	private final String age;
}
