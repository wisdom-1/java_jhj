package quiz;

import java.util.Arrays;

public class B08_Array2Quiz {

	public static void main(String[] args) {
		
		// 1. numArr�� ���հ� ����� ���ؼ� ����غ�����
		
		// 2. numArr�� �� ��� ���� ���� ���ؼ� ����غ����� 
		
		//	ex:	0���� ���� : 5 + 7 + 9
		//		1���� ���� : 7 + 16 + 130 + 16
		
		int[][] numArr = {
				{5, 7, 9},
				{8, 16, 24, 99, 99, 99},
				{13, 130, 1300},
				{15, 16, 17, 18, 19, 20, 21, 22}
		};
		
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < numArr.length; ++i) {
			
			int len = numArr[i].length;
			count += len;
			
			for (int j = 0; j < len; ++j) {
				sum += numArr[i][j];
			}
		}
		
		System.out.println("numArr�� ���� : " + sum);
		System.out.println("numArr�� ��� : " + sum / (double)count);
		
		
		// 2. numArr�� �� ��� ���� ���� ���ؼ� ����غ����� 
		int[] col_sum = new int[numArr.length];
		
		// ���� �� ���� �迭 ã�� (���� ���̰� �������� ���� ��쿡 ���)
		int max_len = 0;
		
		for (int i = 0; i < numArr.length; ++i) 
			max_len = Math.max(max_len, numArr[i].length);
		
		int[] row_sum = new int[max_len];
		
		for (int i = 0; i < numArr.length; ++i) {			
			for (int j = 0; j < numArr[i].length; ++j) {
				col_sum[i] += numArr[i][j];
				row_sum[j] += numArr[i][j];				
			}			
		} 
		
		System.out.println("���� �� : " + Arrays.toString(col_sum));
		System.out.println("���� �� : " + Arrays.toString(row_sum));
	}
	
}














