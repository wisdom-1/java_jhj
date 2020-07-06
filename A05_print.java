// package 구문이 없으면 default package임

public class A05_print {

	public static void main(String[] args) {
		
		// println() : 줄을 자동으로 바꿔주며 출력한다. (맨 뒤에 \n을 자동으로 추가한다)
		// print() : 줄을 자동으로 바꿔주지 않는다.		
		int apple = 10;
		System.out.print("사과 : ");
		System.out.println(apple);
		
		// println()에 아무것도 쓰지 않으면 줄만 바꾼다
		System.out.println();
		System.out.println();
		System.out.println("print!");
		
		
		// printf() : 서식문자를 이용해 출력한다
		// 줄을 자동으로 바꿔주지 않으므로 \n을 까먹지 않도록 주의해야 한다
		
		System.out.printf("사과 : %d\n", apple);
		
		// printf()에 사용되는 서식 문자들
		//		%d : 정수
		//		%f : 실수 (소수)
		//		%s : 문자열 (boolean도 %s를 이용)
		//		%c : 문자
		//		%b : boolean
		//		%o : 정수를 8진수로 출력
		//		%x : 정수를 16진수로 출력
		System.out.printf("8진수 9999 : %o\n", 9999);
		System.out.printf("16진수 9999 : %x\n", 9999);
		System.out.printf("10진수 9999 : %d\n", 9999);
		
		System.out.println();
		System.out.printf("%s\n", true);
		System.out.printf("%b\n", false);
		
		// printf()가 편할 때도 있다
		System.out.println();
		System.out.println(2020 + "년 " + 6 + "월 ");
		System.out.printf("%d년 %d월 %d일의 날씨 %s / 습도 %.2f\n",
				2020, 6, 16, "맑음", 123.123);
		
		// 서식문자 옵션들 
		
		// %숫자d : 숫자만큼 칸을 확보한 뒤 정수를 출력한다
		System.out.printf("ABC : %20d\n", 123);
		System.out.printf("ABC : %15d\n", 123);
		System.out.printf("ABC : %10d\n", 123);
		
		System.out.printf("%5s\n", "**");
		System.out.printf("%3s\n", "**");
		System.out.printf("%s\n", "**");
		System.out.printf("%3s\n", "**");
		System.out.printf("%5s\n", "**");
	
		
		// %-숫자d : 숫자만큼 칸을 확보한 뒤 왼쪽 정렬하여 출력 
		System.out.printf("%-8s : 10\n", "age");
		System.out.printf("%-8s : 123456\n", "birth");
		
		// %0숫자d : 숫자만큼 칸을 확보한 뒤 빈 칸을 0으로 채워 출력한다.
		int password = 123;
		System.out.printf("%06d\n", password);
		
		// %.숫자f : 소수점 아래 자릿수를 설정한다
		double avg = 123.567;		
		System.out.printf("평균 점수 : %020.1f\n", avg); // 20칸 확보하고 소수점 한 자리 출력
		
		// %+d : (+일 때도 굳이) 부호를 표시한다 
		System.out.printf("%+d\n", 123);
		System.out.printf("%+d\n", -123);
		
		
		// String.format() : 서식을 이용하여 원하는 문자열을 생성하기
		String msg = String.format("네이버 : %s\n", "http://www.naver.com");
		
		// 서식대로 생성한 변수에 담긴 문자열을 출력  
		System.out.println(msg);
	}
	
}

















