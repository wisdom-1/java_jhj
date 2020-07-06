
public class B12_method {
	
	// �޼���
	//  - Ŭ���� ������ �Լ��� �޼����� �Ѵ�
	//	- �ڹٿ����� �ݵ�� Ŭ���� ���ο��� �Լ��� ������ �� �ִ�
	//	- �Ȱ��� ����̴��� �� �ν��Ͻ��� ���� ���� ���� ����� �ٸ���
	
	public static void main(String[] args) {
		AppleStore store01 = new AppleStore();
		AppleStore store02 = new AppleStore(300, 20);
		AppleStore store03 = new AppleStore(1500, 3);
		
		int apple_num = 10;
		
		System.out.println("store01���� ����� 10�� ��� : "
				+ store01.getTotalPrice(apple_num) + "��");
		System.out.println("store02���� ����� 10�� ��� : "
				+ store02.getTotalPrice(apple_num) + "��");
		System.out.println("store03���� ����� 10�� ��� : "
				+ store03.getTotalPrice(apple_num) + "��");
		
		
		// ����� ������ �Ѱ��ָ� �ʿ��� �ٱ����� ������ ��ȯ���ִ� �޼��带 �����غ�����
		// �� ���Ը��� �ٱ����� ũ�Ⱑ �ٸ� �� �ְ� ������ּ���
		apple_num = 25;
		
		System.out.println("store01���� ����� 25�� ���� �� : " 
				+ store01.getBasketNum(apple_num) + "��");
		System.out.println("store02���� ����� 25�� ���� �� : " 
				+ store02.getBasketNum(apple_num) + "��");
		System.out.println("store03���� ����� 25�� ���� �� : " 
				+ store03.getBasketNum(apple_num) + "��");
	}
	
}

// ��� ����
class AppleStore {
	
	int price;
	int basketSize;
	
	public AppleStore() {
		price = 500;
		basketSize = 10;
	}
	
	public AppleStore(int price, int basketSize) {
		this.price = price;
		this.basketSize = basketSize;
	}
	
	/** 
	 * ����� ������ �Ѱ��ָ� �� ������ ������ִ� �޼��� 
	 */
	public int getTotalPrice(int apple_num) {
		// price : �� �ν��Ͻ����� �ٸ� ���� ������ �ִ� 
		return apple_num * price;
	}
	
	public int getBasketNum(int apple_num) {
//		if (apple_num % basketSize == 0)
//			return apple_num / basketSize;
//		else
//			return apple_num / basketSize + 1;
		
		// ���׿����� 
		//	- �� ? �� : �ƴϿ�;
		//	- ���� ����� ���̶�� ���ʰ��� ����
		// 	- ���� ����� �����̶�� ������ ���� ����
		return apple_num % basketSize == 0 ? 
				apple_num / basketSize : apple_num / basketSize + 1; 
	}
}









