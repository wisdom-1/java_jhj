
public class B13_static {

	// static
	//	- 같은 클래스의 인스턴스가 공동으로 사용하는 영역을 말한다
	//	- static 영역은 클래스당 하나이기 때문에 클래스 이름에 .을 찍고 사용할 수 있다
	//	- static 변수/메서드는 인스턴스가 생성되기 전에도 사용할 수 있다
	
	public static void main(String[] args) {
		// card01/02/03이 생기기 전에도 static영역을 사용할 수 있다 
		System.out.printf("TrumphCard의 너비 %dmm\n", TrumphCard.width);
		System.out.printf("TrumphCard의 높이 %dmm\n", TrumphCard.height);
		
		TrumphCard card01 = new TrumphCard(1, "clover");
		TrumphCard card02 = new TrumphCard(2, "heart");
		TrumphCard card03 = new TrumphCard(3, "spade");
		
		System.out.println("card01의 가로 너비 : " + card01.width + "mm");
		System.out.println("card02의 가로 너비 : " + card02.width + "mm");
		System.out.println("card03의 가로 너비 : " + card03.width + "mm");
		System.out.println("TrumphCard의 가로 너비 : " 
								+ TrumphCard.width + "mm");
		
		// 모든 인스턴스에서 같은 값을 보고 있기 때문에 하나만 변경해도 모두 바뀐다
		card03.width = 77;
		
		System.out.println("card01의 가로 너비 : " + card01.width + "mm");
		System.out.println("card02의 가로 너비 : " + card02.width + "mm");
		System.out.println("card03의 가로 너비 : " + card03.width + "mm");
		System.out.println("TrumphCard의 가로 너비 : " 
								+ TrumphCard.width + "mm");
		
		// 아무 의미없이 100장 추가 생성
		for (int i = 0; i < 100; ++i)
			new TrumphCard(0, null);
		
		System.out.printf("여태까지 생성된 TrumphCard : %d장\n", 
				TrumphCard.count);
		
		// myobj 패키지에 static 변수와 메서드를 가진 클래스를 하나 정의해보세요 
		// (width, height 금지)
	}
	
}

class TrumphCard {
	// 인스턴스마다 값이 달라서 인스턴스 변수라고 부른다
	int number;
	String shape;	
	
	// 같은 클래스로 만들어진 모든 인스턴스에서 값이 같기 때문에 클래스 변수라고 부른다
	static int width = 50;
	static int height = 100;
	
	static int count = 0;

	public TrumphCard(int number, String shape) {
		this.number = number;
		this.shape = shape;
		++count;
	}
	
	// static method : 모든 인스턴스가 공동으로 사용하는 메서드
	public static void printSize() {
		System.out.printf("TrumphCard의 가로 크기 %dmm\n", width);
		System.out.printf("TrumphCard의 세로 크기 %dmm\n", height);
	} 
	
	// static 메서드는 인스턴스가 존재하지 않을 때도 부를 수 있다.
	// 때문에 static 메서드에서는 인스턴스 변수 사용이 금지되어 있다.
//	public static void printCard() {
//		System.out.printf("TrumphCard의 가로 크기 %dmm\n", number);
//		System.out.printf("TrumphCard의 세로 크기 %dmm\n", shape);
//	}
}












