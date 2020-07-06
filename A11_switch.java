
public class A11_switch {

	public static void main(String[] args) {
		// switch-case��
		//	- ()���� ���� ����� ���� �б⸦ ���� �� �ִ�
		//	- if������ �Ϻ��ϰ� ��ü �����ϴ�
		//	- ()���� �����  case�� ���� ��ġ�� �� �ش� ����� �����Ѵ�
		//	- break�� ���� �� �ش� case���� �����ؼ� break�� ���� �� ���� ��� ����� �����Ѵ�.   
		
		// 1. �⺻ ���� 
		int a = 0;
		
		switch (a) {
		case 0:
			System.out.println("a�� 0�� �� ����Ǵ� ��ɾ�");
			//break;
		case 1:
			System.out.println("a�� 1�� �� ����Ǵ� ��ɾ�");
			//break;
		case 2:
			System.out.println("a�� 2�� �� ����Ǵ� ��ɾ�");
			break;
		default:
			System.out.println("a�� ��� case�� �ش����� ���� �� ����Ǵ� ��ɾ�");
			break;
		}
		
		// 2. ����� �Բ� ����
		int b = 3;
		
		switch (b % 2) {
		case 0:
			System.out.println("b�� ¦��");
			break;
		case 1:
			System.out.println("b�� Ȧ��");
			break;			
		}
		
		// 3. �޼���� �Բ� �̿�
		
		// str.compareTo() : ���ڿ��� ũ�⸦ �����ش�. (������ ũ�⸦ �ǹ���) 
		//	�� ���ڿ��� ������ : 0
		//	�� ����� �� ũ�� : ���
		//  �� ����� �� ������ : ����
		//	�� ���ڿ��� �ٸ��ٸ� ���ڿ� ���� ���̰� �󸶳� ������ ���ϰ����� �˷��ش�.		
		System.out.println("dar".compareTo("abd"));
		System.out.println("car".compareTo("abd"));
		System.out.println("bar".compareTo("abd"));
		
		switch ("car".compareTo("abd")) {
		case 0:
			System.out.println("�� ���ڿ��� ���� ���ڿ��Դϴ�.");
			break;
		default:
			System.out.println("�� ���ڿ��� �ٸ� ���ڿ��Դϴ�.");
			break;
		}
	}
	
}











