package quiz;

import java.util.Arrays;

public class B08_Array2Quiz {

	public static void main(String[] args) {
		
		// 1. numArr의 총합과 평균을 구해서 출력해보세요
		
		// 2. numArr의 각 행과 열의 합을 구해서 출력해보세요 
		
		//	ex:	0행의 총합 : 5 + 7 + 9
		//		1열의 총합 : 7 + 16 + 130 + 16
		
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
		
		System.out.println("numArr의 총합 : " + sum);
		System.out.println("numArr의 평균 : " + sum / (double)count);
		
		
		// 2. numArr의 각 행과 열의 합을 구해서 출력해보세요 
		int[] col_sum = new int[numArr.length];
		
		// 제일 긴 내부 배열 찾기 (열의 길이가 일정하지 않을 경우에 대비)
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
		
		System.out.println("행의 합 : " + Arrays.toString(col_sum));
		System.out.println("열의 합 : " + Arrays.toString(row_sum));
	}
	
}














