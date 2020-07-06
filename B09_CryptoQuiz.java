package quiz;

public class B09_CryptoQuiz {

	// 암호
	//	- 비밀 메세지를 주고 받기 위한 것
	//	- 암호화 : 읽을 수 있는 메세지(평문)를 읽을 수 없는 메세지(암호문)으로 변환하는 것
	//	- 복호화 : 암호문을 평문으로 바꾸는 것
		
	// 시저 암호
	//	- 키(KEY)값 만큼 오른쪽으로 알파벳을 이동시켜 암호문을 생성하는 암호방식
	//	- 암호화 : KEY값 만큼 평문을 오른쪽으로 이동시킨다
	//	- 복호화 : KEY값 만큼 암호문을 왼쪽으로 이동시킨다
	
	// - 암호에 사용할 문자들
	// ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$%^&,.abcdefghijklmnopqrstuvwxyz
	
	// ex: KEY가 5인 경우
	//		"Hello, World!"	=>	"Mjqqtd%!.."
	
	
	// 클래스 변수를 선언하면 모든 메서드에서 같은 변수를 사용할 수 있다
	static String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			+ " !@#$%^&,."
			+ "abcdefghijklmnopqrstuvwxyz";
	
	
	public static int indexOfSymbols(char ch) {		
		for (int i = 0; i < symbols.length(); ++i) {
			if (ch == symbols.charAt(i))
				return i;
		}
		
		// 아무것도 못찾은 경우
		return -1;
	}
	
	// 암호화 함수를 구현해 보세요	
	public static String encryption(String msg, int key) {		
		// str.charAt(index) : 문자열의 index번째 문자를 반환하는 메서드 
		// str.indexOf(char) : 해당 문자 혹은 문자열이 몇 번째 인덱스에 위치하는지 반환하는 메서드
		key %= symbols.length();		
		
		// String encrypted = "";
		
		// StringBuilder 클래스 
		//	- 문자열을 추가해가면서 완성시켜주는 클래스
		//	- 빈 문자열에 +=으로 누적시키는것과 방식은 동일하지만 속도가 훨씬 빠르다
		StringBuilder encrypted = new StringBuilder();
		
		for (int i = 0; i < msg.length(); ++i) {
			char ch = msg.charAt(i);
			
			// symbols에서 ch의 위치를 찾고싶다
			int index = indexOfSymbols(ch);
			
			System.out.printf("문자 ch[%c]의 symbols에서의 인덱스 : %d\n", 
					ch, index);
			
			// encrypted += symbols.charAt((index + key) % symbols.length());			
			if (index == -1)
				encrypted.append(ch);
			else
				encrypted.append(symbols.charAt((index + key) % symbols.length()));
		}
		
		return encrypted.toString();
	}
	
	// 복호화 함수를 구현해 보세요 
	public static String decryption(String crypto, int key) {		
		key %= symbols.length();		
		StringBuilder decrypted = new StringBuilder();
		
		for (int i = 0; i < crypto.length(); ++i) {			
			char ch = crypto.toCharArray()[i];
			
			int index = indexOfSymbols(ch);	
			
			if (index == -1) 
				decrypted.append(ch);
			else if (index - key < 0) 				
				decrypted.append(symbols.charAt(index - key 
						+ symbols.length()));
			else 
				decrypted.append(symbols.charAt(index - key));			
		}
		
		return decrypted.toString();
	}
	
	public static void main(String[] args) {
		String crypto = encryption("H한ello, w글orld!", 5);
		
		System.out.println("완성된 암호문 : " + crypto);
		
		System.out.println("복호화된 평문 : " + decryption(crypto, 5));
	}
	
}












