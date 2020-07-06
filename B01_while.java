import java.util.Scanner;

public class B01_while {

	public static void main(String[] args) {
		
		// while
		//	- for���� ������ �ణ �ٸ� �ݺ���
		//	- �ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�
		//	- �������� ��ġ�� ���� �ݺ����� ����� �޶��� �� �ִ�
		
		// ���� �⺻���� ����
		int i = 0; 
		while (i < 10) {		
			System.out.println("hello " + i);
			++i;
		}
		
		// while������ ����ϰԲ� ����� Ŭ����/�޼����		
		//	- hasNext, hasNextElement, next... ����
		//	    ���� ���� �ִ��� üũ�ϴ� �޼����
		//	- ���� ���� ������ ���� ���� �ϳ��� �������� ������� ����Ѵ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� ������ �Է��غ����� > ");
		while (sc.hasNextInt()) {			
			// nextInt() : �������� ������ �����´�
			System.out.println(sc.nextInt());			
		}		
		
		// ������ ���� ������
		System.out.println("----- ���� �� ������ -----");
		while (sc.hasNext()) {
			// next() : �������� ������ ���ڿ��� �����´�
			System.out.println(sc.next());
		}
		
	}
	
}











