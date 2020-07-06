package quiz;

import java.util.Scanner;

public class A10_alarmQuiz {

	// �ǳ� �����ϴ� ������� ���� ����ڰ� �˶��� �����ϸ�
	// �����ϰ��� �� �ð����� 30�� �̸� �ð����� �˶��� �������ִ� ���α׷��� ������� �Ѵ�
	
	// �ð��� �Է��ϸ� �Է��� �ð��� �� �ð����� 30�� �̸� �ð��� ����غμ��� 
	// (��, �ð��� 24�ð� ǥ���� ����ϸ� 0 ~ 23��, 0 ~ 59�� ���� �Է��� �� �ִ�)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// nextInt() : ���ۿ� �����ϴ� ���� ������ �����´�.
		//			      ���� ���ۿ� ���� ���ٸ� ���α׷��� ���߰� ������� �Է��� ��ٸ���. 
		
		System.out.print("�ð��� ���� �Է� > ");
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if (hour < 0 || hour > 23 || min < 0 || min > 59) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		
		System.out.println("�˶� 1: " + hour + "�� " + min + "��");
		
		if (min < 30) {			
			if (hour == 0)
				hour = 23; 
			else 
				hour = hour - 1;
			
			min = min + 30;
		} else {
			min = min - 30;
		}
		System.out.println("�˶� 2: " + hour + "��" + min + "��");
	}
}











