// �ٸ� ��Ű���� �ִ� Ŭ������ ����ϱ� ���ؼ��� �ش� ��Ű���� import�� �ؾ� �Ѵ�
// Ctrl + Shift + O : Eclipse�� �ڵ� import ����Ű
// Ctrl + / : �ּ�ó�� ����Ű
import java.util.Scanner;

public class A08_Scanner {

	public static void main(String[] args) {		
		// Scanner Ŭ����
		//	- �Է��� ���ϰ� ���� �� �ִ� ����� ���ִ� Ŭ����
		//	- �ַܼκ��� �Է��� ���� ���� System.in�� ����Ѵ�
		//	- ���ڿ��� �κ� �κ� ���� �� ����ϱ⵵ �Ѵ�
		//	- ������ ���� �� ���⵵ �Ѵ�		
		
		// sc : �ַܼκ��� �Է¹��� ���� �о���� ��ĳ�ʸ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��غ����� > ");
		int user_input = sc.nextInt(); // ���⼭ ������� �Է��� ��ٸ��� ���α׷��� �����
		System.out.println("����ڰ� �Է��� ���� " + user_input + "�Դϴ�.");
		
		System.out.print("�Ǽ��� �Է��غ����� > ");
		double d = sc.nextDouble();
		System.out.println("����ڰ� �Է��� ���� " + d + "�Դϴ�.");
		
		// ������ �Ǽ��� �Է¹��� �� ��ĳ���� ���ۿ��� \n�� �����ְԵȴ�.
		// nextLine()�� \n�� �������� �Է¹ޱ� ������ �����ִ� 
		// \n�� ����� �����Է��� ���� �� �ִ�
		
		sc.nextLine(); // �����ִ� ���۸� ���
		
		// nextLine() : \n�� �������� �Է¹޴´�
		System.out.print("�ƹ��ų� �Է��غ����� > ");
		String line = sc.nextLine();
		
		System.out.println(line);
		
//		System.out.print("true/false�� �Է��غ����� > ");
//		boolean b = sc.nextBoolean();
//		System.out.println("����ڰ� �Է��� ���� " + b + "�Դϴ�.");
		
		// sc.nextFloat();
		// sc.nextByte();
		// sc.nextBoolean();
		
		// sc2 : ������ ���ڿ��� �о���� ��ĳ�ʸ� ����
//		Scanner sc2 = new Scanner("aaaa\nbbbb\ncc\ndd\na\nb\nc");
		
		// ���� ���� �����ϴ� ���� �� �پ� ������ ���
//		while (sc2.hasNextLine()) {
//			System.out.println(sc2.nextLine());
//		}
		
	}	
}








