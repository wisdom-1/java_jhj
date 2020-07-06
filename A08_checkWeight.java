package quiz;

import java.util.Scanner;

public class A08_checkWeight {

	// ���� ������ 600kg�� ���������Ͱ� �ִ�.
	// ������ ���Ը� double Ÿ������ �� �� �Է� ���� �� 
	// ���� ������������ ��빫�Ը� ����Ͽ� ����غ�����.
	// (��� ����� �Ҽ� �� ° �ڸ����� ���) 	
	public static void main(String[] args) {
		final double LIMIT = 600;
//		Scanner sc = new Scanner(System.in);		
//		
//		System.out.print("������ ���Ը� �� �� �Է��غ����� > ");
//		double stuff1 = sc.nextDouble();
//		double stuff2 = sc.nextDouble();
		
		double stuff1 = 99.55;
		double stuff2 = 45.7777777;
		
		double result = LIMIT - stuff1 - stuff2;
		
		System.out.println("ù ��° ������ ���� : " + stuff1);
		System.out.println("�� ��° ������ ���� : " + stuff2);
		System.out.printf("���� ��� ���� : %.2fkg\n", result);
		
		// Math.round()�� �̿��� ���ϴ� �ڸ����� �ݿø��ϱ�
		//	1. �ݿø��ϰ� ���� �ڸ��� �Ҽ� ù ��° �ڸ��� �ɶ����� ���Ѵ�
		//	2. Math.round()�� �ݿø��Ѵ�
		//	3. ���ߴ� ���ڸ�ŭ �ٽ� ������ (����� �Ҽ��� �ǵ��� double Ÿ���� �̿��Ѵ�) 
		System.out.println("���� result �� : " + result);
		System.out.println("ù ��° �ڸ����� �ݿø� : " + Math.round(result));
		
		// ���� result �� : 454.6722223
		// 10�� ���� �� �ݿø� : 4546.722223 -> 4547
		// �ٽ� 10���� ���� : 4547 / 10 -> 454.7
		System.out.println(Math.round(result * 10) / 10.0);
		System.out.println(Math.round(result * 100) / 100.0);
		System.out.println(Math.round(result * 1000) / 1000.0);
				
		// String.format()�� �̿��� �ڸ��� �����ϱ�
		result = 444.987654321;
		String str = String.format("%.2f", result);		
		System.out.println("format�� �̿��� ������ ���ڿ� : " + str);
		
		// Double.parseDouble() : ���ڿ��� double Ÿ������ ��ȯ�ϴ� �޼���
		double data = Double.parseDouble(str);		
		System.out.println("���ڿ��� �ٽ� double Ÿ������ ��ȯ : " + data);
	}
	
}








