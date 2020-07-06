
// Ctrl + Space : Eclipse의 자동 완성 기능 

public class A03_varNaming {

	// 변수 이름 짓는 법 
	
	public static void main(String[] args) {
		
		// 우리가 변수를 사용하는 이유 
		//	1. 값을 한 번에 변경할 수 있다 (일일이 소스 코드를 찾아다니며 변경할 필요가 없어진다)
		//	2. 값에 의미를 부여할 수 있다 (변수의 이름을 잘 짓는것이 매우 중요하다)
		
		int apple_num = 30; // 사과의 개수
		int apple_price = 500; // 사과 한 개의 가격
		int apple_weight = 15; // 사과 한 개의 무게
		
		// '문자열 + 숫자'는 이어붙인다
		// System.out.println("123" + 456);
		
		System.out.println("사과의 개수 : " + apple_num);
		System.out.println("사과 하나의 가격 : " + apple_price);
		System.out.println("사과 전체의 가격 : " + apple_price * apple_num + "원");
		System.out.println("사과 전체의 무게 : " + apple_num * apple_weight + "g");
		
		/*
		 * 	# 권장되는 변수 작명 규칙 
		 * 
		 * 		(1) _(언더바, 언더스코어)를 활용		
		 * 			두 단어 이상을 이어붙인 	변수명을 사용할 때 _를 활용한다 
		 * 			ex: apple_weight, minsu_height ..
		 * 
		 * 		(2) 대문자를 활용 		 
		 * 			두 단어 이상을 이어붙인 변수명을 사용할 때 대문자를 활용한다 
		 * 			ex: appleWeight, minsuAge ..
		 * 
		 * 		(3) 변수명 첫 글자는 소문자를 사용한다 (클래스명 첫 글자는 대문자를 사용한다)
		 * 
		 * 		(4) 값이 변하지 않는 변수(상수)의 이름은 모두 대문자를 사용한다 
		 * 			ex: APPLE_PRICE, PI ...
		 * 
		 * 		(5) 변수의 값이 어떤 값인지 추측할 수 있는 단어를 사용하는 것이 좋다 
		 * 
		 * 
		 * 	# 필수적인 변수 작명 규칙 (지키지 않으면 에러 발생)
		 * 
		 * 		(1) 변수명의 첫 번째 글자는 숫자가 될 수 없다 
		 * 			ex: 1st, 2nd, 4pple ... 
		 * 
		 * 		(2) 변수 사이에는 공백을 사용할 수 없다 
		 * 
		 * 		(3) 특수문자는 _와 $만 사용할 수 있다
		 * 
		 * 		(4) 이미 자바에서 사용하고 있는 키워드는 변수명으로 사용할 수 없다
		 * 			ex: int, static, public, void, class ... 
		 * 		
		 * 	
		 * */
		
		int _9x1 = 10;		
		
		System.out.println(_9x1);
		
		// String : 문자열 타입
		final String PUB_DATE = "2020/06/16";
		
		// 선언 할 때 앞에 final을 붙인 변수는 이후에 값을 변경할 수 없다
		// final로 선언된 변수는 변수명으로 모두 대문자를 사용해 표시한다
		
		// PUB_DATE = "123";
	}
	
}









