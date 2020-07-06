
public class A10_if {

	public static void main(String[] args) {
		
		// if문
		//	- ()안의 조건이 true라면 {}안의 내용을 실행한다
	
		// else if문
		//	- 위의 if문이 실행되지 않았다면 ()안의 조건이 true일 때 {}안의 내용을 실행한다
		//	- else if문은 여러개 쓸 수 있다
		
		// else문
		//	- 위의 조건이 모두 아니라면 {}안의 내용을 반드시 실행한다
		//	- else문이 있으면 해당 조건문은 반드시 실행된다
		
		int a = 9999;
		
		// if문의 ()내부에는 boolean타입 결과가 들어가야 한다.
		// 	- boolean 타입 변수
		//	- 비교 연산 (논리 연산 포함)
		//	- 리턴 타입이 boolean인 함수 
		if (a > 1000) { 
			System.out.println(a + "는 1000보다 큽니다."); 
		} else if (a > 100) {
			System.out.println(a + "는 100보다 큽니다.");
		} else if (a > 10) {
			System.out.println(a + "는 10보다 큽니다.");
		} else {
			System.out.println("위의 조건이 모두 아닙니다.");
		}
			
		
	}
	
}




