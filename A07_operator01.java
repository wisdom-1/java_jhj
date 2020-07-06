
public class A07_operator01 {

	public static void main(String[] args) {
		
		// 연산자 (operator)
		//	- 계산 할 때 쓰는 것 
		
		// 산술 연산
		//	- 정수끼리 연산 => 결과가 정수
		//	- 정수와 실수를 연산 => 결과가 실수
		//	- 실수끼리 연산 => 결과가 실수
		//	- 결과를 낸 후 다른 타입으로 변경하고 싶다면 타입 캐스팅을 이용한다
		int a = 7, b = 3;
		double c = 3.0;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // 정수끼리 나누면 몫만 나온다
		System.out.println(a / c); // 정수와 실수를 나누면 결과가 소수로 나온다
		
		// 둘 중 하나를 실수로 바꿔주면 소수 결과를 얻을 수 있다
		System.out.println(a / (double)b); 
		System.out.println((double)a / b);

		// 7나누기 3은 몫은 2 나머지는 1
		System.out.println(a % b); // 나머지 (mod)
		System.out.println(Math.pow(a, b)); // 제곱 
		
		System.out.println(a ^ b); // 제곱이 아니다 (XOR, 비트연산)
		
		// a : 7 -> 0111
		// b : 3 -> 0011
		
		// XOR : 서로 다르면 1
		// 0 1 1 1 
		// 0 0 1 1 ^
		// ---------
		// 0 1 0 0 : 4
	}
	
}







