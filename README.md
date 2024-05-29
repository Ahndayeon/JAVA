# JAVA
---
---
## 객체
---
#### 객체 지향
-> 객체는 속성과 기능으로 이루어져 있다
class 클래스명 {     
     **속성(변수)**
     <U>생성자(기본 생성자)</U> - 필요에 따라 사용(기본 생성자는 없어서는 안된다)
     **기능(메소드)**
}


## Collection
collection framework : 데이터를 저장하는 방식, 다수의 데이터를 쉽고, 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합 → 자료 구조(변수), 주소값을 받음
⇒ 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화 하여 클래스로 구현
⇒ 지정해야하는 크기가 없다. 무한으로 데이터를 받을 수 있다
⇒ 데이터 타입 : Object 타입
*framework : 구조화 되어있다
*인터페이스 : 상위에서 하위로 내려 표준화 시킴.
#### 주요 인터페이스
1. list : **순서가 있는** 데이터의 집합, 데이터의 중복을 허용    / 구현 클래스 : **ArrayList**, Vector, LinkedList, Stack, Queue
2. set : **순서가 없는** 데이터의 집합, **데이터의 중복을 허용하지 않는다**    / 구현 클래스 : **HashSet**, TreeSet
- 중복된 값을 걸러 주기 때문에 따로 중복을 여부를 판단할 필요가 없다(ex - 로또 번호 )
1. map : 키(K)와 값(V)의 한쌍으로 이루어지는 데이터의 집합으로, 순서가 없음. **키는 중복을 허용하지 않지만** **값은 중복될 수 있음**    / 구현 클래스 : **HashMap**, TreeMap, Hashtable, Properties
- K :  V를 사용하기 위한 정보
- ex - 전화번호 관리, 회원 정보 관리

⇒ list와 set은 collection 인터페이스를 상속받지만 map은 별도로 정의
![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/8578dd72-e8e5-4e25-bd80-a3b913addcd4/387d0896-b983-4985-a759-4590b48817b3/Untitled.png)

## List
- ArrayList → 기본적으로 크기가 10인 object 타입으로 생성된다 (하지만 크기는 알아서 늘어나기 때문에 크게 의미는 없다)
![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/8578dd72-e8e5-4e25-bd80-a3b913addcd4/13d902ef-cc9b-4d37-88e5-0f742ac9a9b4/Untitled.png)
참고 :: https://docs.oracle.com/javase/8/docs/api/


