
public class A12_operator03 {

	public static void main(String[] args) {
		// 대입 연산 =
		//	- 왼쪽의 변수에 오른쪽의 값을 넣는다
		//	- 왼쪽의 변수에 오른쪽 변수의 값을 넣는다
		//	- 왼쪽의 변수에 오른쪽의 연산 결과를 넣는다
		//	- 왼쪽의 변수에 오른쪽 메서드의 결과를 넣는다
				
		if (true) {} // 그냥 값
		boolean result = true;
		if (result) {} // 변수의 값
		if (!result) {} // 연산 결과
		if ("pineapple".contains("banana")) {} // 메서드의 결과
		// ※ str.contains() : 해당 문자열이 포함되어있는지 검사한다
		
		// 즉, 값이 들어가는 자리에는 변수 / 연산 결과 / 메서드의 결과도 들어갈 수 있다
		
		
		// 복합 대입 연산
		//	- 변수에 연산 결과를 누적시키는 연산 
		int a = 10;
		
		a += 5; // a = a + 5
		System.out.println(a);
		a -= 3; // a = a - 3
		System.out.println(a);
		a *= 5; // a = a * 5
		System.out.println(a);
		a /= 3; // a = a / 3;
		System.out.println(a);
		a %= 7; // a = a % 7;
		System.out.println(a);
		
		// 단항 연산
		a = 10;
		a++; // a = a + 1
		System.out.println("a++ : " + a);
		++a; // a = a + 1
		System.out.println("++a : " + a);
		
		// 단항 연산자의 후위 표기법 : 그 줄의 명령을 실행한 후에 값이 바뀐다
		a = 10;		
		System.out.println(a++);
		
		// 단항 연산자의 전위 표기법 : 그 줄의 명령을 실행하기 전에 값이 바뀐다
		a = 10;
		System.out.println(++a);
		
		// -- 도 있다.
		a = 10;
		System.out.println(a--);
		System.out.println(--a);
	}
	
}
















