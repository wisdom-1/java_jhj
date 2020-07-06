
public class A04_varTypes {

	public static void main(String[] args) {
		
		// 자바의 변수 타입들 
		
		/*
		 	정수형
		 		- byte	(1byte)
		 			-128(2 ^ 7) ~ +127(2 ^ 7 - 1)
		 			※ 양수에는 0이 포함되기 때문에 나타낼 수 있는 숫자가 음수보다 한 개 적다 
		 				 		
		 		- short	(2byte)
		 			-(2 ^ 15) ~ +(2 ^ 15 - 1)
		 		
		 		- char	(2byte) : 문자 타입 (문자를 나타내는 숫자, 부호가 없음)
		 			0 ~ 65535(2 ^ 16)
		 			※ 부호가 없기 때문에 16bit를 모두 값으로 이용한다 
		 		
		 		- int	(4byte)		* 기본 타입 *
		 			-(2 ^ 31) ~ +(2 ^ 31 - 1)
		 		
		 		- long	(8byte)				
		 			-(2 ^ 63) ~ +(2 ^ 63 - 1) 
		 */
		
		byte _byte_max = 127;
		byte _byte_min = -128;
		
		System.out.println("제일 큰 byte 값 : " + _byte_max);
		System.out.println("제일 작은 byte 값 : " + _byte_min);
		
		short _short_max = 32767;
		short _short_min = -32768;
		
		System.out.println("제일 큰 short 값 : " + _short_max);
		System.out.println("제일 작은 short 값 : " + _short_min);
		
		// char 타입은 값으로는 정수가 들어가지만 출력은 문자로 나온다
		char _char_max = 65535;
		char _char_min = 0;
		
		// 정수 타입이지만 문자 타입 값을 넣을 수도 있다
		// char 타입은 문자를 표현하기 위한 정수 타입이다
		char ch = 'A';
		
		System.out.println("제일 큰 char 값 : " + _char_max);
		System.out.println("제일 작은 char 값 : " + _char_min);
		System.out.println(ch);
		
		// 숫자의 자리를 눈으로 구분하고 싶을 때 _를 사용해도 된다
		int _int_max = 21_4748_3647;
		int _int_min = -21_4748_3648;
		
		System.out.println("제일 큰 int 값 : " + _int_max);
		System.out.println("제일 작은 int 값 : " + _int_min);
		
		// 자바 숫자 데이터의 기본 타입은 int다.
		// 숫자 데이터 값이 int의 범위를 넘어가게 되면 에러가 발생한다.
		// int범위를 벗어나는 숫자 데이터를 사용하고 싶을때는 뒤에 L을 붙여야 한다.
		long _long = 50_0000_0000L;
		long _long_min = -5000000000000000000L;
		
		/*
		 	실수형 (거의 그래픽 계산에만 사용된다)
		 		- 복잡하고 정밀한 수학 계산이 필요한 분야에 사용된다
		 		- 부동소수점 방식을 사용한다
		 		
		 		float (4byte)
		 		double (8byte)		* 기본 타입 * 
		 */
		
		// 자바 소수 데이터의 기본타입은 double이다.
		// 소수만 적은 데이터의 타입은 double이기 때문에 
		// float타입 변수에 소수를 넣으려면 뒤에 F를 붙여 float타입임을 명시해야 한다
		float _float = 1.234F;
		double _double = 1.234;
		
		/*
		 	참/거짓형
		 	
		 		boolean 
		 		 	- true, false 두 가지의 값만 가지고 있는 타입
		 		 	- 참과 거짓을 나타내는데에만 쓰인다		  
		 */
		boolean b = true;
		b = false;
		
		boolean isMale = true;
		boolean isFemale = true;
		boolean under20 = false;
		
		System.out.println("남자인가요? " + isMale);
		System.out.println("여자인가요? " + isFemale);
		System.out.println("20세미만입니까? " + under20);
		
		/*
		  	참조형 타입 (클래스 타입)
		  		- String : 문자열 타입
		  		- 그 외 모든 대문자로 시작하는 타입들 ..		 
		 */
		
		// String 타입에 문자열 타입 데이터를 담아놓을 수 있다
		String name = "김철수";
		String helloMessage = "hi! nice to meet you!!";
		String byeMessage = "by by! " + name;
		
		System.out.println(helloMessage);
		System.out.println(byeMessage);
	}
	
}






