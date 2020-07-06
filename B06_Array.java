
public class B06_Array {

	public static void main(String[] args) {
		// �迭
		//	- ���� Ÿ���� ������ �� ���� ������ �����ϴ� ��� 
		
		// int�� ������ 100�� ���� : 0���� 99���� 100��
		int[] num = new int[100];
		
		// ������ �迭�� �� �濡 ���� ������ �� �ִ�
		num[0] = 80;
		num[1] = 65000;
		num[2] = 990000;
		num[99] = 7;
		// num[100] = 123; // �迭�� ũ��-1�� �ε������� �����Ѵ�
		
		// �� ���� ���� ���Ҷ� ������ ����� �� �ִ�
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		
		// �迭 ���� ���
		//	1. Ÿ��[] ������ = new Ÿ�Ը�[�迭ũ��];
		//	2. Ÿ��[] ������ = {������1, ������2, ������3, ...};
		//	3. Ÿ��[] ������ = new Ÿ�Ը�[] {������1, ������2, ...};	

		// * �ڹ��� ��� Ÿ������ �迭�� ������ �� �ִ�
		String[] fruits = {"apple", "kiwi", "orange"};
		double[] weights = {55.55, 66.66, 77.77, 88.88};
		boolean[] pass = new boolean[] {true, false, true, true, false};
		
		// ġȯ�� �� �ؾ� �Ѵ�
		boolean[] pass2 = {
				99 > 70,
				66 > 70,
				54 > 70,
		};		
		
		System.out.println(fruits[2]);
		System.out.printf("%.2f\n", weights[2]);
		
		// 4��° ����� ������
		if (pass[3]) {
			System.out.println("����Դϴ�.");
		}
		
		// str.toCharArray() : String�� ���ڿ� �迭�� ��ȯ�ϴ� �޼���
		char[] msg = "Hello, World!!".toCharArray();
		
		// �迭.length�� �̿��ϸ� �ݺ��� ���� ���� �� �ִ�.
		System.out.println("msg�� ������ ���� : " + msg.length + "��");
		
		for (int index = 0; index < msg.length; ++index) 
			System.out.printf("char[%d] : %c\n", index, msg[index]);
		
		// ������ �ʱ�ȭ ���� ������ ����� �� ������
		// int a;		
		// System.out.println(a);
		
		// �迭�� �����ʹ� �ٸ��� ����ÿ� �ڵ����� �⺻������ �ʱ�ȭ�� ���ش�
		//		���� : 0
		//		�Ǽ� : 0.0
		//		boolean : false
		//		������ (String.. ��) : null
		//		* �迭�� ������ ������
		int[] arr = new int[10];		
		System.out.println("�ʱ�ȭ ���� ���� arr[7] : " + arr[7]);
		
		String[] animals = new String[10];
		System.out.println("�ʱ�ȭ ���� ���� animals[5] : " + animals[5]);
		
		for (int i = 0; i < animals.length; ++i)
			animals[i] = "Lion" + (i + 1);
		
		// forEach : �迭�� ������ �ϳ��� �����鼭 �ݺ��� �����ϴ� ����
		
		//	String[] animals : String���� ������ ������ �ִ� �迭
		for (String animal : animals) {
			System.out.println("���� �̸� : " + animal);
		}
		
		for (String car : new String[] {"bmw", "benz", "hyundai", "kia"}) {
			System.out.println("�ڵ��� �귣�� : " + car);
		}
	}
	
}












