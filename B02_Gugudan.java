package quiz;

public class B02_Gugudan {
	
	public static void main(String[] args) {
		// 1. �������� ������ ���� ���η� ����غ�����
		
		// 2�� : 2x1=2 2x2=4 2x3=6 ...
		// 3�� : 3x1=3 3x2=6 3x3=9 ...
		// ...
		for (int dan = 2; dan <= 9; ++dan) {
			// �� ���� ����
			System.out.printf("%d�� : ", dan);
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan*gop);				
			}
			System.out.println();			
			// �� ���� ��
		}
		
		
		// 2. �������� ������ ���� ���η� ����غ����� 
		
		//	2��		3��		4��		...
		//	2x1=2	3x1=3	4x1=4	...
		//	2x2=4	3x2=6	4x2=8	...
		//	...		
		for (int gop = 0; gop <= 9; ++gop) {
			
			for (int dan = 2; dan <= 9; ++dan) {
				if (gop == 0) {
					System.out.print(dan + "��\t");
				} else {				
					System.out.printf("%dx%d=%d\t", dan, gop, dan*gop);
				}
			}		
			System.out.println();
		}
		
	}
	
	
}









