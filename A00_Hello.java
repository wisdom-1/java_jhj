// Java의 한 줄 주석 
/*
 	자바의 
 	여러줄 주석 
 */
/**
 * 
 * 	자바의 문서화 주석
 *
 */
/*
  	주석이란?
  		- 프로그래머가 하고 싶은 말을 메모해두는 것
  		- 일반적으로 소스에 대한 설명이나 프로그램의 사용법 같은 것을 적어둔다
  		- 주석은 프로그램의 실행에 영향을 미치지 않는다.  
 */

/*
 	Eclipse 단축키 
 	
 		Ctrl + [+, -] : 글자 크기 조절
 		Ctrl + M : 현재 화면 최대화 / 원래대로  
		Ctrl + F11 : 컴파일 및 실행
		Ctrl + X : 잘라내기 
		Ctrl + C : 복사하기
		Ctrl + V : 붙여넣기
		Alt + [위/ 아래] : 코드 줄 이동하기
		Shift + [Home/ End] : 한 줄 블록지정 편하게 하기
		Shift + [방향키] : 커서 이동하며 블록지정하기
		Tab : 들여쓰기
		Shift + Tab : 역탭
		Ctrl + S : 저장하기 (파일명 앞에 *이 있으면 저장이 안 된 상태다)
		Ctrl + W : 탭 하나 닫기
		Ctrl + Shift + W : 탭 모두 닫기
		Ctrl + Z : 되돌리기
		Ctrl + Y : 되돌리기 취소  
 */

// public class의 이름은 반드시 파일명과 같아야 한다
public class A00_Hello {
// 빨간 줄이 생겼을 때 F2를 누르면 해당 에러에 대한 이유와 해결책을 영어로 볼 수 있다.
	
	// main() 메서드 (함수)
	//	- 프로그램의 시작과 끝
	//	- 프로그램을 실행하면 가장 먼저 main() 메서드를 찾아 시작한다
	//	- main() 메서드가 끝나면 프로그램도 끝난다
	
	// 메서드란?
	//	- 단어 뒤에 ()가 붙어 있는 것
	//	- 메서드의 범위는 {}로 나타낸다
	public static void main(String[] args) { 
		// main() 메서드 시작 (프로그램 시작)
		
		// ; (세미콜론) : 한 명령어의 끝을 알린다.		
		
		// System.out.println() 메서드 : ()안에 전달한 내용을 콘솔에 출력한다
		System.out.println("Hello, world!");
		System.out.println("안녕하세요");
		System.out.println();
		System.out.println("vdvd");
		System.out.println(9999);
		System.out.println(99 + 99);
		System.out.println(99 * 99);
		System.out.println(10 - 100);
		
		// "" 사이에 넣는 것 : 문자열 (String)
		System.out.println("문자열");
		System.out.println("123" + "456"); // 문자열 + 문자열 = 이어붙이기
		
		// 그냥 숫자를 적는 것 : 숫자형 (정수, 실수)
		
		// 출력 결과는 똑같은 10이지만 다른 10이다.
		System.out.println(10);
		System.out.println("10");		
		System.out.println(123 + 456); // 숫자 + 숫자 = 덧셈
		
		// 숫자 + 문자열 = 이어붙이기
		System.out.println(10 + "20");
		System.out.println("10" + 20);
		
		// '' 사이에 넣는 것 : 문자형 (문자 단 하나만 입력할 수 있음)
		System.out.println('A');
		System.out.println('B');
		System.out.println('한');
		
		// 문자 '1'과 숫자 1은 다르다
		System.out.println('1');
		System.out.println(1);		
		
		// main() 메서드 끝 (프로그램 끝)
	}
	
}












