package quiz;

import java.util.Scanner;

public class A08_guessAge {
	// ����ڷκ��� �¾ �⵵�� �Է¹�����
	// ���̸� ����Ͽ� ������ִ� ���α׷��� �ۼ��غ�����
	public static void main(String[] args) {
		// ���α׷��� ������ �� ���� �������� ���� �� 
		final int THIS_YEAR = 2020; 
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("�¾ �⵵�� �Է��ϼ��� > ");
		int birth_year = sc.nextInt();
		
		System.out.printf("����� ���̴� %d�� �Դϴ�.\n", THIS_YEAR - birth_year + 1);
	}
}










