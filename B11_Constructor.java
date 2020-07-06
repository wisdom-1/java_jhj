
public class B11_Constructor {

	// 클래스의 생성자 (Constructor)
	//	- 클래스의 이름과 똑같은 이름의 함수
	//	- 리턴 타입이 없다
	//	- new와 함께 클래스의 생성자를 호출하면 인스턴스가 생성된다
	//	- 생성자를 선언하지 않은 클래스는 기본 생성자를 자동으로 생성해 준다
	
	public static void main(String[] args) {
		// 오렌지 클래스는 생성자를 따로 정의하지 않았기 때문에 기본 생성자를 사용한다
		Orange orange01 = new Orange();
		
		System.out.println(orange01.size);
		System.out.println(orange01.sweet);
		
		Grape grape01 = new Grape();
		
		System.out.println(grape01.num);
		System.out.println(grape01.color);
		
		// 딸기 클래스는 다른 형태의 생성자를 정의했기 때문에 
		// 기본 생성자가 자동으로 생성되지 않았다 
		Strawberry berry01 = new Strawberry(50, 99);
		Strawberry berry02 = new Strawberry(60, 80);
		
		System.out.println("berry01의 씨 개수 : " + berry01.seed);
		System.out.println("berry01의 맛 : " + berry01.sweet);
		
		System.out.println("berry02의 씨 개수 : " + berry02.seed);
		System.out.println("berry02의 맛 : " + berry02.sweet);
		
		// Cherry클래스는 기본생성자가 자동으로 생성되지는 않았지만
		// 기본생성자를 따로 정의했기 때문에 사용할 수 있다 
		Cherry cherry01 = new Cherry();
		Cherry cherry02 = new Cherry(3.33);		// double은 맛 설정
		Cherry cherry03 = new Cherry(0x00FF00); // int는 색 설정
		
		System.out.println(cherry01.taste);
		System.out.println(cherry01.loc);
		System.out.println(cherry01.fresh);
		System.out.println(cherry01.color);
	}	
	
	// 오늘 배운 객체지향 내용을 바탕으로 myobj 패키지에 클래스를 하나 정의해보세요 
	//	1. 과일은 금지
	//	2. 변수 3개 이상
	//	3. 생성자 2개 이상
}

class Orange {
	int size;
	int sweet;
}

class Grape {
	int num;
	String color;
	
	// Grape클래스의 기본 생성자 
	Grape() {
		// 일반적으로, 생성자는 클래스의 멤버 변수 값을 초기화 하는 용도로 사용한다
		num = 23;
		color = "보라색"; 
	}	
}

class Strawberry {
	int seed;
	int sweet;
	
	// Strawberry클래스의 매개변수를 받는 생성자  
	Strawberry(int seed, int sweetness) {
		// this.seed : 인스턴스 변수 seed
		// seed : 매개변수로 전달받은 seed		
		
		// this
		//	- 현재 인스턴스 자기 자신을 뜻한다
		//	- 어떤 인스턴스에서 호출하느냐에 따라 달라지는 값이다
		this.seed = seed;
		
		// 이름이 다른 경우에는 this로 구분해 줄 필요가 없다
		sweet = sweetness;
	}
}


class Cherry {
	int color;
	double taste;
	int fresh;
	String loc;
	
	// 생성자 오버로드 
	//	- 매개 변수의 개수가 다르거나 
	//    개수는 같지만 타입이 다른 생성자를 여러개 정의하는 것
	
	// 기본값을 설정해주는 기본 생성자
	Cherry() {
		color = 0xFF0000;
		taste = 80.00;
		loc = "기본값";
		fresh = 10;
	}
	/** 
	 * 맛만 설정하는 생성자
	 */
	Cherry(double taste) {
		this.taste = taste;
	}
	/** 
	 * 색깔만 설정하는 생성자
	 * @param color
	 */
	Cherry(int color) {
		this.color = color;
	}	
	// 원산지만 설정하는 생성자
	Cherry(String loc) {
		this.loc = loc;
	}
	// 색깔과 맛을 설정하는 생성자
	Cherry(int color, int taste) {
		this.color = color;
		this.taste = taste;
	}
}









