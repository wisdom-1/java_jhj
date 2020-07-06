
public class B08_Array2 {

	public static void main(String[] args) {
		
		// �迭 ������ ������ ������ �ִ� �迭 ����ϱ�
		
		// int[] : ��ҷ� int�� ������ �ִ� �迭
		int[] num = {1, 1, 1, 1, 1};
		
		System.out.println(num[3]);
		
		// int[][] : ��ҷ� int[]�� ������ �ִ� �迭
		//	- �迭 ������ �迭�� ���� ���̰� �޶� �������
		int[][] numArr2 = {
				{1, 2, 3, 4, 5},
				{1, 2},
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{1, 2, 3, 4, 5},				
		};
		
		int[] arr = numArr2[2];
		
		System.out.println("numArr2[1]�� �ִ� �迭�� ���� : " + numArr2[1].length);
		System.out.println("numArr2[2]�� �ִ� �迭�� ���� : " + arr.length);
		System.out.println("numArr2[3]�� �ִ� �迭�� ���� : " + numArr2[3].length);	
		
		System.out.println(numArr2[2][9]);
		
		// int[][][] : ��ҷ� int[][]�� ������ �ִ� �迭
		int[][][] numArr3 = {
				numArr2,
				{
					{1, 2, 3, 4, 5}, 
					{6, 7, 8}, 
					{9, 9, 9, 9}
				},
				numArr2,
				numArr2,
				numArr2,				
		};
		
		System.out.println(numArr3[1][1][1]);
		System.out.println(numArr3[1][1][2]);
		System.out.println(numArr3[1][0][4]);
		
		
		// n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�.
		
		char[] charArr01 = "Nihao".toCharArray();
		char[] charArr02 = "Nice to meet you!".toCharArray();
		char[] charArr03 = "Bonjour".toCharArray();
		char[] charArr04 = "�ȳ��ϼ���".toCharArray();
		
		// 2���� �迭�� ������ �� ���� �迭�� ���̴� �������� �ʾƵ� �ȴ�
		char[][] msg = new char[4][];
		
		msg[0] = charArr01;
		msg[1] = charArr02;
		msg[2] = charArr03;
		msg[3] = charArr04;
		
		System.out.println("msg�迭�� �迭�� � �ֳ���? " + msg.length + "��");
		System.out.println("msg�� ù ��° �迭�� ���� : " + msg[0].length);
		System.out.println("msg�� �� ��° �迭�� ���� : " + msg[1].length);
		System.out.println("msg�� �� ��° �迭�� ���� : " + msg[2].length);
		System.out.println("msg�� �� ��° �迭�� ���� : " + msg[3].length);
		
		for (int i = 0; i < msg.length; ++i) {
			
			for (int j = 0; j < msg[i].length; ++j) {
				
				System.out.printf("msg[%d][%d]\t: %c\n", i, j, msg[i][j]);
				
			}
			
			System.out.println("-----------------------");
			
		}
	}
	
}
















