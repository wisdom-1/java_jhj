
public class B03_breakContinue {

	public static void main(String[] args) {
		
		// break
		//	- switch문, 반복문 안에서만 사용할 수 있다
		//	- switch문 혹은 반복문을 탈출한다
		
		for (int i = 0; i < 100; ++i) {			
			if (i == 15)
				break; // break를 만나면 반복문을 한 개 탈출한다.
			
			System.out.println(i);			
		}
		
		// 다중 반복문 내부에서 break를 사용하면 한 개만 탈출한다.
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
		//	- 반복문 내부에서만 사용할 수 있다
		//	- continue를 만나면 이후 명령을 실행하지 않고 다음번 반복으로 넘어간다
		//	- while문과 같이 사용할 때 증가값을 스킵하지 않도록 주의해야 한다 
		
		for (int i = 0; i < 100; ++i) {
			if (i % 2 == 0)
				continue;
			
			System.out.println(i);			
		}
		
		
		int i = 0;
		
		while (i++ < 100) {
			if (i % 2 == 0) {
				// System.out.println(i + "를 출력하지 않고 스킵합니다.");
				continue;				
			}			
			System.out.println("while로 출력 : " + i);
		}
		
	}
	
}






















