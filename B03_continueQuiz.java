package quiz;

public class B03_continueQuiz {

	public static void main(String[] args) {
		
		int sum = 0;
		
		// 1부터 200 사이의 수 중에서 2 또는 3의 배수가 아닌 수들의 총 합을 구해보세요 
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
		
		
		// while문으로 똑같은 반복문을 만들어보세요 (continue를 써야함)		
		int i = 0;
		sum = 0;
		
		while (i++ <= 200) {			
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			
			sum += i;			
		}
		System.out.println("while문으로 구한 답 : " + sum);
	}
	
}























