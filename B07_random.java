
public class B07_random {

	public static void main(String[] args) {
		
		// 자바로 임의의 숫자 생성하기 
		
		// 1. Math.random() : 0 <= x < 1인 랜덤 소수를 생성한다		
		for (int i = 0; i < 20; ++i) {
			System.out.println(i + "\t:" + Math.random());
		}
		
		// Math.random()을 이용해서 원하는 범위의 숫자 생성하기 
		// ex: 33 ~ 77 사이의 랜덤 숫자 생성하기 
		//	(1) 원하는 숫자의 개수를 곱한다 (0 * 45 <= x < 1 * 45) 
		//	(2) 원하는 숫자중 가장 작은 수를 더한다 (0 + 33 <= x < 45 + 33)
		//	(3) int로 타입캐스팅하여 소수점 아래를 삭제한다 

		for (int i = 0; i < 20; ++i) {
			int num = (int)(Math.random() * 45 + 33);			
			System.out.println(i + "번째 랜덤 숫자\t: " + num);
		}
		
		// 연습문제 : 1000 ~ 9999까지의 랜덤 숫자를 500번 뽑으면서
		//		      나왔던 숫자 중 가장 큰 수와 가장 작은 수를 출력해보세요
		
		// 나중에 숫자의 범위만 재설정해도 모두 올바르게 동작하도록 소스를 작성하는 것이 좋다


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
		
		System.out.println("최대값 : " + (int)(max * 9000 + 1000));
		System.out.println("최소값 : " + (int)(min * 9000 + 1000));
		
		
		
//		int start = 1000;
//		int end = 9999;
//		
//		// 최소값은 뽑을 가능성이 있는 수 중에 가장 큰 수로 설정한다. 
//		int min = end;
//		// 최대값은 뽑을 가능성이 있는 수 중에 가장 작은 수로 설정한다.
//		int max = start;
//		
//		for (int i = 0; i < 500; ++i) {
//			int ran = (int)(Math.random() * (end - start + 1) + start);
//			
//			// 더 큰 수를 뽑으면 최대값을 교체한다
//			if (ran > max)
//				max = ran;
//			// 더 작은 수를 뽑으면 최소값을 교체한다
//			if (ran < min)
//				min = ran;
//		}
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
		
		
		// 2. java.util.Random 클래스
		
		// import를 하기 싫을 때 
		java.util.Random ran = new java.util.Random();		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// ran.nextInt(bound) : 0 <= x < bound인 랜덤 정수를 생성한다		
		
		// Random 클래스로  1000 ~ 9999의 랜덤 정수를 생성하는 방법 
		int num = ran.nextInt(9000) + 1000;
	}
	
}
















