package quiz;

import java.util.Scanner;

public class A11_monthToSeason {
	
	// switch-case문을 이용하여
	// 사용자로부터 몇 월인지 입력받으면 알맞은 계절을 출력해주는 프로그램을 작성해보세요   	
	public static void main(String[] args) {
		// 변수 sc를 선언하지 않고 사용했기 때문에 다시 입력받을 수가 없다.
		// 한번 쓰고 버리는 스캐너가 된다.
		System.out.print("몇 월? ");
		int month = new Scanner(System.in).nextInt();
		
//		if (month < 0 || month > 12) {
//			System.out.println(month + "월은 없습니다.");
//			return;
//		}
		
		switch (month) {
		case 11: case 12: case 1: case 2:
			System.out.println(month + "월은 겨울입니다."); break;
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다."); break;
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다."); break;
		case 9: case 10:
			System.out.println(month + "월은 가을입니다."); break;
		default:
			System.out.println(month + "월은 없습니다."); break;
		}
	}
	
}











