
public class B06_Array {

	public static void main(String[] args) {
		// 배열
		//	- 같은 타입의 변수를 한 번에 여러개 선언하는 방법 
		
		// int형 변수를 100개 선언 : 0부터 99까지 100개
		int[] num = new int[100];
		
		// 선언한 배열의 각 방에 값을 대입할 수 있다
		num[0] = 80;
		num[1] = 65000;
		num[2] = 990000;
		num[99] = 7;
		// num[100] = 123; // 배열은 크기-1번 인덱스까지 존재한다
		
		// 각 방의 값을 원할때 꺼내서 사용할 수 있다
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		
		// 배열 선언 방법
		//	1. 타입[] 변수명 = new 타입명[배열크기];
		//	2. 타입[] 변수명 = {데이터1, 데이터2, 데이터3, ...};
		//	3. 타입[] 변수명 = new 타입명[] {데이터1, 데이터2, ...};	

		// * 자바의 모든 타입으로 배열을 선언할 수 있다
		String[] fruits = {"apple", "kiwi", "orange"};
		double[] weights = {55.55, 66.66, 77.77, 88.88};
		boolean[] pass = new boolean[] {true, false, true, true, false};
		
		// 치환을 잘 해야 한다
		boolean[] pass2 = {
				99 > 70,
				66 > 70,
				54 > 70,
		};		
		
		System.out.println(fruits[2]);
		System.out.printf("%.2f\n", weights[2]);
		
		// 4번째 사람이 통과라면
		if (pass[3]) {
			System.out.println("통과입니다.");
		}
		
		// str.toCharArray() : String을 문자열 배열로 반환하는 메서드
		char[] msg = "Hello, World!!".toCharArray();
		
		// 배열.length를 이용하면 반복을 쉽게 돌릴 수 있다.
		System.out.println("msg의 데이터 개수 : " + msg.length + "개");
		
		for (int index = 0; index < msg.length; ++index) 
			System.out.printf("char[%d] : %c\n", index, msg[index]);
		
		// 변수는 초기화 하지 않으면 사용할 수 없었다
		// int a;		
		// System.out.println(a);
		
		// 배열은 변수와는 다르게 선언시에 자동으로 기본값으로 초기화를 해준다
		//		정수 : 0
		//		실수 : 0.0
		//		boolean : false
		//		참조형 (String.. 등) : null
		//		* 배열도 참조형 변수다
		int[] arr = new int[10];		
		System.out.println("초기화 한적 없는 arr[7] : " + arr[7]);
		
		String[] animals = new String[10];
		System.out.println("초기화 한적 없는 animals[5] : " + animals[5]);
		
		for (int i = 0; i < animals.length; ++i)
			animals[i] = "Lion" + (i + 1);
		
		// forEach : 배열의 내용을 하나씩 꺼내면서 반복을 진행하는 문법
		
		//	String[] animals : String값을 여러개 가지고 있는 배열
		for (String animal : animals) {
			System.out.println("동물 이름 : " + animal);
		}
		
		for (String car : new String[] {"bmw", "benz", "hyundai", "kia"}) {
			System.out.println("자동차 브랜드 : " + car);
		}
	}
	
}












