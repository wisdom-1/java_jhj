
public class A02_variable {

	// 변수 (variable)
	//	- 데이터를 담을 수 있는 공간 
	
	public static void main(String[] args) {		
		int a = 10;
		
		System.out.println(a);
		System.out.println(a + a);
		System.out.println(a * 3);
		
		// 변수는 반드시 선언한 뒤에 사용해야 한다.
		
		// 변수의 선언
		//	- 변수타입 변수이름;
		
		int b; // '정수타입 값만 들어갈 수 있는 변수 b를 앞으로 사용하겠다'라고 선언
		
		// 기존에 알고 있던 =의 의미 : 왼쪽 값과 오른쪽 값이 같다 
		// 프로그래밍 언어에서 =의 의미 : 왼쪽의 변수에 오른쪽의 값을 넣어라 
		b = 77;		
		System.out.println(b);
				
		// 변수를 선언하는 여러가지 방법
		int num1; // 선언
		int num2, num3, num4; // 여러개 선언 
		int num5 = 99; // 선언과 동시에 대입
		int num6 = 123, num7 = 9999; // 여러개 선언과 동시에 대입
		
		// 변수를 선언한 뒤 맨 처음 값을 대입하는 것을 '초기화(initialize)'라고 부른다
		num1 = 9;
		num3 = 10;
		System.out.println(num1 + num3);
		
		// 값을 대입하지 않은 변수들은 사용할 수 없다
		// System.out.println(num2 * num4);
	}
	
}







