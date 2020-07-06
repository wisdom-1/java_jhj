package quiz;

import java.util.Scanner;

public class A10_appleQuiz {

	// 사과를 10개씩 담을 수 있는 바구니가 있다.
	// 사과의 개수를 입력받으면 필요한 바구니의 개수를 계산하여 출력해주는 프로그램을 작성해보세요.
	public static void main(String[] args) {
		final int basketSize = 15;
		Scanner sc = new Scanner(System.in);
				
		System.out.print("사과의 개수를 입력하세요 (바구니 크기: "+ basketSize +") > ");
		int appleCount = sc.nextInt();
		
		// 잘못된 경우를 먼저 걸러내는 것이 편하다
		if (appleCount < 0) {
			System.out.println("잘못된 입력입니다.");
			
			// main() 메서드 종료
			return;
		} 
		
		// 1. 바구니 개수를 올림으로 계산하는 방법
		int basketCount = (int)Math.ceil(appleCount / (double)basketSize);
		
		// 2. if문을 사용하는 방법
//		int basketCount = 0;
//		if (appleCount % basketSize == 0) {
//			basketCount = appleCount / basketSize;			
//		} else {
//			basketCount = appleCount / basketSize + 1;
//		}		
		System.out.println("필요한 바구니의 개수는 " + basketCount + "입니다.");
		
	}
	
}











