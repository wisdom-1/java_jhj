package quiz;

public class A09_conditionQuiz {

	public static void main(String[] args) {
		// 1. int�� ���� x�� 10���� ũ�� 20���� ���� �� true
		int x = 13;
		System.out.println(x > 10 && x < 20);
		
		// 2. char�� ���� ch�� �����̳� ���� �ƴ� �� true
		char ch = 'a';
		
		System.out.println((int)' ');
		System.out.println((int)'	');
		System.out.println((int)'\t');
		
		System.out.println(ch != ' ' && ch != '\t');
		
		// 3. char�� ���� ch�� 'x'�Ǵ� 'X'�� �� true
		System.out.println(ch == 'x' || ch == 'X');
		
		// 4. char�� ���� ch�� ����('0'~'9')�� �� true
		System.out.println(ch >= '0' && ch <= '9');
		
		// 5. char�� ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
		System.out.println((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'));
		
		// if���� {}���ο� �� ��ɾ �� ���̶�� {}�� ������ �� �ִ�.
		if (ch >= 'A' && ch <= 'Z')
			System.out.println(ch + "�� �빮���Դϴ�.");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println(ch + "�� �ҹ����Դϴ�.");
		else
			System.out.println(ch + "�� ��� �ƴմϴ�.");
		
		// 5-2. ch�� �ѱ��� ��� true 
		System.out.println('��' > '��');
		System.out.println('��' < '��');
		
		ch = '��';
		System.out.println(ch >= '��' && ch <= '�R');
		System.out.println((int)'��');
		System.out.println((int)'�R');
		System.out.println((int)'��');
		
		// 6. int�� ���� year�� 400���� ������ �������ų� 
		// 	    �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
		int year = 2096;
		System.out.println(year % 400 == 0 
				|| (year % 4 == 0 && year % 100 != 0));
		
		// 7. boolean�� ���� powerOn�� false�� �� true
		boolean powerOn = false;
		
		System.out.println(powerOn == false);
		System.out.println(!powerOn);
		
		// 8. ���ڿ� �������� str�� "yes"�� �� true
		
		// ������ ���� : �빮�ڷ� �����Ѵ�, ���� �� ==�� ����ϸ� �ּҸ� ���Ѵ�.
		// �⺻�� ���� : �ҹ��ڷ� �����Ѵ�
		String str = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		
		System.out.println("str : " + str);
		System.out.println("str3 : " + str3);
		
		System.out.println(str == str3);
		
		// str.equals() : �� ���ڿ��� �ּҰ��� �ƴ� ���� ������ ���Ѵ�
		System.out.println(str.equals(str3)); 
		
		// str.hashCode() : ���ڿ��� ������ �ؽ��ڵ带 �����Ѵ�
		//	�� �ؽ� �˰��� 
		//		- ���� ���� ������ ���� ����� ������ �˰���
		//		- ����� ������ �� ����� �Ѵ�
		//		- �ܹ����̾�� �Ѵ�. ����� ������ �����ϱ� ������ �Ѵ�.		
		//		abc -> FESAFWEQWERSAFXCVXVSDFWE...
		//		abd -> ASDFERWETQWFXZASDFW...
		System.out.println(str.hashCode() == str3.hashCode());
	}
}














