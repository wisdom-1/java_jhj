
public class B03_breakContinue {

	public static void main(String[] args) {
		
		// break
		//	- switch��, �ݺ��� �ȿ����� ����� �� �ִ�
		//	- switch�� Ȥ�� �ݺ����� Ż���Ѵ�
		
		for (int i = 0; i < 100; ++i) {			
			if (i == 15)
				break; // break�� ������ �ݺ����� �� �� Ż���Ѵ�.
			
			System.out.println(i);			
		}
		
		// ���� �ݺ��� ���ο��� break�� ����ϸ� �� ���� Ż���Ѵ�.
		for (int i = 0; i < 10; ++i) {
			
			if (i == 3)
				break;
			
			for (int j = 0; j < 100; ++j) {
				if (j == 15)
					break;
				
				System.out.printf("%d-%d\n", i, j);
			}			
		}
		
		// continue 
		//	- �ݺ��� ���ο����� ����� �� �ִ�
		//	- continue�� ������ ���� ����� �������� �ʰ� ������ �ݺ����� �Ѿ��
		//	- while���� ���� ����� �� �������� ��ŵ���� �ʵ��� �����ؾ� �Ѵ� 
		
		for (int i = 0; i < 100; ++i) {
			if (i % 2 == 0)
				continue;
			
			System.out.println(i);			
		}
		
		
		int i = 0;
		
		while (i++ < 100) {
			if (i % 2 == 0) {
				// System.out.println(i + "�� ������� �ʰ� ��ŵ�մϴ�.");
				continue;				
			}			
			System.out.println("while�� ��� : " + i);
		}
		
	}
	
}






















