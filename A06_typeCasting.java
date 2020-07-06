
public class A06_typeCasting {

	public static void main(String[] args) {
		
		// 타입 캐스팅 
		//	- 어떤 변수 혹은 값이 다른 타입으로 변하는 것
		//	- 자연스럽게 변하는 경우와 강제로 변환시키는 경우가 있다
	
		// 타입의 크기
		//	byte < short <= char < int < long(8byte) < float(4byte) < double
		
		// 큰 타입 변수에 작은 타입 값을 대입하는 경우
		byte b1 = 127;
		
		// byte타입 값이 자연스럽게 타입캐스팅 되었다
		short s1 = b1;
		int i1 = b1;
		long l1 = b1;		
		// char c1 = b1; // byte는 음수가 존재하지만 char는 음수가 없기 때문에 에러
		
		System.out.println("원래 byte였던 값들");
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		
		
		// 큰 타입 값을 작은 타입 변수에 억지로 넣으려는 경우 (강제적 타입캐스팅)
		long l2 = 9999999999999L;
		
		// 큰 타입 값이 작은 타입에 들어갈때는 원래 값을 잃어버릴 수도 있기 때문에 타입캐스팅을 요구한다.
		// 즉, 타입 캐스팅은 
		//	'나는 이 캐스팅을 통해 값이 손실될 수 있음을 인지하고 있습니다. 에러 안내셔도 됩니다.' 
		// 라는 뜻이다
		int i2 = (int) l2;
		short s2 = (short) l2;
		byte b2 = (byte) l2;
		
		System.out.println("원래 값 : " + l2 + ", 변환 후 값 : " + i2);
		System.out.println("원래 값 : " + l2 + ", 변환 후 값 : " + s2);
		System.out.println("원래 값 : " + l2 + ", 변환 후 값 : " + b2);
				
		// 실수 타입은 정수에는 존재하지 않는 소수점을 가지고 있기 때문에 항상 정수보다 크다
		float f1 = 1234.999F;
		
		// 주로, 실수 타입의 소수점을 다 지우고 싶을 때 정수 타입으로 캐스팅한다 (반올림 X)
		System.out.println("float : " + f1 + ", int : " + (int)f1);
		
		// 소수점에서 반올림을 하고 싶다면 Math.round() 메서드를 사용한다
		// 소수점에서 올림을 하고 싶다면 Math.ceil() 메서드를 사용한다 (ceil : 천장)
		// 소수점에서 내림을 하고 싶다면 Math.floor() 메서드를 사용한다 (floor : 바닥)
		System.out.println("round : " + Math.round(f1));
		System.out.println("ceil : " + Math.ceil(f1));
		System.out.println("floor : " + Math.floor(f1));
		
		// ASCII 코드
		//	- 문자는 각 문자에 해당하는 정수값을 가지고 있다 (char 타입이 정수타입인 이유)
		//	- 각 문자에 대응하는 숫자를 표로 정리해 놓은것을 ASCII코드 표라고 한다
		//	- 문자는 실제 메모리상에는 정수로써 저장되고, char타입이면 우리에게는 문자로 보여준다 
		int ch = 65;
		System.out.println(ch);
		System.out.println((char)ch);
		
		// 숫자를 더해 다음 문자로 넘어갈 수도 있다
		System.out.println(ch + 1);
		System.out.println((char)(ch + 1));
		
		// 문자 타입끼리 정수처럼 연산이 가능하다 (문자 타입의 연산 결과는 정수다)
		System.out.println("z는 a로부터 얼마나 떨어져 있나요 : " + ('Z' - 'A') + "칸");
		
		// 문자 타입과 정수의 연산도 가능하다 (문자 타입의 연산 결과는 정수다)
		System.out.println('A' + 25);
		System.out.println((char)('A' + 25));
		
		// 문자는 실제로는 정수이기 때문에 숫자처럼 연산해도 아무 문제 없다
		System.out.println("소문자 a는 대문자 A보다 크다 : " + ('a' > 'A'));
		System.out.println("소문자 a는 대문자 A보다 작다 : " + ('a' < 'A'));			
		
	}
	
}











