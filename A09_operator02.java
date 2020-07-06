
public class A09_operator02 {

	public static void main(String[] args) {
		
		// 비교 연산 (※ 비교 연산의 결과는 boolean 타입이다)
		int a = 7, b = 3;
		
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		// >=, <= : 부등호가 먼저 나와야 함 (=>, =< 금지)
		System.out.println("a >= b : " + (a >= b)); 
		System.out.println("a <= b : " + (a <= b)); 
		
		System.out.println("a == b : " + (a == b)); // 같을 때 true
		System.out.println("a != b : " + (a != b)); // 다를 때 true
		
		// 비교 연산의 결과를 변수에 담을 수 있다
		boolean result = a != b;
		System.out.println("a != b의 결과 : " + result);
		
		// 논리 연산
		//	&& : 양 옆의 결과가 모두 true일 때 true (AND) 
		//	|| : 양 옆의 결과중 하나만 true여도 true (OR)
		//	!  : true는 false, false는 true (NOT)
		
		// AND : TFFF
		System.out.println("-- AND --");
		System.out.println(true && true);
		System.out.println(true && false);
		
		// &&연산은 앞의 연산 결과가 false일 때 뒤의 것은 실행하지 않는다
		// false가 더 자주 발생하는 연산을 앞에 배치하면 리소스가 절약된다
		System.out.println(false && true);
		System.out.println(false && false);
		
		// OR : TTTF
		System.out.println("-- OR --");
		
		// ||연산은 앞의 연산 결과가 true일 때 뒤의 것은 실행하지 않는다
		// true가 더 자주 발생하는 연산을 앞에 배치하면 리소스가 절약된다
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("not true : " + !true);
		System.out.println("not false : " + !false);
		
		boolean powerOn = false;
		System.out.println(!powerOn);		
		System.out.println(!(a > b));
		
		if (powerOn) {
			System.out.println("전원이 켜져있습니다.");
		} else if (!powerOn) {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	
}









