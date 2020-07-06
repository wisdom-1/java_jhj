
public class B09_function {

	// 변수
	//	- 값을 미리 정의해 놓고 나중에 가져다 쓰는 것
	
	// 함수 (function)
	//	- 기능을 미리 정의해 놓고 나중에 가져다 쓰는 것
	//	- 변수와 여러 명령어들의 묶음에 이름을 붙여 하나의 기능으로 정의한다
	//	- 나중에 재사용할 기능을 미리 만들어 작업의 반복을 피한다 

	// ex: 토끼를 출력하는 기능의 묶음
	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >ㅁ");
		
		return; // 리턴 타입이 void인 함수는 값을 반환하지 않는다
	}
	
	// ex: 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 반환하는 함수
	
	// 함수에 전달하는 사과의 개수와 바구니의 크기를 매개변수(argument)라고 한다
	public static int appleBasket(int appleNum, int basketSize) {
		// 리턴이란?
		//	- return을 만나면 현재 메서드를 바로 종료한다
		//	- 종료할 때 이 함수를 호출한 곳에 이 함수 타입의 결과를 반드시 반환해야 한다 
		if (appleNum % basketSize == 0)
			return appleNum / basketSize;  
		else
			return appleNum / basketSize + 1;				
	}
	
	// 1. 올해와 태어난 년도를 매개변수로 넘기면 한국식 나이를 리턴해주는 함수를 정의해보세요
	static int getKoreanAge(int this_year, int birth_year) {
		return this_year - birth_year + 1;		
	}	
	
	// 2. 무게 제한, 물건1의 무게, 물건2의 무게를 넘기면 남은 무게를 반환하는 함수를 정의해보세요
	//	  (단 반환되는 무게는 double타입이어야 함)
	static double getRemain(int limit, double stuff1, double stuff2) {
		return limit - stuff1 - stuff2;	
	}
	
	// 3. 환전하려는 한국돈과 달러 환율을 전달하면 float타입으로 환전된 달러를 리턴하는 함수  
	static float exchange(int won, float ex_rate) {
		return (float) (Math.floor(won / ex_rate * 100) / 100.0);
	}
	
	
	public static void main(String[] args) {		
		for (int i = 0; i < 10; ++i)
			printRabbit();	
		
		int need = appleBasket(121, 10);
		System.out.println("필요한 바구니의 개수 : " + need);
		
		System.out.println(getKoreanAge(2020, 2010));
		System.out.println(getRemain(600, 35.55, 66.11));
		System.out.println(exchange(5000, 1200));
	}
	
}








