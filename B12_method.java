
public class B12_method {
	
	// 메서드
	//  - 클래스 내부의 함수를 메서드라고 한다
	//	- 자바에서는 반드시 클래스 내부에만 함수를 생성할 수 있다
	//	- 똑같은 기능이더라도 각 인스턴스가 지닌 값에 따라 결과가 다르다
	
	public static void main(String[] args) {
		AppleStore store01 = new AppleStore();
		AppleStore store02 = new AppleStore(300, 20);
		AppleStore store03 = new AppleStore(1500, 3);
		
		int apple_num = 10;
		
		System.out.println("store01에서 사과를 10개 사면 : "
				+ store01.getTotalPrice(apple_num) + "원");
		System.out.println("store02에서 사과를 10개 사면 : "
				+ store02.getTotalPrice(apple_num) + "원");
		System.out.println("store03에서 사과를 10개 사면 : "
				+ store03.getTotalPrice(apple_num) + "원");
		
		
		// 사과의 개수를 넘겨주면 필요한 바구니의 개수를 반환해주는 메서드를 정의해보세요
		// 각 가게마다 바구니의 크기가 다를 수 있게 만들어주세요
		apple_num = 25;
		
		System.out.println("store01에서 사과를 25개 담을 때 : " 
				+ store01.getBasketNum(apple_num) + "개");
		System.out.println("store02에서 사과를 25개 담을 때 : " 
				+ store02.getBasketNum(apple_num) + "개");
		System.out.println("store03에서 사과를 25개 담을 때 : " 
				+ store03.getBasketNum(apple_num) + "개");
	}
	
}

// 사과 가게
class AppleStore {
	
	int price;
	int basketSize;
	
	public AppleStore() {
		price = 500;
		basketSize = 10;
	}
	
	public AppleStore(int price, int basketSize) {
		this.price = price;
		this.basketSize = basketSize;
	}
	
	/** 
	 * 사과의 개수를 넘겨주면 총 가격을 계산해주는 메서드 
	 */
	public int getTotalPrice(int apple_num) {
		// price : 각 인스턴스마다 다른 값을 가지고 있다 
		return apple_num * price;
	}
	
	public int getBasketNum(int apple_num) {
//		if (apple_num % basketSize == 0)
//			return apple_num / basketSize;
//		else
//			return apple_num / basketSize + 1;
		
		// 삼항연산자 
		//	- 비교 ? 예 : 아니오;
		//	- 비교의 결과가 참이라면 왼쪽값을 대입
		// 	- 비교의 결과가 거짓이라면 오른쪽 값을 대입
		return apple_num % basketSize == 0 ? 
				apple_num / basketSize : apple_num / basketSize + 1; 
	}
}









