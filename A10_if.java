
public class A10_if {

	public static void main(String[] args) {
		
		// if��
		//	- ()���� ������ true��� {}���� ������ �����Ѵ�
	
		// else if��
		//	- ���� if���� ������� �ʾҴٸ� ()���� ������ true�� �� {}���� ������ �����Ѵ�
		//	- else if���� ������ �� �� �ִ�
		
		// else��
		//	- ���� ������ ��� �ƴ϶�� {}���� ������ �ݵ�� �����Ѵ�
		//	- else���� ������ �ش� ���ǹ��� �ݵ�� ����ȴ�
		
		int a = 9999;
		
		// if���� ()���ο��� booleanŸ�� ����� ���� �Ѵ�.
		// 	- boolean Ÿ�� ����
		//	- �� ���� (�� ���� ����)
		//	- ���� Ÿ���� boolean�� �Լ� 
		if (a > 1000) { 
			System.out.println(a + "�� 1000���� Ů�ϴ�."); 
		} else if (a > 100) {
			System.out.println(a + "�� 100���� Ů�ϴ�.");
		} else if (a > 10) {
			System.out.println(a + "�� 10���� Ů�ϴ�.");
		} else {
			System.out.println("���� ������ ��� �ƴմϴ�.");
		}
			
		
	}
	
}




