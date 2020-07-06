
public class B04_operator04 {

	public static void main(String[] args) {
		
		// ��Ʈ ����
		//	- ���� ������ �ϴ� ������ �ƴ϶� ������ �����ϴ� ��Ʈ�� ����ϴ� ����
		int a = 15, b = 10;
		
		// Integer.toBinaryString(int) : int�� 2���� ���ڿ��� ��ȯ�Ѵ�
		System.out.println("15�� 2������ : " + Integer.toBinaryString(a));
		System.out.println("10�� 2������ : " + Integer.toBinaryString(b));
		
		// and : �� ��Ʈ�� ��� 1�̾�� 1
		//	15 -> 1 1 1 1
		//	10 -> 1 0 1 0
		//		  -------- &
		//		  1 0 1 0		
		System.out.println("and ��� : " + (a & b));		
		
		// or : �� ��Ʈ �� �ϳ��� 1�̾ 1
		//	15 -> 1 1 1 1
		//	10 -> 1 0 1 0
		//		  -------- |
		//		  1 1 1 1
		System.out.println("or ��� : " + (a | b));		
		
		// xor : �� ��Ʈ�� ���� �ٸ��� 1
		//	15 -> 1 1 1 1
		//	10 -> 1 0 1 0
		//		  -------- ^
		//		  0 1 0 1		
		System.out.println("xor ��� : " + (a ^ b));
		
		
		// ��Ʈ�� ����ϴ� ��
		//	- �� ��Ʈ�� �ڱ⸸�� ��Ģ�� �����Ͽ� ����Ѵ�
		//	- �� ��ü�� �ɼ��� ��Ÿ���ٰ� �����ϸ� �ȴ�
		
		
		// ������ ����� ���� ���� byte
		// 	0000 0000
		// ù ��° ��Ʈ : (��ȣ)
		// 2 ~ 3 ��Ʈ : ������ (00 : A / 01 : B / 10 : O / 11 : AB)
		// 4��° ��Ʈ 	: ���� (���� : 0, ���� : 1)
		// 5 ~ 8 ��Ʈ : �����ϴ� ���
		//	 5��° ��Ʈ : ����
		//	 6��° ��Ʈ : �׸��׸���
		//	 7��° ��Ʈ : ����
		//	 8��° ��Ʈ : ��Ʃ�� ����		
		
		// B��, ����, ����, ��Ʃ��
		byte option1 = 0b00101001;
		
		System.out.println(option1);
		
		System.out.printf("%s\n", Integer.toBinaryString(41));
		System.out.printf("%d\n", 41);
		System.out.printf("%o\n", 41);
		System.out.printf("%x\n", 41);
		
		// ��Ʈ�� ������ �����Ϳ��� ���� ������ (ex: ��� Ȯ���ϱ�)
		//	- ��� ��Ʈ�� ��� 1���� ��  & ����
		switch (option1 & 0b00001111) {
		case 1:
			System.out.println("��Ʃ�길 ���� ���");
			break;
		case 2:
			System.out.println("���߸� �ϴ� ���");
			break;
		case 3:
			System.out.println("���� & ��Ʃ�� �ϴ»��");
			break;
		case 4:
			System.out.println("�׸��� �׸��� ���");
			break;
		case 9:
			System.out.println("��� : ���� & ��Ʃ��");
			break;
		default:
			System.out.println("���� ���� �ȵ� �ɼ�");
			break;
		}
	}
	
}



















