
public class B04_operator04 {

	public static void main(String[] args) {
		
		// 비트 연산
		//	- 정수 값으로 하는 연산이 아니라 정수를 구성하는 비트를 사용하는 연산
		int a = 15, b = 10;
		
		// Integer.toBinaryString(int) : int를 2진수 문자열로 변환한다
		System.out.println("15를 2진수로 : " + Integer.toBinaryString(a));
		System.out.println("10을 2진수로 : " + Integer.toBinaryString(b));
		
		// and : 두 비트가 모두 1이어야 1
		//	15 -> 1 1 1 1
		//	10 -> 1 0 1 0
		//		  -------- &
		//		  1 0 1 0		
		System.out.println("and 결과 : " + (a & b));		
		
		// or : 두 비트 중 하나만 1이어도 1
		//	15 -> 1 1 1 1
		//	10 -> 1 0 1 0
		//		  -------- |
		//		  1 1 1 1
		System.out.println("or 결과 : " + (a | b));		
		
		// xor : 두 비트가 서로 다르면 1
		//	15 -> 1 1 1 1
		//	10 -> 1 0 1 0
		//		  -------- ^
		//		  0 1 0 1		
		System.out.println("xor 결과 : " + (a ^ b));
		
		
		// 비트를 사용하는 법
		//	- 각 비트에 자기만의 규칙을 정의하여 사용한다
		//	- 값 자체가 옵션을 나타낸다고 생각하면 된다
		
		
		// 나만의 사람에 대한 정보 byte
		// 	0000 0000
		// 첫 번째 비트 : (부호)
		// 2 ~ 3 비트 : 혈액형 (00 : A / 01 : B / 10 : O / 11 : AB)
		// 4번째 비트 	: 성별 (남자 : 0, 여자 : 1)
		// 5 ~ 8 비트 : 좋아하는 취미
		//	 5번째 비트 : 게임
		//	 6번째 비트 : 그림그리기
		//	 7번째 비트 : 개발
		//	 8번째 비트 : 유튜브 보기		
		
		// B형, 남성, 게임, 유튜브
		byte option1 = 0b00101001;
		
		System.out.println(option1);
		
		System.out.printf("%s\n", Integer.toBinaryString(41));
		System.out.printf("%d\n", 41);
		System.out.printf("%o\n", 41);
		System.out.printf("%x\n", 41);
		
		// 비트로 설정한 데이터에서 값을 꺼내기 (ex: 취미 확인하기)
		//	- 취미 비트를 모두 1설정 후  & 연산
		switch (option1 & 0b00001111) {
		case 1:
			System.out.println("유튜브만 보는 사람");
			break;
		case 2:
			System.out.println("개발만 하는 사람");
			break;
		case 3:
			System.out.println("개발 & 유튜브 하는사람");
			break;
		case 4:
			System.out.println("그림만 그리는 사람");
			break;
		case 9:
			System.out.println("취미 : 게임 & 유튜브");
			break;
		default:
			System.out.println("아직 설정 안된 옵션");
			break;
		}
	}
	
}



















