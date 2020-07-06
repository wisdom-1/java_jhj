package quiz;

import java.util.Scanner;

public class A10_appleQuiz {

	// ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	// ����� ������ �Է¹����� �ʿ��� �ٱ����� ������ ����Ͽ� ������ִ� ���α׷��� �ۼ��غ�����.
	public static void main(String[] args) {
		final int basketSize = 15;
		Scanner sc = new Scanner(System.in);
				
		System.out.print("����� ������ �Է��ϼ��� (�ٱ��� ũ��: "+ basketSize +") > ");
		int appleCount = sc.nextInt();
		
		// �߸��� ��츦 ���� �ɷ����� ���� ���ϴ�
		if (appleCount < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
			
			// main() �޼��� ����
			return;
		} 
		
		// 1. �ٱ��� ������ �ø����� ����ϴ� ���
		int basketCount = (int)Math.ceil(appleCount / (double)basketSize);
		
		// 2. if���� ����ϴ� ���
//		int basketCount = 0;
//		if (appleCount % basketSize == 0) {
//			basketCount = appleCount / basketSize;			
//		} else {
//			basketCount = appleCount / basketSize + 1;
//		}		
		System.out.println("�ʿ��� �ٱ����� ������ " + basketCount + "�Դϴ�.");
		
	}
	
}











