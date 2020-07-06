
public class A13_for {

	public static void main(String[] args) {
		// 반복문 (for, while, forEach, do-while)
		//	- 같은 코드를 여러번 반복하고 싶을때 사용한다
		
		/*
		 * 		for (초기값; 조건; 증가값) {
		 * 			조건의 결과가 true일 동안 반복할 명령어들
		 * 		} 
		 * */
		
		// 1. 가장 기본적인 형태
		//	초기값은 0을 주고, 조건은 반복하고 싶은 횟수를 적는다, 증가는 1씩 한다
		for (int i = 0; i < 10; ++i) {
			System.out.println("hello, world! " + i);
		}
		
		// 2. 초기값과 증가값의 위치는 마음대로 변경할 수 있다
		//	    하지만 이렇게 쓰면 while문과 다를게 없다
		int i = 5;		
		for (; i < 20;) {
			System.out.println("안녕하세요" + i++);			
		}
		
		// while : ()안의 조건이 참인동안 {}안의 내용을 반복하는 문법
		//		   for와 while의 유일한 차이점은 초기값/증가값의 위치가 정해져 있고/없고이다
		i = 5;
		while (i < 20) {
			System.out.println("(WHILE) 안녕하세요 " + i++);
		}
		
		// 3. 증가값에는 음수도 넣을 수 있다 
		for (int j = 100; j > 0; --j) {
			System.out.println("HI " + j);
		}
		
		// 4. 반복문을 이용해 총합 구하기
		//	(1) 총합을 저장할 변수를 선언하고 0으로 초기화 한다
		//	(2) 반복문 내부에서 총합을 저장할 변수에 복합대입연산으로 값을 누적시킨다		
		
		int total = 0; // sum, total ... (1)
		
		// j는 350부터 500까지 반복
		for (int j = 350; j <= 500; ++j) {
			total += j; // (2)
			
			// 내용을 확인하고 싶다면 콘솔에 적절한 내용을 출력해 값을 잘 확인해야 한다 (로그)
			System.out.println(j + ") 현재 total의 값 : " + total);
		}
		
		System.out.println("350 ~ 500의 총 합 : " + total);
	}
	
}









