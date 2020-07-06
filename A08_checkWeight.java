package quiz;

import java.util.Scanner;

public class A08_checkWeight {

	// 무게 제한이 600kg인 엘레베이터가 있다.
	// 물건의 무게를 double 타입으로 두 개 입력 받은 뒤 
	// 남은 엘레베이터의 허용무게를 계산하여 출력해보세요.
	// (출력 결과는 소수 둘 째 자리까지 출력) 	
	public static void main(String[] args) {
		final double LIMIT = 600;
//		Scanner sc = new Scanner(System.in);		
//		
//		System.out.print("물건의 무게를 두 개 입력해보세요 > ");
//		double stuff1 = sc.nextDouble();
//		double stuff2 = sc.nextDouble();
		
		double stuff1 = 99.55;
		double stuff2 = 45.7777777;
		
		double result = LIMIT - stuff1 - stuff2;
		
		System.out.println("첫 번째 물건의 무게 : " + stuff1);
		System.out.println("두 번째 물건의 무게 : " + stuff2);
		System.out.printf("남은 허용 무게 : %.2fkg\n", result);
		
		// Math.round()를 이용해 원하는 자릿수로 반올림하기
		//	1. 반올림하고 싶은 자리가 소수 첫 번째 자리가 될때까지 곱한다
		//	2. Math.round()로 반올림한다
		//	3. 곱했던 숫자만큼 다시 나눈다 (결과가 소수가 되도록 double 타입을 이용한다) 
		System.out.println("실제 result 값 : " + result);
		System.out.println("첫 번째 자리에서 반올림 : " + Math.round(result));
		
		// 실제 result 값 : 454.6722223
		// 10을 곱한 뒤 반올림 : 4546.722223 -> 4547
		// 다시 10으로 나눔 : 4547 / 10 -> 454.7
		System.out.println(Math.round(result * 10) / 10.0);
		System.out.println(Math.round(result * 100) / 100.0);
		System.out.println(Math.round(result * 1000) / 1000.0);
				
		// String.format()을 이용해 자릿수 변경하기
		result = 444.987654321;
		String str = String.format("%.2f", result);		
		System.out.println("format을 이용해 생성된 문자열 : " + str);
		
		// Double.parseDouble() : 문자열을 double 타입으로 변환하는 메서드
		double data = Double.parseDouble(str);		
		System.out.println("문자열을 다시 double 타입으로 변환 : " + data);
	}
	
}








