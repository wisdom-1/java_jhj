package quiz;

import java.util.Scanner;

public class A10_alarmQuiz {

	// 맨날 지각하는 사람들을 위해 사용자가 알람을 설정하면
	// 설정하고자 한 시간보다 30분 이른 시간에도 알람을 설정해주는 프로그램을 만들고자 한다
	
	// 시간을 입력하면 입력한 시간과 그 시간보다 30분 이른 시간을 출력해부세요 
	// (단, 시간은 24시간 표현을 사용하며 0 ~ 23시, 0 ~ 59분 까지 입력할 수 있다)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// nextInt() : 버퍼에 존재하는 다음 정수를 가져온다.
		//			      만약 버퍼에 값이 없다면 프로그램을 멈추고 사용자의 입력을 기다린다. 
		
		System.out.print("시간과 분을 입력 > ");
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if (hour < 0 || hour > 23 || min < 0 || min > 59) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		System.out.println("알람 1: " + hour + "시 " + min + "분");
		
		if (min < 30) {			
			if (hour == 0)
				hour = 23; 
			else 
				hour = hour - 1;
			
			min = min + 30;
		} else {
			min = min - 30;
		}
		System.out.println("알람 2: " + hour + "시" + min + "분");
	}
}











