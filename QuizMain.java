package quiz;

import myobj.DirtBlock;
import myobj.Position;

public class QuizMain {
	public static void main(String[] args) {
		
		// �ٸ� ��Ű���� Ŭ������ ���� ���� ���� ��쿡�� 
		// ��Ű������ ��Ȯ�ϰ� �Է������ �Ѵ�
		
		// �ٸ� ��Ű������ ���ҽ��� �����ϱ� ���ؼ��� public�� �پ��־�� �Ѵ�.
		System.out.println("�� ����� hp: " + myobj.DirtBlock.hp);
		
		
		// ��Ű������ ������ �Է��ϱ� �ȴٸ� import�� �� �ִ�
		DirtBlock block01 = new DirtBlock();
		
		System.out.println("block01�� ü�� : " + block01.hp);
		System.out.println("block01�� ���� ���� : " + block01.stackSize);
		
		// ��Ű������ ��� �Է��ؼ� �ν��Ͻ� ����
		myobj.DirtBlock block02 = new myobj.DirtBlock();
		
		block02.pos = new Position();
		
		block02.pos.x = 10;
		block02.pos.y = 15;
		block02.pos.z = 30;
	}
}









