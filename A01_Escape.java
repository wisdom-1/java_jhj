
// �Ǽ��� ���� â�� �ٽ� ���� ���� ��
//	 Window -> Show View -> ... 

public class A01_Escape {
	
	public static void main(String[] args) {
		// Escape ���� 
		//	- Ư���� ����� ���� ����
		//	- �տ� \(��������)�� ���� ���ڴ� Escape ���ڷ� �����Ѵ� 
		
		// \n : �ٹٲ��� ����� ���� Ư�� ���� (linefeed, newline)
		System.out.println("�ȳ�\n�ϼ���, ��\n��\n���ϴ�.");
		
		// \t : TabŰ�� ����� ���� Ư�� ���� 
		System.out.println("�̸�\t����\t����\t���");
		System.out.println("ȫ�浿\t15\t��\t�ƹ����� �ƹ����� �θ��� ����");
	
		// \\ : �׳� �������ø� ����ϰ� ���� ��쿡 ����Ѵ� 
		//	ex> C:\Users\KGITBANK\Appdata�� �ֿܼ� ����ϱ�		
		System.out.println("C:\\Users\\KGITBANK\\Appdata");
		
		// \" : �׳� ū ����ǥ�� ����ϰ� ���� ��쿡 ����Ѵ�
		//	ex> ö���� "����"�� ���״�
		System.out.println("ö���� \"����\"�� ���״�");		
		
		// \' : �׳� ���� ����ǥ�� ����ϰ� ���� ��쿡 ����ϴ�
		System.out.println("ö���� \'����\'�� ���״�");
		System.out.println("ö���� '����'�� ���״�");
		
		// ���� Ÿ�� '�� ������ ����ϰ� ���� ���
		System.out.println("'"); // ���ڿ� Ÿ��
		System.out.println('\'');// ���� Ÿ��
	}
	
}








