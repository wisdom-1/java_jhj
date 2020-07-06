package quiz;

import java.util.Scanner;

public class A13_Homework {
	
	public static void main(String[] args) {
		// ����ڰ� ���ڸ� �Է����� ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է� > ");
		int num = sc.nextInt();
		
		// 1. 1���� �Է��� ���ڱ����� �� ���� ���غ�����
		int sum = 0;
		for (int i = 1; i <= num; ++i) {
			sum += i;
		}
		System.out.printf("1���� %d������ �� �� : %d\n", num, sum);
		
		// 2. 1���� �Է��� ���� ���̿� 3�� ����� �� �� �ִ��� �������
		int count = 0;
		for (int i = 1; i <= num; ++i) {			
			if (i % 3 == 0)
				++count;			
		}
		System.out.printf("1���� %d������ 3�� ��� ���� : %d��\n", num, count);
		
		
		// 3. 1���� �Է��� ���� ���̿� �Ҽ��� �� �� �ִ��� ���غ�����
		//	�� �Ҽ� : ����� 1�� �ڱ� �ڽŹۿ� ���� ���� 
		int prime_count = 0;
		
		for (int i = 2; i <= num; ++i) {			
			// 1���� �ڱ� �ڽű��� ���� �������鼭 ������ �������� ���� 2����� �Ҽ�			
			// 2���� �ڱ� �ڽ� �ٷ� ������ ���� �������鼭 ����� ������ �Ҽ�			
			// 2���� �ڱ� �ڽ��� ������ ������ ���� �������鼭 ����� ������ �Ҽ�
			double half = Math.sqrt(i);
			count = 0;
			
			// ���ڰ� �Ҽ����� �˻�
			for (int j = 2; j <= half; ++j) {				
				if (i % j == 0)
					++count;				
			}
			
			if (count == 0) {
				System.out.println(i + "�� �Ҽ��Դϴ�.");
				++prime_count;
			} 							
		}
		System.out.printf("1���� %d������ �Ҽ� : %d��\n", num, prime_count);
		
		// 4. �Է��� ���ڱ��� 369�� ����ȴٸ� �ڼ��� �� �� �ľ��ϴ��� �������
		
		// * ���ڿ��� Ǯ��
		//	- str.charAt(index) : ���ڿ��� index��° ���ڸ� charŸ������ ����
		//	- str.length() : ���ڿ��� ���̸� ��ȯ
		//	- str.contains() : ���ڿ��� �ش� ���� ���Կ��θ� booleanŸ������ ����		
		
		int clap_count = 0;
		
		// 1���� ��ǥ ���ڱ��� �ݺ�
		for (int i = 1; i <= num; ++i) {
			
			// �̹��� �˻��� ���ڸ� ���ڿ��� ��ȯ
			String numStr = String.format("%d", i);
			
			// �˻��� ���ڿ� 3,6,9�� ���ԵǾ��ִ����� �˻�
			if (numStr.contains("3") || numStr.contains("6") 
					|| numStr.contains("9")) {
				
				// ���ڿ��� ��ȯ�� ���ڸ� �� ���ھ� �˻�
				for (int j = 0; j < numStr.length(); ++j) {					
					char n = numStr.charAt(j);
					
					if (n == '3' || n == '6' || n == '9')
						++clap_count;
				}
				
			}
		}
		
		System.out.printf("1���� %d���� 369����� �ڼ� Ƚ�� : %d��\n", 
				num, clap_count);
		
		
		// * ���ڷ� Ǯ��		
		//	- ������ ������ �̿��� ���ڸ� �� �ڸ��� �˻��Ѵ�
		clap_count = 0;
		for (int i = 1; i <= num; ++i) {			
			int check = i;
			
			// �̹��� �˻��� ���ڸ� ������ ������ �̿��� ���ڸ��� �и��Ͽ� üũ
			while (check > 0) {
				int n = check % 10;
				
				if (n == 3 || n == 6 || n == 9) 
					++clap_count;
				
				check /= 10;
			}		
		}
		
	}
	
	
}



















