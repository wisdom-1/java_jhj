package quiz;

import java.util.Scanner;

public class A11_monthToSeason {
	
	// switch-case���� �̿��Ͽ�
	// ����ڷκ��� �� ������ �Է¹����� �˸��� ������ ������ִ� ���α׷��� �ۼ��غ�����   	
	public static void main(String[] args) {
		// ���� sc�� �������� �ʰ� ����߱� ������ �ٽ� �Է¹��� ���� ����.
		// �ѹ� ���� ������ ��ĳ�ʰ� �ȴ�.
		System.out.print("�� ��? ");
		int month = new Scanner(System.in).nextInt();
		
//		if (month < 0 || month > 12) {
//			System.out.println(month + "���� �����ϴ�.");
//			return;
//		}
		
		switch (month) {
		case 11: case 12: case 1: case 2:
			System.out.println(month + "���� �ܿ��Դϴ�."); break;
		case 3: case 4: case 5:
			System.out.println(month + "���� ���Դϴ�."); break;
		case 6: case 7: case 8:
			System.out.println(month + "���� �����Դϴ�."); break;
		case 9: case 10:
			System.out.println(month + "���� �����Դϴ�."); break;
		default:
			System.out.println(month + "���� �����ϴ�."); break;
		}
	}
	
}











