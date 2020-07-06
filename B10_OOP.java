
public class B10_OOP {

	// 객체지향 프로그래밍 (OOP: Object Oriented Programming)
	//	- 세상에 존재하는 모든 객체를 변수와 함수로 표현하려는 프로그래밍 방법 
	//	- 변수는 객체의 현재 상태를 나타내고 함수(메서드)는 행동 및 기능을 나타낸다
	//	- 객체 (Object) : 세상에 존재하는 모든 개념을 말한다 (사물, 추상적인 것 등) 
	
	// ex: 사과 객체
	//	- 상태 (변수로 표현) : 색깔, 크기, 딴 날짜, 신선도 ... 
	//	- 기능 (메서드로 표현) : 먹기, 색깔이 변한다, 던지기 ...  
	
	// 클래스 (class)
	//	- 객체를 프로그래밍 언어로 표현한 것 
	//	- 객체의 설계도 (정의한 시점에서는 실체가 없음)
	//	- 클래스를 통해 생성하는 실제 객체를 '인스턴스'라고 부른다
	//	- 클래스는 참조형 변수 타입이다 (나만의 타입을 정의하는 것)
	
	public static void main(String[] args) {
		
		// new 
		//	- 클래스(설계도)를 이용해 실체(인스턴스)를 생성한다
		//	- new 뒤에 클래스 이름으로 된 함수를 호출하면 
		//	    새로운 인스턴스가 메모리에 생성되고 그 주소값이 반환된다 

		// 똑같이 생긴 사과를 같은 설계도로 여러개 찍어낼 수 있다
		Apple a1 = new Apple();
		Apple a2 = new Apple();		
		
		System.out.println("Apple타입 인스턴스 a1의 주소 : " + a1);
		System.out.println("Apple타입 인스턴스 a2의 주소 : " + a2);
		
		// 인스턴스 변수에 값을 대입하기
		a1.color = "red";
		a2.color = "green";
		
		// 인스턴스 변수에 저장된 값을 사용하기
		System.out.println("a1의 색깔 : " + a1.color);
		System.out.println("a2의 색깔 : " + a2.color);
		
		// 클래스 타입 배열 사용하기 
		Apple[] apples = {
			new Apple(), 
			new Apple(), 
			new Apple(), 
			new Apple()	
		};
		
		apples[0].sweet = 10;
		apples[1].sweet = 11;
		apples[2].sweet = 7;
		apples[3].sweet = 6;
		
		System.out.println("apples[0]의 당도 : " + apples[0].sweet);
		System.out.println("apples[1]의 당도 : " + apples[1].sweet);
		System.out.println("apples[2]의 당도 : " + apples[2].sweet);
		System.out.println("apples[3]의 당도 : " + apples[3].sweet);
		
		// 초기화 하지 않은 클래스 멤버 변수들은 배열처럼 초기화가 되어 있다
		//	- 정수 : 0, 실수 : 0.0, boolean : false, 참조형 : null		
		System.out.println(apples[0].size);
		System.out.println(apples[0].worm);
		System.out.println(apples[0].color);		
		
		
		// Apple[]을 500크기로 선언했다는 것은 
		// Apple클래스의 인스턴스를 500개 선언한 것이 아니라
		// Apple클래스의 인스턴스가 들어갈 수 있는 슬롯을 500개 생성한것이다.
		Apple[] box = new Apple[100];
		
		System.out.println("box[50] : " + box[50]); 
		
		// 인스턴스는 하나만 생성하고 모든 배열이 같은 사과를 가리키게 만들었다
		box[0] = new Apple();
		
		for (int i = 1; i < box.length; ++i) {
			box[i] = box[0];			
			// box[i] = new Apple();
		}
		
		System.out.println("box[0] : " + box[0]);
		System.out.println("box[50] : " + box[50]);
		
		box[0].color = "red";		
		System.out.println("box[99] : " + box[99].color);
		
		box[99].color = "blue";		
		System.out.println("box[0] : " + box[0].color);
	}
}

class Apple {	
	// 클래스의 인스턴스 변수 (필드값, 멤버변수, 속성)
	int size;	
	int weight;
	int sweet;
	int location;
	boolean worm;
	String color;	
	String pick_date;
}














