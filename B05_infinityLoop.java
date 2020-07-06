import java.util.Scanner;

public class B05_infinityLoop {

	public static void main(String[] args) {

		// 무한 루프
		
		// 1. for문의 무한 루프 (조건 부분에 true를 쓰거나, 조건을 쓰지 않으면 무한 루프)
		for (int i = 0;; i += 100) {
			System.out.println(i);
			
			// 무한 루프는 break문과 함께 사용하면 좋다
			if (i > 50000)
				break;
		}
		
		// 2. while문의 무한 루프 (조건에 true를 쓴다)
		int index = 0;
		while (true) {
			System.out.println("while : " + index++);
			
			if (index > 123)
				break;
		}
		
		// 무한 루프로 프로그램 구성하기
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n=======================");
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 종료");
			System.out.println("2. 토끼");
			System.out.print("> ");
						
			// 숫자만 입력받아 사용하기
			
			// sc.hasNextInt() 
			//	- 버퍼가 비어있으면 다음 입력을 기다린다
			//	- 버퍼에 확인할 내용이 있으면 확인 후 
			//	  int라면 true, int가 아니라면 false를 반환한다
			if (sc.hasNextInt()) {
				// sc.nextInt() : 버퍼에 값이 있다면 int값을 하나만 꺼낸다
				int cmd = sc.nextInt();
				
				switch (cmd) {
				case 1:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				case 2:
					System.out.println(" /)/)");
					System.out.println("(  ..)");
					System.out.println("(  >ㅁ");
					break;
				default:
					System.out.println("그런 메뉴는 없습니다.");
					break;
				}
			} else {
				// 버퍼 비우기
				// sc.nextLine() : 버퍼에 값이 있다면 한 줄을 전부 꺼낸다
				String trash = sc.nextLine();
				System.out.println("버퍼에 남아있던 값들 : " + trash);
 			}
		}
		
	}
	
}










