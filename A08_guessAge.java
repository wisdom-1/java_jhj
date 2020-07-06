package quiz;

import java.util.Scanner;

public class A08_guessAge {
	// 사용자로부터 태어난 년도를 입력받으면
	// 나이를 계산하여 출력해주는 프로그램을 작성해보세요
	public static void main(String[] args) {
		// 프로그램을 종료할 때 까지 변경하지 않을 값 
		final int THIS_YEAR = 2020; 
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("태어난 년도를 입력하세요 > ");
		int birth_year = sc.nextInt();
		
		System.out.printf("당신의 나이는 %d살 입니다.\n", THIS_YEAR - birth_year + 1);
	}
}










