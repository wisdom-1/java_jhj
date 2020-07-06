// package ������ ������ default package��

public class A05_print {

	public static void main(String[] args) {
		
		// println() : ���� �ڵ����� �ٲ��ָ� ����Ѵ�. (�� �ڿ� \n�� �ڵ����� �߰��Ѵ�)
		// print() : ���� �ڵ����� �ٲ����� �ʴ´�.		
		int apple = 10;
		System.out.print("��� : ");
		System.out.println(apple);
		
		// println()�� �ƹ��͵� ���� ������ �ٸ� �ٲ۴�
		System.out.println();
		System.out.println();
		System.out.println("print!");
		
		
		// printf() : ���Ĺ��ڸ� �̿��� ����Ѵ�
		// ���� �ڵ����� �ٲ����� �����Ƿ� \n�� ����� �ʵ��� �����ؾ� �Ѵ�
		
		System.out.printf("��� : %d\n", apple);
		
		// printf()�� ���Ǵ� ���� ���ڵ�
		//		%d : ����
		//		%f : �Ǽ� (�Ҽ�)
		//		%s : ���ڿ� (boolean�� %s�� �̿�)
		//		%c : ����
		//		%b : boolean
		//		%o : ������ 8������ ���
		//		%x : ������ 16������ ���
		System.out.printf("8���� 9999 : %o\n", 9999);
		System.out.printf("16���� 9999 : %x\n", 9999);
		System.out.printf("10���� 9999 : %d\n", 9999);
		
		System.out.println();
		System.out.printf("%s\n", true);
		System.out.printf("%b\n", false);
		
		// printf()�� ���� ���� �ִ�
		System.out.println();
		System.out.println(2020 + "�� " + 6 + "�� ");
		System.out.printf("%d�� %d�� %d���� ���� %s / ���� %.2f\n",
				2020, 6, 16, "����", 123.123);
		
		// ���Ĺ��� �ɼǵ� 
		
		// %����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ������ ����Ѵ�
		System.out.printf("ABC : %20d\n", 123);
		System.out.printf("ABC : %15d\n", 123);
		System.out.printf("ABC : %10d\n", 123);
		
		System.out.printf("%5s\n", "**");
		System.out.printf("%3s\n", "**");
		System.out.printf("%s\n", "**");
		System.out.printf("%3s\n", "**");
		System.out.printf("%5s\n", "**");
	
		
		// %-����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ���� �����Ͽ� ��� 
		System.out.printf("%-8s : 10\n", "age");
		System.out.printf("%-8s : 123456\n", "birth");
		
		// %0����d : ���ڸ�ŭ ĭ�� Ȯ���� �� �� ĭ�� 0���� ä�� ����Ѵ�.
		int password = 123;
		System.out.printf("%06d\n", password);
		
		// %.����f : �Ҽ��� �Ʒ� �ڸ����� �����Ѵ�
		double avg = 123.567;		
		System.out.printf("��� ���� : %020.1f\n", avg); // 20ĭ Ȯ���ϰ� �Ҽ��� �� �ڸ� ���
		
		// %+d : (+�� ���� ����) ��ȣ�� ǥ���Ѵ� 
		System.out.printf("%+d\n", 123);
		System.out.printf("%+d\n", -123);
		
		
		// String.format() : ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϱ�
		String msg = String.format("���̹� : %s\n", "http://www.naver.com");
		
		// ���Ĵ�� ������ ������ ��� ���ڿ��� ���  
		System.out.println(msg);
	}
	
}

















