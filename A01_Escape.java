
// 실수로 닫은 창을 다시 열고 싶을 때
//	 Window -> Show View -> ... 

public class A01_Escape {
	
	public static void main(String[] args) {
		// Escape 문자 
		//	- 특수한 기능을 가진 문자
		//	- 앞에 \(역슬래시)가 붙은 문자는 Escape 문자로 간주한다 
		
		// \n : 줄바꿈의 기능을 가진 특수 문자 (linefeed, newline)
		System.out.println("안녕\n하세요, 반\n갑\n습니다.");
		
		// \t : Tab키의 기능을 가진 특수 문자 
		System.out.println("이름\t나이\t성별\t비고");
		System.out.println("홍길동\t15\t남\t아버지를 아버지라 부르지 못함");
	
		// \\ : 그냥 역슬래시를 출력하고 싶은 경우에 사용한다 
		//	ex> C:\Users\KGITBANK\Appdata를 콘솔에 출력하기		
		System.out.println("C:\\Users\\KGITBANK\\Appdata");
		
		// \" : 그냥 큰 따옴표를 출력하고 싶은 경우에 사용한다
		//	ex> 철수가 "피자"를 시켰다
		System.out.println("철수가 \"피자\"를 시켰다");		
		
		// \' : 그냥 작은 따옴표를 출력하고 싶은 경우에 사용하다
		System.out.println("철수가 \'피자\'를 시켰다");
		System.out.println("철수가 '피자'를 시켰다");
		
		// 문자 타입 '를 값으로 사용하고 싶은 경우
		System.out.println("'"); // 문자열 타입
		System.out.println('\'');// 문자 타입
	}
	
}








