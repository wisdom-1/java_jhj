package quiz;

import java.util.Arrays;

public class B07_LottoQuiz {
	
	// int�� �迭�� �ߺ����� �ʴ� 6���� ���� ����(1 ~ 45)�� �����غ�����
	
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for (int test = 0; test < 1000; ++test) {
			
			for (int i = 0; i < lotto.length; ++i) {
				
				// ���ڸ� ���� ������ ������ ���ڿ� ���Ѵ�.
				// ���� ���� ���ڰ� ������ �ٽ� �̴´�.				
				lotto[i] = (int) (Math.random() * 45 + 1);
			
				// i��° ���ڸ� �̾��� �� i���� ���ڵ�� ���Ѵ� 
				for (int j = 0; j < i; ++j) {
					if (lotto[j] == lotto[i]) {
						// ���� ���ڸ� �߰��ϸ� �ٽ� �̴´�
						--i;
						break;
					}					
				}					
			}
			
			// Arrays.sort() : �迭�� ũ������� �����Ѵ�
			Arrays.sort(lotto);
			
			// Arrays.toString() : �迭�� �������� ������ ���ڿ��� ��ȯ
			System.out.println(Arrays.toString(lotto));
			
		}
	}
	
	
}







