package quiz;

public class B03_continueQuiz {

	public static void main(String[] args) {
		
		int sum = 0;
		
		// 1���� 200 ������ �� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ������ �� ���� ���غ����� 
		for (int i = 1; i <= 200; ++i) {

			if (i % 2 == 0)
				continue;
			else if (i % 3 == 0)
				continue;
			
			sum += i;
			
//			if (i % 2 != 0 && i % 3 != 0) 
//				sum += i;
			
//			if (!(i % 2 == 0 || i % 3 == 0))		
//				sum += i;
		}		
		System.out.println(sum);
		
		
		// while������ �Ȱ��� �ݺ����� �������� (continue�� �����)		
		int i = 0;
		sum = 0;
		
		while (i++ <= 200) {			
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			
			sum += i;			
		}
		System.out.println("while������ ���� �� : " + sum);
	}
	
}























