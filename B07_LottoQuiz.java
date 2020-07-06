package quiz;

import java.util.Arrays;

public class B07_LottoQuiz {
	
	// int형 배열에 중복되지 않는 6개의 랜덤 숫자(1 ~ 45)를 저장해보세요
	
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for (int test = 0; test < 1000; ++test) {
			
			for (int i = 0; i < lotto.length; ++i) {
				
				// 숫자를 새로 뽑으면 이전의 숫자와 비교한다.
				// 만약 같은 숫자가 있으면 다시 뽑는다.				
				lotto[i] = (int) (Math.random() * 45 + 1);
			
				// i번째 숫자를 뽑았을 때 i이전 숫자들과 비교한다 
				for (int j = 0; j < i; ++j) {
					if (lotto[j] == lotto[i]) {
						// 같은 숫자를 발견하면 다시 뽑는다
						--i;
						break;
					}					
				}					
			}
			
			// Arrays.sort() : 배열을 크기순으로 정렬한다
			Arrays.sort(lotto);
			
			// Arrays.toString() : 배열을 보기좋은 형태의 문자열로 반환
			System.out.println(Arrays.toString(lotto));
			
		}
	}
	
	
}







