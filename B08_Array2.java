
public class B08_Array2 {

	public static void main(String[] args) {
		
		// 배열 변수를 여러개 가지고 있는 배열 사용하기
		
		// int[] : 요소로 int를 가지고 있는 배열
		int[] num = {1, 1, 1, 1, 1};
		
		System.out.println(num[3]);
		
		// int[][] : 요소로 int[]을 가지고 있는 배열
		//	- 배열 내부의 배열은 각자 길이가 달라도 상관없다
		int[][] numArr2 = {
				{1, 2, 3, 4, 5},
				{1, 2},
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{1, 2, 3, 4, 5},				
		};
		
		int[] arr = numArr2[2];
		
		System.out.println("numArr2[1]에 있는 배열의 길이 : " + numArr2[1].length);
		System.out.println("numArr2[2]에 있는 배열의 길이 : " + arr.length);
		System.out.println("numArr2[3]에 있는 배열의 길이 : " + numArr2[3].length);	
		
		System.out.println(numArr2[2][9]);
		
		// int[][][] : 요소로 int[][]을 가지고 있는 배열
		int[][][] numArr3 = {
				numArr2,
				{
					{1, 2, 3, 4, 5}, 
					{6, 7, 8}, 
					{9, 9, 9, 9}
				},
				numArr2,
				numArr2,
				numArr2,				
		};
		
		System.out.println(numArr3[1][1][1]);
		System.out.println(numArr3[1][1][2]);
		System.out.println(numArr3[1][0][4]);
		
		
		// n차원 배열은 n중 반복문으로 모두 탐색할 수 있다.
		
		char[] charArr01 = "Nihao".toCharArray();
		char[] charArr02 = "Nice to meet you!".toCharArray();
		char[] charArr03 = "Bonjour".toCharArray();
		char[] charArr04 = "안녕하세요".toCharArray();
		
		// 2차원 배열을 선언할 때 내부 배열의 길이는 설정하지 않아도 된다
		char[][] msg = new char[4][];
		
		msg[0] = charArr01;
		msg[1] = charArr02;
		msg[2] = charArr03;
		msg[3] = charArr04;
		
		System.out.println("msg배열에 배열이 몇개 있나요? " + msg.length + "개");
		System.out.println("msg의 첫 번째 배열의 길이 : " + msg[0].length);
		System.out.println("msg의 두 번째 배열의 길이 : " + msg[1].length);
		System.out.println("msg의 세 번째 배열의 길이 : " + msg[2].length);
		System.out.println("msg의 네 번째 배열의 길이 : " + msg[3].length);
		
		for (int i = 0; i < msg.length; ++i) {
			
			for (int j = 0; j < msg[i].length; ++j) {
				
				System.out.printf("msg[%d][%d]\t: %c\n", i, j, msg[i][j]);
				
			}
			
			System.out.println("-----------------------");
			
		}
	}
	
}
















