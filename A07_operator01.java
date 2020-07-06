
public class A07_operator01 {

	public static void main(String[] args) {
		
		// ������ (operator)
		//	- ��� �� �� ���� �� 
		
		// ��� ����
		//	- �������� ���� => ����� ����
		//	- ������ �Ǽ��� ���� => ����� �Ǽ�
		//	- �Ǽ����� ���� => ����� �Ǽ�
		//	- ����� �� �� �ٸ� Ÿ������ �����ϰ� �ʹٸ� Ÿ�� ĳ������ �̿��Ѵ�
		int a = 7, b = 3;
		double c = 3.0;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // �������� ������ �� ���´�
		System.out.println(a / c); // ������ �Ǽ��� ������ ����� �Ҽ��� ���´�
		
		// �� �� �ϳ��� �Ǽ��� �ٲ��ָ� �Ҽ� ����� ���� �� �ִ�
		System.out.println(a / (double)b); 
		System.out.println((double)a / b);

		// 7������ 3�� ���� 2 �������� 1
		System.out.println(a % b); // ������ (mod)
		System.out.println(Math.pow(a, b)); // ���� 
		
		System.out.println(a ^ b); // ������ �ƴϴ� (XOR, ��Ʈ����)
		
		// a : 7 -> 0111
		// b : 3 -> 0011
		
		// XOR : ���� �ٸ��� 1
		// 0 1 1 1 
		// 0 0 1 1 ^
		// ---------
		// 0 1 0 0 : 4
	}
	
}







