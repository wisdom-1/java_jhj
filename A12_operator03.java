
public class A12_operator03 {

	public static void main(String[] args) {
		// ���� ���� =
		//	- ������ ������ �������� ���� �ִ´�
		//	- ������ ������ ������ ������ ���� �ִ´�
		//	- ������ ������ �������� ���� ����� �ִ´�
		//	- ������ ������ ������ �޼����� ����� �ִ´�
				
		if (true) {} // �׳� ��
		boolean result = true;
		if (result) {} // ������ ��
		if (!result) {} // ���� ���
		if ("pineapple".contains("banana")) {} // �޼����� ���
		// �� str.contains() : �ش� ���ڿ��� ���ԵǾ��ִ��� �˻��Ѵ�
		
		// ��, ���� ���� �ڸ����� ���� / ���� ��� / �޼����� ����� �� �� �ִ�
		
		
		// ���� ���� ����
		//	- ������ ���� ����� ������Ű�� ���� 
		int a = 10;
		
		a += 5; // a = a + 5
		System.out.println(a);
		a -= 3; // a = a - 3
		System.out.println(a);
		a *= 5; // a = a * 5
		System.out.println(a);
		a /= 3; // a = a / 3;
		System.out.println(a);
		a %= 7; // a = a % 7;
		System.out.println(a);
		
		// ���� ����
		a = 10;
		a++; // a = a + 1
		System.out.println("a++ : " + a);
		++a; // a = a + 1
		System.out.println("++a : " + a);
		
		// ���� �������� ���� ǥ��� : �� ���� ����� ������ �Ŀ� ���� �ٲ��
		a = 10;		
		System.out.println(a++);
		
		// ���� �������� ���� ǥ��� : �� ���� ����� �����ϱ� ���� ���� �ٲ��
		a = 10;
		System.out.println(++a);
		
		// -- �� �ִ�.
		a = 10;
		System.out.println(a--);
		System.out.println(--a);
	}
	
}
















