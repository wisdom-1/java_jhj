
public class B07_random {

	public static void main(String[] args) {
		
		// �ڹٷ� ������ ���� �����ϱ� 
		
		// 1. Math.random() : 0 <= x < 1�� ���� �Ҽ��� �����Ѵ�		
		for (int i = 0; i < 20; ++i) {
			System.out.println(i + "\t:" + Math.random());
		}
		
		// Math.random()�� �̿��ؼ� ���ϴ� ������ ���� �����ϱ� 
		// ex: 33 ~ 77 ������ ���� ���� �����ϱ� 
		//	(1) ���ϴ� ������ ������ ���Ѵ� (0 * 45 <= x < 1 * 45) 
		//	(2) ���ϴ� ������ ���� ���� ���� ���Ѵ� (0 + 33 <= x < 45 + 33)
		//	(3) int�� Ÿ��ĳ�����Ͽ� �Ҽ��� �Ʒ��� �����Ѵ� 

		for (int i = 0; i < 20; ++i) {
			int num = (int)(Math.random() * 45 + 33);			
			System.out.println(i + "��° ���� ����\t: " + num);
		}
		
		// �������� : 1000 ~ 9999������ ���� ���ڸ� 500�� �����鼭
		//		      ���Դ� ���� �� ���� ū ���� ���� ���� ���� ����غ�����
		
		// ���߿� ������ ������ �缳���ص� ��� �ùٸ��� �����ϵ��� �ҽ��� �ۼ��ϴ� ���� ����


		double min = 0;
		double max = 0;
		
		for (int i = 0; i < 500; ++i) {
			
			double ran = Math.random();
			
			if (i == 0) {
				min = ran;
				max = ran;
			} else {				
				max = Math.max(max, ran);
				min = Math.min(min, ran);
//				if (ran < min) min = ran;				
//				if (ran > max) max = ran;				
			}			
		}
		
		System.out.println("�ִ밪 : " + (int)(max * 9000 + 1000));
		System.out.println("�ּҰ� : " + (int)(min * 9000 + 1000));
		
		
		
//		int start = 1000;
//		int end = 9999;
//		
//		// �ּҰ��� ���� ���ɼ��� �ִ� �� �߿� ���� ū ���� �����Ѵ�. 
//		int min = end;
//		// �ִ밪�� ���� ���ɼ��� �ִ� �� �߿� ���� ���� ���� �����Ѵ�.
//		int max = start;
//		
//		for (int i = 0; i < 500; ++i) {
//			int ran = (int)(Math.random() * (end - start + 1) + start);
//			
//			// �� ū ���� ������ �ִ밪�� ��ü�Ѵ�
//			if (ran > max)
//				max = ran;
//			// �� ���� ���� ������ �ּҰ��� ��ü�Ѵ�
//			if (ran < min)
//				min = ran;
//		}
//		System.out.println("�ִ밪 : " + max);
//		System.out.println("�ּҰ� : " + min);
		
		
		
		// 2. java.util.Random Ŭ����
		
		// import�� �ϱ� ���� �� 
		java.util.Random ran = new java.util.Random();		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// ran.nextInt(bound) : 0 <= x < bound�� ���� ������ �����Ѵ�		
		
		// Random Ŭ������  1000 ~ 9999�� ���� ������ �����ϴ� ��� 
		int num = ran.nextInt(9000) + 1000;
	}
	
}
















