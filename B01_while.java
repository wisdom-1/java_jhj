import java.util.Scanner;

public class B01_while {

	public static void main(String[] args) {
		
		// while
		//	- for문과 사용법이 약간 다른 반복문
		//	- 초기값과 증가값의 위치가 정해져 있지 않다
		//	- 증가값의 위치에 따라 반복문의 결과가 달라질 수 있다
		
		// 가장 기본적인 형태
		int i = 0; 
		while (i < 10) {		
			System.out.println("hello " + i);
			++i;
		}
		
		// while문으로 사용하게끔 설계된 클래스/메서드들		
		//	- hasNext, hasNextElement, next... 등의
		//	    다음 값이 있는지 체크하는 메서드들
		//	- 다음 값이 있으면 다음 값을 하나씩 꺼내오는 방식으로 사용한다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 여러개 입력해보세요 > ");
		while (sc.hasNextInt()) {			
			// nextInt() : 다음값을 정수로 가져온다
			System.out.println(sc.nextInt());			
		}		
		
		// 남은것 마저 꺼내기
		System.out.println("----- 남은 것 꺼내기 -----");
		while (sc.hasNext()) {
			// next() : 다음값을 무조건 문자열로 가져온다
			System.out.println(sc.next());
		}
		
	}
	
}











