package quiz;

public class A09_conditionQuiz {

	public static void main(String[] args) {
		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true
		int x = 13;
		System.out.println(x > 10 && x < 20);
		
		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true
		char ch = 'a';
		
		System.out.println((int)' ');
		System.out.println((int)'	');
		System.out.println((int)'\t');
		
		System.out.println(ch != ' ' && ch != '\t');
		
		// 3. char형 변수 ch가 'x'또는 'X'일 때 true
		System.out.println(ch == 'x' || ch == 'X');
		
		// 4. char형 변수 ch가 문자('0'~'9')일 때 true
		System.out.println(ch >= '0' && ch <= '9');
		
		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true
		System.out.println((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'));
		
		// if문의 {}내부에 쓸 명령어가 한 줄이라면 {}를 생략할 수 있다.
		if (ch >= 'A' && ch <= 'Z')
			System.out.println(ch + "는 대문자입니다.");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println(ch + "는 소문자입니다.");
		else
			System.out.println(ch + "는 영어가 아닙니다.");
		
		// 5-2. ch가 한글인 경우 true 
		System.out.println('하' > '가');
		System.out.println('하' < '가');
		
		ch = '다';
		System.out.println(ch >= '가' && ch <= '힣');
		System.out.println((int)'가');
		System.out.println((int)'힣');
		System.out.println((int)'金');
		
		// 6. int형 변수 year가 400으로 나누어 떨어지거나 
		// 	    또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
		int year = 2096;
		System.out.println(year % 400 == 0 
				|| (year % 4 == 0 && year % 100 != 0));
		
		// 7. boolean형 변수 powerOn이 false일 때 true
		boolean powerOn = false;
		
		System.out.println(powerOn == false);
		System.out.println(!powerOn);
		
		// 8. 문자열 참조변수 str이 "yes"일 때 true
		
		// 참조형 변수 : 대문자로 시작한다, 비교할 때 ==을 사용하면 주소를 비교한다.
		// 기본형 변수 : 소문자로 시작한다
		String str = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		
		System.out.println("str : " + str);
		System.out.println("str3 : " + str3);
		
		System.out.println(str == str3);
		
		// str.equals() : 두 문자열을 주소값이 아닌 실제 값으로 비교한다
		System.out.println(str.equals(str3)); 
		
		// str.hashCode() : 문자열의 값으로 해쉬코드를 생성한다
		//	※ 해쉬 알고리즘 
		//		- 같은 값을 넣으면 같은 결과가 나오는 알고리즘
		//		- 결과를 예측할 수 없어야 한다
		//		- 단방향이어야 한다. 결과로 원본을 유추하기 힘들어야 한다.		
		//		abc -> FESAFWEQWERSAFXCVXVSDFWE...
		//		abd -> ASDFERWETQWFXZASDFW...
		System.out.println(str.hashCode() == str3.hashCode());
	}
}














