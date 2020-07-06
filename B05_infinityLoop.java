import java.util.Scanner;

public class B05_infinityLoop {

	public static void main(String[] args) {

		// ���� ����
		
		// 1. for���� ���� ���� (���� �κп� true�� ���ų�, ������ ���� ������ ���� ����)
		for (int i = 0;; i += 100) {
			System.out.println(i);
			
			// ���� ������ break���� �Բ� ����ϸ� ����
			if (i > 50000)
				break;
		}
		
		// 2. while���� ���� ���� (���ǿ� true�� ����)
		int index = 0;
		while (true) {
			System.out.println("while : " + index++);
			
			if (index > 123)
				break;
		}
		
		// ���� ������ ���α׷� �����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n=======================");
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1. ����");
			System.out.println("2. �䳢");
			System.out.print("> ");
						
			// ���ڸ� �Է¹޾� ����ϱ�
			
			// sc.hasNextInt() 
			//	- ���۰� ��������� ���� �Է��� ��ٸ���
			//	- ���ۿ� Ȯ���� ������ ������ Ȯ�� �� 
			//	  int��� true, int�� �ƴ϶�� false�� ��ȯ�Ѵ�
			if (sc.hasNextInt()) {
				// sc.nextInt() : ���ۿ� ���� �ִٸ� int���� �ϳ��� ������
				int cmd = sc.nextInt();
				
				switch (cmd) {
				case 1:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
					break;
				case 2:
					System.out.println(" /)/)");
					System.out.println("(  ..)");
					System.out.println("(  >��");
					break;
				default:
					System.out.println("�׷� �޴��� �����ϴ�.");
					break;
				}
			} else {
				// ���� ����
				// sc.nextLine() : ���ۿ� ���� �ִٸ� �� ���� ���� ������
				String trash = sc.nextLine();
				System.out.println("���ۿ� �����ִ� ���� : " + trash);
 			}
		}
		
	}
	
}










