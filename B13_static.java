
public class B13_static {

	// static
	//	- ���� Ŭ������ �ν��Ͻ��� �������� ����ϴ� ������ ���Ѵ�
	//	- static ������ Ŭ������ �ϳ��̱� ������ Ŭ���� �̸��� .�� ��� ����� �� �ִ�
	//	- static ����/�޼���� �ν��Ͻ��� �����Ǳ� ������ ����� �� �ִ�
	
	public static void main(String[] args) {
		// card01/02/03�� ����� ������ static������ ����� �� �ִ� 
		System.out.printf("TrumphCard�� �ʺ� %dmm\n", TrumphCard.width);
		System.out.printf("TrumphCard�� ���� %dmm\n", TrumphCard.height);
		
		TrumphCard card01 = new TrumphCard(1, "clover");
		TrumphCard card02 = new TrumphCard(2, "heart");
		TrumphCard card03 = new TrumphCard(3, "spade");
		
		System.out.println("card01�� ���� �ʺ� : " + card01.width + "mm");
		System.out.println("card02�� ���� �ʺ� : " + card02.width + "mm");
		System.out.println("card03�� ���� �ʺ� : " + card03.width + "mm");
		System.out.println("TrumphCard�� ���� �ʺ� : " 
								+ TrumphCard.width + "mm");
		
		// ��� �ν��Ͻ����� ���� ���� ���� �ֱ� ������ �ϳ��� �����ص� ��� �ٲ��
		card03.width = 77;
		
		System.out.println("card01�� ���� �ʺ� : " + card01.width + "mm");
		System.out.println("card02�� ���� �ʺ� : " + card02.width + "mm");
		System.out.println("card03�� ���� �ʺ� : " + card03.width + "mm");
		System.out.println("TrumphCard�� ���� �ʺ� : " 
								+ TrumphCard.width + "mm");
		
		// �ƹ� �ǹ̾��� 100�� �߰� ����
		for (int i = 0; i < 100; ++i)
			new TrumphCard(0, null);
		
		System.out.printf("���±��� ������ TrumphCard : %d��\n", 
				TrumphCard.count);
		
		// myobj ��Ű���� static ������ �޼��带 ���� Ŭ������ �ϳ� �����غ����� 
		// (width, height ����)
	}
	
}

class TrumphCard {
	// �ν��Ͻ����� ���� �޶� �ν��Ͻ� ������� �θ���
	int number;
	String shape;	
	
	// ���� Ŭ������ ������� ��� �ν��Ͻ����� ���� ���� ������ Ŭ���� ������� �θ���
	static int width = 50;
	static int height = 100;
	
	static int count = 0;

	public TrumphCard(int number, String shape) {
		this.number = number;
		this.shape = shape;
		++count;
	}
	
	// static method : ��� �ν��Ͻ��� �������� ����ϴ� �޼���
	public static void printSize() {
		System.out.printf("TrumphCard�� ���� ũ�� %dmm\n", width);
		System.out.printf("TrumphCard�� ���� ũ�� %dmm\n", height);
	} 
	
	// static �޼���� �ν��Ͻ��� �������� ���� ���� �θ� �� �ִ�.
	// ������ static �޼��忡���� �ν��Ͻ� ���� ����� �����Ǿ� �ִ�.
//	public static void printCard() {
//		System.out.printf("TrumphCard�� ���� ũ�� %dmm\n", number);
//		System.out.printf("TrumphCard�� ���� ũ�� %dmm\n", shape);
//	}
}












