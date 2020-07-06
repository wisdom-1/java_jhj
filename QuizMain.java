package quiz;

import myobj.DirtBlock;
import myobj.Position;

public class QuizMain {
	public static void main(String[] args) {
		
		// 다른 패키지의 클래스를 갖다 쓰고 싶은 경우에는 
		// 패키지명을 정확하게 입력해줘야 한다
		
		// 다른 패키지에서 리소스에 접근하기 위해서는 public이 붙어있어야 한다.
		System.out.println("흙 블록의 hp: " + myobj.DirtBlock.hp);
		
		
		// 패키지명을 일일이 입력하기 싫다면 import할 수 있다
		DirtBlock block01 = new DirtBlock();
		
		System.out.println("block01의 체력 : " + block01.hp);
		System.out.println("block01의 스택 제한 : " + block01.stackSize);
		
		// 패키지명을 모두 입력해서 인스턴스 생성
		myobj.DirtBlock block02 = new myobj.DirtBlock();
		
		block02.pos = new Position();
		
		block02.pos.x = 10;
		block02.pos.y = 15;
		block02.pos.z = 30;
	}
}









