
public class A11_switch {

	public static void main(String[] args) {
		// switch-case문
		//	- ()안의 연산 결과에 따라 분기를 나눌 수 있다
		//	- if문으로 완벽하게 대체 가능하다
		//	- ()안의 결과와  case의 값이 일치할 때 해당 블록을 실행한다
		//	- break가 없을 땐 해당 case부터 시작해서 break를 만날 때 까지 모든 명령을 실행한다.   
		
		// 1. 기본 사용법 
		int a = 0;
		
		switch (a) {
		case 0:
			System.out.println("a가 0일 때 실행되는 명령어");
			//break;
		case 1:
			System.out.println("a가 1일 때 실행되는 명령어");
			//break;
		case 2:
			System.out.println("a가 2일 때 실행되는 명령어");
			break;
		default:
			System.out.println("a가 모든 case에 해당하지 않을 때 실행되는 명령어");
			break;
		}
		
		// 2. 연산과 함께 응용
		int b = 3;
		
		switch (b % 2) {
		case 0:
			System.out.println("b는 짝수");
			break;
		case 1:
			System.out.println("b는 홀수");
			break;			
		}
		
		// 3. 메서드와 함께 이용
		
		// str.compareTo() : 문자열의 크기를 비교해준다. (사전순 크기를 의미함) 
		//	두 문자열이 같으면 : 0
		//	비교 대상이 더 크면 : 양수
		//  비교 대상이 더 작으면 : 음수
		//	두 문자열이 다르다면 문자열 간에 차이가 얼마나 나는지 리턴값으로 알려준다.		
		System.out.println("dar".compareTo("abd"));
		System.out.println("car".compareTo("abd"));
		System.out.println("bar".compareTo("abd"));
		
		switch ("car".compareTo("abd")) {
		case 0:
			System.out.println("두 문자열은 같은 문자열입니다.");
			break;
		default:
			System.out.println("두 문자열은 다른 문자열입니다.");
			break;
		}
	}
	
}











