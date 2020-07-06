package quiz;

import java.util.Scanner;

public class A13_Homework {
	
	public static void main(String[] args) {
		// 사용자가 숫자를 입력했을 때
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력 > ");
		int num = sc.nextInt();
		
		// 1. 1부터 입력한 숫자까지의 총 합을 구해보세요
		int sum = 0;
		for (int i = 1; i <= num; ++i) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 총 합 : %d\n", num, sum);
		
		// 2. 1부터 입력한 숫자 사이에 3의 배수가 몇 개 있는지 세어보세요
		int count = 0;
		for (int i = 1; i <= num; ++i) {			
			if (i % 3 == 0)
				++count;			
		}
		System.out.printf("1부터 %d까지의 3의 배수 개수 : %d개\n", num, count);
		
		
		// 3. 1부터 입력한 숫자 사이에 소수가 몇 개 있는지 구해보세요
		//	※ 소수 : 약수가 1과 자기 자신밖에 없는 숫자 
		int prime_count = 0;
		
		for (int i = 2; i <= num; ++i) {			
			// 1부터 자기 자신까지 전부 나눠보면서 나누어 떨어지는 것이 2개라면 소수			
			// 2부터 자기 자신 바로 전까지 전부 나눠보면서 약수가 없으면 소수			
			// 2부터 자기 자신의 제곱근 전까지 전부 나눠보면서 약수가 없으면 소수
			double half = Math.sqrt(i);
			count = 0;
			
			// 숫자가 소수인지 검사
			for (int j = 2; j <= half; ++j) {				
				if (i % j == 0)
					++count;				
			}
			
			if (count == 0) {
				System.out.println(i + "는 소수입니다.");
				++prime_count;
			} 							
		}
		System.out.printf("1부터 %d까지의 소수 : %d개\n", num, prime_count);
		
		// 4. 입력한 숫자까지 369가 진행된다면 박수를 몇 번 쳐야하는지 세어보세요
		
		// * 문자열로 풀기
		//	- str.charAt(index) : 문자열의 index번째 문자를 char타입으로 리턴
		//	- str.length() : 문자열의 길이를 반환
		//	- str.contains() : 문자열에 해당 문자 포함여부를 boolean타입으로 리턴		
		
		int clap_count = 0;
		
		// 1부터 목표 숫자까지 반복
		for (int i = 1; i <= num; ++i) {
			
			// 이번에 검사할 숫자를 문자열로 변환
			String numStr = String.format("%d", i);
			
			// 검사할 숫자에 3,6,9가 포함되어있는지를 검사
			if (numStr.contains("3") || numStr.contains("6") 
					|| numStr.contains("9")) {
				
				// 문자열로 변환한 숫자를 한 글자씩 검사
				for (int j = 0; j < numStr.length(); ++j) {					
					char n = numStr.charAt(j);
					
					if (n == '3' || n == '6' || n == '9')
						++clap_count;
				}
				
			}
		}
		
		System.out.printf("1부터 %d까지 369진행시 박수 횟수 : %d번\n", 
				num, clap_count);
		
		
		// * 숫자로 풀기		
		//	- 나머지 연산을 이용해 숫자를 한 자리씩 검사한다
		clap_count = 0;
		for (int i = 1; i <= num; ++i) {			
			int check = i;
			
			// 이번에 검사할 숫자를 나머지 연산을 이용해 한자리씩 분리하여 체크
			while (check > 0) {
				int n = check % 10;
				
				if (n == 3 || n == 6 || n == 9) 
					++clap_count;
				
				check /= 10;
			}		
		}
		
	}
	
	
}



















