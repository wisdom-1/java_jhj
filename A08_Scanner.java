// 다른 패키지에 있는 클래스를 사용하기 위해서는 해당 패키지를 import를 해야 한다
// Ctrl + Shift + O : Eclipse의 자동 import 단축키
// Ctrl + / : 주석처리 단축키
import java.util.Scanner;

public class A08_Scanner {

	public static void main(String[] args) {		
		// Scanner 클래스
		//	- 입력을 편하게 받을 수 있는 기능이 모여있는 클래스
		//	- 콘솔로부터 입력을 받을 때는 System.in을 사용한다
		//	- 문자열을 부분 부분 읽을 때 사용하기도 한다
		//	- 파일을 읽을 때 쓰기도 한다		
		
		// sc : 콘솔로부터 입력받은 값을 읽어들일 스캐너를 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해보세요 > ");
		int user_input = sc.nextInt(); // 여기서 사용자의 입력을 기다리며 프로그램이 멈춘다
		System.out.println("사용자가 입력한 값은 " + user_input + "입니다.");
		
		System.out.print("실수를 입력해보세요 > ");
		double d = sc.nextDouble();
		System.out.println("사용자가 입력한 값은 " + d + "입니다.");
		
		// 정수나 실수를 입력받은 후 스캐너의 버퍼에는 \n이 남아있게된다.
		// nextLine()은 \n을 기준으로 입력받기 때문에 남아있는 
		// \n을 비워야 다음입력을 받을 수 있다
		
		sc.nextLine(); // 남아있는 버퍼를 비움
		
		// nextLine() : \n을 기준으로 입력받는다
		System.out.print("아무거나 입력해보세요 > ");
		String line = sc.nextLine();
		
		System.out.println(line);
		
//		System.out.print("true/false를 입력해보세요 > ");
//		boolean b = sc.nextBoolean();
//		System.out.println("사용자가 입력한 값은 " + b + "입니다.");
		
		// sc.nextFloat();
		// sc.nextByte();
		// sc.nextBoolean();
		
		// sc2 : 전달한 문자열을 읽어들일 스캐너를 생성
//		Scanner sc2 = new Scanner("aaaa\nbbbb\ncc\ndd\na\nb\nc");
		
		// 다음 줄이 존재하는 동안 한 줄씩 내용을 출력
//		while (sc2.hasNextLine()) {
//			System.out.println(sc2.nextLine());
//		}
		
	}	
}








